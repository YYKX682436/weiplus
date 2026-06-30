package n45;

/* loaded from: classes8.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n45.b f335083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n45.b bVar) {
        super(0);
        this.f335083d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n45.b bVar = this.f335083d;
        synchronized (bVar.f335084d) {
            jz5.l lVar = (jz5.l) kz5.n0.k0(bVar.f335084d);
            if (lVar != null) {
                java.lang.Object obj = lVar.f302833d;
                int i17 = ((qk.h6) ((l23.a) obj)).field_cmdid;
                java.lang.String str = ((qk.h6) ((l23.a) obj)).field_functionmsgid;
                super/*n23.a*/.b(lVar);
            }
            bVar.f335084d.clear();
        }
        return jz5.f0.f302826a;
    }
}
