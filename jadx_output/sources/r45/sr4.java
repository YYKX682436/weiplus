package r45;

/* loaded from: classes10.dex */
public class sr4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385939d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385940e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385941f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385942g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385943h;

    /* renamed from: i, reason: collision with root package name */
    public int f385944i;

    /* renamed from: m, reason: collision with root package name */
    public r45.hf2 f385945m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sr4)) {
            return false;
        }
        r45.sr4 sr4Var = (r45.sr4) fVar;
        return n51.f.a(this.f385939d, sr4Var.f385939d) && n51.f.a(this.f385940e, sr4Var.f385940e) && n51.f.a(this.f385941f, sr4Var.f385941f) && n51.f.a(this.f385942g, sr4Var.f385942g) && n51.f.a(this.f385943h, sr4Var.f385943h) && n51.f.a(java.lang.Integer.valueOf(this.f385944i), java.lang.Integer.valueOf(sr4Var.f385944i)) && n51.f.a(this.f385945m, sr4Var.f385945m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385939d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385940e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f385941f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f385942g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f385943h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f385944i);
            r45.hf2 hf2Var = this.f385945m;
            if (hf2Var != null) {
                fVar.i(7, hf2Var.computeSize());
                this.f385945m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f385939d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f385940e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f385941f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f385942g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f385943h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            int e17 = j17 + b36.f.e(6, this.f385944i);
            r45.hf2 hf2Var2 = this.f385945m;
            return hf2Var2 != null ? e17 + b36.f.i(7, hf2Var2.computeSize()) : e17;
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
        r45.sr4 sr4Var = (r45.sr4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sr4Var.f385939d = aVar2.k(intValue);
                return 0;
            case 2:
                sr4Var.f385940e = aVar2.k(intValue);
                return 0;
            case 3:
                sr4Var.f385941f = aVar2.k(intValue);
                return 0;
            case 4:
                sr4Var.f385942g = aVar2.k(intValue);
                return 0;
            case 5:
                sr4Var.f385943h = aVar2.k(intValue);
                return 0;
            case 6:
                sr4Var.f385944i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.hf2 hf2Var3 = new r45.hf2();
                    if (bArr != null && bArr.length > 0) {
                        hf2Var3.parseFrom(bArr);
                    }
                    sr4Var.f385945m = hf2Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
