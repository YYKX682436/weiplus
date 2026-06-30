package sm2;

/* loaded from: classes3.dex */
public final class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409797d;

    public y3(sm2.o4 o4Var) {
        this.f409797d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f409797d.A;
        if (etVar != null) {
            etVar.C1();
        }
    }
}
