package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.bn f114277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f114278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f114279f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(com.tencent.mm.plugin.finder.live.plugin.bn bnVar, int i17, java.lang.String str) {
        super(0);
        this.f114277d = bnVar;
        this.f114278e = i17;
        this.f114279f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        df2.t6 t6Var;
        com.tencent.mm.plugin.finder.live.plugin.bn bnVar = this.f114277d;
        bnVar.getClass();
        if ((in0.q.f292769b2 != null) && (i17 = this.f114278e) != 0) {
            java.lang.String str = this.f114279f;
            if ((str.length() > 0) && (t6Var = (df2.t6) bnVar.U0(df2.t6.class)) != null) {
                t6Var.d7(i17, str, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
            }
        }
        return jz5.f0.f302826a;
    }
}
