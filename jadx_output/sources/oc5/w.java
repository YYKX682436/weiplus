package oc5;

/* loaded from: classes12.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.n f344488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oc5.u f344489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(oc5.n nVar, oc5.u uVar) {
        super(0);
        this.f344488d = nVar;
        this.f344489e = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        oc5.n nVar = this.f344488d;
        if (nVar != null) {
            com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = this.f344489e.f344484b;
            kotlin.jvm.internal.o.d(recogQBarOfImageFileFailedEvent);
            nVar.b(recogQBarOfImageFileFailedEvent);
        }
        return jz5.f0.f302826a;
    }
}
