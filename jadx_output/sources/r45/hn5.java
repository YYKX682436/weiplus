package r45;

/* loaded from: classes9.dex */
public class hn5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f376316d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f376317e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376318f;

    /* renamed from: g, reason: collision with root package name */
    public int f376319g;

    /* renamed from: h, reason: collision with root package name */
    public r45.io6 f376320h;

    /* renamed from: i, reason: collision with root package name */
    public int f376321i;

    /* renamed from: m, reason: collision with root package name */
    public int f376322m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hn5)) {
            return false;
        }
        r45.hn5 hn5Var = (r45.hn5) fVar;
        return n51.f.a(this.BaseResponse, hn5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f376316d), java.lang.Integer.valueOf(hn5Var.f376316d)) && n51.f.a(this.f376317e, hn5Var.f376317e) && n51.f.a(this.f376318f, hn5Var.f376318f) && n51.f.a(java.lang.Integer.valueOf(this.f376319g), java.lang.Integer.valueOf(hn5Var.f376319g)) && n51.f.a(this.f376320h, hn5Var.f376320h) && n51.f.a(java.lang.Integer.valueOf(this.f376321i), java.lang.Integer.valueOf(hn5Var.f376321i)) && n51.f.a(java.lang.Integer.valueOf(this.f376322m), java.lang.Integer.valueOf(hn5Var.f376322m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376317e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f376316d);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f376318f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f376319g);
            r45.io6 io6Var = this.f376320h;
            if (io6Var != null) {
                fVar.i(6, io6Var.computeSize());
                this.f376320h.writeFields(fVar);
            }
            fVar.e(7, this.f376321i);
            fVar.e(8, this.f376322m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f376316d) + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f376318f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            int e17 = i18 + b36.f.e(5, this.f376319g);
            r45.io6 io6Var2 = this.f376320h;
            if (io6Var2 != null) {
                e17 += b36.f.i(6, io6Var2.computeSize());
            }
            return e17 + b36.f.e(7, this.f376321i) + b36.f.e(8, this.f376322m);
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
        r45.hn5 hn5Var = (r45.hn5) objArr[1];
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
                    hn5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                hn5Var.f376316d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.mw6 mw6Var = new r45.mw6();
                    if (bArr3 != null && bArr3.length > 0) {
                        mw6Var.parseFrom(bArr3);
                    }
                    hn5Var.f376317e.add(mw6Var);
                }
                return 0;
            case 4:
                hn5Var.f376318f = aVar2.k(intValue);
                return 0;
            case 5:
                hn5Var.f376319g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.io6 io6Var3 = new r45.io6();
                    if (bArr4 != null && bArr4.length > 0) {
                        io6Var3.parseFrom(bArr4);
                    }
                    hn5Var.f376320h = io6Var3;
                }
                return 0;
            case 7:
                hn5Var.f376321i = aVar2.g(intValue);
                return 0;
            case 8:
                hn5Var.f376322m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
