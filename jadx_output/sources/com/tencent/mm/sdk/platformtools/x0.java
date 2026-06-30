package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f193069a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuffer f193070b;

    public x0(java.lang.String str) {
        this.f193069a = "";
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        this.f193070b = stringBuffer;
        this.f193069a = str;
        stringBuffer.append("<" + str + ">");
    }

    public void a(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuffer stringBuffer = this.f193070b;
        stringBuffer.append("<" + str + ">");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            stringBuffer.append("");
        } else if (str2.contains("]]>")) {
            stringBuffer.append("<![CDATA[" + com.tencent.mm.sdk.platformtools.t8.p(str2) + "]]>");
        } else {
            stringBuffer.append("<![CDATA[" + str2 + "]]>");
        }
        stringBuffer.append("</" + str + ">");
    }
}
