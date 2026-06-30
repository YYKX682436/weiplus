package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class d70 implements java.util.function.Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f112236a;

    public d70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var) {
        this.f112236a = v70Var;
    }

    @Override // java.util.function.Consumer
    public void accept(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f112236a;
        v70Var.getClass();
        com.tencent.mm.plugin.finder.live.util.y.e(v70Var, null, null, new com.tencent.mm.plugin.finder.live.plugin.u70(v70Var, intValue, null), 3, null);
    }
}
