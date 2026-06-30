package dk5;

/* loaded from: classes12.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f234713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f234714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f234716h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f234717i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f234718m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f234719n;

    public l0(java.util.List list, com.tencent.mm.vfs.r6 r6Var, com.tencent.mm.ui.widget.dialog.u3 u3Var, java.lang.String str, int i17, androidx.appcompat.app.AppCompatActivity appCompatActivity, boolean z17, int i18) {
        this.f234712d = list;
        this.f234713e = r6Var;
        this.f234714f = u3Var;
        this.f234715g = str;
        this.f234716h = i17;
        this.f234717i = appCompatActivity;
        this.f234718m = z17;
        this.f234719n = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List list;
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        java.util.List list2 = this.f234712d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f234714f;
        com.tencent.mm.vfs.r6 r6Var = this.f234713e;
        java.lang.String str = this.f234715g;
        int i17 = this.f234716h;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f234717i;
        int i18 = 0;
        int i19 = 0;
        for (java.lang.Object obj : list2) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str2 = (java.lang.String) obj;
            if (u3Var.isShowing()) {
                d75.b.g(new dk5.j0(u3Var, appCompatActivity, i19, list2));
                o70.k kVar = new o70.k(r6Var);
                kVar.f343259g.add(new o70.i(str2, null, 0L));
                kotlin.jvm.internal.o.g(str, "<set-?>");
                kVar.f343255c = str;
                kVar.f343258f = i18;
                kVar.f343256d = i17;
                o70.l lVar = (o70.l) kz5.n0.Z(((b80.u) i95.n0.c(b80.u.class)).oj(kVar));
                if (lVar != null) {
                    k70.i0 i0Var = new k70.i0();
                    i0Var.f304642a = i17;
                    java.lang.String r17 = c01.z1.r();
                    if (r17 == null) {
                        r17 = "";
                    }
                    list = list2;
                    r70.g gVar = new r70.g(str2, 0, r17, str, i0Var);
                    gVar.f393108j = "forward_img_from_gallery";
                    kotlinx.coroutines.flow.j oj6 = ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).oj(gVar, lVar);
                    java.lang.String str3 = gVar.f393102d;
                    gm0.b bVar = gm0.j1.b().f273245h;
                    if (bVar != null && (lifecycleScope = bVar.f273145e) != null) {
                        v65.i.b(lifecycleScope, null, new dk5.i0(oj6, "processImageShareFromSystemGallery", str3, null), 1, null);
                    }
                    i19 = i27;
                    list2 = list;
                    i18 = 0;
                }
            }
            list = list2;
            i19 = i27;
            list2 = list;
            i18 = 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.ImgRetransmitLogic", "delete pre build folder after send ret:" + com.tencent.mm.vfs.w6.g(this.f234713e.o(), true));
        if (this.f234714f.isShowing()) {
            ((ku5.t0) ku5.t0.f312615d).B(new dk5.k0(this.f234714f, this.f234717i, this.f234718m, this.f234715g, this.f234719n));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.ImgRetransmitLogic", "dialog is dismiss do nothing");
        }
    }
}
