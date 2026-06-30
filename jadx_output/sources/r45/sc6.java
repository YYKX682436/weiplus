package r45;

/* loaded from: classes9.dex */
public class sc6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385628d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385629e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385630f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385631g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385632h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385633i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sc6)) {
            return false;
        }
        r45.sc6 sc6Var = (r45.sc6) fVar;
        return n51.f.a(this.f385628d, sc6Var.f385628d) && n51.f.a(this.f385629e, sc6Var.f385629e) && n51.f.a(this.f385630f, sc6Var.f385630f) && n51.f.a(this.f385631g, sc6Var.f385631g) && n51.f.a(this.f385632h, sc6Var.f385632h) && n51.f.a(this.f385633i, sc6Var.f385633i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385628d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385629e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385630f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f385631g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f385632h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f385633i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f385628d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f385629e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f385630f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f385631g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f385632h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f385633i;
            return str12 != null ? j17 + b36.f.j(6, str12) : j17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.sc6 sc6Var = (r45.sc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sc6Var.f385628d = aVar2.k(intValue);
                return 0;
            case 2:
                sc6Var.f385629e = aVar2.k(intValue);
                return 0;
            case 3:
                sc6Var.f385630f = aVar2.k(intValue);
                return 0;
            case 4:
                sc6Var.f385631g = aVar2.k(intValue);
                return 0;
            case 5:
                sc6Var.f385632h = aVar2.k(intValue);
                return 0;
            case 6:
                sc6Var.f385633i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
