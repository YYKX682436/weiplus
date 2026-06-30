package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class j0 {
    public j0(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(android.content.Context context, so2.y0 commentItem, java.lang.String feedUsername, boolean z17, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(commentItem, "commentItem");
        kotlin.jvm.internal.o.g(feedUsername, "feedUsername");
        if (z17) {
            if ((((xy2.c.e(context).length() > 0) && kotlin.jvm.internal.o.b(xy2.c.e(context), str)) || commentItem.f410703d.c1(context)) && !commentItem.f410703d.j1()) {
                return true;
            }
        } else if ((commentItem.f410703d.c1(context) || hc2.l.g(feedUsername)) && !commentItem.f410703d.j1()) {
            return true;
        }
        return false;
    }
}
