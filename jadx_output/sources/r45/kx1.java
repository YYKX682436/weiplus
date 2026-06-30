package r45;

/* loaded from: classes9.dex */
public class kx1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f379014d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379015e;

    /* renamed from: f, reason: collision with root package name */
    public int f379016f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ox1 f379017g;

    /* renamed from: h, reason: collision with root package name */
    public int f379018h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379019i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379020m;

    /* renamed from: n, reason: collision with root package name */
    public int f379021n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f379022o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kx1)) {
            return false;
        }
        r45.kx1 kx1Var = (r45.kx1) fVar;
        return n51.f.a(this.BaseResponse, kx1Var.BaseResponse) && n51.f.a(this.f379014d, kx1Var.f379014d) && n51.f.a(this.f379015e, kx1Var.f379015e) && n51.f.a(java.lang.Integer.valueOf(this.f379016f), java.lang.Integer.valueOf(kx1Var.f379016f)) && n51.f.a(this.f379017g, kx1Var.f379017g) && n51.f.a(java.lang.Integer.valueOf(this.f379018h), java.lang.Integer.valueOf(kx1Var.f379018h)) && n51.f.a(this.f379019i, kx1Var.f379019i) && n51.f.a(this.f379020m, kx1Var.f379020m) && n51.f.a(java.lang.Integer.valueOf(this.f379021n), java.lang.Integer.valueOf(kx1Var.f379021n)) && n51.f.a(java.lang.Boolean.valueOf(this.f379022o), java.lang.Boolean.valueOf(kx1Var.f379022o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379014d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f379015e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f379016f);
            r45.ox1 ox1Var = this.f379017g;
            if (ox1Var != null) {
                fVar.i(5, ox1Var.computeSize());
                this.f379017g.writeFields(fVar);
            }
            fVar.e(6, this.f379018h);
            java.lang.String str = this.f379019i;
            if (str != null) {
                fVar.j(7, str);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f379020m;
            if (gVar2 != null) {
                fVar.b(8, gVar2);
            }
            fVar.e(9, this.f379021n);
            fVar.a(10, this.f379022o);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar3 = this.f379015e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int e17 = i18 + b36.f.e(4, this.f379016f);
            r45.ox1 ox1Var2 = this.f379017g;
            if (ox1Var2 != null) {
                e17 += b36.f.i(5, ox1Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(6, this.f379018h);
            java.lang.String str2 = this.f379019i;
            if (str2 != null) {
                e18 += b36.f.j(7, str2);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f379020m;
            if (gVar4 != null) {
                e18 += b36.f.b(8, gVar4);
            }
            return e18 + b36.f.e(9, this.f379021n) + b36.f.a(10, this.f379022o);
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
        r45.kx1 kx1Var = (r45.kx1) objArr[1];
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
                    kx1Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.yx1 yx1Var = new r45.yx1();
                    if (bArr3 != null && bArr3.length > 0) {
                        yx1Var.parseFrom(bArr3);
                    }
                    kx1Var.f379014d.add(yx1Var);
                }
                return 0;
            case 3:
                kx1Var.f379015e = aVar2.d(intValue);
                return 0;
            case 4:
                kx1Var.f379016f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ox1 ox1Var3 = new r45.ox1();
                    if (bArr4 != null && bArr4.length > 0) {
                        ox1Var3.parseFrom(bArr4);
                    }
                    kx1Var.f379017g = ox1Var3;
                }
                return 0;
            case 6:
                kx1Var.f379018h = aVar2.g(intValue);
                return 0;
            case 7:
                kx1Var.f379019i = aVar2.k(intValue);
                return 0;
            case 8:
                kx1Var.f379020m = aVar2.d(intValue);
                return 0;
            case 9:
                kx1Var.f379021n = aVar2.g(intValue);
                return 0;
            case 10:
                kx1Var.f379022o = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
