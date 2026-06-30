package jn2;

/* loaded from: classes8.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f300649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f300650e;

    public m1(jn2.z1 z1Var, int i17) {
        this.f300649d = z1Var;
        this.f300650e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f300649d.y(this.f300650e);
    }
}
