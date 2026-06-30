package lx;

/* loaded from: classes11.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public final mn0.b0 f321690a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.pigeon.biz_base.FinderLivePlayInfo f321691b;

    public a6(mn0.b0 player, com.tencent.pigeon.biz_base.FinderLivePlayInfo finderLivePlayInfo) {
        kotlin.jvm.internal.o.g(player, "player");
        kotlin.jvm.internal.o.g(finderLivePlayInfo, "finderLivePlayInfo");
        this.f321690a = player;
        this.f321691b = finderLivePlayInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx.a6)) {
            return false;
        }
        lx.a6 a6Var = (lx.a6) obj;
        return kotlin.jvm.internal.o.b(this.f321690a, a6Var.f321690a) && kotlin.jvm.internal.o.b(this.f321691b, a6Var.f321691b);
    }

    public int hashCode() {
        return (this.f321690a.hashCode() * 31) + this.f321691b.hashCode();
    }

    public java.lang.String toString() {
        return "LivePlayerWrapper(player=" + this.f321690a + ", finderLivePlayInfo=" + this.f321691b + ')';
    }
}
