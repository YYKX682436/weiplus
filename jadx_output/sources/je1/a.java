package je1;

/* loaded from: classes15.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask f299192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f299193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask absTransitCardTask, java.util.concurrent.CountDownLatch countDownLatch) {
        super(1);
        this.f299192d = absTransitCardTask;
        this.f299193e = countDownLatch;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        he1.k result = (he1.k) obj;
        kotlin.jvm.internal.o.g(result, "result");
        boolean z17 = result instanceof he1.j;
        com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask absTransitCardTask = this.f299192d;
        if (z17) {
            absTransitCardTask.f83476m = true;
            java.lang.String str = ((he1.j) result).f280884a;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            absTransitCardTask.f83475i = str;
            absTransitCardTask.f83473g = 0;
            absTransitCardTask.f83474h = "ok";
        } else if (result instanceof he1.i) {
            absTransitCardTask.f83476m = false;
            he1.i iVar = (he1.i) result;
            absTransitCardTask.f83473g = iVar.f280882a;
            java.lang.String str2 = iVar.f280883b;
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            absTransitCardTask.f83474h = str2;
        }
        this.f299193e.countDown();
        return jz5.f0.f302826a;
    }
}
