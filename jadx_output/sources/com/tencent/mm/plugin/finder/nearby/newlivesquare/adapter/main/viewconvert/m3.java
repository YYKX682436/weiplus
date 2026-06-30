package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class m3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f121807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.q3 f121808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121809c;

    public m3(android.content.Context context, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.q3 q3Var, java.lang.String str) {
        this.f121807a = context;
        this.f121808b = q3Var;
        this.f121809c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 != 0 || fVar.f70616b != 0) {
            com.tencent.mars.xlog.Log.i("NoticeOfSpecialColumnConvert", "Cgi receiveConcertTicket failed errType: " + fVar.f70615a + ", errMsg: " + fVar.f70617c + ", errCode: " + fVar.f70616b);
            return f0Var;
        }
        r45.m70 m70Var = (r45.m70) ((r45.o62) fVar.f70618d).getCustom(1);
        if (m70Var == null) {
            return null;
        }
        android.content.Context context = this.f121807a;
        java.lang.String str = this.f121809c;
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.z5((s40.w0) c17, context, m70Var, this.f121808b.f121900e, str, null, 16, null);
        return f0Var;
    }
}
