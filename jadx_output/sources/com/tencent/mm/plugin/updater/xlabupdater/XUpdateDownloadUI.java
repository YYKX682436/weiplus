package com.tencent.mm.plugin.updater.xlabupdater;

@db5.a(4)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/updater/xlabupdater/XUpdateDownloadUI;", "Lcom/tencent/mm/plugin/updater/xlabupdater/DialogDownloadUI;", "<init>", "()V", "plugin-updater_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class XUpdateDownloadUI extends com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f175512q = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f175513h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f175514i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f175515m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f175516n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f175517o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ProgressBar f175518p;

    public XUpdateDownloadUI() {
        jz5.h.b(new xn4.p(this));
        jz5.h.b(new xn4.h(this));
        this.f175513h = -1;
    }

    @Override // com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI
    public void W6(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "onDownloadFail ");
        ym5.a1.f(new xn4.k(this));
    }

    @Override // com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI
    public void X6(double d17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "onDownloadProgress " + d17);
        android.widget.ProgressBar progressBar = this.f175518p;
        if (progressBar != null) {
            progressBar.setProgress((int) d17, true);
        }
    }

    @Override // com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI
    public void Y6(r45.mm6 info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "onDownloadSuccess ");
        xn4.c0 c0Var = xn4.c0.f455604a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        c0Var.k(context, info);
        c7();
        finish();
    }

    @Override // com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI
    public void Z6() {
        int i17 = this.f175513h;
        xn4.c0 c0Var = xn4.c0.f455604a;
        java.lang.String cdnUrl = V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl, "cdnUrl");
        if (i17 == c0Var.e(cdnUrl)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "curShowingStatus == XUpdateHelper.getCurStatus, dont need changeDialog " + this.f175513h);
            return;
        }
        java.lang.String cdnUrl2 = V6().f380677p;
        kotlin.jvm.internal.o.f(cdnUrl2, "cdnUrl");
        boolean z17 = true;
        if (!(c0Var.e(cdnUrl2) == 0)) {
            java.lang.String cdnUrl3 = V6().f380677p;
            kotlin.jvm.internal.o.f(cdnUrl3, "cdnUrl");
            if (c0Var.e(cdnUrl3) == 1) {
                this.f175513h = 1;
                d7();
                return;
            }
            return;
        }
        this.f175513h = 0;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
        java.lang.String str = V6().f380673i;
        if (str == null || str.length() == 0) {
            str = getString(com.tencent.mm.R.string.k3v);
        }
        u1Var.g(str);
        java.lang.String str2 = V6().f380675n;
        if (str2 == null || str2.length() == 0) {
            str2 = getString(com.tencent.mm.R.string.f490375t8);
        }
        u1Var.n(str2);
        java.lang.String str3 = V6().f380676o;
        if (str3 != null && str3.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str3 = getString(com.tencent.mm.R.string.f490347sg);
        }
        u1Var.j(str3);
        u1Var.l(new xn4.n(this));
        u1Var.i(new xn4.o(this));
        u1Var.q(false);
        this.f175514i = u1Var.f211998c;
    }

    @Override // com.tencent.mm.plugin.updater.xlabupdater.DialogDownloadUI
    public void a7(java.lang.String mediaId, r45.mm6 info) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "onMergeSuccess ");
        ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).wi(this, xn4.e0.f455614d.b().f380671g);
    }

    public final void c7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.XUpdate.XUpdateDownloadUI", "hideDownloadingDialog: ");
        ym5.a1.f(new xn4.i(this));
    }

    public final void d7() {
        android.text.TextPaint paint;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
        u1Var.d(com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.d2u, (android.view.ViewGroup) null));
        u1Var.n(getString(com.tencent.mm.R.string.k3u));
        u1Var.l(new xn4.l(this));
        u1Var.j(getString(com.tencent.mm.R.string.f490347sg));
        u1Var.i(new xn4.m(this));
        u1Var.q(false);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = u1Var.f211998c;
        this.f175515m = j0Var;
        this.f175516n = (android.widget.TextView) j0Var.findViewById(com.tencent.mm.R.id.otd);
        this.f175517o = (android.widget.TextView) j0Var.findViewById(com.tencent.mm.R.id.otb);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) j0Var.findViewById(com.tencent.mm.R.id.otc);
        this.f175518p = progressBar;
        if (progressBar != null) {
            progressBar.setProgress(this.f175509d, false);
        }
        android.widget.TextView textView = this.f175516n;
        if (textView != null && (paint = textView.getPaint()) != null) {
            com.tencent.mm.ui.bk.s0(paint);
        }
        android.widget.TextView textView2 = this.f175516n;
        if (textView2 != null) {
            java.lang.String str = V6().f380687z;
            if (str == null || str.length() == 0) {
                str = getString(com.tencent.mm.R.string.k3t);
            }
            textView2.setText(str);
        }
        android.widget.TextView textView3 = this.f175517o;
        if (textView3 == null) {
            return;
        }
        java.lang.String str2 = V6().f380687z;
        if (str2 == null || str2.length() == 0) {
            str2 = getString(com.tencent.mm.R.string.k3s) + com.tencent.mm.sdk.platformtools.t8.h0(V6().f380670f);
        }
        textView3.setText(str2);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }
}
