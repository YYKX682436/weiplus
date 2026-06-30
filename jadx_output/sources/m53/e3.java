package m53;

/* loaded from: classes2.dex */
public class e3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323650d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323651e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323652f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323653g;

    /* renamed from: h, reason: collision with root package name */
    public m53.s3 f323654h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f323655i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.e3)) {
            return false;
        }
        m53.e3 e3Var = (m53.e3) fVar;
        return n51.f.a(this.f323650d, e3Var.f323650d) && n51.f.a(this.f323651e, e3Var.f323651e) && n51.f.a(this.f323652f, e3Var.f323652f) && n51.f.a(this.f323653g, e3Var.f323653g) && n51.f.a(this.f323654h, e3Var.f323654h) && n51.f.a(this.f323655i, e3Var.f323655i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323650d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f323651e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f323652f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f323653g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            m53.s3 s3Var = this.f323654h;
            if (s3Var != null) {
                fVar.i(5, s3Var.computeSize());
                this.f323654h.writeFields(fVar);
            }
            java.lang.String str5 = this.f323655i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f323650d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f323651e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f323652f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f323653g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            m53.s3 s3Var2 = this.f323654h;
            if (s3Var2 != null) {
                j17 += b36.f.i(5, s3Var2.computeSize());
            }
            java.lang.String str10 = this.f323655i;
            return str10 != null ? j17 + b36.f.j(6, str10) : j17;
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
        m53.e3 e3Var = (m53.e3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                e3Var.f323650d = aVar2.k(intValue);
                return 0;
            case 2:
                e3Var.f323651e = aVar2.k(intValue);
                return 0;
            case 3:
                e3Var.f323652f = aVar2.k(intValue);
                return 0;
            case 4:
                e3Var.f323653g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    m53.s3 s3Var3 = new m53.s3();
                    if (bArr != null && bArr.length > 0) {
                        s3Var3.parseFrom(bArr);
                    }
                    e3Var.f323654h = s3Var3;
                }
                return 0;
            case 6:
                e3Var.f323655i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
