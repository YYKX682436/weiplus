package com.tencent.mm.plugin.repairer.ui.demo;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerTextStatusShowConfigUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class RepairerTextStatusShowConfigUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cg9;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
        org.json.JSONObject json = bk4.i.a().d().toJSON();
        java.lang.Object obj = json.get("key");
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.onr)).setText("当前状态配置key:" + obj);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.olv)).setText(json.toString());
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.re8);
        if (button != null) {
            button.setOnClickListener(new yw3.g7(this));
        }
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.f483485re4);
        if (button2 != null) {
            button2.setOnClickListener(new yw3.h7(this));
        }
        android.widget.Button button3 = (android.widget.Button) findViewById(com.tencent.mm.R.id.f483486re5);
        if (button3 != null) {
            button3.setOnClickListener(new yw3.i7(this));
        }
    }
}
