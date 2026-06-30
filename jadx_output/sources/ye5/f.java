package ye5;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f461250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f461251e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yb5.d dVar, rd5.d dVar2) {
        super(0);
        this.f461250d = dVar;
        this.f461251e = dVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sb5.z zVar;
        yb5.d dVar = this.f461250d;
        if (dVar != null && (zVar = (sb5.z) dVar.f460708c.a(sb5.z.class)) != null) {
            ((com.tencent.mm.ui.chatting.adapter.k) zVar).h(this.f461251e);
        }
        return jz5.f0.f302826a;
    }
}
