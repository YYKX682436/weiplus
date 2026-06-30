package ln1;

/* loaded from: classes12.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final ln1.s f319730a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f319731b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f319732c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f319733d;

    /* renamed from: e, reason: collision with root package name */
    public final int f319734e;

    /* renamed from: f, reason: collision with root package name */
    public long f319735f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f319736g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f319737h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.util.Vector f319738i = new java.util.Vector();

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b3 f319739j = new com.tencent.mm.sdk.platformtools.b3(true);

    /* renamed from: k, reason: collision with root package name */
    public final long f319740k = j62.e.g().i("clicfg_backup_send_cache_size", 31457280, false, true);

    /* renamed from: l, reason: collision with root package name */
    public final sn1.e0 f319741l = new ln1.d0(this);

    public c0(ln1.s sVar, kn1.h hVar) {
        java.lang.String e17;
        this.f319731b = "";
        this.f319730a = sVar;
        java.lang.String str = hVar.f309621a;
        this.f319732c = str;
        int i17 = hVar.f309624d;
        this.f319734e = i17;
        if (com.tencent.mm.storage.z3.R4(str)) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.f(str, str);
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            e17 = c01.a2.e(str);
        }
        this.f319733d = e17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = e17 == null ? "" : e17;
            objArr[1] = str;
            com.tencent.mars.xlog.Log.e("", "TagProcessor nickName is NullOrNil! nickName:%s, talker:%s", objArr);
            this.f319733d = str;
        }
        java.lang.String str2 = "MicroMsg.BackupPackAndSend.tag." + i17 + "." + this.f319733d;
        this.f319731b = str2;
        com.tencent.mars.xlog.Log.i(str2, "initTagNow [%d,%s,%s] [%s]", java.lang.Integer.valueOf(i17), this.f319733d, str, com.tencent.mm.sdk.platformtools.z3.a());
    }

    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MSG_");
        sb6.append(this.f319738i.size());
        sb6.append("_");
        sb6.append(this.f319732c);
        sb6.append("_");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f319737h = sb6.toString();
        com.tencent.mars.xlog.Log.i(this.f319731b, "chatMsgList:%d", java.lang.Integer.valueOf(this.f319738i.size()));
        sn1.e0 e0Var = this.f319741l;
        ln1.e0 e0Var2 = new ln1.e0(this);
        java.lang.String str = this.f319737h;
        java.util.LinkedList linkedList = new java.util.LinkedList(this.f319738i);
        byte[] bArr = this.f319730a.f319803d.f309608f;
        int i17 = sn1.a0.A;
        ln1.s.f319797r.a(new sn1.c0(e0Var2, linkedList, e0Var, str, bArr), linkedList.size() * 10240);
        this.f319738i = new java.util.Vector();
    }

    public void b(ln1.b0 b0Var) {
        if (this.f319738i.size() > 0) {
            a();
        }
        java.lang.String str = this.f319737h;
        java.lang.String str2 = this.f319731b;
        final ln1.a0 a0Var = new ln1.a0(str2, this.f319730a, this.f319732c, this.f319734e, this.f319735f, this.f319736g, str, this.f319733d, b0Var);
        this.f319736g = 0L;
        this.f319735f = 0L;
        ln1.r rVar = ln1.s.f319797r;
        com.tencent.mars.xlog.Log.i(str2, "setTagEnd tagTextClientId:%s, index:%d", str, java.lang.Long.valueOf(rVar.f319787b.get()));
        rVar.a(new ln1.q(new java.lang.Runnable() { // from class: ln1.c0$$a
            @Override // java.lang.Runnable
            public final void run() {
                ln1.a0.this.run();
            }
        }), 0L);
    }

    public java.lang.String toString() {
        return this.f319731b;
    }
}
