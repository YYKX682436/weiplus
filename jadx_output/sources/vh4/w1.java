package vh4;

/* loaded from: classes.dex */
public class w1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f437169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f437170b;

    public w1(vh4.t1 t1Var, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        this.f437169a = runnable;
        this.f437170b = runnable2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "checkContactIsAdultAge cgiBack: " + ((r45.y04) fVar.f70618d).toJSON());
        if ((fVar.f70615a == 0 && fVar.f70616b == 0) && ((r45.y04) fVar.f70618d).f390683d == 0) {
            java.lang.Runnable runnable = this.f437169a;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            java.lang.Runnable runnable2 = this.f437170b;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        return fVar;
    }
}
