package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class v1 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.a2 f124276c;

    public v1(com.tencent.mm.plugin.finder.profile.uic.a2 a2Var) {
        this.f124276c = a2Var;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        com.tencent.mm.plugin.finder.profile.uic.a2 a2Var = this.f124276c;
        so2.j5 j5Var = (so2.j5) kz5.n0.a0(a2Var.O6(), i17);
        if (j5Var == null) {
            return 6;
        }
        android.app.Activity context = a2Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return 6 / ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.class)).S6(j5Var.getClass());
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
