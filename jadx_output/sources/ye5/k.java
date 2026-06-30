package ye5;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f461267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd5.i f461268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yb5.d dVar, qd5.i iVar) {
        super(0);
        this.f461267d = dVar;
        this.f461268e = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sb5.z zVar = (sb5.z) this.f461267d.f460708c.a(sb5.z.class);
        if (zVar != null) {
            ((com.tencent.mm.ui.chatting.adapter.k) zVar).h(this.f461268e);
        }
        return jz5.f0.f302826a;
    }
}
