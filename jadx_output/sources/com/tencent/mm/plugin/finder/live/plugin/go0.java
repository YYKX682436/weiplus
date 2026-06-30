package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class go0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.yv1 f112720a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.ov1 f112721b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.c42 f112722c;

    public go0(r45.yv1 yv1Var, r45.ov1 ov1Var, r45.c42 c42Var) {
        this.f112720a = yv1Var;
        this.f112721b = ov1Var;
        this.f112722c = c42Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.go0)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.go0 go0Var = (com.tencent.mm.plugin.finder.live.plugin.go0) obj;
        return kotlin.jvm.internal.o.b(this.f112720a, go0Var.f112720a) && kotlin.jvm.internal.o.b(this.f112721b, go0Var.f112721b) && kotlin.jvm.internal.o.b(this.f112722c, go0Var.f112722c);
    }

    public int hashCode() {
        r45.yv1 yv1Var = this.f112720a;
        int hashCode = (yv1Var == null ? 0 : yv1Var.hashCode()) * 31;
        r45.ov1 ov1Var = this.f112721b;
        int hashCode2 = (hashCode + (ov1Var == null ? 0 : ov1Var.hashCode())) * 31;
        r45.c42 c42Var = this.f112722c;
        return hashCode2 + (c42Var != null ? c42Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SpecialProcessGiftExInfo(randomCtx=" + this.f112720a + ", attackCtx=" + this.f112721b + ", pkExtraItem=" + this.f112722c + ')';
    }
}
