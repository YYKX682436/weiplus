package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class u9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.x9 f119964e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(java.lang.String str, com.tencent.mm.plugin.finder.live.widget.x9 x9Var) {
        super(0);
        this.f119963d = str;
        this.f119964e = x9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eib);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String str = this.f119963d;
        if (!(str == null || str.length() == 0)) {
            string = str;
        }
        db5.t7.f(this.f119964e.f118183e, string, com.tencent.mm.plugin.finder.live.widget.t9.f119878a);
        return jz5.f0.f302826a;
    }
}
