package vf5;

/* loaded from: classes.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f436420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f436421e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f436422f;

    public i(android.view.View view, int i17, int i18) {
        this.f436420d = view;
        this.f436421e = i17;
        this.f436422f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f436420d;
        int paddingBottom = view.getPaddingBottom();
        if (paddingBottom == 0) {
            paddingBottom = this.f436421e;
        }
        int i17 = paddingBottom + this.f436422f;
        if (i17 < 0) {
            i17 = 0;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i17);
    }
}
