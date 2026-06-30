package ry4;

/* loaded from: classes.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f401649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f401650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401651f;

    public j(android.widget.LinearLayout linearLayout, int i17, int i18) {
        this.f401649d = linearLayout;
        this.f401650e = i17;
        this.f401651f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.LinearLayout linearLayout = this.f401649d;
        int paddingBottom = linearLayout.getPaddingBottom();
        if (paddingBottom == 0) {
            paddingBottom = this.f401650e;
        }
        int i17 = paddingBottom + this.f401651f;
        if (i17 < 0) {
            i17 = 0;
        }
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), i17);
    }
}
