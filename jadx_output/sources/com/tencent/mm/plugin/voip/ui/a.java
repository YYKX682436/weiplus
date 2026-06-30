package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes3.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f176935d;

    /* renamed from: e, reason: collision with root package name */
    public int f176936e;

    public a(java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f176935d = key;
        this.f176936e = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.voip.ui.a)) {
            return false;
        }
        com.tencent.mm.plugin.voip.ui.a aVar = (com.tencent.mm.plugin.voip.ui.a) obj;
        return kotlin.jvm.internal.o.b(this.f176935d, aVar.f176935d) && this.f176936e == aVar.f176936e;
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
        return (this.f176935d.hashCode() * 31) + java.lang.Integer.hashCode(this.f176936e);
    }

    public java.lang.String toString() {
        return "BeautyParams(key=" + this.f176935d + ", value=" + this.f176936e + ')';
    }
}
