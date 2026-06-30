package yh4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f462407a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f462408b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f462409c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f462410d;

    public a(java.lang.String name, int i17, android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        this.f462407a = name;
        this.f462408b = java.lang.Integer.valueOf(i17);
        this.f462410d = onClickListener;
    }

    public a(java.lang.String name, android.graphics.drawable.Drawable drawable, android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(onClickListener, "onClickListener");
        this.f462407a = name;
        this.f462409c = drawable;
        this.f462410d = onClickListener;
    }
}
