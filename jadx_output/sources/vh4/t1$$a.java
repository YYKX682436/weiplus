package vh4;

/* loaded from: classes.dex */
public final /* synthetic */ class t1$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh4.t1 f437142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f437143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uh4.e f437144f;

    public /* synthetic */ t1$$a(vh4.t1 t1Var, int i17, uh4.e eVar) {
        this.f437142d = t1Var;
        this.f437143e = i17;
        this.f437144f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vh4.t1 t1Var = this.f437142d;
        t1Var.getClass();
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        create.putInt("operationType", this.f437143e);
        ((h45.q) i95.n0.c(h45.q.class)).startUseCase("teenagerModeOperationUseCase", create, new vh4.d2(t1Var, this.f437144f));
    }
}
