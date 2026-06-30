package h91;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView f279687d;

    public d(com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView mCanvasView) {
        this.f279687d = mCanvasView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.canvas.widget.MCanvasView mCanvasView = this.f279687d;
        android.view.ViewParent parent = mCanvasView.getParent();
        do {
            ((android.view.View) parent).forceLayout();
            parent = parent.getParent();
        } while (parent instanceof android.view.View);
        if (parent != null) {
            parent.requestLayout();
            mCanvasView.invalidate();
        }
    }
}
