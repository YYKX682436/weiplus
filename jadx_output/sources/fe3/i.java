package fe3;

/* loaded from: classes7.dex */
public enum i {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f261552d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f261553e = new java.util.concurrent.ConcurrentHashMap();

    i() {
        fe3.g gVar = new fe3.g(this);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().a(gVar);
    }

    public void a(oq1.q qVar, com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo, java.lang.String str, jc3.m0 m0Var) {
        com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo wxaMagicPkgInfo2 = new com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo();
        if (wxaMagicPkgInfo == null) {
            wxaMagicPkgInfo2.f147858d = str;
            wxaMagicPkgInfo2.f147865n = "default";
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene scene = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene.Download;
            kotlin.jvm.internal.o.g(scene, "scene");
            ((je3.i) i95.n0.c(je3.i.class)).Rg(str, wxaMagicPkgInfo2.f147865n, wxaMagicPkgInfo2.f147866o, wxaMagicPkgInfo2.f147860f, 0, scene, 0, 0);
        } else {
            java.lang.String str2 = wxaMagicPkgInfo.f147858d;
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene scene2 = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene.Download;
            kotlin.jvm.internal.o.g(scene2, "scene");
            ((je3.i) i95.n0.c(je3.i.class)).Rg(str2, wxaMagicPkgInfo.f147865n, wxaMagicPkgInfo.f147866o, wxaMagicPkgInfo.f147860f, 0, scene2, 0, 0);
        }
        com.tencent.mm.plugin.downloader.model.t0 t0Var = new com.tencent.mm.plugin.downloader.model.t0(null);
        t0Var.f97156g = str;
        t0Var.f97150a = qVar.f347349d;
        t0Var.f97153d = qVar.f347350e;
        t0Var.f97155f = 2;
        t0Var.f97159j = false;
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        long b17 = com.tencent.mm.plugin.downloader.model.r0.i().b(t0Var);
        ((java.util.concurrent.ConcurrentHashMap) this.f261553e).put(java.lang.Long.valueOf(b17), new fe3.h(this, "downloadMagicPkg", qVar, wxaMagicPkgInfo != null ? wxaMagicPkgInfo : wxaMagicPkgInfo2, m0Var));
        this.f261552d.add(java.lang.Long.valueOf(b17));
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPkgDownloadPkg", "downloadMagicPkg:taskId:%s", java.lang.Long.valueOf(b17));
    }
}
