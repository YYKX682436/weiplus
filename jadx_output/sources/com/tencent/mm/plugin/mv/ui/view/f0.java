package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f151823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.t3 f151825f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.view.View view, com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView, com.tencent.mm.plugin.mv.ui.view.t3 t3Var) {
        super(0);
        this.f151823d = view;
        this.f151824e = musicMVCardChooseView;
        this.f151825f = t3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm3.w wVar;
        try {
            android.widget.ImageView imageView = (android.widget.ImageView) this.f151823d.findViewById(com.tencent.mm.R.id.p0n);
            kotlin.jvm.internal.o.d(imageView);
            wVar = fm3.x.a(imageView);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mv.MusicMVCardChooseView", "generate animation info fail:" + e17.getLocalizedMessage());
            wVar = null;
        }
        com.tencent.mm.plugin.mv.ui.view.b0 b0Var = this.f151824e.G;
        if (b0Var != null) {
            com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI = (com.tencent.mm.plugin.mv.ui.MusicMvMakerUI) b0Var;
            com.tencent.mm.plugin.mv.ui.view.t3 data = this.f151825f;
            kotlin.jvm.internal.o.g(data, "data");
            musicMvMakerUI.a7(wVar, new jm3.p0(musicMvMakerUI, data));
        }
        return jz5.f0.f302826a;
    }
}
