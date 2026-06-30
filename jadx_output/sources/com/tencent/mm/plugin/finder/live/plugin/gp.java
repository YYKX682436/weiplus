package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.gp f112723d = new com.tencent.mm.plugin.finder.live.plugin.gp();

    public gp() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String string;
        com.tencent.mm.plugin.finder.live.plugin.go0 it = (com.tencent.mm.plugin.finder.live.plugin.go0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("randomCtx-animation_id:");
        java.lang.String str2 = "";
        r45.yv1 yv1Var = it.f112720a;
        if (yv1Var == null || (str = yv1Var.getString(0)) == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(",attackCtx-animation_id:");
        r45.ov1 ov1Var = it.f112721b;
        if (ov1Var != null && (string = ov1Var.getString(0)) != null) {
            str2 = string;
        }
        sb6.append(str2);
        sb6.append(',');
        return sb6.toString();
    }
}
