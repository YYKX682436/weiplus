package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes5.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public int f157055a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f157056b;

    public w1(int i17, java.lang.String bind_serial, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        bind_serial = (i18 & 2) != 0 ? "" : bind_serial;
        kotlin.jvm.internal.o.g(bind_serial, "bind_serial");
        this.f157055a = i17;
        this.f157056b = bind_serial;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.remittance.model.w1)) {
            return false;
        }
        com.tencent.mm.plugin.remittance.model.w1 w1Var = (com.tencent.mm.plugin.remittance.model.w1) obj;
        return this.f157055a == w1Var.f157055a && kotlin.jvm.internal.o.b(this.f157056b, w1Var.f157056b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f157055a) * 31) + this.f157056b.hashCode();
    }

    public java.lang.String toString() {
        return "RecvChannelAccount(recv_channel_type=" + this.f157055a + ", bind_serial=" + this.f157056b + ')';
    }
}
