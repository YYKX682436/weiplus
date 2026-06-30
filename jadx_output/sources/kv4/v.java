package kv4;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f312740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f312741e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f312742f;

    public v(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3) {
        this.f312740d = h0Var;
        this.f312741e = h0Var2;
        this.f312742f = h0Var3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f312740d.f310123d;
        int height = ((android.widget.TextView) this.f312741e.f310123d).getHeight();
        kotlin.jvm.internal.o.d(this.f312742f.f310123d);
        frameLayout.setPadding(0, (int) (((height - ((com.tencent.mm.ui.widget.imageview.WeImageView) r2).getHeight()) / 2.0f) + 0.5f), 0, 0);
    }
}
