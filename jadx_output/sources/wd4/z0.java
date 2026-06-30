package wd4;

/* loaded from: classes9.dex */
public final class z0 {
    public z0(kotlin.jvm.internal.i iVar) {
    }

    public final int[] a(java.util.List items) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("array2int", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
        kotlin.jvm.internal.o.g(items, "items");
        int[] iArr = new int[items.size()];
        int size = items.size();
        for (int i17 = 0; i17 < size; i17++) {
            iArr[i17] = ((java.lang.Number) items.get(i17)).intValue();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("array2int", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
        return iArr;
    }

    public final jz5.l b(r45.jj4 media, java.lang.String snsLoacalId) {
        java.lang.String o17;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoQuickSharedPath", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(snsLoacalId, "snsLoacalId");
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), media.f377855d);
        kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
        if (com.tencent.mm.vfs.w6.j(d17 + ca4.z0.Y(media))) {
            o17 = d17 + ca4.z0.Y(media);
            str = d17 + ca4.z0.a0(media);
        } else {
            java.lang.String q17 = com.tencent.mm.plugin.sns.model.y6.q(media);
            o17 = com.tencent.mm.plugin.sns.model.y6.o(snsLoacalId, media);
            str = q17;
        }
        if (!com.tencent.mm.vfs.w6.j(o17)) {
            o17 = com.tencent.mm.plugin.sns.model.y6.m(snsLoacalId);
            com.tencent.mars.xlog.Log.w("MicroMsg.ShareSheet", "shareSendVideo get relocated video path: " + o17);
        }
        jz5.l lVar = new jz5.l(str, o17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoQuickSharedPath", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
        return lVar;
    }

    public final void c(android.app.Activity activity, java.lang.String toUsers, java.lang.String str, r45.jj4 media, java.lang.String snsLoacalId) {
        java.lang.String str2;
        c01.h7 h7Var;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shareSendVideo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(toUsers, "toUsers");
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(snsLoacalId, "snsLoacalId");
        jz5.l b17 = b(media, snsLoacalId);
        java.lang.String str6 = (java.lang.String) b17.f302834e;
        java.lang.String str7 = (java.lang.String) b17.f302833d;
        java.lang.String str8 = "MicroMsg.ShareSheet";
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareSheet", "shareSendVideo >> " + snsLoacalId + " fullPath: " + str6 + ", imagePath: " + str7);
        boolean z17 = true;
        if (!(str6 == null || str6.length() == 0)) {
            if (str7 != null && str7.length() != 0) {
                z17 = false;
            }
            if (!z17 && com.tencent.mm.vfs.w6.j(str6) && com.tencent.mm.vfs.w6.j(str7)) {
                boolean fj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).fj(vf0.j3.f436205g);
                c01.h7 h7Var2 = new c01.h7();
                h7Var2.f37230e = snsLoacalId;
                java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) new r26.t(",").g(toUsers, 0).toArray(new java.lang.String[0]));
                kotlin.jvm.internal.o.f(P1, "stringsToList(...)");
                int S = ca4.z0.S(str6);
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str9 = (java.lang.String) it.next();
                    com.tencent.mars.xlog.Log.i(str8, "send sight to %s, videopath %s, thumbpath %s duration %d", str9, str6, str7, java.lang.Integer.valueOf(S));
                    if (fj6) {
                        c35.o oVar = (c35.o) i95.n0.c(c35.o.class);
                        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                        kk.l lVar = t21.w2.f415056c;
                        java.lang.String a17 = t21.c3.a(str9);
                        vf0.r2 r2Var = new vf0.r2(null, null, null, null, null, null, false, null, null, null, false, true, 2047, null);
                        kotlin.jvm.internal.o.d(a17);
                        str2 = str7;
                        h7Var = h7Var2;
                        str3 = str8;
                        ((vf0.k2) oVar).Ai(new vf0.u2(a17, str6, str7, false, S, r2Var, h7Var), str9);
                        str5 = str9;
                        str4 = str6;
                    } else {
                        str2 = str7;
                        h7Var = h7Var2;
                        str3 = str8;
                        java.lang.String str10 = str6;
                        str4 = str10;
                        str5 = str9;
                        ((dk5.s5) tg3.t1.a()).nj(activity, str9, str10, str2, 62, S, false, false, "", null);
                    }
                    ((dk5.s5) tg3.t1.a()).Ui(str, str5);
                    str7 = str2;
                    str8 = str3;
                    h7Var2 = h7Var;
                    str6 = str4;
                }
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).Ai(snsLoacalId);
                com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareSendVideo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShareSheet", "shareSendVideo file is error >> " + str6 + ", " + str7);
        if (com.tencent.mm.plugin.sns.model.j4.e()) {
            com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.ihu), null, activity, null, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareSendVideo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$Companion");
    }
}
