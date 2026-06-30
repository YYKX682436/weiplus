package m21;

/* loaded from: classes4.dex */
public final class h implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.g92 f322988a = new r45.g92();

    @Override // m21.u
    public java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        java.lang.String c17 = zy2.d5.c(b());
        kotlin.jvm.internal.o.f(c17, "makeContent(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        return c17;
    }

    public r45.g92 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
        r45.g92 g92Var = this.f322988a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
        return g92Var;
    }

    public java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeFestivalContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        r45.g92 b17 = b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (b17 != null) {
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b17.getString(0))) {
                    sb6.append("<SpringFinderLive>");
                    sb6.append("<finderLiveID>");
                    sb6.append(b17.getString(0));
                    sb6.append("</finderLiveID>");
                    sb6.append("<finderUsername>");
                    sb6.append(com.tencent.mm.sdk.platformtools.t8.p(b17.getString(1)));
                    sb6.append("</finderUsername>");
                    sb6.append("<finderObjectID>");
                    sb6.append(b17.getString(2));
                    sb6.append("</finderObjectID>");
                    sb6.append("<nickname>");
                    sb6.append(com.tencent.mm.sdk.platformtools.aa.a(b17.getString(3)));
                    sb6.append("</nickname>");
                    sb6.append("<finderNonceID>");
                    sb6.append(com.tencent.mm.sdk.platformtools.t8.p(b17.getString(12)));
                    sb6.append("</finderNonceID>");
                    sb6.append("<liveStatus>");
                    sb6.append(com.tencent.mm.sdk.platformtools.aa.a(b17.getInteger(13) + ""));
                    sb6.append("</liveStatus>");
                    sb6.append("<headUrl>");
                    sb6.append(com.tencent.mm.sdk.platformtools.aa.a(b17.getString(11)));
                    sb6.append("</headUrl>");
                    sb6.append("<media>");
                    sb6.append("<coverUrl>");
                    sb6.append(com.tencent.mm.sdk.platformtools.aa.a(b17.getString(5)));
                    sb6.append("</coverUrl>");
                    sb6.append("<width>");
                    sb6.append(b17.getFloat(6));
                    sb6.append("</width>");
                    sb6.append("<height>");
                    sb6.append(b17.getFloat(7));
                    sb6.append("</height>");
                    sb6.append("</media>");
                    sb6.append("</SpringFinderLive>");
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "makeFestivalContent(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeFestivalContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        return sb7;
    }

    public void d(java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        e(zy2.d5.l(str, map));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
    }

    public void e(r45.g92 g92Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
        kotlin.jvm.internal.o.g(g92Var, "<set-?>");
        this.f322988a = g92Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
    }
}
