package r45;

/* loaded from: classes9.dex */
public class rc3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qw f384723d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384724e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384725f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f384726g;

    /* renamed from: h, reason: collision with root package name */
    public int f384727h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rc3)) {
            return false;
        }
        r45.rc3 rc3Var = (r45.rc3) fVar;
        return n51.f.a(this.f384723d, rc3Var.f384723d) && n51.f.a(this.f384724e, rc3Var.f384724e) && n51.f.a(this.f384725f, rc3Var.f384725f) && n51.f.a(java.lang.Boolean.valueOf(this.f384726g), java.lang.Boolean.valueOf(rc3Var.f384726g)) && n51.f.a(java.lang.Integer.valueOf(this.f384727h), java.lang.Integer.valueOf(rc3Var.f384727h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qw qwVar = this.f384723d;
            if (qwVar != null) {
                fVar.i(1, qwVar.computeSize());
                this.f384723d.writeFields(fVar);
            }
            java.lang.String str = this.f384724e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f384725f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.a(4, this.f384726g);
            fVar.e(5, this.f384727h);
            return 0;
        }
        if (i17 == 1) {
            r45.qw qwVar2 = this.f384723d;
            int i18 = qwVar2 != null ? 0 + b36.f.i(1, qwVar2.computeSize()) : 0;
            java.lang.String str3 = this.f384724e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f384725f;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.a(4, this.f384726g) + b36.f.e(5, this.f384727h);
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
        r45.rc3 rc3Var = (r45.rc3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.qw qwVar3 = new r45.qw();
                if (bArr != null && bArr.length > 0) {
                    qwVar3.parseFrom(bArr);
                }
                rc3Var.f384723d = qwVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            rc3Var.f384724e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            rc3Var.f384725f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            rc3Var.f384726g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        rc3Var.f384727h = aVar2.g(intValue);
        return 0;
    }
}
