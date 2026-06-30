package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        super(0);
        this.f112033d = mgVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f112033d;
        bm2.o1 o1Var = mgVar.D;
        java.util.List list = ((mm2.x4) mgVar.P0(mm2.x4.class)).f329528f;
        kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
        o1Var.getClass();
        java.util.ArrayList arrayList = o1Var.f22180m;
        arrayList.clear();
        arrayList.addAll(list);
        mgVar.D.notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
