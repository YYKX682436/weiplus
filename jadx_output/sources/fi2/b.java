package fi2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.d f262805d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fi2.d dVar) {
        super(0);
        this.f262805d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fi2.d dVar = this.f262805d;
        android.content.Context context = dVar.f262811a.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new ci2.d(context, dVar.f262811a, dVar);
    }
}
