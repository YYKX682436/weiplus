package oc5;

/* loaded from: classes12.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.n f344486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oc5.u f344487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(oc5.n nVar, oc5.u uVar) {
        super(0);
        this.f344486d = nVar;
        this.f344487e = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        oc5.n nVar = this.f344486d;
        if (nVar != null) {
            com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = this.f344487e.f344483a;
            kotlin.jvm.internal.o.d(recogQBarOfImageFileResultEvent);
            nVar.a(recogQBarOfImageFileResultEvent);
        }
        return jz5.f0.f302826a;
    }
}
