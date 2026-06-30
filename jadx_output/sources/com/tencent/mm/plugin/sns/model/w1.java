package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f164726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164729g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i1 f164730h;

    public w1(com.tencent.mm.plugin.sns.model.i1 i1Var, r45.jj4 jj4Var, int i17, java.lang.String str, java.lang.String str2) {
        this.f164730h = i1Var;
        this.f164726d = jj4Var;
        this.f164727e = i17;
        this.f164728f = str;
        this.f164729g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set;
        r45.jj4 jj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$7");
        com.tencent.mm.plugin.sns.model.i1 i1Var = this.f164730h;
        if (com.tencent.mm.plugin.sns.model.i1.d(i1Var).size() >= 60) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "pushToImageLoaderImpl loaderlist.size:%d exceed, trim to MAX_DECODE_SIZE:%d", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.model.i1.d(i1Var).size()), 60);
        }
        while (true) {
            int size = com.tencent.mm.plugin.sns.model.i1.d(i1Var).size();
            set = i1Var.f164274w;
            jj4Var = this.f164726d;
            if (size < 60) {
                break;
            }
            com.tencent.mm.plugin.sns.model.a2 a2Var = (com.tencent.mm.plugin.sns.model.a2) com.tencent.mm.plugin.sns.model.i1.d(i1Var).removeFirst();
            com.tencent.mars.xlog.Log.e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] start pushToImageLoaderImpl too many,remove key:%s media:%s", "[image-flow]", jj4Var.f377855d, com.tencent.mm.plugin.sns.model.a2.e(a2Var), a2Var.g());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            ((java.util.HashSet) set).remove(a2Var.f164065c);
        }
        com.tencent.mm.plugin.sns.model.a2 a2Var2 = new com.tencent.mm.plugin.sns.model.a2(this.f164730h, ca4.z0.x(this.f164727e, jj4Var.f377855d), this.f164728f + this.f164729g, this.f164728f, this.f164726d, this.f164727e);
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] start pushToImageLoaderImpl ImageLoader key:%s", "[image-flow]", jj4Var.f377855d, com.tencent.mm.plugin.sns.model.a2.e(a2Var2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        jt0.i iVar = i1Var.f164254c;
        java.lang.String str = a2Var2.f164065c;
        if (iVar.k(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            ((java.util.HashSet) set).remove(str);
            com.tencent.mars.xlog.Log.e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] end pushToImageLoaderImpl ImageLoader key:%s for mMemoryCache already contains", "[image-flow]", jj4Var.f377855d, com.tencent.mm.plugin.sns.model.a2.e(a2Var2));
        } else {
            if (!((java.util.HashSet) set).contains(com.tencent.mm.plugin.sns.model.a2.e(a2Var2))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] end pushToImageLoaderImpl add ImageLoader key:%s ", "[image-flow]", jj4Var.f377855d, com.tencent.mm.plugin.sns.model.a2.e(a2Var2));
                com.tencent.mm.plugin.sns.model.i1.d(i1Var).add(a2Var2);
                ((java.util.HashSet) set).add(com.tencent.mm.plugin.sns.model.a2.e(a2Var2));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "add loaderlist size:%d", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.model.i1.d(i1Var).size()));
        java.lang.String mediaId = jj4Var.f377855d;
        int size2 = com.tencent.mm.plugin.sns.model.i1.d(i1Var).size();
        ta4.u0 u0Var = ta4.u0.f416838a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startImageLoader", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        pm0.v.O("SnsImageLoadReporter", new ta4.r0(mediaId, size2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startImageLoader", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        i1Var.o0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$7");
    }
}
