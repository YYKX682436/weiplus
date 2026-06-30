package x51;

/* loaded from: classes16.dex */
public class a0 implements p5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x51.d0 f451968a;

    public a0(x51.d0 d0Var) {
        this.f451968a = d0Var;
    }

    @Override // p5.h
    public java.lang.Object a(p5.m mVar) {
        java.lang.Object obj;
        m3.a aVar = this.f451968a.f451985b;
        synchronized (mVar.f351985a) {
            obj = mVar.f351987c;
        }
        aVar.accept((java.lang.String) obj);
        return null;
    }
}
