package r45;

/* loaded from: classes7.dex */
public class r20 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384459d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384460e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384461f;

    /* renamed from: g, reason: collision with root package name */
    public int f384462g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f384463h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f384464i;

    /* renamed from: m, reason: collision with root package name */
    public int f384465m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r20)) {
            return false;
        }
        r45.r20 r20Var = (r45.r20) fVar;
        return n51.f.a(this.BaseResponse, r20Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384459d), java.lang.Integer.valueOf(r20Var.f384459d)) && n51.f.a(this.f384460e, r20Var.f384460e) && n51.f.a(this.f384461f, r20Var.f384461f) && n51.f.a(java.lang.Integer.valueOf(this.f384462g), java.lang.Integer.valueOf(r20Var.f384462g)) && n51.f.a(this.f384463h, r20Var.f384463h) && n51.f.a(java.lang.Integer.valueOf(this.f384464i), java.lang.Integer.valueOf(r20Var.f384464i)) && n51.f.a(java.lang.Integer.valueOf(this.f384465m), java.lang.Integer.valueOf(r20Var.f384465m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384463h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f384459d);
            java.lang.String str = this.f384460e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f384461f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f384462g);
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f384464i);
            fVar.e(8, this.f384465m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384459d);
            java.lang.String str3 = this.f384460e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f384461f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.e(5, this.f384462g) + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f384464i) + b36.f.e(8, this.f384465m);
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
        r45.r20 r20Var = (r45.r20) objArr[1];
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
                    r20Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                r20Var.f384459d = aVar2.g(intValue);
                return 0;
            case 3:
                r20Var.f384460e = aVar2.k(intValue);
                return 0;
            case 4:
                r20Var.f384461f = aVar2.k(intValue);
                return 0;
            case 5:
                r20Var.f384462g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.vm6 vm6Var = new r45.vm6();
                    if (bArr3 != null && bArr3.length > 0) {
                        vm6Var.parseFrom(bArr3);
                    }
                    r20Var.f384463h.add(vm6Var);
                }
                return 0;
            case 7:
                r20Var.f384464i = aVar2.g(intValue);
                return 0;
            case 8:
                r20Var.f384465m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
