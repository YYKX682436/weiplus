package r45;

/* loaded from: classes2.dex */
public class rr3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385134d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f385135e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f385136f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385137g;

    /* renamed from: h, reason: collision with root package name */
    public int f385138h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f385139i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f385140m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f385141n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rr3)) {
            return false;
        }
        r45.rr3 rr3Var = (r45.rr3) fVar;
        return n51.f.a(this.BaseResponse, rr3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385134d), java.lang.Integer.valueOf(rr3Var.f385134d)) && n51.f.a(this.f385135e, rr3Var.f385135e) && n51.f.a(this.f385136f, rr3Var.f385136f) && n51.f.a(this.f385137g, rr3Var.f385137g) && n51.f.a(java.lang.Integer.valueOf(this.f385138h), java.lang.Integer.valueOf(rr3Var.f385138h)) && n51.f.a(this.f385139i, rr3Var.f385139i) && n51.f.a(this.f385140m, rr3Var.f385140m) && n51.f.a(this.f385141n, rr3Var.f385141n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385135e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f385134d);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f385136f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f385137g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f385138h);
            java.lang.String str3 = this.f385139i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f385140m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f385141n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385134d) + b36.f.g(3, 8, linkedList);
            java.lang.String str6 = this.f385136f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f385137g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int e17 = i18 + b36.f.e(6, this.f385138h);
            java.lang.String str8 = this.f385139i;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f385140m;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f385141n;
            return str10 != null ? e17 + b36.f.j(9, str10) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.rr3 rr3Var = (r45.rr3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    rr3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                rr3Var.f385134d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.l57 l57Var = new r45.l57();
                    if (bArr3 != null && bArr3.length > 0) {
                        l57Var.parseFrom(bArr3);
                    }
                    rr3Var.f385135e.add(l57Var);
                }
                return 0;
            case 4:
                rr3Var.f385136f = aVar2.k(intValue);
                return 0;
            case 5:
                rr3Var.f385137g = aVar2.k(intValue);
                return 0;
            case 6:
                rr3Var.f385138h = aVar2.g(intValue);
                return 0;
            case 7:
                rr3Var.f385139i = aVar2.k(intValue);
                return 0;
            case 8:
                rr3Var.f385140m = aVar2.k(intValue);
                return 0;
            case 9:
                rr3Var.f385141n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
