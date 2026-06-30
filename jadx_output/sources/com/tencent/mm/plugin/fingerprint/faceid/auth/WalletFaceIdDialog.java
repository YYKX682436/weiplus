package com.tencent.mm.plugin.fingerprint.faceid.auth;

/* loaded from: classes14.dex */
public class WalletFaceIdDialog extends com.tencent.mm.ui.widget.dialog.k2 implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.fingerprint.faceid.auth.FrameAnimatorImageView f136986d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f136987e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f136988f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f136989g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f136990h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f136991i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f136992m;

    /* renamed from: n, reason: collision with root package name */
    public final lz2.w f136993n;

    public WalletFaceIdDialog(android.content.Context context, lz2.a aVar) {
        this(context, aVar, null);
    }

    public final void c() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.aao, null);
        this.f136991i = inflate;
        this.f136992m = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.e1e);
        this.f136986d = (com.tencent.mm.plugin.fingerprint.faceid.auth.FrameAnimatorImageView) this.f136991i.findViewById(com.tencent.mm.R.id.e1a);
        this.f136987e = (android.widget.TextView) this.f136991i.findViewById(com.tencent.mm.R.id.e1d);
        this.f136988f = (android.widget.TextView) this.f136991i.findViewById(com.tencent.mm.R.id.e1c);
        this.f136989g = (android.widget.TextView) this.f136991i.findViewById(com.tencent.mm.R.id.e1b);
        this.f136990h = (android.view.ViewGroup) this.f136991i.findViewById(com.tencent.mm.R.id.e1_);
        com.tencent.mm.ui.bk.r0(this.f136989g.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(this.f136988f.getPaint(), 0.8f);
        this.f136991i.setBackgroundColor(0);
        this.f136989g.setOnClickListener(new lz2.o(this));
        this.f136988f.setOnClickListener(new lz2.p(this));
    }

    public void e(android.view.animation.Animation.AnimationListener animationListener) {
        this.f136986d.setImageResource(com.tencent.mm.R.drawable.c2h);
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477777b6);
        this.f136986d.startAnimation(loadAnimation);
        if (animationListener != null) {
            loadAnimation.setAnimationListener(animationListener);
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
    public void onActivityStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletFaceIdDialog", "activity pause");
        this.f136993n.f322358e.userCancel();
        dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f136991i);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
    }

    public WalletFaceIdDialog(android.content.Context context, lz2.a aVar, android.os.Bundle bundle) {
        this(context);
        lz2.w wVar = new lz2.w(this, aVar, bundle);
        this.f136993n = wVar;
        setOnShowListener(wVar);
        setOnDismissListener(wVar);
        setOnCancelListener(wVar);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    private WalletFaceIdDialog(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494179gb);
        c();
    }

    private WalletFaceIdDialog(android.content.Context context, int i17) {
        super(context, com.tencent.mm.R.style.f494179gb);
        c();
    }
}
