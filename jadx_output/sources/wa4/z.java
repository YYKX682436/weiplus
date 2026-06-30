package wa4;

/* loaded from: classes4.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuffer f444307a = new java.lang.StringBuffer();

    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("append", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f444307a.append(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("append", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public void b(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        this.f444307a.append("</" + str + ">");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public java.lang.String c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        java.lang.String stringBuffer = this.f444307a.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getXml", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        return stringBuffer;
    }

    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        java.lang.StringBuffer stringBuffer = this.f444307a;
        if (K0) {
            stringBuffer.append("");
        } else if (str.contains("]]>")) {
            stringBuffer.append("<![CDATA[" + com.tencent.mm.sdk.platformtools.t8.p(str) + "]]>");
        } else {
            stringBuffer.append("<![CDATA[" + str + "]]>");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public void e(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        this.f444307a.append("<" + str + ">");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public void f(java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        java.lang.StringBuffer stringBuffer = this.f444307a;
        stringBuffer.append("<" + str);
        for (java.lang.String str2 : map.keySet()) {
            stringBuffer.append(" " + str2 + "=\"" + ((java.lang.String) map.get(str2)) + "\" ");
        }
        stringBuffer.append(">");
        map.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startTag", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public void g(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        this.f444307a.append(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }

    public void h(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
        d(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "com.tencent.mm.plugin.sns.snstimeline.TimelineConvert$pullXml");
    }
}
