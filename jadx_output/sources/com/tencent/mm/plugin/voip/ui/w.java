package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes.dex */
public final class w implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final int f177013d;

    /* renamed from: e, reason: collision with root package name */
    public final int f177014e;

    /* renamed from: f, reason: collision with root package name */
    public final int f177015f;

    /* renamed from: g, reason: collision with root package name */
    public final int f177016g;

    /* renamed from: h, reason: collision with root package name */
    public final int f177017h;

    /* renamed from: i, reason: collision with root package name */
    public final int f177018i;

    /* renamed from: m, reason: collision with root package name */
    public final int f177019m;

    public w(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f177013d = i17;
        this.f177014e = i18;
        this.f177015f = i19;
        this.f177016g = i27;
        this.f177017h = i28;
        this.f177018i = i29;
        this.f177019m = i37;
    }

    public final byte[] a() {
        int i17 = this.f177019m;
        return new byte[]{0, 0, (byte) this.f177013d, (byte) this.f177014e, (byte) this.f177015f, (byte) this.f177016g, (byte) this.f177017h, (byte) this.f177018i, (byte) (i17 & 65535), (byte) ((i17 >> 8) & 65535), (byte) ((i17 >> 16) & 65535), (byte) ((i17 >> 24) & 65535)};
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.voip.ui.w)) {
            return false;
        }
        com.tencent.mm.plugin.voip.ui.w wVar = (com.tencent.mm.plugin.voip.ui.w) obj;
        return this.f177013d == wVar.f177013d && this.f177014e == wVar.f177014e && this.f177015f == wVar.f177015f && this.f177016g == wVar.f177016g && this.f177017h == wVar.f177017h && this.f177018i == wVar.f177018i && this.f177019m == wVar.f177019m;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.f177013d) * 31) + java.lang.Integer.hashCode(this.f177014e)) * 31) + java.lang.Integer.hashCode(this.f177015f)) * 31) + java.lang.Integer.hashCode(this.f177016g)) * 31) + java.lang.Integer.hashCode(this.f177017h)) * 31) + java.lang.Integer.hashCode(this.f177018i)) * 31) + java.lang.Integer.hashCode(this.f177019m);
    }

    public java.lang.String toString() {
        return "QosParams(codec=" + this.f177013d + ", codecSize=" + this.f177014e + ", fps=" + this.f177015f + ", iPeriod=" + this.f177016g + ", interval=" + this.f177017h + ", rsLevel=" + this.f177018i + ", bitrate=" + this.f177019m + ')';
    }
}
