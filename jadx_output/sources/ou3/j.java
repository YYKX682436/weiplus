package ou3;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ou3.j f348958a = new ou3.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f348959b = com.tencent.mm.vfs.q7.c("PublicResource") + "/professional/filter";

    public final void a(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalRecordMaasFilterResManager", "copyAssets assetsPath:" + str + " localPath:" + str2);
        try {
            java.lang.String[] list = assetManager.list(str);
            if (list == null) {
                return;
            }
            if (!(list.length == 0)) {
                com.tencent.mm.vfs.w6.u(str2);
                for (java.lang.String str3 : list) {
                    f348958a.a(assetManager, str + '/' + str3, str2 + '/' + str3);
                }
                return;
            }
            java.io.InputStream open = assetManager.open(str);
            try {
                java.io.OutputStream K = com.tencent.mm.vfs.w6.K(str2, false);
                try {
                    kotlin.jvm.internal.o.d(open);
                    kotlin.jvm.internal.o.d(K);
                    vz5.a.b(open, K, 0, 2, null);
                    vz5.b.a(K, null);
                    vz5.b.a(open, null);
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ProfessionalRecordMaasFilterResManager", e17, "copyAssets", new java.lang.Object[0]);
        }
    }

    public final com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem b(ou3.h type) {
        com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem improveRecordMaasFilterItem;
        kotlin.jvm.internal.o.g(type, "type");
        int i17 = type.f348956d;
        ou3.h hVar = ou3.h.f348944e;
        if (i17 == 0) {
            return new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(vt3.m.f440011e, i17, "", "", 0, 0.0f, 32, null);
        }
        ou3.h hVar2 = ou3.h.f348944e;
        java.lang.String str = f348959b;
        if (i17 == 1) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.htt);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            improveRecordMaasFilterItem = new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(null, i17, string, str + "/ziran/live_filter_zr.astc", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a2u), 0.0f, 33, null);
        } else {
            ou3.h hVar3 = ou3.h.f348944e;
            if (i17 == 2) {
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.htk);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                improveRecordMaasFilterItem = new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(null, i17, string2, str + "/baixi/live_filter_bx.astc", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a2l), 0.0f, 33, null);
            } else {
                ou3.h hVar4 = ou3.h.f348944e;
                if (i17 == 3) {
                    java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.hts);
                    kotlin.jvm.internal.o.f(string3, "getString(...)");
                    improveRecordMaasFilterItem = new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(null, i17, string3, str + "/yuanqi/live_filter_yq.astc", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a2t), 0.0f, 33, null);
                } else {
                    ou3.h hVar5 = ou3.h.f348944e;
                    if (i17 == 4) {
                        java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.htm);
                        kotlin.jvm.internal.o.f(string4, "getString(...)");
                        improveRecordMaasFilterItem = new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(null, i17, string4, str + "/fennen/live_filter_fn.astc", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a2n), 0.0f, 33, null);
                    } else {
                        ou3.h hVar6 = ou3.h.f348944e;
                        if (i17 == 5) {
                            java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.htp);
                            kotlin.jvm.internal.o.f(string5, "getString(...)");
                            improveRecordMaasFilterItem = new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(null, i17, string5, str + "/qingche/live_filter_qc.astc", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a2q), 0.0f, 33, null);
                        } else {
                            ou3.h hVar7 = ou3.h.f348944e;
                            if (i17 == 6) {
                                java.lang.String string6 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.htn);
                                kotlin.jvm.internal.o.f(string6, "getString(...)");
                                improveRecordMaasFilterItem = new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(null, i17, string6, str + "/luori/live_filter_lr.astc", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a2o), 0.0f, 33, null);
                            } else {
                                ou3.h hVar8 = ou3.h.f348944e;
                                if (i17 == 7) {
                                    java.lang.String string7 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.htr);
                                    kotlin.jvm.internal.o.f(string7, "getString(...)");
                                    improveRecordMaasFilterItem = new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(null, i17, string7, str + "/shensui/live_filter_ss.astc", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a2s), 0.0f, 33, null);
                                } else {
                                    ou3.h hVar9 = ou3.h.f348944e;
                                    if (i17 == 8) {
                                        java.lang.String string8 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.htq);
                                        kotlin.jvm.internal.o.f(string8, "getString(...)");
                                        improveRecordMaasFilterItem = new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(null, i17, string8, str + "/qiuri/qiuri.astc", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a2r), 0.0f, 33, null);
                                    } else {
                                        ou3.h hVar10 = ou3.h.f348944e;
                                        if (i17 == 9) {
                                            java.lang.String string9 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.hto);
                                            kotlin.jvm.internal.o.f(string9, "getString(...)");
                                            improveRecordMaasFilterItem = new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(null, i17, string9, str + "/meishi/meishi.astc", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a2p), 0.0f, 33, null);
                                        } else {
                                            java.lang.String string10 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.htl);
                                            kotlin.jvm.internal.o.f(string10, "getString(...)");
                                            improveRecordMaasFilterItem = new com.tencent.mm.plugin.recordvideo.model.ImproveRecordMaasFilterItem(null, i17, string10, str + "/fanchaleng/fanchaleng.astc", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a2m), 0.0f, 33, null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return improveRecordMaasFilterItem;
    }
}
