package oc5;

/* loaded from: classes12.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.n f344392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent f344393e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(oc5.n nVar, com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent) {
        super(0);
        this.f344392d = nVar;
        this.f344393e = recogQBarOfImageFileResultEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        oc5.n nVar = this.f344392d;
        if (nVar != null) {
            nVar.a(this.f344393e);
        }
        return jz5.f0.f302826a;
    }
}
