package d22;

/* loaded from: classes12.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f225838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f225839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f225840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d22.k0 f225841g;

    public f0(com.tencent.mm.ui.widget.dialog.f4 f4Var, boolean z17, android.content.Context context, d22.k0 k0Var) {
        this.f225838d = f4Var;
        this.f225839e = z17;
        this.f225840f = context;
        this.f225841g = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f225838d.dismiss();
        if (this.f225839e) {
            d22.k0 k0Var = this.f225841g;
            o22.i.c(this.f225840f, 6, k0Var.f225852i.getMd5(), k0Var.f364227e);
        }
    }
}
