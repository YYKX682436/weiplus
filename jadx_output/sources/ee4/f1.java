package ee4;

/* loaded from: classes4.dex */
public final class f1 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f251706n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f251707o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(ce4.b pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
        this.f251706n = "";
        this.f251707o = new java.util.HashMap();
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        return "SnsPublish.PicReportPc";
    }

    @Override // ce4.a
    public boolean h(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        if (!super.h(bundle)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
            return false;
        }
        java.lang.String stringExtra = c().getIntent().getStringExtra("KSessionID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f251706n = stringExtra;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        return true;
    }

    @Override // ce4.a
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        super.i();
        this.f251707o.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
    }

    public final void p(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem snsPublishBaseMultiPicItem, boolean z17) {
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addReportInfoFromPicItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        if (snsPublishBaseMultiPicItem != null) {
            try {
                java.lang.String b17 = snsPublishBaseMultiPicItem.b();
                kotlin.jvm.internal.o.d(b17);
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(b17);
                java.lang.String str = a17.f213279f;
                if (str != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                ee4.f1 n17 = n();
                java.lang.String b18 = snsPublishBaseMultiPicItem.b();
                kotlin.jvm.internal.o.d(b18);
                int i17 = z17 ? 1 : 2;
                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                long j17 = 0;
                if (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) {
                    j17 = m17.f213235e;
                }
                long uxtimeDatatimeOriginal = com.tencent.mm.compatible.util.Exif.fromFile(snsPublishBaseMultiPicItem.b()).getUxtimeDatatimeOriginal();
                n17.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
                r45.ea6 ea6Var = new r45.ea6();
                ea6Var.f373199h = i17;
                ea6Var.f373201m = j17 / 1000;
                ea6Var.f373200i = uxtimeDatatimeOriginal;
                n17.f251707o.put(b18, ea6Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
            } catch (java.lang.Exception e17) {
                f("get report info error " + e17.getMessage());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addReportInfoFromPicItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
    }

    public final void q(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
        com.tencent.mm.autogen.mmdata.rpt.SnsBeforePostImageInfoStruct snsBeforePostImageInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsBeforePostImageInfoStruct();
        snsBeforePostImageInfoStruct.f60464f = snsBeforePostImageInfoStruct.i();
        snsBeforePostImageInfoStruct.f60462d = i17;
        snsBeforePostImageInfoStruct.f60463e = snsBeforePostImageInfoStruct.b("SessionId", this.f251706n, true);
        snsBeforePostImageInfoStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicReportPc");
    }
}
