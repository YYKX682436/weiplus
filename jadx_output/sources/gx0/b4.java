package gx0;

/* loaded from: classes5.dex */
public final class b4 extends kv0.b {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f276223n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f276223n = jz5.h.b(new gx0.a4(this));
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void f7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        kv0.a panel = (kv0.a) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
        kotlinx.coroutines.l.d(getMainScope(), null, null, new gx0.z3(this, null), 3, null);
    }
}
