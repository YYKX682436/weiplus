package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes13.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f158966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f158967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kd0.c3 f158968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f158969g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f158970h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.p0 f158971i;

    public o0(com.tencent.mm.plugin.scanner.model.p0 p0Var, java.util.List list, long j17, kd0.c3 c3Var, java.util.List list2, java.util.List list3) {
        this.f158971i = p0Var;
        this.f158966d = list;
        this.f158967e = j17;
        this.f158968f = c3Var;
        this.f158969g = list2;
        this.f158970h = list3;
    }

    @Override // java.lang.Runnable
    public void run() {
        kd0.c3 c3Var = this.f158968f;
        com.tencent.mm.plugin.scanner.model.p0 p0Var = this.f158971i;
        long j17 = this.f158967e;
        java.util.List<com.tencent.qbar.WxQBarResult> list = this.f158966d;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecogQBarOfImageFileListener", "%d scan file no result", java.lang.Long.valueOf(j17));
            if (((java.util.HashMap) p0Var.f158973a.f158987d).containsKey(java.lang.Long.valueOf(j17))) {
                com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileFailedEvent();
                java.lang.String str = (java.lang.String) ((java.util.HashMap) p0Var.f158973a.f158987d).get(java.lang.Long.valueOf(j17));
                am.bq bqVar = recogQBarOfImageFileFailedEvent.f54660g;
                bqVar.f6278a = str;
                boolean z17 = false;
                bqVar.f6279b = c3Var != null ? c3Var.f306625e : 0;
                if (c3Var != null && c3Var.f306626f) {
                    z17 = true;
                }
                bqVar.f6280c = z17;
                recogQBarOfImageFileFailedEvent.e();
                ((java.util.HashMap) p0Var.f158973a.f158987d).remove(java.lang.Long.valueOf(j17));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecogQBarOfImageFileListener", "%d scan file get %d results ", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(list.size()));
        com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = new com.tencent.mm.autogen.events.RecogQBarOfImageFileResultEvent();
        if (((java.util.HashMap) p0Var.f158973a.f158987d).containsKey(java.lang.Long.valueOf(j17))) {
            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) p0Var.f158973a.f158987d).get(java.lang.Long.valueOf(j17));
            am.cq cqVar = recogQBarOfImageFileResultEvent.f54661g;
            cqVar.f6368a = str2;
            android.graphics.Point point = c3Var.f306624d;
            if (point != null) {
                cqVar.f6374g = point.x;
                cqVar.f6375h = point.y;
            }
            cqVar.f6379l = c3Var.f306626f;
            cqVar.f6378k = c3Var.f306625e;
            cqVar.f6381n = c3Var.f306628h;
            cqVar.f6369b = new java.util.ArrayList();
            cqVar.f6371d = new java.util.ArrayList();
            cqVar.f6373f = new java.util.ArrayList();
            cqVar.f6370c = new java.util.ArrayList();
            cqVar.f6372e = new java.util.ArrayList();
            cqVar.f6376i = new java.util.ArrayList();
            cqVar.f6377j = new java.util.ArrayList();
            cqVar.f6380m = new java.util.ArrayList();
            for (com.tencent.qbar.WxQBarResult wxQBarResult : list) {
                cqVar.f6369b.add(wxQBarResult.f475332f);
                cqVar.f6371d.add(wxQBarResult.f475331e);
                cqVar.f6373f.add(java.lang.Integer.valueOf(wxQBarResult.f475335i));
                cqVar.f6370c.add(java.lang.Integer.valueOf(com.tencent.mm.plugin.scanner.j1.a(wxQBarResult.f475331e)));
            }
            java.util.List list2 = this.f158969g;
            if (list2 != null && !list2.isEmpty()) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    cqVar.f6372e.add(java.lang.Integer.valueOf(((com.tencent.qbar.WxQbarNative$QBarReportMsg) it.next()).qrcodeVersion));
                }
            }
            java.util.List<com.tencent.qbar.QbarNative$QBarPoint> list3 = this.f158970h;
            if (list3 != null && !list3.isEmpty()) {
                for (com.tencent.qbar.QbarNative$QBarPoint qbarNative$QBarPoint : list3) {
                    if (qbarNative$QBarPoint != null) {
                        float max = java.lang.Math.max(0.0f, (((qbarNative$QBarPoint.f215230x0 + qbarNative$QBarPoint.f215231x1) + qbarNative$QBarPoint.f215232x2) + qbarNative$QBarPoint.f215233x3) / 4.0f);
                        float max2 = java.lang.Math.max(0.0f, (((qbarNative$QBarPoint.f215234y0 + qbarNative$QBarPoint.f215235y1) + qbarNative$QBarPoint.f215236y2) + qbarNative$QBarPoint.f215237y3) / 4.0f);
                        cqVar.f6376i.add(java.lang.Float.valueOf(max));
                        cqVar.f6377j.add(java.lang.Float.valueOf(max2));
                        if (cqVar.f6374g > 0 && cqVar.f6375h > 0) {
                            float min = java.lang.Math.min(qbarNative$QBarPoint.f215232x2, qbarNative$QBarPoint.f215233x3);
                            float min2 = java.lang.Math.min(qbarNative$QBarPoint.f215234y0, qbarNative$QBarPoint.f215237y3);
                            float max3 = java.lang.Math.max(qbarNative$QBarPoint.f215230x0, qbarNative$QBarPoint.f215231x1);
                            float max4 = java.lang.Math.max(qbarNative$QBarPoint.f215235y1, qbarNative$QBarPoint.f215236y2);
                            int i17 = cqVar.f6374g;
                            int i18 = cqVar.f6375h;
                            cqVar.f6380m.add(new com.tencent.mm.plugin.scanner.CodePointRect(min / i17, min2 / i18, max3 / i17, max4 / i18));
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RecogQBarOfImageFileListener", "mFileScanCallback result:%d codeName:%d codeType:%d codeVersion:$d codePointCenterX:%d codePointCenterY:%d", java.lang.Integer.valueOf(cqVar.f6369b.size()), java.lang.Integer.valueOf(cqVar.f6371d.size()), java.lang.Integer.valueOf(cqVar.f6370c.size()), java.lang.Integer.valueOf(cqVar.f6372e.size()), java.lang.Integer.valueOf(cqVar.f6376i.size()), java.lang.Integer.valueOf(cqVar.f6377j.size()));
            recogQBarOfImageFileResultEvent.e();
            ((java.util.HashMap) p0Var.f158973a.f158987d).remove(java.lang.Long.valueOf(j17));
        }
    }
}
