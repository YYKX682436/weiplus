package r45;

/* loaded from: classes9.dex */
public class h45 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375825d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375826e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375827f;

    /* renamed from: g, reason: collision with root package name */
    public int f375828g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375829h;

    /* renamed from: i, reason: collision with root package name */
    public r45.iu f375830i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f375831m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h45)) {
            return false;
        }
        r45.h45 h45Var = (r45.h45) fVar;
        return n51.f.a(this.f375825d, h45Var.f375825d) && n51.f.a(this.f375826e, h45Var.f375826e) && n51.f.a(this.f375827f, h45Var.f375827f) && n51.f.a(java.lang.Integer.valueOf(this.f375828g), java.lang.Integer.valueOf(h45Var.f375828g)) && n51.f.a(this.f375829h, h45Var.f375829h) && n51.f.a(this.f375830i, h45Var.f375830i) && n51.f.a(this.f375831m, h45Var.f375831m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375825d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f375826e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f375827f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f375828g);
            java.lang.String str4 = this.f375829h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            r45.iu iuVar = this.f375830i;
            if (iuVar != null) {
                fVar.i(6, iuVar.computeSize());
                this.f375830i.writeFields(fVar);
            }
            java.lang.String str5 = this.f375831m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f375825d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f375826e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f375827f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f375828g);
            java.lang.String str9 = this.f375829h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            r45.iu iuVar2 = this.f375830i;
            if (iuVar2 != null) {
                e17 += b36.f.i(6, iuVar2.computeSize());
            }
            java.lang.String str10 = this.f375831m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.h45 h45Var = (r45.h45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                h45Var.f375825d = aVar2.k(intValue);
                return 0;
            case 2:
                h45Var.f375826e = aVar2.k(intValue);
                return 0;
            case 3:
                h45Var.f375827f = aVar2.k(intValue);
                return 0;
            case 4:
                h45Var.f375828g = aVar2.g(intValue);
                return 0;
            case 5:
                h45Var.f375829h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.parseFrom(bArr);
                    }
                    h45Var.f375830i = iuVar3;
                }
                return 0;
            case 7:
                h45Var.f375831m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
