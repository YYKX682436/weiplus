package qx5;

/* loaded from: classes13.dex */
public class t extends by5.u0 {

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f367519f = null;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f367520g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cy5.h f367521h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f367522i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f367523j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367524k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367525l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f367526m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f367527n;

    public t(android.content.Context context, cy5.h hVar, int i17, boolean z17, java.lang.String str, java.lang.String str2, boolean z18, android.webkit.ValueCallback valueCallback) {
        this.f367520g = context;
        this.f367521h = hVar;
        this.f367522i = i17;
        this.f367523j = z17;
        this.f367524k = str;
        this.f367525l = str2;
        this.f367526m = z18;
        this.f367527n = valueCallback;
    }

    @Override // by5.u0
    public java.lang.Object d(java.lang.Object[] objArr) {
        java.io.File file;
        by5.n0 n0Var;
        cy5.h hVar = this.f367521h;
        boolean z17 = true;
        try {
            int f17 = hVar.f(true);
            int i17 = this.f367522i;
            if (i17 <= 0) {
                i17 = 99999;
                if (f17 >= 99999) {
                    i17 = f17 + 1;
                }
            } else if (f17 > 0) {
                java.lang.String o17 = hVar.o(f17);
                hVar.u(-1, true);
                if (o17 != null && !o17.isEmpty()) {
                    by5.u.h(o17);
                }
            }
            n0Var = new by5.n0();
            by5.m0 m0Var = n0Var.f36574m;
            m0Var.f36537e = i17;
            n0Var.f36571j = false;
            m0Var.f36555w = hVar.g(i17, false);
            file = new java.io.File(m0Var.f36555w);
        } catch (java.lang.Exception e17) {
            e = e17;
            file = null;
        }
        try {
            if (this.f367523j) {
                by5.u.f(this.f367520g.getAssets().open(this.f367524k), file);
            } else {
                by5.u.d(this.f367525l, file.getPath());
            }
            n0Var.f36567f = by5.x.c(file.getPath());
            n0Var.f36573l = true;
            if (hVar.s(n0Var) != 0) {
                z17 = false;
            }
            return java.lang.Boolean.valueOf(z17);
        } catch (java.lang.Exception e18) {
            e = e18;
            by5.c4.c("XWebDebugPluginHelper", "loadZipFormatPluginFromLocal error: " + e);
            if (file != null) {
                by5.u.h(file.getAbsolutePath());
            }
            return java.lang.Boolean.FALSE;
        }
    }

    @Override // by5.u0
    public void g(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (bool.booleanValue()) {
            this.f367519f.setMessage("安装完成");
        } else {
            java.lang.String str = this.f367523j ? "asset/" : "sdcard/apkxwebtest/";
            this.f367519f.setMessage("安装失败，请确保文件存在: " + str + this.f367524k);
        }
        this.f367519f.getButton(-1).setVisibility(0);
        if (this.f367526m) {
            this.f367519f.hide();
        }
        android.webkit.ValueCallback valueCallback = this.f367527n;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(bool);
        }
    }

    @Override // by5.u0
    public void h() {
        android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(this.f367520g);
        this.f367519f = progressDialog;
        progressDialog.setProgressStyle(0);
        this.f367519f.setMessage("安装中");
        this.f367519f.setCancelable(false);
        this.f367519f.setCanceledOnTouchOutside(false);
        this.f367519f.setButton(-1, "完成", new qx5.s(this));
        this.f367519f.show();
        this.f367519f.getButton(-1).setVisibility(8);
    }
}
