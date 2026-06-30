package wo1;

/* loaded from: classes5.dex */
public final class y0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ po1.d f448056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f448057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f448058c;

    public y0(po1.d dVar, wo1.a1 a1Var, long j17) {
        this.f448056a = dVar;
        this.f448057b = a1Var;
        this.f448058c = j17;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        android.net.Uri data = intent != null ? intent.getData() : null;
        if (intent == null || data == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "result of data is null or uri is null, deviceId=" + this.f448056a.f357295a);
            return;
        }
        jz5.l e17 = to1.g.f420911a.e(data);
        if (e17 == null) {
            wo1.a1 a1Var = this.f448057b;
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseTaskStatusView", "Fail to parse uri=" + data);
            android.content.Context context = a1Var.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.mzd);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c();
            return;
        }
        java.lang.String str = (java.lang.String) e17.f302833d;
        java.lang.String str2 = (java.lang.String) e17.f302834e;
        if (!kotlin.jvm.internal.o.b(str, this.f448056a.f357300f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "uuid not match, uuid=" + str + ", deviceUUID=" + this.f448056a.f357300f);
            android.content.Context context2 = this.f448057b.getContext();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var2.d(com.tencent.mm.R.string.mzd);
            e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var2.c();
            return;
        }
        if (r26.i0.A(this.f448056a.f357299e, str2, false, 2, null)) {
            java.lang.String string = this.f448057b.getContext().getString(com.tencent.mm.R.string.mvy);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            ((ku5.t0) ku5.t0.f312615d).g(new wo1.x0(data, this.f448056a, str2, com.tencent.mm.ui.widget.dialog.u3.f(this.f448057b.getContext(), string, false, 3, null), this.f448057b, this.f448058c));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTaskStatusView", "path error, path=" + str2 + ", devicePath=" + this.f448056a.f357299e);
        android.content.Context context3 = this.f448057b.getContext();
        int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(context3);
        e4Var3.d(com.tencent.mm.R.string.mze);
        e4Var3.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var3.c();
    }
}
