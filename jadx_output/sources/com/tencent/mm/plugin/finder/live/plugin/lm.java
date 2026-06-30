package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class lm extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.lm f113415d = new com.tencent.mm.plugin.finder.live.plugin.lm();

    public lm() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.zy6 zy6Var = (r45.zy6) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(zy6Var.getLong(0));
        sb6.append('-');
        sb6.append(zy6Var.getLong(1));
        sb6.append(',');
        return sb6.toString();
    }
}
