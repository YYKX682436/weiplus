package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fp {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f112582a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f112583b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.b82 f112584c;

    /* renamed from: d, reason: collision with root package name */
    public final int f112585d;

    public fp(gk2.e buContext, java.lang.String sendGiftTargetUserName, r45.b82 giftExtInfo, int i17) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(sendGiftTargetUserName, "sendGiftTargetUserName");
        kotlin.jvm.internal.o.g(giftExtInfo, "giftExtInfo");
        this.f112582a = buContext;
        this.f112583b = sendGiftTargetUserName;
        this.f112584c = giftExtInfo;
        this.f112585d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.fp)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.fp fpVar = (com.tencent.mm.plugin.finder.live.plugin.fp) obj;
        return kotlin.jvm.internal.o.b(this.f112582a, fpVar.f112582a) && kotlin.jvm.internal.o.b(this.f112583b, fpVar.f112583b) && kotlin.jvm.internal.o.b(this.f112584c, fpVar.f112584c) && this.f112585d == fpVar.f112585d;
    }

    public int hashCode() {
        return (((((this.f112582a.hashCode() * 31) + this.f112583b.hashCode()) * 31) + this.f112584c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f112585d);
    }

    public java.lang.String toString() {
        return "LocalGiftMsgParams(buContext=" + this.f112582a + ", sendGiftTargetUserName=" + this.f112583b + ", giftExtInfo=" + this.f112584c + ", pk_extra_times_multi_100=" + this.f112585d + ')';
    }
}
