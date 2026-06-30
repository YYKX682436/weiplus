package fm3;

/* loaded from: classes10.dex */
public final class i implements fm3.n {

    /* renamed from: a, reason: collision with root package name */
    public final fm3.d f264075a;

    public i(fm3.d videoInfo) {
        kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
        this.f264075a = videoInfo;
    }

    @Override // fm3.n
    public void a(android.widget.ImageView thumbView, f60.a aVar) {
        kotlin.jvm.internal.o.g(thumbView, "thumbView");
        e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
        fm3.d dVar = this.f264075a;
        ((o23.i) b1Var).wi(thumbView, 2, dVar.f264041e, dVar.a(), dVar.hashCode(), -1, aVar, 0L);
    }
}
