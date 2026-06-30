package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class g9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x9 f118415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(com.tencent.mm.plugin.finder.live.widget.x9 x9Var) {
        super(1);
        this.f118415d = x9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.of1 it = (r45.of1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.getInteger(2) == this.f118415d.M);
    }
}
