package tk3;

/* loaded from: classes8.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f419945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f419946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(tk3.t tVar, long j17) {
        super(0);
        this.f419945d = tVar;
        this.f419946e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tk3.t tVar = this.f419945d;
        if (!tVar.p()) {
            long j17 = this.f419946e;
            if (1 <= j17 && j17 <= tVar.o()) {
                tVar.l();
                tk3.t.t(this.f419945d, new com.tencent.mm.plugin.multitask.model.MultiTaskInfo(), null, false, 4, null);
                tVar.r(j17);
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewUIManager", "tryAttachFloatBallContainer timeLeft: " + j17);
            }
        }
        return jz5.f0.f302826a;
    }
}
