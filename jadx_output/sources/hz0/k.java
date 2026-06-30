package hz0;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f286272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kotlinx.coroutines.r2 r2Var) {
        super(1);
        this.f286272d = r2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hz0.m mVar = hz0.m.f286283a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundWorkManager", "dealBackgroundWork: invokeOnCancellation");
        kotlinx.coroutines.p2.a(this.f286272d, null, 1, null);
        return jz5.f0.f302826a;
    }
}
