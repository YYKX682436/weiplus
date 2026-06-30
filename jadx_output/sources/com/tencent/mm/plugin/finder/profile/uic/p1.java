package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.a2 f124100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.finder.profile.uic.a2 a2Var) {
        super(0);
        this.f124100d = a2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f124100d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.class)).f123425r;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
