package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes2.dex */
public final class i8 {
    public i8(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.view.View view, java.util.List ids, int i17) {
        kotlin.jvm.internal.o.g(ids, "ids");
        java.util.Iterator it = ids.iterator();
        while (it.hasNext()) {
            android.view.View findViewById = view != null ? view.findViewById(((java.lang.Number) it.next()).intValue()) : null;
            if (findViewById != null) {
                findViewById.animate().alpha(i17 == 0 ? 1.0f : 0.0f).setDuration(150L).withEndAction(new com.tencent.mm.plugin.mv.ui.uic.h8(findViewById, i17)).start();
            }
        }
    }
}
