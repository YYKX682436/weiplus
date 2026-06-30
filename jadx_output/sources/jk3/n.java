package jk3;

/* loaded from: classes8.dex */
public final class n implements jk3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f300097b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f300098c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f300099d;

    public n(jk3.v vVar, boolean z17, int i17, android.graphics.Bitmap bitmap) {
        this.f300096a = vVar;
        this.f300097b = z17;
        this.f300098c = i17;
        this.f300099d = bitmap;
    }

    @Override // jk3.g
    public void a() {
        jk3.v vVar = this.f300096a;
        vVar.j();
        vVar.f300124q = vVar.f();
        boolean z17 = this.f300097b;
        android.graphics.Bitmap bitmap = this.f300099d;
        int i17 = this.f300098c;
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).b(new jk3.m(vVar, i17, bitmap), "MultiTasklLoopTag");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("auto hideUIC,id:");
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = vVar.f300077a;
            sb6.append(multiTaskInfo != null ? multiTaskInfo.field_id : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", sb6.toString());
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.multitask.l0.Bd((com.tencent.mm.plugin.multitask.l0) c17, 0, "MultiTaskForSnapshotMinusScreen", 1048576, null, 8, null);
        } else {
            vVar.l(vVar.F(i17) ? vVar.P(bitmap, vVar.f300124q) : null, i17 == 4);
        }
        ak3.c cVar = vVar.f300111d;
        if (cVar != null) {
            ((ak3.i) cVar).t(false);
        }
    }
}
