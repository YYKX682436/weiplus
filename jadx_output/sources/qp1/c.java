package qp1;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.model.BallInfo f365690a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.model.BallSizeAndPosInfo f365691b;

    public c(com.tencent.mm.plugin.ball.model.BallInfo info, com.tencent.mm.plugin.ball.model.BallSizeAndPosInfo ballSizeAndPos) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(ballSizeAndPos, "ballSizeAndPos");
        this.f365690a = info;
        this.f365691b = ballSizeAndPos;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp1.c)) {
            return false;
        }
        qp1.c cVar = (qp1.c) obj;
        return kotlin.jvm.internal.o.b(this.f365690a, cVar.f365690a) && kotlin.jvm.internal.o.b(this.f365691b, cVar.f365691b);
    }

    public int hashCode() {
        return (this.f365690a.hashCode() * 31) + this.f365691b.hashCode();
    }

    public java.lang.String toString() {
        return "FloatBallClickBallInfo(info=" + this.f365690a + ", ballSizeAndPos=" + this.f365691b + ')';
    }
}
