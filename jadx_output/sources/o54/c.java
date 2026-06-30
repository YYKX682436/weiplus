package o54;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o54.d f343122d;

    public c(o54.d dVar) {
        this.f343122d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        o54.d dVar = this.f343122d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder$1");
        try {
            o54.g.b(1673L, 1L, dVar.f343123a);
            o54.g.b(1673L, 2L, dVar.f343124b);
            o54.g.b(1673L, 3L, dVar.f343125c);
            o54.g.b(1673L, 4L, dVar.f343126d);
            o54.g.b(1673L, 5L, dVar.f343127e);
            o54.g.b(1673L, 15L, dVar.f343128f);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imgCnt=");
            sb6.append(dVar.f343123a);
            sb6.append(", sightCnt=");
            sb6.append(dVar.f343124b);
            sb6.append(", streamCnt=");
            sb6.append(dVar.f343125c);
            sb6.append(", commVideoCnt=");
            sb6.append(dVar.f343126d);
            sb6.append(", total=");
            sb6.append(dVar.f343127e);
            sb6.append(", normalTotal=");
            sb6.append(dVar.f343128f);
            sb6.append("|fpImgCnt=");
            sb6.append(dVar.f343129g);
            sb6.append(", fpSightCnt=");
            sb6.append(dVar.f343130h);
            sb6.append(", fpStreamCnt=");
            sb6.append(dVar.f343131i);
            sb6.append(", fpCommVideoCnt=");
            sb6.append(dVar.f343132j);
            sb6.append(", fpTotal=");
            sb6.append(dVar.f343133k);
            sb6.append(", fpNormalTotal=");
            sb6.append(dVar.f343134l);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPageStaticHelper.ComponentStaticBuilder", "report exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder$1");
    }
}
