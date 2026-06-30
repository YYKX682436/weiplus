package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public class m1 extends uh4.d0 {
    @Override // uh4.c
    public java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String string = context.getString(com.tencent.mm.R.string.l7a);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // uh4.c
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
        h(context2, state, aVar, true);
        f(context2, state, aVar, true);
    }

    public final void f(android.content.Context context, uh4.b state, uh4.a aVar, boolean z17) {
        java.util.Map d17;
        java.lang.String str;
        ot0.q v17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        ot0.q qVar = aVar.f427957a;
        rt0.e eVar = qVar != null ? (rt0.e) qVar.y(rt0.e.class) : null;
        if (eVar == null || (d17 = com.tencent.mm.sdk.platformtools.aa.d(eVar.f399380e, "content", null)) == null || (str = (java.lang.String) d17.get(".content")) == null || (v17 = ot0.q.v(str)) == null) {
            return;
        }
        java.lang.String str2 = v17.f348654f;
        android.widget.TextView textView = aVar.f427968l;
        boolean z18 = true;
        if (str2 == null || r26.n0.N(str2)) {
            str2 = context.getString(z17 ? com.tencent.mm.R.string.f490590zb : com.tencent.mm.R.string.f490589za);
        }
        textView.setText(str2);
        java.lang.String str3 = v17.f348734z;
        java.lang.String str4 = v17.f348674k;
        aVar.f427966j.setImageResource(com.tencent.mm.R.raw.app_attach_file_icon_webpage);
        aVar.f427966j.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        if (!(str3 == null || r26.n0.N(str3))) {
            n11.a b17 = n11.a.b();
            android.widget.ImageView imageView = aVar.f427966j;
            o11.f fVar = new o11.f();
            fVar.f342091o = com.tencent.mm.R.raw.app_attach_file_icon_webpage;
            fVar.f342098v = true;
            fVar.f342078b = true;
            fVar.f342082f = tv.a.b(str3);
            fVar.f342086j = 132;
            fVar.f342087k = 132;
            b17.h(str3, imageView, fVar.a());
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar.f427958b)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            aVar.f427966j.setImageBitmap(m11.b1.Di().m0(null, aVar.f427958b, i65.a.g(context), false));
        }
        float b18 = i65.a.b(context, 4);
        i95.m c17 = i95.n0.c(vv.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        fq1.e.f265507a.g(aVar.f427966j, b18, true, true);
        if (!aVar.a() && state != uh4.b.AUTHORIZED) {
            z18 = false;
        }
        if (!z18) {
            aVar.f427965i.setOnClickListener(null);
            return;
        }
        if (z17) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).d(str4, -1, 3, new java.lang.Object[0]);
        }
        aVar.f427965i.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.l1(z17, str4, context));
    }

    public final void h(android.content.Context context, uh4.b state, uh4.a aVar, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(state, "state");
        if (aVar == null) {
            return;
        }
        if (aVar.a()) {
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqw));
                return;
            }
            if (ordinal == 1) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqx));
                return;
            } else if (ordinal == 2) {
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqv));
                return;
            } else {
                if (ordinal != 3) {
                    return;
                }
                aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqu));
                return;
            }
        }
        int ordinal2 = state.ordinal();
        if (ordinal2 == 0) {
            aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.f493322jr0));
            return;
        }
        if (ordinal2 == 1) {
            aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.f493323jr1));
        } else if (ordinal2 == 2) {
            aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqz));
        } else {
            if (ordinal2 != 3) {
                return;
            }
            aVar.f427964h.setText(context.getString(com.tencent.mm.R.string.jqy));
        }
    }
}
