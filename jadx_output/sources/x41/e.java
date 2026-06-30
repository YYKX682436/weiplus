package x41;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.openim.ui.view.BaseDialogView f451771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f451772e;

    public e(com.tencent.mm.openim.ui.view.BaseDialogView baseDialogView, int i17) {
        this.f451771d = baseDialogView;
        this.f451772e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x41.b bVar = this.f451771d.f72309i;
        if (bVar != null) {
            bVar.dismissDialog(this.f451772e);
        }
    }
}
