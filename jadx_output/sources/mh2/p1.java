package mh2;

/* loaded from: classes10.dex */
public final class p1 extends in5.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mh2.r1 f326438a;

    public p1(mh2.r1 r1Var) {
        this.f326438a = r1Var;
    }

    @Override // in5.v
    public void d(android.view.View view, long j17, long j18, boolean z17, long j19) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("KtvNoSingerWidget", "onViewExposed: " + z17);
        if (z17) {
            this.f326438a.f326447c.d(false);
        }
    }
}
