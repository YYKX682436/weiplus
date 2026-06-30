package lw2;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw2.o f321587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f321588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f321589f;

    public n(lw2.o oVar, android.view.View view, android.util.Size size) {
        this.f321587d = oVar;
        this.f321588e = view;
        this.f321589f = size;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f321588e;
        this.f321587d.d(view.getMeasuredWidth(), view.getMeasuredHeight(), this.f321589f);
    }
}
