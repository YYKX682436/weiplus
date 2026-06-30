package re5;

/* loaded from: classes8.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.textview.FadeEdgeTextView f394585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg3.c f394586e;

    public o(com.tencent.mm.ui.widget.textview.FadeEdgeTextView fadeEdgeTextView, gg3.c cVar) {
        this.f394585d = fadeEdgeTextView;
        this.f394586e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String q17 = com.tencent.mm.vfs.w6.q(this.f394586e.f271729d);
        com.tencent.mm.ui.widget.textview.FadeEdgeTextView fadeEdgeTextView = this.f394585d;
        fadeEdgeTextView.setText(q17);
        fadeEdgeTextView.invalidate();
    }
}
