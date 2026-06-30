package ke2;

/* loaded from: classes.dex */
public final class m0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final int f306966t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f306967u;

    /* renamed from: v, reason: collision with root package name */
    public final ke2.l0 f306968v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(java.lang.String finderUserName, int i17, java.lang.Integer num, java.lang.Long l17, ke2.l0 l0Var) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        this.f306966t = i17;
        this.f306967u = "Finder.CgiFinderLiveSwitchIdentity";
        this.f306968v = l0Var;
        r45.ib2 ib2Var = new r45.ib2();
        ib2Var.set(3, finderUserName);
        ib2Var.set(2, java.lang.Integer.valueOf(i17));
        ib2Var.set(1, db2.t4.f228171a.a(4163));
        ib2Var.set(4, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        ib2Var.set(5, java.lang.Long.valueOf(l17 != null ? l17.longValue() : 0L));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ib2Var;
        r45.jb2 jb2Var = new r45.jb2();
        jb2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) jb2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = jb2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveswitchidentity";
        lVar.f70667d = 4163;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init finder_username:");
        sb6.append(ib2Var.getString(3));
        sb6.append(",target_alias_role:");
        sb6.append(ib2Var.getInteger(2));
        sb6.append(",live_identity:");
        r45.kv0 kv0Var = (r45.kv0) ib2Var.getCustom(1);
        sb6.append(kv0Var != null ? java.lang.Integer.valueOf(kv0Var.getInteger(6)) : null);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveSwitchIdentity", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.jb2 resp = (r45.jb2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.String str2 = "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread();
        java.lang.String str3 = this.f306967u;
        com.tencent.mars.xlog.Log.i(str3, str2);
        ke2.l0 l0Var = this.f306968v;
        if (i17 != 0 || i18 != 0) {
            if (l0Var != null) {
                l0Var.a(i17, i18, str);
            }
        } else {
            com.tencent.mars.xlog.Log.i(str3, "set finder live alias role:" + this.f306966t);
            if (l0Var != null) {
                l0Var.b(resp);
            }
        }
    }

    public /* synthetic */ m0(java.lang.String str, int i17, java.lang.Integer num, java.lang.Long l17, ke2.l0 l0Var, int i18, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i18 & 4) != 0 ? null : num, (i18 & 8) != 0 ? null : l17, l0Var);
    }
}
