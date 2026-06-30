package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xy implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.az f115134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cm2.x f115135b;

    public xy(com.tencent.mm.plugin.finder.live.plugin.az azVar, cm2.x xVar) {
        this.f115134a = azVar;
        this.f115135b = xVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.plugin.az azVar = this.f115134a;
        kotlinx.coroutines.r2 r2Var = azVar.f111954o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = azVar.f111953n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        cm2.x xVar = this.f115135b;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.g byteString = ((r45.zs1) fVar.f70618d).getByteString(1);
            if (byteString == null) {
                return null;
            }
            r45.b52 b52Var = new r45.b52();
            b52Var.parseFrom(byteString.g());
            xVar.getClass();
            xVar.f43407v = b52Var;
            ((mm2.f6) azVar.f111947e.a(mm2.f6.class)).c7(xVar);
            java.lang.String string = ((r45.zs1) fVar.f70618d).getString(2);
            if (string == null || string.length() == 0) {
                ae2.in inVar = ae2.in.f3688a;
                if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3874s5).getValue()).r()).booleanValue()) {
                    java.lang.String string2 = xVar.f43407v.getString(3);
                    if (string2 == null) {
                        return null;
                    }
                    com.tencent.mm.plugin.finder.live.plugin.az.a(azVar, string2);
                }
            }
            android.content.Context context = azVar.f111946d;
            com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
            y1Var.i(true);
            y1Var.m(java.lang.Boolean.TRUE);
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.dan, null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
            android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.fbn);
            android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.fbm);
            ae2.in inVar2 = ae2.in.f3688a;
            if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3874s5).getValue()).r()).booleanValue()) {
                textView.setText("这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案，这是一条测试文案");
            } else {
                textView.setText(((r45.zs1) fVar.f70618d).getString(2));
            }
            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.wy(xVar, y1Var, azVar));
            y1Var.k(roundedCornerFrameLayout);
            y1Var.s();
        } else {
            java.lang.String string3 = xVar.f43407v.getString(3);
            if (string3 == null) {
                return null;
            }
            com.tencent.mm.plugin.finder.live.plugin.az.a(azVar, string3);
        }
        return f0Var;
    }
}
