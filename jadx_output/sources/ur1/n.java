package ur1;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final ur1.n f430361a = new ur1.n();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f430362b = jz5.h.b(ur1.m.f430360d);

    public final boolean a() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        r45.sl b17 = b();
        if (b17.f385823g == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterStrategy", "canShowBizCreatorCenter = true");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalCenterStrategy", "cellInfoList.is_originator_open = " + b17.f385823g);
        return false;
    }

    public final r45.sl b() {
        byte[] j17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f430362b).getValue()).j("personal_center_main_table");
        r45.sl slVar = new r45.sl();
        if (j17 != null) {
            try {
                slVar.parseFrom(j17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizPersonalCenterStrategy", "parseFrom failed", e17);
                com.tencent.mm.pluginsdk.model.e eVar = com.tencent.mm.pluginsdk.model.e.f189277a;
                com.tencent.mm.autogen.mmdata.rpt.BizGeneralExceptionReportStruct bizGeneralExceptionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BizGeneralExceptionReportStruct();
                bizGeneralExceptionReportStruct.f55394d = 2L;
                bizGeneralExceptionReportStruct.f55395e = bizGeneralExceptionReportStruct.b(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", true);
            }
        }
        return slVar;
    }

    public final com.tencent.pigeon.biz.BizNotificationTabInfo c() {
        java.util.ArrayList arrayList;
        java.util.LinkedList<r45.sm> linkedList = b().f385825i;
        java.util.List list = null;
        if (linkedList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.sm smVar : linkedList) {
                java.lang.String str = smVar.f385840d;
                java.util.LinkedList linkedList2 = smVar.f385841e;
                if (linkedList2 != null) {
                    arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                    java.util.Iterator it = linkedList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.Long.valueOf(((java.lang.Integer) it.next()).intValue()));
                    }
                } else {
                    arrayList = null;
                }
                arrayList2.add(new com.tencent.pigeon.biz.NotifyTabInfo(str, arrayList, java.lang.Boolean.valueOf(smVar.f385842f)));
            }
            list = kz5.n0.S0(arrayList2);
        }
        com.tencent.pigeon.biz.BizNotificationTabInfo bizNotificationTabInfo = new com.tencent.pigeon.biz.BizNotificationTabInfo(java.lang.Long.valueOf(r0.f385824h), list);
        java.util.List<com.tencent.pigeon.biz.NotifyTabInfo> tabList = bizNotificationTabInfo.getTabList();
        if (!(tabList == null || tabList.isEmpty())) {
            return bizNotificationTabInfo;
        }
        com.tencent.pigeon.biz.NotifyTabInfo notifyTabInfo = new com.tencent.pigeon.biz.NotifyTabInfo(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.pak), kz5.c0.i(4L, 5L, 6L, 22L, 33L, 26L, 39L), java.lang.Boolean.TRUE);
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.pal);
        java.util.List i17 = kz5.c0.i(7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 17L, 18L, 19L, 23L, 24L, 25L, 28L, 29L, 30L, 31L, 32L, 34L, 35L, 36L, 37L, 38L);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return new com.tencent.pigeon.biz.BizNotificationTabInfo(1L, kz5.c0.i(notifyTabInfo, new com.tencent.pigeon.biz.NotifyTabInfo(g17, i17, bool), new com.tencent.pigeon.biz.NotifyTabInfo(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.pao), kz5.c0.i(1L, 3L, 27L, 40L), bool)));
    }
}
