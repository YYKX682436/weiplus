package ed2;

/* loaded from: classes2.dex */
public final class i extends com.tencent.mm.ui.component.UIComponent implements zy2.o7 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f251268d;

    /* renamed from: e, reason: collision with root package name */
    public ed2.a f251269e;

    /* renamed from: f, reason: collision with root package name */
    public in5.s0 f251270f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f251268d = new java.util.HashMap();
    }

    public final void O6(yz5.a aVar) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        pf5.e.launch$default(this, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new ed2.g(aVar, null), 2, null);
    }

    public final boolean P6(ed2.a key) {
        kotlin.jvm.internal.o.g(key, "key");
        ed2.a aVar = this.f251269e;
        if (aVar == key || aVar == null) {
            O6(new ed2.h(key, this));
            return this.f251269e == key;
        }
        com.tencent.mars.xlog.Log.w("FinderFeedBubbleTipsManager", "showTargetWithResult false show " + key + ", current: " + this.f251269e);
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f251268d = new java.util.HashMap();
    }
}
