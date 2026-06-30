package r45;

/* loaded from: classes9.dex */
public class jy extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f378205d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378206e;

    /* renamed from: f, reason: collision with root package name */
    public r45.g04 f378207f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378208g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378209h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378210i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378211m;

    /* renamed from: n, reason: collision with root package name */
    public int f378212n;

    /* renamed from: o, reason: collision with root package name */
    public r45.tr6 f378213o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jy)) {
            return false;
        }
        r45.jy jyVar = (r45.jy) fVar;
        return n51.f.a(this.BaseResponse, jyVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f378205d), java.lang.Integer.valueOf(jyVar.f378205d)) && n51.f.a(this.f378206e, jyVar.f378206e) && n51.f.a(this.f378207f, jyVar.f378207f) && n51.f.a(this.f378208g, jyVar.f378208g) && n51.f.a(this.f378209h, jyVar.f378209h) && n51.f.a(this.f378210i, jyVar.f378210i) && n51.f.a(this.f378211m, jyVar.f378211m) && n51.f.a(java.lang.Integer.valueOf(this.f378212n), java.lang.Integer.valueOf(jyVar.f378212n)) && n51.f.a(this.f378213o, jyVar.f378213o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f378205d);
            java.lang.String str = this.f378206e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.g04 g04Var = this.f378207f;
            if (g04Var != null) {
                fVar.i(4, g04Var.computeSize());
                this.f378207f.writeFields(fVar);
            }
            java.lang.String str2 = this.f378208g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f378209h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f378210i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f378211m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.e(9, this.f378212n);
            r45.tr6 tr6Var = this.f378213o;
            if (tr6Var != null) {
                fVar.i(10, tr6Var.computeSize());
                this.f378213o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f378205d);
            java.lang.String str6 = this.f378206e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            r45.g04 g04Var2 = this.f378207f;
            if (g04Var2 != null) {
                i18 += b36.f.i(4, g04Var2.computeSize());
            }
            java.lang.String str7 = this.f378208g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f378209h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f378210i;
            if (str9 != null) {
                i18 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f378211m;
            if (str10 != null) {
                i18 += b36.f.j(8, str10);
            }
            int e17 = i18 + b36.f.e(9, this.f378212n);
            r45.tr6 tr6Var2 = this.f378213o;
            return tr6Var2 != null ? e17 + b36.f.i(10, tr6Var2.computeSize()) : e17;
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
        r45.jy jyVar = (r45.jy) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    jyVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                jyVar.f378205d = aVar2.g(intValue);
                return 0;
            case 3:
                jyVar.f378206e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.g04 g04Var3 = new r45.g04();
                    if (bArr2 != null && bArr2.length > 0) {
                        g04Var3.parseFrom(bArr2);
                    }
                    jyVar.f378207f = g04Var3;
                }
                return 0;
            case 5:
                jyVar.f378208g = aVar2.k(intValue);
                return 0;
            case 6:
                jyVar.f378209h = aVar2.k(intValue);
                return 0;
            case 7:
                jyVar.f378210i = aVar2.k(intValue);
                return 0;
            case 8:
                jyVar.f378211m = aVar2.k(intValue);
                return 0;
            case 9:
                jyVar.f378212n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.tr6 tr6Var3 = new r45.tr6();
                    if (bArr3 != null && bArr3.length > 0) {
                        tr6Var3.parseFrom(bArr3);
                    }
                    jyVar.f378213o = tr6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
