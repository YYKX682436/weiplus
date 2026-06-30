package md3;

/* loaded from: classes.dex */
public final class b implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md3.c f325854a;

    public b(md3.c cVar) {
        this.f325854a = cVar;
    }

    @Override // r35.n3
    public final void a(int i17) {
        md3.c cVar = this.f325854a;
        if (i17 == -2) {
            cVar.s().invoke(cVar.h(3, "added"));
            return;
        }
        if (i17 == 0) {
            cVar.s().invoke(cVar.i(lc3.x.f317935b));
        } else if (i17 != 1) {
            cVar.s().invoke(cVar.h(2, "fail"));
        } else {
            cVar.s().invoke(cVar.k());
        }
    }
}
