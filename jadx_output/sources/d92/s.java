package d92;

/* loaded from: classes.dex */
public final class s {
    public s(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(android.view.View view, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(view, com.tencent.mm.R.id.f484408e61);
        java.lang.String string = aVar.a(view, com.tencent.mm.R.id.e5w) == z17 ? view.getContext().getString(com.tencent.mm.R.string.mhu) : view.getContext().getString(com.tencent.mm.R.string.mhv);
        kotlin.jvm.internal.o.d(string);
        return string + ", " + ((java.lang.Object) d17);
    }

    public final java.lang.String b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return "评论" + ((java.lang.Object) e92.b.f250347d.d(view, com.tencent.mm.R.id.e5m));
    }

    public final java.lang.String c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return "转发" + ((java.lang.Object) e92.b.f250347d.d(view, com.tencent.mm.R.id.e5u));
    }

    public final java.lang.String d(android.view.View view, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        e92.a aVar = e92.b.f250347d;
        java.lang.CharSequence d17 = aVar.d(view, com.tencent.mm.R.id.e7i);
        boolean a17 = aVar.a(view, com.tencent.mm.R.id.rku);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        java.lang.String string = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.I9).getValue()).r()).intValue() == 1 ? a17 == z17 ? view.getContext().getString(com.tencent.mm.R.string.f492090ms5) : view.getContext().getString(com.tencent.mm.R.string.ms6) : a17 == z17 ? view.getContext().getString(com.tencent.mm.R.string.mh6) : view.getContext().getString(com.tencent.mm.R.string.mh7);
        kotlin.jvm.internal.o.d(string);
        return string + ", " + ((java.lang.Object) d17);
    }
}
