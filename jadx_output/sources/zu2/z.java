package zu2;

/* loaded from: classes3.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jx2.j f475757f;

    public z(android.view.View view, android.view.View view2, jx2.j jVar) {
        this.f475755d = view;
        this.f475756e = view2;
        this.f475757f = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f475755d;
        int left = view.getLeft() + (view.getMeasuredWidth() / 2);
        android.view.View anchor = this.f475756e;
        int measuredWidth = left - (anchor.getMeasuredWidth() / 2);
        jx2.j jVar = this.f475757f;
        jVar.getClass();
        kotlin.jvm.internal.o.g(anchor, "anchor");
        jVar.f302434d = measuredWidth;
        jVar.a(anchor, null);
        android.view.View findViewById = jVar.getContentView().findViewById(com.tencent.mm.R.id.a4x);
        android.view.View findViewById2 = jVar.getContentView().findViewById(com.tencent.mm.R.id.a4q);
        if (findViewById != null) {
            findViewById.requestLayout();
        }
        if (findViewById2 != null) {
            findViewById2.requestLayout();
        }
    }
}
