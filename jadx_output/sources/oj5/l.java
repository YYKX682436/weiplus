package oj5;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj5.o f345858d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(oj5.o oVar) {
        super(0);
        this.f345858d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f345858d.f345869h;
        if (recyclerView != null) {
            return oj5.x.a(recyclerView);
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }
}
