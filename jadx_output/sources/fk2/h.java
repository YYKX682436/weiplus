package fk2;

/* loaded from: classes3.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.CharSequence content, com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView contentTv, int i17, int i18, boolean z17, bm2.h1 holder) {
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(contentTv, "contentTv");
        kotlin.jvm.internal.o.g(holder, "holder");
        fk2.h hVar = fk2.k.f263413m;
        yz5.s sVar = i17 > 0 ? fk2.e.f263353d : fk2.g.f263389d;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.view.ViewParent parent = contentTv.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        h0Var.f310123d = (android.view.ViewGroup) parent;
        contentTv.setTextSize(i18);
        contentTv.setVisibility(0);
        sVar.v(contentTv, content, 1, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        kotlinx.coroutines.y0 y0Var = holder.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new fk2.c(contentTv, content, h0Var, sVar, i17, z17, null), 2, null);
        }
    }

    public final java.lang.String b() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d4h);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
