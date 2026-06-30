package zx;

/* loaded from: classes14.dex */
public final class d implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f476944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx.t f476945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zx.u f476946f;

    public d(boolean z17, zx.t tVar, zx.u uVar) {
        this.f476944d = z17;
        this.f476945e = tVar;
        this.f476946f = uVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        if (this.f476944d) {
            return;
        }
        java.lang.String b17 = this.f476946f.f476972d.b();
        zx.t tVar = this.f476945e;
        if (b17 == null) {
            tVar.getClass();
            return;
        }
        if (android.text.TextUtils.equals(tVar.f476967f, b17)) {
            int x17 = tVar.x(b17);
            tVar.f476967f = null;
            if (x17 >= 0) {
                tVar.notifyItemChanged(x17);
            }
        }
    }
}
