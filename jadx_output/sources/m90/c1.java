package m90;

/* loaded from: classes.dex */
public final class c1 implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String subType, java.util.Map values, com.tencent.mm.modelbase.p0 addMsgInfo) {
        kotlin.jvm.internal.o.g(subType, "subType");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        try {
            com.tencent.mars.xlog.Log.i("HandleFinderNewXmlReceived", "on new xml received: " + values);
            if (values.get(".sysmsg.sysmsgtemplate.content_template") != null) {
                java.lang.String str = (java.lang.String) values.get(".sysmsg.sysmsgtemplate.content_template.$type");
                if (kotlin.jvm.internal.o.b("tmpl_type_chatroom_finder", str)) {
                    return;
                }
                com.tencent.mars.xlog.Log.w("HandleFinderNewXmlReceived", "non supported type: " + str);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HandleFinderNewXmlReceived", th6, "onNewXmlReceived", new java.lang.Object[0]);
        }
    }
}
