package yt3;

/* loaded from: classes3.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f465494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f465495e;

    public i1(kotlin.jvm.internal.h0 h0Var, android.widget.TextView textView) {
        this.f465494d = h0Var;
        this.f465495e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = this.f465494d;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPlayPlugin", "DEBUG showVideoDebugInfoIfNeed %s", h0Var.f310123d);
        android.widget.TextView textView = this.f465495e;
        textView.setVisibility(0);
        textView.setText((java.lang.CharSequence) h0Var.f310123d);
    }
}
