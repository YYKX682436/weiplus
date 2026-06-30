package ug5;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f427634d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f427635e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f427636f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f427637g;

    public n(ug5.v vVar, android.view.View view, android.view.Window window, android.widget.FrameLayout frameLayout) {
        this.f427634d = vVar;
        this.f427635e = view;
        this.f427636f = window;
        this.f427637g = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do Animation start, params: ");
        ug5.v vVar = this.f427634d;
        sb6.append(vVar.f427658a);
        com.tencent.mars.xlog.Log.i("ViewFluentPerformer", sb6.toString());
        this.f427635e.postDelayed(new ug5.m(vVar, this.f427636f, this.f427637g), 60L);
    }
}
