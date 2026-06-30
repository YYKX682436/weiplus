package oy2;

/* loaded from: classes8.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout f349953d;

    public e(com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout expandableScrollFrameLayout) {
        this.f349953d = expandableScrollFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oy2.m dialog = this.f349953d.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
