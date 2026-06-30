package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class za {

    /* renamed from: a, reason: collision with root package name */
    public final int f115315a;

    /* renamed from: b, reason: collision with root package name */
    public final int f115316b;

    /* renamed from: c, reason: collision with root package name */
    public final int f115317c;

    /* renamed from: d, reason: collision with root package name */
    public final int f115318d;

    public za(int i17, int i18, int i19, int i27) {
        this.f115315a = i17;
        this.f115316b = i18;
        this.f115317c = i19;
        this.f115318d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.plugin.za)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.plugin.za zaVar = (com.tencent.mm.plugin.finder.live.plugin.za) obj;
        return this.f115315a == zaVar.f115315a && this.f115316b == zaVar.f115316b && this.f115317c == zaVar.f115317c && this.f115318d == zaVar.f115318d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f115315a) * 31) + java.lang.Integer.hashCode(this.f115316b)) * 31) + java.lang.Integer.hashCode(this.f115317c)) * 31) + java.lang.Integer.hashCode(this.f115318d);
    }

    public java.lang.String toString() {
        return "AnchorLocationSize(posX=" + this.f115315a + ", posY=" + this.f115316b + ", width=" + this.f115317c + ", height=" + this.f115318d + ')';
    }
}
