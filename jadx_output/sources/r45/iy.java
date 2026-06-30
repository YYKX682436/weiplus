package r45;

/* loaded from: classes9.dex */
public class iy extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377400d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377401e;

    /* renamed from: f, reason: collision with root package name */
    public long f377402f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377403g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377404h;

    /* renamed from: i, reason: collision with root package name */
    public int f377405i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f377406m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f377407n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iy)) {
            return false;
        }
        r45.iy iyVar = (r45.iy) fVar;
        return n51.f.a(this.BaseRequest, iyVar.BaseRequest) && n51.f.a(this.f377400d, iyVar.f377400d) && n51.f.a(this.f377401e, iyVar.f377401e) && n51.f.a(java.lang.Long.valueOf(this.f377402f), java.lang.Long.valueOf(iyVar.f377402f)) && n51.f.a(this.f377403g, iyVar.f377403g) && n51.f.a(this.f377404h, iyVar.f377404h) && n51.f.a(java.lang.Integer.valueOf(this.f377405i), java.lang.Integer.valueOf(iyVar.f377405i)) && n51.f.a(this.f377406m, iyVar.f377406m) && n51.f.a(this.f377407n, iyVar.f377407n);
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
            java.lang.String str = this.f377400d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f377401e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f377402f);
            java.lang.String str3 = this.f377403g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f377404h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f377405i);
            java.lang.String str5 = this.f377406m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f377407n;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str7 = this.f377400d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f377401e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            int h17 = i18 + b36.f.h(4, this.f377402f);
            java.lang.String str9 = this.f377403g;
            if (str9 != null) {
                h17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f377404h;
            if (str10 != null) {
                h17 += b36.f.j(6, str10);
            }
            int e17 = h17 + b36.f.e(7, this.f377405i);
            java.lang.String str11 = this.f377406m;
            if (str11 != null) {
                e17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f377407n;
            return str12 != null ? e17 + b36.f.j(9, str12) : e17;
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
        r45.iy iyVar = (r45.iy) objArr[1];
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
                    iyVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                iyVar.f377400d = aVar2.k(intValue);
                return 0;
            case 3:
                iyVar.f377401e = aVar2.k(intValue);
                return 0;
            case 4:
                iyVar.f377402f = aVar2.i(intValue);
                return 0;
            case 5:
                iyVar.f377403g = aVar2.k(intValue);
                return 0;
            case 6:
                iyVar.f377404h = aVar2.k(intValue);
                return 0;
            case 7:
                iyVar.f377405i = aVar2.g(intValue);
                return 0;
            case 8:
                iyVar.f377406m = aVar2.k(intValue);
                return 0;
            case 9:
                iyVar.f377407n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
