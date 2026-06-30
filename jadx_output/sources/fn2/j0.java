package fn2;

/* loaded from: classes10.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.m0 f264288d;

    public j0(fn2.m0 m0Var) {
        this.f264288d = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fn2.m0 m0Var = this.f264288d;
        com.tencent.mm.plugin.finder.live.widget.vu vuVar = m0Var.f264319m;
        if (vuVar == null) {
            kotlin.jvm.internal.o.o("singingSongWidget");
            throw null;
        }
        if (vuVar.f120089a.getVisibility() == 0) {
            fn2.d dVar = fn2.d.f264242a;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = vuVar.f120104p;
            kotlin.jvm.internal.o.d(constraintLayout);
            android.content.Context a17 = vuVar.a();
            kotlin.jvm.internal.o.f(a17, "<get-context>(...)");
            dVar.a(constraintLayout, a17);
            com.tencent.mars.xlog.Log.i("FinderLiveRequestSingingSongWidget", "Playing highlight animation for singing song widget");
        }
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSongTabRequested", "Highlighted singing song widget for target: " + m0Var.f264315f);
    }
}
