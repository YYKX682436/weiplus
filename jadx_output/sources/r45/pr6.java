package r45;

/* loaded from: classes2.dex */
public class pr6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383340d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383341e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383342f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383343g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383344h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f383345i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pr6)) {
            return false;
        }
        r45.pr6 pr6Var = (r45.pr6) fVar;
        return n51.f.a(this.f383340d, pr6Var.f383340d) && n51.f.a(this.f383341e, pr6Var.f383341e) && n51.f.a(this.f383342f, pr6Var.f383342f) && n51.f.a(this.f383343g, pr6Var.f383343g) && n51.f.a(this.f383344h, pr6Var.f383344h) && n51.f.a(this.f383345i, pr6Var.f383345i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383340d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f383341e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f383342f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f383343g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f383344h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f383345i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f383340d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f383341e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f383342f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f383343g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f383344h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f383345i;
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
        r45.pr6 pr6Var = (r45.pr6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pr6Var.f383340d = aVar2.k(intValue);
                return 0;
            case 2:
                pr6Var.f383341e = aVar2.k(intValue);
                return 0;
            case 3:
                pr6Var.f383342f = aVar2.k(intValue);
                return 0;
            case 4:
                pr6Var.f383343g = aVar2.k(intValue);
                return 0;
            case 5:
                pr6Var.f383344h = aVar2.k(intValue);
                return 0;
            case 6:
                pr6Var.f383345i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
