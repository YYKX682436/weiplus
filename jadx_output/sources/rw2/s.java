package rw2;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.t f400623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(rw2.t tVar) {
        super(0);
        this.f400623d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rw2.t tVar = this.f400623d;
        yz5.l lVar = tVar.f400630g;
        if (lVar != null) {
            android.view.Surface surface = tVar.f400631h;
            kotlin.jvm.internal.o.d(surface);
            lVar.invoke(surface);
        }
        return jz5.f0.f302826a;
    }
}
