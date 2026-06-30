package fm3;

/* loaded from: classes10.dex */
public final class g implements fm3.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f264068a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f264069b;

    public g(java.lang.String thumbPath, java.lang.String videoPath) {
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        this.f264068a = thumbPath;
        this.f264069b = videoPath;
    }

    @Override // fm3.n
    public void a(android.widget.ImageView thumbView, f60.a aVar) {
        kotlin.jvm.internal.o.g(thumbView, "thumbView");
        e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
        ((o23.i) b1Var).wi(thumbView, 2, this.f264068a, this.f264069b, r5.hashCode(), -1, aVar, 0L);
    }
}
