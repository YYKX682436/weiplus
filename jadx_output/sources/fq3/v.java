package fq3;

/* loaded from: classes12.dex */
public class v extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f265562d;

    /* renamed from: e, reason: collision with root package name */
    public final int f265563e;

    public v(fq3.w wVar, java.lang.String str, int i17) {
        this.f265562d = str;
        this.f265563e = i17;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.C2CMsgConsumeTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        if (nVar.f265539x != null) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.requireAccountInitialized();
            mq3.b bVar = nVar2.f265539x;
            bVar.getClass();
            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar3.requireAccountInitialized();
            nVar3.f265536u.a(new mq3.a(bVar, this.f265562d, 2, this.f265563e));
        }
    }
}
