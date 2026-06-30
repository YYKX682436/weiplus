package d34;

/* loaded from: classes11.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.p0 f226337e;

    public x(d34.y yVar, java.lang.String str, com.tencent.mm.modelbase.p0 p0Var) {
        this.f226336d = str;
        this.f226337e = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c34.h0.Di().c(this.f226336d, this.f226337e.f70726a.f377568r, 1);
    }
}
