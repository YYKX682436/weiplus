package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public final class s1 extends uh4.d0 {
    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return "未知类型";
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        java.lang.String str;
        ot0.q qVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(state, "state");
        rt0.e eVar = (aVar == null || (qVar = aVar.f427957a) == null) ? null : (rt0.e) qVar.y(rt0.e.class);
        if (eVar != null) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(eVar.f399380e, "content", null);
            android.widget.TextView textView = aVar.f427968l;
            if (d17 == null || (str = (java.lang.String) d17.get(".msg.appmsg.title")) == null) {
                str = "";
            }
            textView.setText(str);
        }
    }
}
