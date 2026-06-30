package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class a2 extends com.tencent.mm.plugin.sns.model.f2 {

    /* renamed from: c */
    public final java.lang.String f164065c;

    /* renamed from: e */
    public final java.lang.String f164067e;

    /* renamed from: f */
    public final java.lang.String f164068f;

    /* renamed from: g */
    public final r45.jj4 f164069g;

    /* renamed from: h */
    public final int f164070h;

    /* renamed from: j */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i1 f164072j;

    /* renamed from: d */
    public com.tencent.mm.memory.r f164066d = null;

    /* renamed from: i */
    public final boolean f164071i = true;

    public a2(com.tencent.mm.plugin.sns.model.i1 i1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, r45.jj4 jj4Var, int i17) {
        this.f164072j = i1Var;
        this.f164065c = "";
        this.f164070h = 0;
        this.f164065c = str;
        this.f164067e = str2;
        this.f164068f = str3;
        this.f164069g = jj4Var;
        this.f164070h = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1108", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.model.i1.f164251x++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1108", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.String str4 = jj4Var.f377855d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int i18 = com.tencent.mm.plugin.sns.model.i1.f164251x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.ImageLoader", "create loader for key:%s, media:%s, pendingCount:%s, path:%s", str, str4, java.lang.Integer.valueOf(i18), str2);
    }

    public static /* synthetic */ java.lang.String e(com.tencent.mm.plugin.sns.model.a2 a2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        java.lang.String str = a2Var.f164065c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03d8  */
    @Override // com.tencent.mm.plugin.sns.model.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.Object[] r37) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.a2.a(java.lang.Object[]):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public java.util.concurrent.ExecutorService b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        java.util.concurrent.ExecutorService bj6 = com.tencent.mm.plugin.sns.model.l4.bj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExecutor", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        return bj6;
    }

    @Override // com.tencent.mm.plugin.sns.model.f2
    public void c(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        super.c((java.lang.Boolean) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1110", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.model.i1.f164251x--;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1110", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        ((java.util.HashSet) this.f164072j.f164274w).remove(this.f164065c);
        if (this.f164069g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageLoader", "[%s][media:%s] ImageLoader onPostExecute start1", "[image-flow]", g());
            java.lang.String mediaId = this.f164069g.f377855d;
            int size = com.tencent.mm.plugin.sns.model.i1.d(this.f164072j).size();
            ta4.u0 u0Var = ta4.u0.f416838a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("imageLoaderFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            pm0.v.O("SnsImageLoadReporter", new ta4.f0(mediaId, size));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("imageLoaderFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        } else if (this.f164065c.contains("-")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageLoader", "[%s][media:%s] ImageLoader onPostExecute start2 key:%s", "[image-flow]", g(), this.f164065c);
            java.lang.String str = this.f164065c;
            java.lang.String mediaId2 = str.substring(str.indexOf("-") + 1);
            int size2 = com.tencent.mm.plugin.sns.model.i1.d(this.f164072j).size();
            ta4.u0 u0Var2 = ta4.u0.f416838a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("imageLoaderFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            kotlin.jvm.internal.o.g(mediaId2, "mediaId");
            pm0.v.O("SnsImageLoadReporter", new ta4.f0(mediaId2, size2));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("imageLoaderFinished", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageLoader", "[%s][media:%s] ImageLoader onPostExecute start3 key:%s", "[image-flow]", g(), this.f164065c);
        }
        com.tencent.mm.plugin.sns.model.i1 i1Var = this.f164072j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        i1Var.f164259h = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (this.f164071i) {
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.a2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.sns.model.a2 a2Var = com.tencent.mm.plugin.sns.model.a2.this;
                    a2Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onPostExecute$0", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
                    java.lang.String g17 = a2Var.g();
                    com.tencent.mm.memory.r rVar = a2Var.f164066d;
                    com.tencent.mm.plugin.sns.model.i1 i1Var2 = a2Var.f164072j;
                    i1Var2.r0(g17, a2Var.f164065c, rVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    i1Var2.o0();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onPostExecute$0", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
                }
            });
        } else {
            this.f164072j.r0(g(), this.f164065c, this.f164066d);
            com.tencent.mm.plugin.sns.model.i1 i1Var2 = this.f164072j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            i1Var2.o0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostExecute", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
    }

    public final void f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createUserThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str4 = this.f164068f;
        sb6.append(str4);
        sb6.append(str3);
        com.tencent.mm.vfs.w6.j(sb6.toString());
        if (!com.tencent.mm.vfs.w6.j(str4 + str)) {
            if (!com.tencent.mm.vfs.w6.j(str4 + str2)) {
                str2 = ca4.z0.W(this.f164069g);
            }
            boolean W0 = com.tencent.mm.plugin.sns.storage.m2.W0(str4, str2, str, com.tencent.mm.plugin.sns.model.l4.tj());
            if (!W0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageLoader", "delete %s", str2);
                com.tencent.mm.vfs.w6.h(str4 + str2);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageLoader", "createUserThumb %s -> %s, result:%b", str4 + str2, str4 + str, java.lang.Boolean.valueOf(W0));
        }
        com.tencent.mm.plugin.sns.storage.m2.i1(str4, str, str3, com.tencent.mm.plugin.sns.model.l4.mj());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createUserThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
    }

    public java.lang.String g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        r45.jj4 jj4Var = this.f164069g;
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
            return "";
        }
        java.lang.String str = jj4Var.f377855d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$ImageLoader");
        return str;
    }
}
