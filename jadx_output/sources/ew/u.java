package ew;

/* loaded from: classes11.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final mn0.b0 f257005a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.pigeon.biz_base.FinderLivePlayInfo f257006b;

    public u(mn0.b0 player, com.tencent.pigeon.biz_base.FinderLivePlayInfo finderLivePlayInfo) {
        kotlin.jvm.internal.o.g(player, "player");
        kotlin.jvm.internal.o.g(finderLivePlayInfo, "finderLivePlayInfo");
        this.f257005a = player;
        this.f257006b = finderLivePlayInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew.u)) {
            return false;
        }
        ew.u uVar = (ew.u) obj;
        return kotlin.jvm.internal.o.b(this.f257005a, uVar.f257005a) && kotlin.jvm.internal.o.b(this.f257006b, uVar.f257006b);
    }

    public int hashCode() {
        return (this.f257005a.hashCode() * 31) + this.f257006b.hashCode();
    }

    public java.lang.String toString() {
        return "LivePlayerWrapper(player=" + this.f257005a + ", finderLivePlayInfo=" + this.f257006b + ')';
    }
}
