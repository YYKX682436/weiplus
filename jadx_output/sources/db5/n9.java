package db5;

/* loaded from: classes15.dex */
public class n9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f228451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f228452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.VerticalScrollBar f228453f;

    public n9(com.tencent.mm.ui.base.VerticalScrollBar verticalScrollBar, int i17, int i18) {
        this.f228453f = verticalScrollBar;
        this.f228451d = i17;
        this.f228452e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.base.VerticalScrollBar verticalScrollBar = this.f228453f;
        java.lang.String[] strArr = verticalScrollBar.f197706f;
        if (strArr.length <= 0) {
            return;
        }
        int measureText = strArr[strArr.length + (-1)] != null ? (int) verticalScrollBar.f197715r.measureText(strArr[strArr.length - 1]) : 0;
        int b17 = i65.a.b(verticalScrollBar.getContext(), 16) + measureText;
        int length = (int) (verticalScrollBar.f197706f.length * verticalScrollBar.f197708h * verticalScrollBar.f197704d);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(length);
        int i17 = this.f228451d;
        com.tencent.mars.xlog.Log.i("MicroMsg.VerticalScrollBar", "onDraw newHeight:%s, viewHeight:%s, alphabetWidth:%s, newWidth:%s", valueOf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(measureText), java.lang.Integer.valueOf(b17));
        if (length == 0) {
            length = i17;
        }
        int i18 = this.f228452e;
        if (b17 > i18) {
            b17 = i18;
        }
        android.view.ViewGroup.LayoutParams layoutParams = verticalScrollBar.getLayoutParams();
        layoutParams.width = b17;
        layoutParams.height = length;
        verticalScrollBar.setLayoutParams(layoutParams);
    }
}
