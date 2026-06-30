package com.tencent.mm.plugin.voip.widget;

@db5.a(3)
/* loaded from: classes14.dex */
public class VoipScoreDialog extends com.tencent.mm.ui.MMActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f177123i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.VoipScoreState f177124d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f177125e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView[] f177126f = new android.widget.ImageView[5];

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f177127g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f177128h = 0;

    public static void T6(com.tencent.mm.plugin.voip.widget.VoipScoreDialog voipScoreDialog, int i17) {
        rk0.c.c("MicroMsg.VoipScoreDialog", "doScoreStat %s %s %s", java.lang.Integer.valueOf(voipScoreDialog.f177128h), java.lang.Integer.valueOf(i17), voipScoreDialog.f177124d);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15684, java.lang.Integer.valueOf(voipScoreDialog.f177124d.f176313f), java.lang.Long.valueOf(voipScoreDialog.f177124d.f176314g), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(voipScoreDialog.f177128h), java.lang.Integer.valueOf(voipScoreDialog.f177124d.f176312e), java.lang.Long.valueOf(voipScoreDialog.f177124d.f176316i), java.lang.Long.valueOf(voipScoreDialog.f177124d.f176315h));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d4t;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.voip.model.VoipScoreState voipScoreState = (com.tencent.mm.plugin.voip.model.VoipScoreState) getIntent().getParcelableExtra("key_score_state");
        this.f177124d = voipScoreState;
        if (voipScoreState == null) {
            rk0.c.b("MicroMsg.VoipScoreDialog", "onCreate error, scoreState is null", new java.lang.Object[0]);
            finish();
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(this, com.tencent.mm.R.layout.d4s, null);
        this.f177125e = viewGroup;
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.man);
        android.widget.ImageView[] imageViewArr = this.f177126f;
        imageViewArr[0] = imageView;
        imageViewArr[1] = (android.widget.ImageView) this.f177125e.findViewById(com.tencent.mm.R.id.mao);
        imageViewArr[2] = (android.widget.ImageView) this.f177125e.findViewById(com.tencent.mm.R.id.map);
        imageViewArr[3] = (android.widget.ImageView) this.f177125e.findViewById(com.tencent.mm.R.id.maq);
        imageViewArr[4] = (android.widget.ImageView) this.f177125e.findViewById(com.tencent.mm.R.id.mar);
        for (int i17 = 0; i17 < imageViewArr.length; i17++) {
            imageViewArr[i17].setOnClickListener(new com.tencent.mm.plugin.voip.widget.q(this, i17));
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
        u1Var.u(this.f177124d.f176311d);
        u1Var.d(this.f177125e);
        u1Var.n(getString(com.tencent.mm.R.string.f493478kd5));
        u1Var.l(new com.tencent.mm.plugin.voip.widget.r(this));
        u1Var.a(false);
        u1Var.e(new com.tencent.mm.plugin.voip.widget.s(this));
        com.tencent.mm.ui.widget.dialog.j0 j0Var = u1Var.f211998c;
        this.f177127g = j0Var;
        if (j0Var != null) {
            j0Var.show();
        } else {
            finish();
        }
    }
}
