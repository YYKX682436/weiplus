package r45;

/* loaded from: classes9.dex */
public class b2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f370434d;

    /* renamed from: e, reason: collision with root package name */
    public int f370435e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f370436f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370437g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370438h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370439i = "";

    /* renamed from: m, reason: collision with root package name */
    public long f370440m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f370441n = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b2)) {
            return false;
        }
        r45.b2 b2Var = (r45.b2) fVar;
        return n51.f.a(this.f370434d, b2Var.f370434d) && n51.f.a(java.lang.Integer.valueOf(this.f370435e), java.lang.Integer.valueOf(b2Var.f370435e)) && n51.f.a(java.lang.Integer.valueOf(this.f370436f), java.lang.Integer.valueOf(b2Var.f370436f)) && n51.f.a(this.f370437g, b2Var.f370437g) && n51.f.a(this.f370438h, b2Var.f370438h) && n51.f.a(this.f370439i, b2Var.f370439i) && n51.f.a(java.lang.Long.valueOf(this.f370440m), java.lang.Long.valueOf(b2Var.f370440m)) && n51.f.a(java.lang.Integer.valueOf(this.f370441n), java.lang.Integer.valueOf(b2Var.f370441n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f370434d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.computeSize());
                this.f370434d.writeFields(fVar);
            }
            fVar.e(2, this.f370435e);
            fVar.e(3, this.f370436f);
            java.lang.String str = this.f370437g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f370438h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f370439i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f370440m);
            fVar.e(8, this.f370441n);
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var2 = this.f370434d;
            int i18 = (bn6Var2 != null ? 0 + b36.f.i(1, bn6Var2.computeSize()) : 0) + b36.f.e(2, this.f370435e) + b36.f.e(3, this.f370436f);
            java.lang.String str4 = this.f370437g;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f370438h;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f370439i;
            if (str6 != null) {
                i18 += b36.f.j(6, str6);
            }
            return i18 + b36.f.h(7, this.f370440m) + b36.f.e(8, this.f370441n);
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
        r45.b2 b2Var = (r45.b2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.bn6 bn6Var3 = new r45.bn6();
                    if (bArr != null && bArr.length > 0) {
                        bn6Var3.parseFrom(bArr);
                    }
                    b2Var.f370434d = bn6Var3;
                }
                return 0;
            case 2:
                b2Var.f370435e = aVar2.g(intValue);
                return 0;
            case 3:
                b2Var.f370436f = aVar2.g(intValue);
                return 0;
            case 4:
                b2Var.f370437g = aVar2.k(intValue);
                return 0;
            case 5:
                b2Var.f370438h = aVar2.k(intValue);
                return 0;
            case 6:
                b2Var.f370439i = aVar2.k(intValue);
                return 0;
            case 7:
                b2Var.f370440m = aVar2.i(intValue);
                return 0;
            case 8:
                b2Var.f370441n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
