package d34;

/* loaded from: classes11.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f226331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.p0 f226332e;

    public u(d34.v vVar, java.lang.String str, com.tencent.mm.modelbase.p0 p0Var) {
        this.f226331d = str;
        this.f226332e = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c34.h0.Di().c(this.f226331d, this.f226332e.f70726a.f377568r, 0);
    }
}
