package tb5;

/* loaded from: classes5.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f417032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hd5.n f417034f;

    public b0(com.tencent.mm.storage.f9 f9Var, int i17, hd5.n nVar) {
        this.f417032d = f9Var;
        this.f417033e = i17;
        this.f417034f = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[rptLowAsyncPreload] msgId: ");
        com.tencent.mm.storage.f9 f9Var = this.f417032d;
        sb6.append(f9Var.getMsgId());
        sb6.append(" cost: ");
        int i17 = this.f417033e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMonitorComponent", sb6.toString());
        java.util.Map a17 = tb5.f0.a(f9Var);
        a17.put("cost", java.lang.Integer.valueOf(i17));
        hd5.n nVar = this.f417034f;
        if (nVar == null || (str = nVar.name()) == null) {
            str = "";
        }
        a17.put("action", str);
        km.a.a("chatting_low_async_preload", a17);
    }
}
