package com.tencent.mm.plugin.wallet_core.ui.view;

@db5.a(3)
/* loaded from: classes3.dex */
public class WalletSuccPageAwardLuckyMoneyDialog extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f180731d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d8d;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getSupportActionBar() != null) {
            getSupportActionBar().o();
        }
        if (fp.h.c(19)) {
            getWindow().setFlags(67108864, 67108864);
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_layer_info");
        if (byteArrayExtra == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletSuccPageAwardLuckyMoneyDialog", "WalletSuccPageAwardLuckyMoneyDialog onCreate error! cannot get layerInfoBytes!");
            finish();
        }
        try {
            new a36.f().parseFrom(byteArrayExtra);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardLuckyMoneyDialog", e17, "parse layer info byte error! %s", e17.getMessage());
            finish();
        }
        this.f180731d = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.che);
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.f483758bz2)).setOnClickListener(new gt4.s1(this));
        android.view.ViewGroup viewGroup = this.f180731d;
        gt4.t1 t1Var = new gt4.t1(this);
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new gt4.u1(this, viewGroup, scaleAnimation2));
        scaleAnimation2.setAnimationListener(t1Var);
        if (viewGroup != null) {
            viewGroup.startAnimation(scaleAnimation);
        }
    }
}
