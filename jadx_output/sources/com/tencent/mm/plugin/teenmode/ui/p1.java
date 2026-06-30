package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public final class p1 extends com.tencent.mm.plugin.teenmode.ui.m1 {
    @Override // com.tencent.mm.plugin.teenmode.ui.m1, uh4.c
    public java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = context.getString(com.tencent.mm.R.string.l7b);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.teenmode.ui.m1, uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        android.content.Context context2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        android.widget.LinearLayout linearLayout = aVar.f427965i;
        if (linearLayout == null || (context2 = linearLayout.getContext()) == null) {
            context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context2);
        h(context2, state, aVar, false);
        f(context2, state, aVar, false);
    }
}
