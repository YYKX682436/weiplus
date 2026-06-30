package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.m3 f124829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f124830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f124831g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.e4 f124832h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, com.tencent.mm.plugin.finder.profile.widget.m3 m3Var, int i17, boolean z17, com.tencent.mm.plugin.finder.profile.widget.e4 e4Var) {
        super(2);
        this.f124828d = s4Var;
        this.f124829e = m3Var;
        this.f124830f = i17;
        this.f124831g = z17;
        this.f124832h = e4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f124830f;
        com.tencent.mm.plugin.finder.profile.widget.m3 m3Var = this.f124829e;
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124828d;
        if (intValue != 0) {
            s4Var.c(m3Var, intValue == 1 ? 1 : 2, i17);
        }
        if (this.f124831g) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("finder_username", s4Var.f124747a);
            java.lang.String string = m3Var.f124624a.getString(8);
            if (string == null) {
                string = "";
            }
            hashMap.put("activityId", string);
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.K1;
            r45.qt2 qt2Var = s4Var.f124750d;
            zy2.zb.I8(zbVar, u1Var, hashMap, qt2Var.getString(1), java.lang.String.valueOf(qt2Var.getInteger(5)), null, null, false, 112, null);
            r45.h32 h32Var = m3Var.f124624a;
            java.lang.String string2 = h32Var.getString(8);
            java.lang.String str = string2 == null ? "" : string2;
            java.lang.String string3 = h32Var.getString(4);
            pq5.g l17 = new db2.b2(str, null, null, 0L, 0L, string3 == null ? "" : string3, 1, false, 158, null).l();
            android.content.Context context = s4Var.f124748b;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) context);
            l17.K(new com.tencent.mm.plugin.finder.profile.widget.j4(s4Var));
        }
        com.tencent.mm.plugin.finder.profile.widget.s4.b(s4Var);
        this.f124832h.notifyItemChanged(i17);
        return jz5.f0.f302826a;
    }
}
