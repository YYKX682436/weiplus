package r45;

/* loaded from: classes4.dex */
public class ib5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kj6 f376902d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f376903e;

    /* renamed from: f, reason: collision with root package name */
    public int f376904f;

    /* renamed from: g, reason: collision with root package name */
    public int f376905g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376906h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376907i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f376908m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ib5)) {
            return false;
        }
        r45.ib5 ib5Var = (r45.ib5) fVar;
        return n51.f.a(this.BaseRequest, ib5Var.BaseRequest) && n51.f.a(this.f376902d, ib5Var.f376902d) && n51.f.a(java.lang.Boolean.valueOf(this.f376903e), java.lang.Boolean.valueOf(ib5Var.f376903e)) && n51.f.a(java.lang.Integer.valueOf(this.f376904f), java.lang.Integer.valueOf(ib5Var.f376904f)) && n51.f.a(java.lang.Integer.valueOf(this.f376905g), java.lang.Integer.valueOf(ib5Var.f376905g)) && n51.f.a(this.f376906h, ib5Var.f376906h) && n51.f.a(this.f376907i, ib5Var.f376907i) && n51.f.a(this.f376908m, ib5Var.f376908m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.kj6 kj6Var = this.f376902d;
            if (kj6Var != null) {
                fVar.i(2, kj6Var.computeSize());
                this.f376902d.writeFields(fVar);
            }
            fVar.a(3, this.f376903e);
            fVar.e(4, this.f376904f);
            fVar.e(5, this.f376905g);
            java.lang.String str = this.f376906h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f376907i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f376908m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kj6 kj6Var2 = this.f376902d;
            if (kj6Var2 != null) {
                i18 += b36.f.i(2, kj6Var2.computeSize());
            }
            int a17 = i18 + b36.f.a(3, this.f376903e) + b36.f.e(4, this.f376904f) + b36.f.e(5, this.f376905g);
            java.lang.String str4 = this.f376906h;
            if (str4 != null) {
                a17 += b36.f.j(6, str4);
            }
            java.lang.String str5 = this.f376907i;
            if (str5 != null) {
                a17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f376908m;
            return str6 != null ? a17 + b36.f.j(8, str6) : a17;
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
        r45.ib5 ib5Var = (r45.ib5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    ib5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kj6 kj6Var3 = new r45.kj6();
                    if (bArr2 != null && bArr2.length > 0) {
                        kj6Var3.parseFrom(bArr2);
                    }
                    ib5Var.f376902d = kj6Var3;
                }
                return 0;
            case 3:
                ib5Var.f376903e = aVar2.c(intValue);
                return 0;
            case 4:
                ib5Var.f376904f = aVar2.g(intValue);
                return 0;
            case 5:
                ib5Var.f376905g = aVar2.g(intValue);
                return 0;
            case 6:
                ib5Var.f376906h = aVar2.k(intValue);
                return 0;
            case 7:
                ib5Var.f376907i = aVar2.k(intValue);
                return 0;
            case 8:
                ib5Var.f376908m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
