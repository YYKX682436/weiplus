package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        super(0);
        this.f151790d = musicMVCardChooseView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = this.f151790d;
        android.content.Context context = musicMVCardChooseView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(um3.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        um3.b bVar = (um3.b) a17;
        android.content.Context context2 = musicMVCardChooseView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a18 = zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.mv.ui.uic.v4.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = (com.tencent.mm.plugin.mv.ui.uic.v4) a18;
        kotlinx.coroutines.r2 r2Var = musicMVCardChooseView.f151646z1;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = bVar.O6();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        musicMVCardChooseView.f151646z1 = kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.mv.ui.view.b1(v4Var, musicMVCardChooseView, null), 2, null);
        return jz5.f0.f302826a;
    }
}
