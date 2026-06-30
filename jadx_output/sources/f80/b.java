package f80;

/* loaded from: classes12.dex */
public class b extends f80.j implements w65.c {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f260076o = new java.util.concurrent.atomic.AtomicLong(0);

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f260077h;

    /* renamed from: i, reason: collision with root package name */
    public final f80.f f260078i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f260079m;

    /* renamed from: n, reason: collision with root package name */
    public final long f260080n;

    public b(java.lang.String str, f80.f fVar, java.lang.ref.WeakReference weakReference, kotlin.jvm.internal.i iVar) {
        super(str, fVar);
        this.f260077h = str;
        this.f260078i = fVar;
        this.f260079m = weakReference;
        this.f260080n = f260076o.incrementAndGet();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        w65.m other = (w65.m) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof f80.b)) {
            return 0;
        }
        return kotlin.jvm.internal.o.j(this.f260080n, ((f80.b) other).f260080n);
    }

    @Override // w65.m
    public java.lang.String id() {
        return "default_img_attach_" + this.f260077h + '_' + this.f260080n;
    }

    @Override // w65.m
    public java.lang.Class z1() {
        return com.tencent.mm.feature.img.task.DefaultMsgImageLoadGroup.class;
    }
}
