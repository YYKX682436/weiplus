package g73;

/* loaded from: classes15.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.model.MultiTaskInfo f269324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        super(0);
        this.f269324d = multiTaskInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.handoff.model.HandOff a17 = h73.a.f279484a.a(this.f269324d);
        if (a17 != null) {
            g73.o0.f269311d.Bi(a17);
        }
        return jz5.f0.f302826a;
    }
}
