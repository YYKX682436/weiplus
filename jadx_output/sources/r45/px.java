package r45;

/* loaded from: classes9.dex */
public class px extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383443e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383444f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383445g;

    /* renamed from: h, reason: collision with root package name */
    public int f383446h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f383447i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383448m;

    /* renamed from: n, reason: collision with root package name */
    public int f383449n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f383450o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.px)) {
            return false;
        }
        r45.px pxVar = (r45.px) fVar;
        return n51.f.a(this.BaseResponse, pxVar.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383442d), java.lang.Integer.valueOf(pxVar.f383442d)) && n51.f.a(this.f383443e, pxVar.f383443e) && n51.f.a(this.f383444f, pxVar.f383444f) && n51.f.a(this.f383445g, pxVar.f383445g) && n51.f.a(java.lang.Integer.valueOf(this.f383446h), java.lang.Integer.valueOf(pxVar.f383446h)) && n51.f.a(this.f383447i, pxVar.f383447i) && n51.f.a(this.f383448m, pxVar.f383448m) && n51.f.a(java.lang.Integer.valueOf(this.f383449n), java.lang.Integer.valueOf(pxVar.f383449n)) && n51.f.a(this.f383450o, pxVar.f383450o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383447i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f383442d);
            java.lang.String str = this.f383443e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f383444f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f383445g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f383446h);
            fVar.g(7, 2, linkedList);
            java.lang.String str4 = this.f383448m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f383449n);
            java.lang.String str5 = this.f383450o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f383442d);
            java.lang.String str6 = this.f383443e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f383444f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f383445g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            int e17 = i18 + b36.f.e(6, this.f383446h) + b36.f.g(7, 2, linkedList);
            java.lang.String str9 = this.f383448m;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            int e18 = e17 + b36.f.e(9, this.f383449n);
            java.lang.String str10 = this.f383450o;
            return str10 != null ? e18 + b36.f.j(10, str10) : e18;
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
        r45.px pxVar = (r45.px) objArr[1];
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
                    pxVar.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                pxVar.f383442d = aVar2.g(intValue);
                return 0;
            case 3:
                pxVar.f383443e = aVar2.k(intValue);
                return 0;
            case 4:
                pxVar.f383444f = aVar2.k(intValue);
                return 0;
            case 5:
                pxVar.f383445g = aVar2.k(intValue);
                return 0;
            case 6:
                pxVar.f383446h = aVar2.g(intValue);
                return 0;
            case 7:
                pxVar.f383447i.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 8:
                pxVar.f383448m = aVar2.k(intValue);
                return 0;
            case 9:
                pxVar.f383449n = aVar2.g(intValue);
                return 0;
            case 10:
                pxVar.f383450o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
