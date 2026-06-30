package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f119152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.tencent.mm.plugin.finder.live.widget.b4 b4Var) {
        super(3);
        this.f119152d = b4Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.protocal.protobuf.FinderObject feed = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g((android.view.View) obj3, "<anonymous parameter 2>");
        com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.f119152d;
        b4Var.getClass();
        b4Var.b(feed, ml2.x1.f328216w, null);
        return jz5.f0.f302826a;
    }
}
