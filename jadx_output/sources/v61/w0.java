package v61;

@j95.b
/* loaded from: classes.dex */
public final class w0 extends i95.w implements com.tencent.mm.contact.m {
    public final java.lang.String wi() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n            <sysmsg type=\"sysmsgtemplate\">\n              <sysmsgtemplate>\n                <content_template type=\"unavailable_account_tip\">\n                  <plain><![CDATA[]]></plain>\n                  <template><![CDATA[");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d49);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        kotlin.jvm.internal.o.f(format, "format(...)");
        sb6.append(format);
        sb6.append(" $unavailable_tips_detail$]]></template>\n                  <link_list>\n                    <link name=\"unavailable_tips_detail\" type=\"link_unavailable_tips_url\">\n                      <title>");
        sb6.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490599zl));
        sb6.append("</title>\n                    </link>\n                  </link_list>\n                </content_template>\n              </sysmsgtemplate>\n            </sysmsg>\n        ");
        return r26.b0.b(sb6.toString());
    }
}
