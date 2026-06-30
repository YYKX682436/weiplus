package p81;

/* loaded from: classes7.dex */
public class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f352714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f352715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f352716c;

    public b(p81.e eVar, km5.b bVar, boolean z17, int i17) {
        this.f352714a = bVar;
        this.f352715b = z17;
        this.f352716c = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (th1.a.b(fVar)) {
            com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) fVar.f70619e.getReqResp();
            return nm5.j.c((r45.os3) oVar.f70710a.f70684a, (r45.ps3) oVar.f70711b.f70700a);
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f352714a.c(bool);
        km5.u.b().a(bool);
        r81.f.INSTANCE.b(this.f352716c, this.f352715b ? 50 : 49);
        return null;
    }
}
