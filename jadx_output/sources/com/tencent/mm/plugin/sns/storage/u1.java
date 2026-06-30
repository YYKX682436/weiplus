package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public abstract class u1 {
    public static void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        java.lang.String[] split = ((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SNS_MEDIA_COLLAPSE_STRING, "")).split("&");
        boolean z17 = split.length >= 1 && com.tencent.mm.sdk.platformtools.t8.y(split[0], false);
        boolean z18 = split.length >= 2 && com.tencent.mm.sdk.platformtools.t8.y(split[1], false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 2; i17 < split.length; i17++) {
            long V = com.tencent.mm.sdk.platformtools.t8.V(split[i17], 0L);
            if (V != 0) {
                arrayList.add(java.lang.Long.valueOf(V));
            }
        }
        arrayList.remove(java.lang.Long.valueOf(j17));
        java.util.Collections.reverse(arrayList);
        java.lang.Long l17 = arrayList.size() > 0 ? (java.lang.Long) arrayList.get(0) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateConfigStg", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_MEDIA_COLLAPSE_SNS_ID_LONG, l17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateConfigStg", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17);
        sb6.append("&");
        sb6.append(z18);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            sb6.append("&");
            sb6.append(arrayList.get(i18));
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_MEDIA_COLLAPSE_STRING, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
    }

    public static boolean b(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
        if (W0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
            return false;
        }
        java.lang.String[] split = ((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SNS_MEDIA_COLLAPSE_STRING, "")).split("&");
        boolean z17 = split.length >= 1 && com.tencent.mm.sdk.platformtools.t8.y(split[0], false);
        boolean z18 = split.length >= 2 && com.tencent.mm.sdk.platformtools.t8.y(split[1], false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 2; i17 < split.length; i17++) {
            long V = com.tencent.mm.sdk.platformtools.t8.V(split[i17], 0L);
            if (V != 0) {
                arrayList.add(java.lang.Long.valueOf(V));
            }
        }
        if (W0.getTimeLine().ContentObj.f369837e == 15) {
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
                return false;
            }
            z17 = true;
        } else {
            if (!W0.isPhoto()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
                return false;
            }
            if (z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
                return false;
            }
            z18 = true;
        }
        if (!arrayList.contains(java.lang.Long.valueOf(j17))) {
            arrayList.add(java.lang.Long.valueOf(j17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z17);
        sb6.append("&");
        sb6.append(z18);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            sb6.append("&");
            sb6.append(arrayList.get(i18));
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_MEDIA_COLLAPSE_STRING, sb6.toString());
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateConfigStg", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_MEDIA_COLLAPSE_SNS_ID_LONG, valueOf);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateConfigStg", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveCollapseSnsId", "com.tencent.mm.plugin.sns.storage.SnsCollapseInfo");
        return true;
    }
}
