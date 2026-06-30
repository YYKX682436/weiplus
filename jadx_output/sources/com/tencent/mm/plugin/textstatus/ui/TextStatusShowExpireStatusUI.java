package com.tencent.mm.plugin.textstatus.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusShowExpireStatusUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TextStatusShowExpireStatusUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.czd;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusShowExpireStatusUI", "onCreate: ");
        o25.n1.f(this);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        vj5.o.e(getWindow());
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        getWindow().setNavigationBarColor(getResources().getColor(com.tencent.mm.R.color.f478514w));
        setMMTitle("");
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f483487b03);
        if (viewGroup != null) {
            int h17 = i65.a.h(this, com.tencent.mm.R.dimen.f479719dc) + com.tencent.mm.ui.bl.h(this);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = null;
            android.widget.RelativeLayout.LayoutParams layoutParams3 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams3 != null) {
                layoutParams3.topMargin = h17;
                layoutParams2 = layoutParams3;
            }
            viewGroup.setLayoutParams(layoutParams2);
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.fg(this));
        }
    }
}
