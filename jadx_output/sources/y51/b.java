package y51;

/* loaded from: classes10.dex */
public final class b extends android.widget.RelativeLayout implements y51.c, y51.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f459466d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f459467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f459466d = new java.util.HashMap();
        this.f459467e = new android.widget.RelativeLayout(context);
    }

    public z51.x a(java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.util.HashMap hashMap = this.f459466d;
        java.lang.String canonicalName = clazz.getCanonicalName();
        kotlin.jvm.internal.o.d(canonicalName);
        java.lang.Object obj = hashMap.get(canonicalName);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type T of com.tencent.mm.player.MMLivePhotoLocalPlayerView.component");
        return (z51.x) obj;
    }

    public void b() {
        java.util.Iterator it = this.f459466d.entrySet().iterator();
        while (it.hasNext()) {
            ((z51.x) ((java.util.Map.Entry) it.next()).getValue()).h();
        }
    }

    public void c() {
        java.util.Iterator it = this.f459466d.entrySet().iterator();
        while (it.hasNext()) {
            ((z51.x) ((java.util.Map.Entry) it.next()).getValue()).i();
        }
    }

    public void d() {
        z51.c cVar = (z51.c) a(z51.c.class);
        cVar.f("prepare");
        a61.c cVar2 = cVar.f470174f;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("sourceConfig");
            throw null;
        }
        if (cVar2.f1720b) {
            return;
        }
        cVar.f470175g = kotlinx.coroutines.l.d(cVar.f470236c, null, null, new z51.b(cVar, null), 3, null);
    }

    public void e() {
        java.util.Iterator it = this.f459466d.entrySet().iterator();
        while (it.hasNext()) {
            ((z51.x) ((java.util.Map.Entry) it.next()).getValue()).j();
        }
    }

    public android.content.Context getPlayerContext() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return context;
    }

    public android.view.View getScaleParent() {
        return this.f459467e;
    }

    public android.view.View getTagLayout() {
        return ((z51.r) a(z51.r.class)).f470214i;
    }

    @Override // y51.c
    public void setPlayCallback(y51.e callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((z51.p) a(z51.p.class)).f470206m = callback;
    }

    @Override // y51.g
    public void setTagViewCallback(y51.f callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((z51.r) a(z51.r.class)).f470215j = callback;
    }
}
