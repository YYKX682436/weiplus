package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ps extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f113930e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps(com.tencent.mm.plugin.finder.live.plugin.et etVar, r45.ch1 ch1Var) {
        super(0);
        this.f113929d = etVar;
        this.f113930e = ch1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.co coVar = (df2.co) this.f113929d.U0(df2.co.class);
        if (coVar != null) {
            r45.ch1 ch1Var = this.f113930e;
            java.lang.String string = ch1Var.getString(2);
            kotlin.jvm.internal.o.d(string);
            coVar.n7(kz5.b0.c(new jz5.o(string, ch1Var.getString(2), "[图片]")));
        }
        return jz5.f0.f302826a;
    }
}
