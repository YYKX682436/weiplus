package w11;

/* loaded from: classes11.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w11.r0 f442112e;

    public q0(w11.r0 r0Var, java.lang.String str) {
        this.f442112e = r0Var;
        this.f442111d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.modelsimple.l1(5, "", "", "", "", false, 1, false).doScene(this.f442112e.dispatcher(), new w11.p0(this));
    }
}
