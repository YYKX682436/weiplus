package df;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final df.g f229458a = new df.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f229459b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f229460c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public static boolean f229461d;

    public final df.z a(android.content.Context context, boolean z17) {
        df.j jVar = new df.j(context);
        return z17 ? new df.z(jVar, new io.flutter.embedding.android.FlutterTextureView(jVar)) : new df.z(jVar, new io.flutter.embedding.android.FlutterSurfaceView(jVar));
    }

    public final df.z b(android.content.Context context, boolean z17) {
        df.z zVar;
        kotlin.jvm.internal.o.g(context, "context");
        java.util.Iterator it = f229459b.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            zVar = (df.z) next;
            if ((z17 && zVar.getRenderMode() == io.flutter.embedding.android.RenderMode.texture) || (!z17 && zVar.getRenderMode() == io.flutter.embedding.android.RenderMode.surface)) {
                it.remove();
                zVar.c(context);
                break;
            }
        }
        zVar = null;
        return zVar == null ? a(context, z17) : zVar;
    }

    public final void c(df.z view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        view.c(context);
        view.setWxKeyboardAction(null);
        if (!(f229461d && view.getRenderMode() == io.flutter.embedding.android.RenderMode.texture) && (f229461d || view.getRenderMode() != io.flutter.embedding.android.RenderMode.surface)) {
            return;
        }
        f229459b.addLast(view);
    }
}
