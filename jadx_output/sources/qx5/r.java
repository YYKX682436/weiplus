package qx5;

/* loaded from: classes13.dex */
public class r implements cy5.o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f367510a = false;

    /* renamed from: b, reason: collision with root package name */
    public android.app.ProgressDialog f367511b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367512c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f367513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f367514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cy5.p f367515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f367516g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f367517h;

    public r(java.lang.String str, boolean z17, android.content.Context context, cy5.p pVar, boolean z18, android.webkit.ValueCallback valueCallback) {
        this.f367512c = str;
        this.f367513d = z17;
        this.f367514e = context;
        this.f367515f = pVar;
        this.f367516g = z18;
        this.f367517h = valueCallback;
    }

    @Override // cy5.o
    public void a() {
        d(this.f367512c + " 下载更新中");
    }

    @Override // cy5.o
    public void b(int i17) {
        android.app.ProgressDialog progressDialog;
        if (this.f367510a || (progressDialog = this.f367511b) == null) {
            return;
        }
        progressDialog.setProgress(i17);
    }

    @Override // cy5.o
    public void c(int i17) {
        this.f367510a = true;
        java.lang.String str = this.f367512c;
        cy5.h d17 = cy5.m.d(str);
        int f17 = d17 != null ? d17.f(true) : -1;
        boolean z17 = this.f367516g;
        switch (i17) {
            case -11:
                d(str + " 更新失败，插件安装失败，ErrCode = " + i17);
                break;
            case -10:
                d(str + " 更新失败，插件下载失败，ErrCode = " + i17);
                break;
            case -9:
                d(str + " 更新失败，插件下载或安装失败，ErrCode = " + i17);
                break;
            case -8:
                d(str + " 更新失败，未找到可用更新，当前已安装版本" + f17 + "，ErrCode = " + i17);
                android.app.ProgressDialog progressDialog = this.f367511b;
                if (progressDialog != null && z17) {
                    progressDialog.dismiss();
                    break;
                }
                break;
            case -7:
                d(str + " 更新失败，配置中未包含插件信息，ErrCode = " + i17);
                break;
            case -6:
                d(str + " 更新失败，配置解析失败，ErrCode = " + i17);
                break;
            case -5:
                d(str + " 更新失败，配置下载失败，ErrCode = " + i17);
                break;
            case -4:
                d(str + " 更新失败，其它任务正在更新插件，ErrCode = " + i17);
                break;
            case -3:
                d(str + " 更新失败，未到检查时间，ErrCode = " + i17);
                break;
            case -2:
                d(str + " 更新失败，无网络，ErrCode = " + i17);
                break;
            case -1:
                d(str + " 更新被取消，ErrCode = " + i17);
                break;
            case 0:
                d(str + " 更新完成，已安装版本" + f17);
                android.app.ProgressDialog progressDialog2 = this.f367511b;
                if (progressDialog2 != null) {
                    progressDialog2.setProgress(100);
                    this.f367511b.getButton(-2).setVisibility(8);
                    this.f367511b.getButton(-1).setVisibility(0);
                    if (z17) {
                        this.f367511b.dismiss();
                        break;
                    }
                }
                break;
            default:
                d(str + " 更新失败，未知错误，ErrCode = " + i17);
                break;
        }
        android.webkit.ValueCallback valueCallback = this.f367517h;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(java.lang.Integer.valueOf(i17));
        }
    }

    public final void d(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showMessage, shouldAlert:");
        boolean z17 = this.f367513d;
        sb6.append(z17);
        sb6.append(", message:");
        sb6.append(str);
        by5.c4.f("XWebDebugPluginHelper", sb6.toString());
        android.content.Context context = this.f367514e;
        if (!z17) {
            android.widget.Toast.makeText(context, str, 0).show();
            return;
        }
        if (this.f367511b == null) {
            android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(context);
            this.f367511b = progressDialog;
            progressDialog.setProgressStyle(1);
            this.f367511b.setMessage(str);
            this.f367511b.setCancelable(false);
            this.f367511b.setCanceledOnTouchOutside(false);
            this.f367511b.setButton(-2, "取消", new qx5.p(this));
            this.f367511b.setButton(-1, "完成", new qx5.q(this));
            this.f367511b.show();
            this.f367511b.getButton(-1).setVisibility(8);
        }
        this.f367511b.setMessage(str);
    }
}
