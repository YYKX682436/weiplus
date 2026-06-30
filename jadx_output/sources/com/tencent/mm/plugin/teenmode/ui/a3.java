package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public final class a3 extends uh4.d0 {
    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = context.getString(com.tencent.mm.R.string.jqm);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        java.lang.String g27;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        aVar.f427965i.setVisibility(8);
        if (!aVar.a()) {
            aVar.f427969m.setVisibility(8);
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqo));
                return;
            }
            if (ordinal == 1) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqp));
                return;
            }
            if (ordinal == 2) {
                aVar.f427969m.setVisibility(0);
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqn));
                return;
            } else {
                if (ordinal != 3) {
                    return;
                }
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqp));
                return;
            }
        }
        int ordinal2 = state.ordinal();
        if (ordinal2 == 0) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f427962f, true);
            android.widget.TextView textView = aVar.f427964h;
            java.lang.Object[] objArr = new java.lang.Object[1];
            g27 = n17 != null ? n17.g2() : null;
            objArr[0] = g27 != null ? g27 : "";
            textView.setText(context.getString(com.tencent.mm.R.string.jqk, objArr));
            return;
        }
        if (ordinal2 == 1) {
            aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jql));
            return;
        }
        if (ordinal2 != 2) {
            if (ordinal2 != 3) {
                return;
            }
            aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jql));
        } else {
            com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f427962f, true);
            android.widget.TextView textView2 = aVar.f427964h;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            g27 = n18 != null ? n18.g2() : null;
            objArr2[0] = g27 != null ? g27 : "";
            textView2.setText(context.getString(com.tencent.mm.R.string.jqj, objArr2));
        }
    }
}
