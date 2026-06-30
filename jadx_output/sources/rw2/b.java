package rw2;

/* loaded from: classes10.dex */
public final class b implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rw2.j f400589a;

    public b(rw2.j jVar) {
        this.f400589a = jVar;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        if (z17) {
            rw2.j jVar = this.f400589a;
            jVar.d();
            com.tencent.mars.xlog.Log.i(jVar.f400607c, "init download first thumb succ");
        }
    }
}
