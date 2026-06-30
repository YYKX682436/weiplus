package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tl0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f114425a;

    public tl0(java.lang.Object data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f114425a = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.finder.live.plugin.tl0) && kotlin.jvm.internal.o.b(this.f114425a, ((com.tencent.mm.plugin.finder.live.plugin.tl0) obj).f114425a);
    }

    public int hashCode() {
        return this.f114425a.hashCode();
    }

    public java.lang.String toString() {
        return "WishBannerItem(data=" + this.f114425a + ')';
    }
}
