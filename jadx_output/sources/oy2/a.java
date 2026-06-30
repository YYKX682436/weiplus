package oy2;

/* loaded from: classes8.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout f349935d;

    public a(com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout centerScrollFrameLayout) {
        this.f349935d = centerScrollFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oy2.m dialog = this.f349935d.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
