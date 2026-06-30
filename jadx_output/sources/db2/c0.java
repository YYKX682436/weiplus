package db2;

/* loaded from: classes.dex */
public final class c0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f227914t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(long j17, java.lang.String finderUsername) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.f227914t = "Finder.CgiFinderDelDraft";
        r45.x01 x01Var = new r45.x01();
        x01Var.set(1, java.lang.Long.valueOf(j17));
        x01Var.set(3, db2.t4.f228171a.b(6662, this.f16135n));
        if (finderUsername.length() == 0) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            finderUsername = xy2.c.e(context);
        }
        x01Var.set(2, finderUsername);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = x01Var;
        r45.y01 y01Var = new r45.y01();
        y01Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) y01Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = y01Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderdeldraft";
        lVar.f70667d = 6662;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderDelDraft", "init id:" + j17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.y01 resp = (r45.y01) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f227914t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
