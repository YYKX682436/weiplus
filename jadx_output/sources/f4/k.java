package f4;

/* loaded from: classes15.dex */
public abstract class k extends f4.q {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f259392b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Choreographer f259393c;

    /* renamed from: d, reason: collision with root package name */
    public final f4.s f259394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f4.i jankStats, android.view.View view) {
        super(jankStats);
        kotlin.jvm.internal.o.g(jankStats, "jankStats");
        kotlin.jvm.internal.o.g(view, "view");
        this.f259392b = new java.lang.ref.WeakReference(view);
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        kotlin.jvm.internal.o.f(choreographer, "getInstance(...)");
        this.f259393c = choreographer;
        android.view.ViewParent parent = view.getParent();
        while (parent instanceof android.view.View) {
            view = parent;
            parent = view.getParent();
        }
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.jid);
        if (tag == null) {
            tag = new f4.s();
            view.setTag(com.tencent.mm.R.id.jid, tag);
        }
        this.f259394d = (f4.s) tag;
        new f4.j(jankStats, this);
    }
}
