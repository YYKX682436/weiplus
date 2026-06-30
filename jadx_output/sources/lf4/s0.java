package lf4;

/* loaded from: classes4.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f318481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ if4.f f318482e;

    public s0(lf4.j1 j1Var, if4.f fVar) {
        this.f318481d = j1Var;
        this.f318482e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f318481d.f318421h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: deleteItem fake ");
        if4.f fVar = this.f318482e;
        sb6.append(fVar);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        ef4.e0.f252441a.a(fVar.f291247e.f291253a);
        jf4.a aVar = jf4.a.f299432a;
        aVar.a(fVar.f291247e.f291259g);
        aVar.b(fVar.f291247e.f291259g);
    }
}
