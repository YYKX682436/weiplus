package cv1;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ms f222553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ms f222554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ms f222555f;

    public e(r45.ms msVar, r45.ms msVar2, r45.ms msVar3) {
        this.f222553d = msVar;
        this.f222554e = msVar2;
        this.f222555f = msVar3;
    }

    @Override // java.lang.Runnable
    public void run() {
        fp.j jVar = new fp.j();
        com.tencent.mm.modelcdntran.s1 Zi = com.tencent.mm.modelcdntran.s1.Zi();
        if (Zi.f71130q == null) {
            Zi.f71130q = new com.tencent.mm.modelcdntran.p1(Zi);
        }
        if (Zi.f71130q != null && this.f222553d != null) {
            com.tencent.mm.modelcdntran.s1 Zi2 = com.tencent.mm.modelcdntran.s1.Zi();
            if (Zi2.f71130q == null) {
                Zi2.f71130q = new com.tencent.mm.modelcdntran.p1(Zi2);
            }
            com.tencent.mm.modelbase.k0 k0Var = Zi2.f71130q;
            r45.ms msVar = this.f222553d;
            r45.ms msVar2 = this.f222554e;
            r45.ms msVar3 = this.f222555f;
            com.tencent.mm.modelcdntran.p1 p1Var = (com.tencent.mm.modelcdntran.p1) k0Var;
            p1Var.getClass();
            msVar.getClass();
            java.util.Objects.toString(com.tencent.mm.modelcdntran.s1.cj());
            if (com.tencent.mm.modelcdntran.s1.cj() != null) {
                com.tencent.mm.modelcdntran.s1.cj().h(msVar, msVar2, msVar3, null, null, null, "");
                ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.modelcdntran.o1(p1Var), "MicroMsg.Cdn.ThreadName");
            }
            jVar.a();
        }
        jVar.a();
    }
}
