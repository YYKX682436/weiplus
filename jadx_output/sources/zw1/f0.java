package zw1;

/* loaded from: classes5.dex */
public class f0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f476620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI f476621e;

    public f0(com.tencent.mm.plugin.collect.ui.CollectCreateQRCodeNewUI collectCreateQRCodeNewUI, android.view.View.OnClickListener onClickListener) {
        this.f476621e = collectCreateQRCodeNewUI;
        this.f476620d = onClickListener;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66 && this.f476621e.f96381h.isShown()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CollectCreateQRCodeNewUI", "click enter");
            this.f476620d.onClick(null);
        }
        return true;
    }
}
