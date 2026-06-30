package cs2;

/* loaded from: classes2.dex */
public final class e extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f222066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cs2.i f222067b;

    public e(r45.qt2 qt2Var, cs2.i iVar) {
        this.f222066a = qt2Var;
        this.f222067b = iVar;
    }

    @Override // in5.p
    public float a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return 0.1f;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onExposeTimeRecorded: size = ");
        sb6.append(recordsSet.size());
        sb6.append(", commentScene=");
        r45.qt2 qt2Var = this.f222066a;
        sb6.append(qt2Var.getInteger(5));
        com.tencent.mars.xlog.Log.i("Finder.GridFeedPreloadCore", sb6.toString());
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            this.f222067b.c((in5.j) it.next(), qt2Var);
        }
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f222067b.d(item, this.f222066a);
    }
}
