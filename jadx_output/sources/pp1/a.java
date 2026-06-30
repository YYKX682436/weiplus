package pp1;

/* loaded from: classes8.dex */
public final class a extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.ball.model.BallInfo f357393d;

    /* renamed from: e, reason: collision with root package name */
    public int f357394e;

    public a(com.tencent.mm.plugin.ball.model.BallInfo floatBallInfo, int i17) {
        kotlin.jvm.internal.o.g(floatBallInfo, "floatBallInfo");
        this.f357393d = floatBallInfo;
        this.f357394e = i17;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        pp1.a other = (pp1.a) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.b(this.f357393d, other.f357393d);
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        pp1.a other = (pp1.a) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f357394e, other.f357394e);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return 0;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f357393d;
        sb6.append(ballInfo.f93049g);
        sb6.append('-');
        sb6.append(ballInfo.f93046d);
        return sb6.toString();
    }
}
