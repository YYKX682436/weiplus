package oy2;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout f349950d;

    public b(com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout centerScrollFrameLayout) {
        this.f349950d = centerScrollFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oy2.m dialog = this.f349950d.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
