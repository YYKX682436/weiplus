package or2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final or2.j f347656a = new or2.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentLinkedDeque f347657b = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.c0 f347658c = new com.tencent.mm.sdk.platformtools.c0(200);

    public final void a(androidx.recyclerview.widget.RecyclerView view, java.lang.String scene) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(scene, "scene");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = or2.u.f347681a;
        if (or2.u.f347685e && android.os.Build.VERSION.SDK_INT >= 26) {
            view.i(new or2.s(view.getContext().getClass().getSimpleName() + '#' + scene));
        }
    }
}
