package sc2;

/* loaded from: classes2.dex */
public final class p6 {
    public p6(kotlin.jvm.internal.i iVar) {
    }

    public final void a(ad2.h observer, in5.s0 holder, android.view.View view, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(observer, "observer");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        java.lang.String u17 = pm0.v.u(itemId);
        view.setOnClickListener(new sc2.n6(holder, view, u17, infoEx, observer));
        ym5.a1.h(view, new sc2.o6(infoEx, observer, u17, holder, itemId));
    }
}
