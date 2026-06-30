package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public final class b extends uh4.d0 {
    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = context.getString(com.tencent.mm.R.string.f490614a00);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // uh4.c
    public void c(android.content.Context context, uh4.b state, uh4.a aVar) {
        java.util.Map d17;
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(state, "state");
        if (aVar == null || (d17 = com.tencent.mm.sdk.platformtools.aa.d(((rt0.e) aVar.f427957a.y(rt0.e.class)).f399380e, "content", null)) == null || (str = (java.lang.String) d17.get(".content")) == null) {
            return;
        }
        ot0.q v17 = ot0.q.v(str);
        boolean a17 = aVar.a();
        boolean z17 = a17 || state == uh4.b.AUTHORIZED;
        if (v17 != null) {
            aVar.f427968l.setText(v17.f348654f);
            n11.a b17 = n11.a.b();
            java.lang.String str2 = v17.f348734z;
            android.widget.ImageView imageView = aVar.f427966j;
            o11.f fVar = new o11.f();
            fVar.f342096t = true;
            fVar.f342093q = com.tencent.mm.R.drawable.bpu;
            b17.h(str2, imageView, fVar.a());
        }
        if (a17) {
            aVar.f427969m.setVisibility(0);
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqw));
            } else if (ordinal == 1) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqx));
            } else if (ordinal == 2) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqv));
            } else if (ordinal == 3) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqu));
            }
        } else {
            aVar.f427969m.setVisibility(8);
            int ordinal2 = state.ordinal();
            if (ordinal2 == 0) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.f493322jr0));
            } else if (ordinal2 == 1) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.f493323jr1));
            } else if (ordinal2 == 2) {
                aVar.f427969m.setVisibility(0);
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqz));
            } else if (ordinal2 == 3) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqy));
            }
        }
        if (z17) {
            aVar.f427965i.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.a(v17, context));
        } else {
            aVar.f427965i.setOnClickListener(null);
        }
    }
}
