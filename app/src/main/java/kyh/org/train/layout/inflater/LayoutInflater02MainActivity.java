package kyh.org.train.layout.inflater;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LayoutInflater02MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView 이전에 뷰를 참조하므로 실행시 널포이트 에러가 난다.
        Button button = (Button) findViewById(R.id.button_inflater);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //리소스 폴더에서 화면레이아웃xml파일을 id로 찾아서 메모리에 올린다.
        //고로 이메쏘드 실행전에 뷰들을 참조할려면 예외상황이 발생한다.
        setContentView(R.layout.activity_layout_inflater02_main);
    }
}
