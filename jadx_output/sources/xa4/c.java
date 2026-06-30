package xa4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final xa4.c f452822a = new xa4.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f452823b = new java.util.HashMap();

    public final void a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, boolean z17) {
        int i18;
        int i19;
        int i27;
        r45.fd6 fd6Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        if (!xa4.g.f452830d.y(snsInfo.getTimeLine())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        java.lang.String c17 = c(snsInfo, i17);
        java.util.HashMap hashMap = f452823b;
        if (!hashMap.containsKey(c17)) {
            hashMap.put(c17, new com.tencent.mm.autogen.mmdata.rpt.SnsRabbiot2023ExposeStruct());
        }
        com.tencent.mm.autogen.mmdata.rpt.SnsRabbiot2023ExposeStruct snsRabbiot2023ExposeStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsRabbiot2023ExposeStruct) hashMap.get(c17);
        if (snsRabbiot2023ExposeStruct == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
        if (timeLine == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        snsRabbiot2023ExposeStruct.f60698d = snsRabbiot2023ExposeStruct.b("feedID", ca4.z0.t0(snsInfo.field_snsId), true);
        snsRabbiot2023ExposeStruct.f60699e = snsRabbiot2023ExposeStruct.b("publishUin", snsInfo.getUserName(), true);
        snsRabbiot2023ExposeStruct.f60701g = xa4.g.w(timeLine, snsInfo.isAd(), z17) ? 1 : 0;
        java.lang.String str = timeLine.ContentDesc;
        int i28 = 0;
        snsRabbiot2023ExposeStruct.f60702h = str != null ? str.length() : 0;
        com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(snsInfo);
        kotlin.jvm.internal.o.d(e17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateMyCommentCount", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        java.lang.String sj6 = com.tencent.mm.plugin.sns.model.l4.sj();
        java.util.LinkedList<r45.e86> linkedList = e17.CommentUserList;
        if (linkedList != null) {
            i18 = 0;
            i19 = 0;
            for (r45.e86 e86Var : linkedList) {
                if (kotlin.jvm.internal.o.b(e86Var.f373126d, sj6)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(e86Var.f373134o)) {
                        i18++;
                    } else {
                        i19++;
                    }
                }
            }
        } else {
            i18 = 0;
            i19 = 0;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateMyCommentCount", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        int intValue = valueOf.intValue();
        snsRabbiot2023ExposeStruct.f60705k = valueOf2.intValue() + intValue;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateMyLikeCount", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        java.lang.String sj7 = com.tencent.mm.plugin.sns.model.l4.sj();
        java.util.LinkedList<r45.e86> linkedList2 = e17.LikeUserList;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            i27 = 0;
        } else {
            java.util.Iterator<T> it = linkedList2.iterator();
            i27 = 0;
            while (it.hasNext()) {
                if (kotlin.jvm.internal.o.b(((r45.e86) it.next()).f373126d, sj7) && (i27 = i27 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateMyLikeCount", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        snsRabbiot2023ExposeStruct.f60706l = i27;
        snsRabbiot2023ExposeStruct.f60704j = intValue;
        java.util.LinkedList<r45.e86> linkedList3 = e17.CommentUserList;
        snsRabbiot2023ExposeStruct.f60710p = linkedList3 != null ? linkedList3.size() : 0;
        java.util.LinkedList<r45.e86> linkedList4 = e17.CommentUserList;
        snsRabbiot2023ExposeStruct.f60703i = linkedList4 != null ? linkedList4.size() : 0;
        java.util.LinkedList<r45.e86> linkedList5 = e17.LikeUserList;
        snsRabbiot2023ExposeStruct.f60711q = linkedList5 != null ? linkedList5.size() : 0;
        r45.a90 a90Var = timeLine.ContentObj;
        if (a90Var != null && (fd6Var = a90Var.B) != null) {
            i28 = fd6Var.f374244e;
        }
        snsRabbiot2023ExposeStruct.f60712r = i28;
        snsRabbiot2023ExposeStruct.f60708n++;
        snsRabbiot2023ExposeStruct.f60707m = i17;
        if (snsInfo.isAd()) {
            snsRabbiot2023ExposeStruct.f60713s = snsRabbiot2023ExposeStruct.b("aid", snsInfo.getAid(), true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedExpose", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
    }

    public final void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("feedSpringTailClick", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedSpringTailClick", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
            return;
        }
        java.lang.String c17 = c(snsInfo, i17);
        java.util.HashMap hashMap = f452823b;
        if (!hashMap.containsKey(c17)) {
            hashMap.put(c17, new com.tencent.mm.autogen.mmdata.rpt.SnsRabbiot2023ExposeStruct());
        }
        com.tencent.mm.autogen.mmdata.rpt.SnsRabbiot2023ExposeStruct snsRabbiot2023ExposeStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsRabbiot2023ExposeStruct) hashMap.get(c17);
        if (snsRabbiot2023ExposeStruct == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedSpringTailClick", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        } else {
            snsRabbiot2023ExposeStruct.f60709o++;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("feedSpringTailClick", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        }
    }

    public final java.lang.String c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeUniqueKey", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        java.lang.String str = snsInfo.getLocalid() + '-' + i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeUniqueKey", "com.tencent.mm.plugin.sns.spring.SnsSpringFeed25330Reporter");
        return str;
    }
}
