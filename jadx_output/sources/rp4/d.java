package rp4;

/* loaded from: classes3.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f398617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f398618e;

    public d(kotlin.jvm.internal.h0 h0Var, android.widget.TextView textView) {
        this.f398617d = h0Var;
        this.f398618e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = this.f398617d;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditVideoPreviewPlugin", "DEBUG showVideoDebugInfoIfNeed %s", h0Var.f310123d);
        android.widget.TextView textView = this.f398618e;
        textView.setVisibility(0);
        textView.setText((java.lang.CharSequence) h0Var.f310123d);
    }
}
