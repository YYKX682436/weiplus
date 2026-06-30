package oc5;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.m f344449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(oc5.m mVar, int i17) {
        super(2);
        this.f344449d = mVar;
        this.f344450e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        oc5.e action = (oc5.e) obj;
        oc5.e targetAction = (oc5.e) obj2;
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(targetAction, "targetAction");
        if (action.priority() < targetAction.priority()) {
            int i17 = this.f344450e;
            oc5.m mVar = this.f344449d;
            if (mVar.e(i17) == null) {
                targetAction.getType();
                mVar.g(targetAction.getType(), 4);
            }
        }
        return jz5.f0.f302826a;
    }
}
