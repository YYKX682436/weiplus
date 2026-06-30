package r45;

/* loaded from: classes9.dex */
public class a30 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f369692d;

    /* renamed from: e, reason: collision with root package name */
    public int f369693e;

    /* renamed from: f, reason: collision with root package name */
    public int f369694f;

    /* renamed from: g, reason: collision with root package name */
    public r45.e17 f369695g;

    /* renamed from: h, reason: collision with root package name */
    public long f369696h;

    /* renamed from: i, reason: collision with root package name */
    public int f369697i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f369698m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f369699n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a30)) {
            return false;
        }
        r45.a30 a30Var = (r45.a30) fVar;
        return n51.f.a(this.BaseRequest, a30Var.BaseRequest) && n51.f.a(this.f369692d, a30Var.f369692d) && n51.f.a(java.lang.Integer.valueOf(this.f369693e), java.lang.Integer.valueOf(a30Var.f369693e)) && n51.f.a(java.lang.Integer.valueOf(this.f369694f), java.lang.Integer.valueOf(a30Var.f369694f)) && n51.f.a(this.f369695g, a30Var.f369695g) && n51.f.a(java.lang.Long.valueOf(this.f369696h), java.lang.Long.valueOf(a30Var.f369696h)) && n51.f.a(java.lang.Integer.valueOf(this.f369697i), java.lang.Integer.valueOf(a30Var.f369697i)) && n51.f.a(this.f369698m, a30Var.f369698m) && n51.f.a(this.f369699n, a30Var.f369699n);
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
            java.lang.String str = this.f369692d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f369693e);
            fVar.e(4, this.f369694f);
            r45.e17 e17Var = this.f369695g;
            if (e17Var != null) {
                fVar.i(5, e17Var.computeSize());
                this.f369695g.writeFields(fVar);
            }
            fVar.h(6, this.f369696h);
            fVar.e(7, this.f369697i);
            java.lang.String str2 = this.f369698m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            java.lang.String str3 = this.f369699n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f369692d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f369693e) + b36.f.e(4, this.f369694f);
            r45.e17 e17Var2 = this.f369695g;
            if (e17Var2 != null) {
                e17 += b36.f.i(5, e17Var2.computeSize());
            }
            int h17 = e17 + b36.f.h(6, this.f369696h) + b36.f.e(7, this.f369697i);
            java.lang.String str5 = this.f369698m;
            if (str5 != null) {
                h17 += b36.f.j(8, str5);
            }
            java.lang.String str6 = this.f369699n;
            return str6 != null ? h17 + b36.f.j(9, str6) : h17;
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
        r45.a30 a30Var = (r45.a30) objArr[1];
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
                    a30Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                a30Var.f369692d = aVar2.k(intValue);
                return 0;
            case 3:
                a30Var.f369693e = aVar2.g(intValue);
                return 0;
            case 4:
                a30Var.f369694f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.e17 e17Var3 = new r45.e17();
                    if (bArr2 != null && bArr2.length > 0) {
                        e17Var3.parseFrom(bArr2);
                    }
                    a30Var.f369695g = e17Var3;
                }
                return 0;
            case 6:
                a30Var.f369696h = aVar2.i(intValue);
                return 0;
            case 7:
                a30Var.f369697i = aVar2.g(intValue);
                return 0;
            case 8:
                a30Var.f369698m = aVar2.k(intValue);
                return 0;
            case 9:
                a30Var.f369699n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
