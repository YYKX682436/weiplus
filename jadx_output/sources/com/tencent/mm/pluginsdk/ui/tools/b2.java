package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct f191524a = new com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Vector f191525b = new java.util.Vector();

    public final void a(int i17) {
        com.tencent.mm.autogen.mmdata.rpt.SendFileInWidgetStruct sendFileInWidgetStruct = this.f191524a;
        if (i17 == 1) {
            sendFileInWidgetStruct.f60191e++;
            return;
        }
        if (i17 == 2) {
            sendFileInWidgetStruct.f60192f++;
        } else if (i17 == 3) {
            sendFileInWidgetStruct.f60193g++;
        } else {
            if (i17 != 4) {
                return;
            }
            sendFileInWidgetStruct.f60202p++;
        }
    }
}
