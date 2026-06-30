package r45;

/* loaded from: classes8.dex */
public class y14 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f390710d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390713g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f390711e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f390712f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f390714h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y14)) {
            return false;
        }
        r45.y14 y14Var = (r45.y14) fVar;
        return n51.f.a(this.BaseResponse, y14Var.BaseResponse) && n51.f.a(this.f390710d, y14Var.f390710d) && n51.f.a(this.f390711e, y14Var.f390711e) && n51.f.a(this.f390712f, y14Var.f390712f) && n51.f.a(this.f390713g, y14Var.f390713g) && n51.f.a(this.f390714h, y14Var.f390714h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f390714h;
        java.util.LinkedList linkedList2 = this.f390712f;
        java.util.LinkedList linkedList3 = this.f390711e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.j14 j14Var = this.f390710d;
            if (j14Var != null) {
                fVar.i(2, j14Var.computeSize());
                this.f390710d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 1, linkedList2);
            java.lang.String str = this.f390713g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.j14 j14Var2 = this.f390710d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 1, linkedList2);
            java.lang.String str2 = this.f390713g;
            if (str2 != null) {
                g17 += b36.f.j(5, str2);
            }
            return g17 + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.y14 y14Var = (r45.y14) objArr[1];
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
                    y14Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.j14 j14Var3 = new r45.j14();
                    if (bArr3 != null && bArr3.length > 0) {
                        j14Var3.parseFrom(bArr3);
                    }
                    y14Var.f390710d = j14Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.lx6 lx6Var = new r45.lx6();
                    if (bArr4 != null && bArr4.length > 0) {
                        lx6Var.parseFrom(bArr4);
                    }
                    y14Var.f390711e.add(lx6Var);
                }
                return 0;
            case 4:
                y14Var.f390712f.add(aVar2.k(intValue));
                return 0;
            case 5:
                y14Var.f390713g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.d24 d24Var = new r45.d24();
                    if (bArr5 != null && bArr5.length > 0) {
                        d24Var.parseFrom(bArr5);
                    }
                    y14Var.f390714h.add(d24Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
