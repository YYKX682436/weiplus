package oc5;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.m f344438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(oc5.m mVar) {
        super(2);
        this.f344438d = mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        oc5.e action = (oc5.e) obj;
        oc5.e targetAction = (oc5.e) obj2;
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(targetAction, "targetAction");
        if (action.priority() > targetAction.priority()) {
            action.getType();
            targetAction.getType();
            this.f344438d.b(targetAction.getType());
        }
        return jz5.f0.f302826a;
    }
}
