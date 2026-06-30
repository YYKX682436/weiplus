package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class mh implements java.util.function.BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.xh f119074a;

    public mh(com.tencent.mm.plugin.finder.live.widget.xh xhVar) {
        this.f119074a = xhVar;
    }

    @Override // java.util.function.BiConsumer
    public void accept(java.lang.Object obj, java.lang.Object obj2) {
        r45.kv1 gift = (r45.kv1) obj;
        vm2.z view = (vm2.z) obj2;
        kotlin.jvm.internal.o.g(gift, "gift");
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.String string = gift.getString(0);
        r45.kv1 kv1Var = this.f119074a.A;
        view.setHasSelected(kotlin.jvm.internal.o.b(string, kv1Var != null ? kv1Var.getString(0) : null));
    }
}
