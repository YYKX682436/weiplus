package r45;

/* loaded from: classes7.dex */
public class zw1 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f392416e;

    /* renamed from: f, reason: collision with root package name */
    public int f392417f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ax1 f392418g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f392415d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f392419h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zw1)) {
            return false;
        }
        r45.zw1 zw1Var = (r45.zw1) fVar;
        return n51.f.a(this.BaseResponse, zw1Var.BaseResponse) && n51.f.a(this.f392415d, zw1Var.f392415d) && n51.f.a(this.f392416e, zw1Var.f392416e) && n51.f.a(java.lang.Integer.valueOf(this.f392417f), java.lang.Integer.valueOf(zw1Var.f392417f)) && n51.f.a(this.f392418g, zw1Var.f392418g) && n51.f.a(this.f392419h, zw1Var.f392419h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f392419h;
        java.util.LinkedList linkedList2 = this.f392415d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar = this.f392416e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f392417f);
            r45.ax1 ax1Var = this.f392418g;
            if (ax1Var != null) {
                fVar.i(5, ax1Var.computeSize());
                this.f392418g.writeFields(fVar);
            }
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar2 = this.f392416e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            int e17 = i18 + b36.f.e(4, this.f392417f);
            r45.ax1 ax1Var2 = this.f392418g;
            if (ax1Var2 != null) {
                e17 += b36.f.i(5, ax1Var2.computeSize());
            }
            return e17 + b36.f.g(8, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.zw1 zw1Var = (r45.zw1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                zw1Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.ay1 ay1Var = new r45.ay1();
                if (bArr3 != null && bArr3.length > 0) {
                    ay1Var.parseFrom(bArr3);
                }
                zw1Var.f392415d.add(ay1Var);
            }
            return 0;
        }
        if (intValue == 3) {
            zw1Var.f392416e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 4) {
            zw1Var.f392417f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                r45.ax1 ax1Var3 = new r45.ax1();
                if (bArr4 != null && bArr4.length > 0) {
                    ax1Var3.parseFrom(bArr4);
                }
                zw1Var.f392418g = ax1Var3;
            }
            return 0;
        }
        if (intValue != 8) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr5 = (byte[]) j27.get(i29);
            r45.cy1 cy1Var = new r45.cy1();
            if (bArr5 != null && bArr5.length > 0) {
                cy1Var.parseFrom(bArr5);
            }
            zw1Var.f392419h.add(cy1Var);
        }
        return 0;
    }
}
