package com.tencent.mm.plugin.websearch;

/* loaded from: classes11.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final mn0.b0 f181684a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo f181685b;

    public v1(mn0.b0 player, com.tencent.pigeon.websearch.SearchResultFinderLivePlayInfo finderLivePlayInfo) {
        kotlin.jvm.internal.o.g(player, "player");
        kotlin.jvm.internal.o.g(finderLivePlayInfo, "finderLivePlayInfo");
        this.f181684a = player;
        this.f181685b = finderLivePlayInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.websearch.v1)) {
            return false;
        }
        com.tencent.mm.plugin.websearch.v1 v1Var = (com.tencent.mm.plugin.websearch.v1) obj;
        return kotlin.jvm.internal.o.b(this.f181684a, v1Var.f181684a) && kotlin.jvm.internal.o.b(this.f181685b, v1Var.f181685b);
    }

    public int hashCode() {
        return (this.f181684a.hashCode() * 31) + this.f181685b.hashCode();
    }

    public java.lang.String toString() {
        return "LivePlayerWrapper(player=" + this.f181684a + ", finderLivePlayInfo=" + this.f181685b + ')';
    }
}
