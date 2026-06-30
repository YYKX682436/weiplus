package ek2;

/* loaded from: classes.dex */
public final class x0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f253561t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.es1 f253562u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.String anchorUsername, byte[] bArr, long j17, long j18, java.util.LinkedList reqList) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        kotlin.jvm.internal.o.g(reqList, "reqList");
        this.f253561t = "Finder.CgiFinderLiveGetExtraInfo";
        r45.es1 es1Var = new r45.es1();
        this.f253562u = es1Var;
        es1Var.set(1, db2.t4.f228171a.a(8259));
        es1Var.set(2, anchorUsername);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        java.lang.String str = e17.length() > 0 ? e17 : null;
        if (str != null) {
            es1Var.set(3, str);
        }
        es1Var.set(4, com.tencent.mm.protobuf.g.b(bArr));
        es1Var.set(5, java.lang.Long.valueOf(j18));
        es1Var.set(6, java.lang.Long.valueOf(j17));
        es1Var.set(7, reqList);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = es1Var;
        r45.fs1 fs1Var = new r45.fs1();
        fs1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) fs1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = fs1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetextrainfo";
        lVar.f70667d = 8259;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.fs1 resp = (r45.fs1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253561t, "[onCgiBack] scene:" + this.f253562u.getLong(6) + ",errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
