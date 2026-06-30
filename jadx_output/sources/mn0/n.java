package mn0;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.y f329789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(mn0.y yVar) {
        super(0);
        this.f329789d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = this.f329789d.f329808g.iterator();
        while (it.hasNext()) {
            ((mn0.c0) it.next()).u();
        }
        return jz5.f0.f302826a;
    }
}
