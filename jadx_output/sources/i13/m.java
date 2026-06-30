package i13;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i13.n f287296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i13.n nVar) {
        super(1);
        this.f287296d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        i13.p it = (i13.p) obj;
        kotlin.jvm.internal.o.g(it, "it");
        i13.n nVar = this.f287296d;
        nVar.f287299a.offer(it);
        nVar.f287300b.add(it.f287275d);
        return jz5.f0.f302826a;
    }
}
