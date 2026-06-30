package r45;

/* loaded from: classes2.dex */
public class v16 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387806d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387807e;

    /* renamed from: f, reason: collision with root package name */
    public int f387808f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387809g;

    /* renamed from: h, reason: collision with root package name */
    public int f387810h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f387811i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f387812m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v16)) {
            return false;
        }
        r45.v16 v16Var = (r45.v16) fVar;
        return n51.f.a(this.BaseRequest, v16Var.BaseRequest) && n51.f.a(this.f387806d, v16Var.f387806d) && n51.f.a(this.f387807e, v16Var.f387807e) && n51.f.a(java.lang.Integer.valueOf(this.f387808f), java.lang.Integer.valueOf(v16Var.f387808f)) && n51.f.a(this.f387809g, v16Var.f387809g) && n51.f.a(java.lang.Integer.valueOf(this.f387810h), java.lang.Integer.valueOf(v16Var.f387810h)) && n51.f.a(this.f387811i, v16Var.f387811i) && n51.f.a(java.lang.Integer.valueOf(this.f387812m), java.lang.Integer.valueOf(v16Var.f387812m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387811i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f387806d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387807e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f387808f);
            java.lang.String str3 = this.f387809g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f387810h);
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f387812m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f387806d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f387807e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f387808f);
            java.lang.String str6 = this.f387809g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f387810h) + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f387812m);
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
        r45.v16 v16Var = (r45.v16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    v16Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                v16Var.f387806d = aVar2.k(intValue);
                return 0;
            case 3:
                v16Var.f387807e = aVar2.k(intValue);
                return 0;
            case 4:
                v16Var.f387808f = aVar2.g(intValue);
                return 0;
            case 5:
                v16Var.f387809g = aVar2.k(intValue);
                return 0;
            case 6:
                v16Var.f387810h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.os osVar = new r45.os();
                    if (bArr3 != null && bArr3.length > 0) {
                        osVar.parseFrom(bArr3);
                    }
                    v16Var.f387811i.add(osVar);
                }
                return 0;
            case 8:
                v16Var.f387812m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
