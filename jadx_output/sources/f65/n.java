package f65;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final f65.n f259909a = new f65.n();

    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportAllImageDone >> " + z17 + ", " + aq.o.f12920a);
        if (aq.o.f12920a) {
            return;
        }
        f65.o.f259928q = z17 ? 1 : 2;
    }

    public final void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportImageDone >> " + z17 + ", " + aq.o.f12920a);
        if (aq.o.f12920a) {
            return;
        }
        f65.o.f259920i = z17 ? 1 : 2;
    }

    public final void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportInternalReport >> " + i17 + ", " + aq.o.f12920a);
        if (aq.o.f12920a) {
            return;
        }
        f65.o.f259912a.c(i17);
    }

    public final void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchAllNum >> " + i17 + ",  " + aq.o.f12920a);
        if (aq.o.f12920a) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReporter", "setSearchImageCnt >> " + i17 + ' ' + f65.o.f259917f);
        if (f65.o.f259917f.length() == 0) {
            return;
        }
        f65.o.f259923l = i17;
    }

    public final void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportSearchPeopleAllNum >> " + i17 + ",  " + aq.o.f12920a);
        if (aq.o.f12920a) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReporter", "setSearchPeopleImageCnt >> " + i17 + ' ' + f65.o.f259917f);
        if (f65.o.f259917f.length() == 0) {
            return;
        }
        f65.o.f259924m = i17;
    }

    public final void f(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportSubTabClick >> " + i17 + ", " + i18 + ", " + aq.o.f12920a);
        if (!aq.o.f12920a) {
            f65.o.f259926o = i17;
            f65.o.f259912a.c(i18);
            return;
        }
        int i19 = i17 - 1;
        if (aq.p.f12930b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryComposeOp", "ftsSubTabClickReport >> " + i19);
            de5.a aVar = de5.a.f229396a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "setCurrentSubType >> " + i19);
            de5.a.f229402g = i19;
            aVar.g(6);
        }
    }

    public final void g(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryReportProvider", "reportTecSearchImageNum >> " + i17 + ", " + aq.o.f12920a);
        if (aq.o.f12920a) {
            return;
        }
        f65.p.f259952s = i17;
    }
}
