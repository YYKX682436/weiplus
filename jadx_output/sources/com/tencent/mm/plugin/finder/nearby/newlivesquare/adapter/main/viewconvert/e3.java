package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class e3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f121644c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.j3 f121645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121646e;

    public e3(java.lang.String str, java.lang.String str2, android.content.Context context, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.j3 j3Var, java.lang.String str3) {
        this.f121642a = str;
        this.f121643b = str2;
        this.f121644c = context;
        this.f121645d = j3Var;
        this.f121646e = str3;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.m70 m70Var = (r45.m70) ((r45.zr1) fVar.f70618d).getCustom(1);
            boolean z17 = m70Var != null ? m70Var.getBoolean(6) : false;
            if (!z17) {
                com.tencent.mars.xlog.Log.i("NoticeOfSpecialColumnConvert", "ticket hasReceived: " + z17);
                pq5.g l17 = new db2.b2(this.f121642a, null, null, 0L, 0L, this.f121643b, 1, false, 158, null).l();
                android.content.Context context = this.f121644c;
                l17.K(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.d3(context, this.f121645d, this.f121646e));
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.tencent.mm.ui.MMActivity) context);
            }
        } else {
            com.tencent.mars.xlog.Log.i("NoticeOfSpecialColumnConvert", "Cgi getConcertTicket failed errType: " + fVar.f70615a + ", errMsg: " + fVar.f70617c + ", errCode: " + fVar.f70616b);
        }
        return jz5.f0.f302826a;
    }
}
