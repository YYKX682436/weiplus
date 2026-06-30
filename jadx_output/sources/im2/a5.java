package im2;

/* loaded from: classes3.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FollowUserEvent f292247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent, im2.h6 h6Var) {
        super(0);
        this.f292247d = followUserEvent;
        this.f292248e = h6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        am.zd zdVar;
        com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = this.f292247d;
        java.lang.Integer valueOf = (followUserEvent == null || (zdVar = followUserEvent.f54346g) == null) ? null : java.lang.Integer.valueOf(zdVar.f8552b);
        im2.h6 h6Var = this.f292248e;
        if (valueOf != null && valueOf.intValue() == 1) {
            java.lang.String string = h6Var.f292360J ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7f) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e7d);
            kotlin.jvm.internal.o.d(string);
            pm0.v.X(new im2.w5(h6Var, string, com.tencent.mm.R.raw.icons_outlined_done));
        } else if (valueOf != null && valueOf.intValue() == 2) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491782e83);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            h6Var.getClass();
            pm0.v.X(new im2.w5(h6Var, string2, com.tencent.mm.R.raw.icons_outlined_done));
        } else if (valueOf != null && valueOf.intValue() == 3) {
            java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491781e82);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            h6Var.getClass();
            pm0.v.X(new im2.w5(h6Var, string3, com.tencent.mm.R.raw.icons_outlined_done));
        }
        return jz5.f0.f302826a;
    }
}
