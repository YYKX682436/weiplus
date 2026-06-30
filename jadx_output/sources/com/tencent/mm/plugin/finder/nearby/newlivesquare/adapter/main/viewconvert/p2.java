package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(in5.s0 s0Var, java.lang.String str) {
        super(1);
        this.f121878d = s0Var;
        this.f121879e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        java.lang.String str;
        java.lang.String num;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        java.lang.String str2 = "";
        in5.s0 s0Var = this.f121878d;
        if (booleanValue) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
                str = "";
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            ml2.u1 u1Var = ml2.u1.f328040e;
            a4Var.a(str, "", b17, "square_card_friend_like_avatar_half", this.f121879e);
        } else {
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar != null && (num = java.lang.Integer.valueOf(nyVar.f135380n).toString()) != null) {
                str2 = num;
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b18 = b52.b.b();
            ml2.t1 t1Var = ml2.t1.f327942e;
            a4Var.b(str2, b18, "square_card_friend_like_avatar_half", this.f121879e);
        }
        return jz5.f0.f302826a;
    }
}
