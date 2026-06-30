package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class ob {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f201248a;

    /* renamed from: b, reason: collision with root package name */
    public final int f201249b;

    /* renamed from: c, reason: collision with root package name */
    public final int f201250c;

    /* renamed from: d, reason: collision with root package name */
    public final int f201251d;

    /* renamed from: e, reason: collision with root package name */
    public final int f201252e;

    /* renamed from: f, reason: collision with root package name */
    public final int f201253f;

    public ob(java.lang.String codecStr, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(codecStr, "codecStr");
        this.f201248a = codecStr;
        this.f201249b = i17;
        this.f201250c = i18;
        this.f201251d = i19;
        this.f201252e = i27;
        this.f201253f = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.gallery.ob)) {
            return false;
        }
        com.tencent.mm.ui.chatting.gallery.ob obVar = (com.tencent.mm.ui.chatting.gallery.ob) obj;
        return kotlin.jvm.internal.o.b(this.f201248a, obVar.f201248a) && this.f201249b == obVar.f201249b && this.f201250c == obVar.f201250c && this.f201251d == obVar.f201251d && this.f201252e == obVar.f201252e && this.f201253f == obVar.f201253f;
    }

    public int hashCode() {
        return (((((((((this.f201248a.hashCode() * 31) + java.lang.Integer.hashCode(this.f201249b)) * 31) + java.lang.Integer.hashCode(this.f201250c)) * 31) + java.lang.Integer.hashCode(this.f201251d)) * 31) + java.lang.Integer.hashCode(this.f201252e)) * 31) + java.lang.Integer.hashCode(this.f201253f);
    }

    public java.lang.String toString() {
        return "StaticInfo(codecStr=" + this.f201248a + ", bitrate=" + this.f201249b + ", fps=" + this.f201250c + ", width=" + this.f201251d + ", height=" + this.f201252e + ", durationSec=" + this.f201253f + ')';
    }
}
