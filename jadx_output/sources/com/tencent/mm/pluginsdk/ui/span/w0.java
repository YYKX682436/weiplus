package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes4.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.y0 f191295d;

    public w0(com.tencent.mm.pluginsdk.ui.span.y0 y0Var) {
        this.f191295d = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.pluginsdk.ui.span.y0 y0Var = this.f191295d;
        android.view.View.OnLongClickListener onLongClickListener = y0Var.f191311q;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(y0Var.f191304g);
            y0Var.f191305h = true;
            y0Var.b();
        }
        android.view.View view = y0Var.f191304g;
        if (view == null || !view.isPressed()) {
            return;
        }
        y0Var.f191305h = true;
        y0Var.b();
    }
}
