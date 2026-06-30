package g41;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g41.f f268703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g41.f fVar) {
        super(0);
        this.f268703d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f268703d.f268709a;
        if (view != null) {
            return (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.sfb);
        }
        kotlin.jvm.internal.o.o("floatingView");
        throw null;
    }
}
