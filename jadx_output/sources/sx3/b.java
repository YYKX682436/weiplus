package sx3;

/* loaded from: classes10.dex */
public final class b extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.j0 f413546d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f413547e;

    /* renamed from: f, reason: collision with root package name */
    public long f413548f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f413549g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f413550h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f413546d = new androidx.lifecycle.j0();
        this.f413547e = true;
        this.f413548f = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.f413549g = new java.util.HashSet();
        this.f413550h = new java.util.ArrayList();
    }

    public final void clear() {
        this.f413549g.clear();
        this.f413550h.clear();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f413550h.clear();
        this.f413549g.clear();
    }
}
