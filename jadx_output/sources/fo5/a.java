package fo5;

/* loaded from: classes14.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f264949a = (lp0.b.h() + "voip") + "/Models";

    public boolean a() {
        boolean b17 = nq4.f.f339014a.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.BaseCoreService", "canQuickAcceptUseBT: " + b17 + ' ');
        return b17;
    }

    public abstract java.util.ArrayList b();

    public abstract er4.c c();

    public abstract java.lang.Object d(java.lang.String str, kotlin.coroutines.Continuation continuation);

    public abstract void e(er4.r rVar, boolean z17);

    public abstract boolean f();
}
