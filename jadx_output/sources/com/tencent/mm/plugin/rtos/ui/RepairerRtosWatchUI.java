package com.tencent.mm.plugin.rtos.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/rtos/ui/RepairerRtosWatchUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerRtosWatchUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.che;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RepairerRtosWatchUI", "onCreate");
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.bxm);
        if (button != null) {
            button.setOnClickListener(oy3.a.f350009d);
        }
        android.widget.Button button2 = (android.widget.Button) findViewById(com.tencent.mm.R.id.f483749by1);
        if (button2 != null) {
            button2.setOnClickListener(oy3.b.f350011d);
        }
        android.widget.Button button3 = (android.widget.Button) findViewById(com.tencent.mm.R.id.o2v);
        if (button3 != null) {
            button3.setOnClickListener(oy3.c.f350013d);
        }
        android.widget.Button button4 = (android.widget.Button) findViewById(com.tencent.mm.R.id.m9r);
        if (button4 != null) {
            button4.setOnClickListener(oy3.d.f350016d);
        }
        android.widget.Button button5 = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485153gr3);
        if (button5 != null) {
            button5.setOnClickListener(oy3.e.f350017d);
        }
        android.widget.Button button6 = (android.widget.Button) findViewById(com.tencent.mm.R.id.bxx);
        if (button6 != null) {
            button6.setOnClickListener(oy3.f.f350018d);
        }
        android.widget.Button button7 = (android.widget.Button) findViewById(com.tencent.mm.R.id.bxu);
        if (button7 != null) {
            button7.setOnClickListener(oy3.g.f350019d);
        }
    }
}
