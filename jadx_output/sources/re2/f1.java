package re2;

/* loaded from: classes3.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.h1 f394409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f394410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(re2.h1 h1Var, yz5.a aVar) {
        super(1);
        this.f394409d = h1Var;
        this.f394410e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.lx0 resp = (r45.lx0) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        re2.h1 h1Var = this.f394409d;
        h1Var.getClass();
        h1Var.f394390c = resp.f379918d;
        java.lang.String str = resp.f379919e;
        if (str == null) {
            str = "";
        }
        h1Var.f394392e = str;
        h1Var.f394393f = resp.f379920f;
        r45.f50 f50Var = h1Var.f394391d;
        if (f50Var == null) {
            f50Var = new r45.f50();
        }
        f50Var.f374013d = h1Var.f394390c;
        f50Var.f374018i = h1Var.f394393f;
        f50Var.f374014e = 0;
        f50Var.f374015f = h1Var.f394426r;
        f50Var.f374020n = h1Var.f394392e;
        if (f50Var.f374017h == null) {
            ya2.g gVar = ya2.h.f460484a;
            java.lang.String str2 = h1Var.f394388a;
            ya2.b2 b17 = gVar.b(str2);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact.setUsername(str2);
            finderContact.setNickname(b17 != null ? b17.w0() : "");
            finderContact.setHeadUrl(b17 != null ? b17.y0() : "");
            f50Var.f374017h = finderContact;
        }
        h1Var.f394391d = f50Var;
        h1Var.j();
        h1Var.b();
        yz5.a aVar = this.f394410e;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
