package mt1;

/* loaded from: classes12.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f331251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f331252e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f331253f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.UUID f331254g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.k5 f331255h;

    public p(java.util.List list, int i17, long j17, java.util.UUID uuid, com.tencent.mm.vfs.k5 k5Var) {
        this.f331251d = list;
        this.f331252e = i17;
        this.f331253f = j17;
        this.f331254g = uuid;
        this.f331255h = k5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CalcWxNewService", "Refresh UUID: " + ot1.h.u0((java.lang.String) this.f331251d.get(this.f331252e)));
        ot1.j n17 = mt1.b0.f331191a.n();
        long j17 = this.f331255h.f213234d;
        n17.getClass();
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.util.UUID uuid = this.f331254g;
        objArr[0] = uuid == null ? null : c01.td.b(uuid);
        objArr[1] = java.lang.Long.valueOf(j17);
        objArr[2] = java.lang.Long.valueOf(this.f331253f);
        n17.f348849d.j("WxFileIndex3", "UPDATE WxFileIndex3 SET linkUUID=?, diskSpace=? WHERE rowid=?", objArr, null);
    }
}
