package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class vs implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f170711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f170712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f170713f;

    public vs(com.tencent.mm.modelbase.m1 m1Var, android.content.Context context, long j17) {
        this.f170711d = m1Var;
        this.f170712e = context;
        this.f170713f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        r45.k76 k76Var;
        com.tencent.mm.protocal.protobuf.SnsObject snsObject;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2;
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil$4");
        com.tencent.mm.modelbase.m1 m1Var = this.f170711d;
        r45.e86 e86Var = null;
        if (m1Var instanceof com.tencent.mm.plugin.sns.model.n2) {
            com.tencent.mm.plugin.sns.model.n2 n2Var = (com.tencent.mm.plugin.sns.model.n2) m1Var;
            n2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            r45.l76 l76Var = n2Var.f164485g;
            k76Var = l76Var != null ? l76Var.f379205f : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            com.tencent.mm.plugin.sns.model.n2 n2Var2 = (com.tencent.mm.plugin.sns.model.n2) m1Var;
            n2Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsRspObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            snsObject = n2Var2.f164488m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRspObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            com.tencent.mm.plugin.sns.model.n2 n2Var3 = (com.tencent.mm.plugin.sns.model.n2) m1Var;
            n2Var3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
            snsInfo = n2Var3.f164487i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
        } else if (m1Var instanceof com.tencent.mm.plugin.sns.model.i2) {
            com.tencent.mm.plugin.sns.model.i2 i2Var = (com.tencent.mm.plugin.sns.model.i2) m1Var;
            i2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            r45.l76 l76Var2 = i2Var.f164290g;
            k76Var = l76Var2 != null ? l76Var2.f379205f : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAction", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            com.tencent.mm.plugin.sns.model.i2 i2Var2 = (com.tencent.mm.plugin.sns.model.i2) m1Var;
            i2Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            snsObject = i2Var2.f164293m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            com.tencent.mm.plugin.sns.model.i2 i2Var3 = (com.tencent.mm.plugin.sns.model.i2) m1Var;
            i2Var3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
            if (i2Var3.f164292i == null) {
                r45.l76 l76Var3 = i2Var3.f164290g;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfoInner", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                try {
                    snsInfo2 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(l76Var3.f379203d);
                    if (snsInfo2 == null && (y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(l76Var3.f379203d)) != null) {
                        snsInfo2 = y07.convertToSnsInfo();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoInner", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                } catch (java.lang.Throwable unused) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoInner", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                    snsInfo2 = null;
                }
                i2Var3.f164292i = snsInfo2;
            }
            snsInfo = i2Var3.f164292i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
        } else {
            snsInfo = null;
            k76Var = null;
            snsObject = null;
        }
        if (k76Var == null || snsObject == null || snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil$4");
            return;
        }
        android.os.Vibrator vibrator = ca4.z0.f40068a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentSended", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str = k76Var.f378465n;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentSended", "com.tencent.mm.plugin.sns.data.SnsUtil");
        } else {
            java.lang.String str2 = k76Var.f378458d;
            java.util.LinkedList<r45.e86> linkedList = snsObject.CommentUserList;
            if (linkedList != null) {
                int size = linkedList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    r45.e86 e86Var2 = linkedList.get(size);
                    if (e86Var2 != null && android.text.TextUtils.equals(str2, e86Var2.f373126d) && android.text.TextUtils.equals(e86Var2.f373130h, str)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentSended", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        e86Var = e86Var2;
                        break;
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentSended", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
        if (e86Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil$4");
            return;
        }
        java.util.regex.Matcher matcher = com.tencent.mm.pluginsdk.ui.span.b0.f191186u.matcher(k76Var.f378465n);
        while (matcher.find()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = e86Var.f373132m;
            sb6.append(i17 != 0 ? i17 : e86Var.f373137r);
            sb6.append("");
            com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I(this.f170712e, snsInfo, ca4.z0.n0(e86Var), sb6.toString(), 3, matcher.group(), this.f170713f);
        }
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1 = o13.n.l(79);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil$4");
    }
}
