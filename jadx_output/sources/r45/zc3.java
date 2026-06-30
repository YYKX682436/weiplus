package r45;

/* loaded from: classes2.dex */
public class zc3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f391903d;

    /* renamed from: e, reason: collision with root package name */
    public int f391904e;

    /* renamed from: f, reason: collision with root package name */
    public int f391905f;

    /* renamed from: g, reason: collision with root package name */
    public int f391906g;

    /* renamed from: h, reason: collision with root package name */
    public int f391907h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391908i;

    /* renamed from: m, reason: collision with root package name */
    public int f391909m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zc3)) {
            return false;
        }
        r45.zc3 zc3Var = (r45.zc3) fVar;
        return n51.f.a(this.BaseResponse, zc3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f391903d), java.lang.Integer.valueOf(zc3Var.f391903d)) && n51.f.a(java.lang.Integer.valueOf(this.f391904e), java.lang.Integer.valueOf(zc3Var.f391904e)) && n51.f.a(java.lang.Integer.valueOf(this.f391905f), java.lang.Integer.valueOf(zc3Var.f391905f)) && n51.f.a(java.lang.Integer.valueOf(this.f391906g), java.lang.Integer.valueOf(zc3Var.f391906g)) && n51.f.a(java.lang.Integer.valueOf(this.f391907h), java.lang.Integer.valueOf(zc3Var.f391907h)) && n51.f.a(this.f391908i, zc3Var.f391908i) && n51.f.a(java.lang.Integer.valueOf(this.f391909m), java.lang.Integer.valueOf(zc3Var.f391909m));
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
            fVar.e(2, this.f391903d);
            fVar.e(3, this.f391904e);
            fVar.e(4, this.f391905f);
            fVar.e(5, this.f391906g);
            fVar.e(6, this.f391907h);
            java.lang.String str = this.f391908i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f391909m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f391903d) + b36.f.e(3, this.f391904e) + b36.f.e(4, this.f391905f) + b36.f.e(5, this.f391906g) + b36.f.e(6, this.f391907h);
            java.lang.String str2 = this.f391908i;
            if (str2 != null) {
                i18 += b36.f.j(7, str2);
            }
            return i18 + b36.f.e(8, this.f391909m);
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
        r45.zc3 zc3Var = (r45.zc3) objArr[1];
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
                    zc3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                zc3Var.f391903d = aVar2.g(intValue);
                return 0;
            case 3:
                zc3Var.f391904e = aVar2.g(intValue);
                return 0;
            case 4:
                zc3Var.f391905f = aVar2.g(intValue);
                return 0;
            case 5:
                zc3Var.f391906g = aVar2.g(intValue);
                return 0;
            case 6:
                zc3Var.f391907h = aVar2.g(intValue);
                return 0;
            case 7:
                zc3Var.f391908i = aVar2.k(intValue);
                return 0;
            case 8:
                zc3Var.f391909m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
