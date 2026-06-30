package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(in5.s0 s0Var) {
        super(2);
        this.f121761d = s0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        android.content.Context context = this.f121761d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sp2.x3 x3Var = (sp2.x3) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(sp2.x3.class);
        com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "startRequestCgi");
        x3Var.V6(intValue, intValue2);
        x3Var.W6(intValue, intValue2);
        return jz5.f0.f302826a;
    }
}
