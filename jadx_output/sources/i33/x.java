package i33;

/* loaded from: classes10.dex */
public final class x implements u23.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i33.a0 f288285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f288286b;

    public x(i33.a0 a0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f288285a = a0Var;
        this.f288286b = appCompatActivity;
    }

    @Override // u23.o
    public void a() {
        androidx.appcompat.app.AppCompatActivity activity = this.f288286b;
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.t0 t0Var = (i33.t0) pf5.z.f353948a.a(activity).a(i33.t0.class);
        t0Var.getClass();
        com.tencent.mars.xlog.Log.i(t0Var.f288247f, "disableShow force=false");
        t0Var.f288263y = false;
    }

    @Override // u23.o
    public void b(java.util.List result, boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView;
        kotlin.jvm.internal.o.g(result, "result");
        int size = result.isEmpty() ^ true ? ((v23.b) result.get(0)).f432887b.size() : 0;
        i33.a0 a0Var = this.f288285a;
        android.app.Activity context = a0Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        i33.b1 b1Var = (i33.b1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(i33.b1.class);
        java.lang.String ticket = a0Var.f288150o;
        b1Var.getClass();
        kotlin.jvm.internal.o.g(ticket, "ticket");
        i33.v vVar = (i33.v) ((java.util.LinkedHashMap) b1Var.f288164i).get(ticket);
        if (vVar != null) {
            vVar.f288279d = java.lang.System.currentTimeMillis();
            vVar.f288280e = size;
        }
        if (z17) {
            com.tencent.mm.autogen.mmdata.rpt.GalleryTecReportStruct galleryTecReportStruct = b1Var.f288162g;
            if (galleryTecReportStruct.f58308s <= 0) {
                galleryTecReportStruct.f58308s = java.lang.System.currentTimeMillis();
            }
        }
        java.util.List list = a0Var.f288149n;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(result);
        if (!((java.util.ArrayList) list).isEmpty()) {
            yz5.a aVar = a0Var.f288147i;
            if (aVar != null && (imageFolderMgrView = (com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView) aVar.invoke()) != null) {
                v23.b bVar = a0Var.f288151p;
                if (bVar == null) {
                    bVar = (v23.b) ((java.util.ArrayList) list).get(0);
                }
                imageFolderMgrView.b(list, bVar);
            }
            java.lang.String str2 = "";
            i33.l1.x3(this.f288285a, kotlin.jvm.internal.o.b(a0Var.X6(), "") ? ((v23.b) ((java.util.ArrayList) list).get(0)).f432886a : a0Var.X6(), z17, null, 4, null);
            if (!z17) {
                java.lang.String X6 = a0Var.X6();
                v23.b bVar2 = a0Var.f288151p;
                if (bVar2 != null && (str = bVar2.f432888c) != null) {
                    str2 = str;
                }
                a0Var.f288151p = a0Var.W6(list, X6, str2);
            }
        }
        com.tencent.mars.xlog.Log.i(a0Var.f288144f, "[MediaLoader.DataListener] onReady: " + result.size() + ", folderName: " + a0Var.X6() + ", willNewFolder: " + z17);
    }

    @Override // u23.o
    public void c() {
        androidx.appcompat.app.AppCompatActivity activity = this.f288286b;
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.t0 t0Var = (i33.t0) pf5.z.f353948a.a(activity).a(i33.t0.class);
        t0Var.getClass();
        com.tencent.mars.xlog.Log.i(t0Var.f288247f, "disableShow force=true");
        t0Var.f288263y = true;
    }
}
