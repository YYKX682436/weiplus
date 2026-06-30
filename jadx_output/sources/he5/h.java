package he5;

/* loaded from: classes9.dex */
public class h implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public android.database.Cursor f280931a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f280932b;

    /* renamed from: c, reason: collision with root package name */
    public final long f280933c;

    /* renamed from: d, reason: collision with root package name */
    public final int f280934d;

    /* renamed from: e, reason: collision with root package name */
    public final int f280935e;

    public h(java.lang.String str, long j17, int i17, int i18) {
        this.f280932b = str;
        this.f280933c = j17;
        this.f280935e = i18;
        this.f280934d = i17;
    }

    @Override // he5.t
    public int a() {
        return this.f280935e;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        this.f280931a.moveToFirst();
        while (!this.f280931a.isAfterLast()) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.convertFrom(this.f280931a);
            list.add(f9Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingBizDataSource", "ChattingBizDataSource fillItem: %s %s %s %s", f9Var.Q0(), f9Var.G, java.lang.Integer.valueOf(f9Var.A0()), java.lang.Integer.valueOf(f9Var.getType()));
            this.f280931a.moveToNext();
        }
        java.util.Collections.sort(list, new he5.g(this));
        ((hd5.f) sVar).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        com.tencent.mm.storage.x4 x4Var = (com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
        java.lang.String str = this.f280932b;
        long m07 = x4Var.m0(str);
        long j17 = this.f280933c;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        int i17 = this.f280934d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingLoader.ChattingBizDataSource", "[ChattingBizDataSource] talker:%s bizChatId:%s,count:%s totalCount:%s createTime:%s", str, valueOf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f280935e), java.lang.Long.valueOf(m07));
        com.tencent.mm.storage.v j18 = c01.d9.b().j();
        java.lang.String str2 = "SELECT * FROM " + j18.e(str) + " WHERE " + j18.l(str, j17) + " ORDER BY createTime DESC LIMIT " + i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatMessageStorage", "getBizInitCursor talker:%s, bizChatId:%s, limitCount:%s, sql:[%s]", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str2);
        android.database.Cursor B = j18.d().B(str2, null);
        this.f280931a = B;
        B.moveToFirst();
        oVar.next();
    }

    @Override // he5.t
    public void close() {
        this.f280931a.close();
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }
}
