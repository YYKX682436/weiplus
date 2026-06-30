package vo4;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.i f438623d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f438624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vo4.i iVar, boolean z17) {
        super(0);
        this.f438623d = iVar;
        this.f438624e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vo4.r rVar = this.f438623d.f438634e;
        boolean z17 = this.f438624e;
        rVar.f438675d = z17;
        java.util.Iterator it = rVar.f438676e.iterator();
        while (it.hasNext()) {
            ((vo4.b) it.next()).a(z17);
        }
        return jz5.f0.f302826a;
    }
}
