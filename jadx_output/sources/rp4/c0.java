package rp4;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp4.f0 f398616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(rp4.f0 f0Var) {
        super(2);
        this.f398616d = f0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String taskId = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(taskId, "taskId");
        pm0.v.X(new rp4.b0(taskId, this.f398616d, intValue));
        return jz5.f0.f302826a;
    }
}
