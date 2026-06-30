package m53;

/* loaded from: classes7.dex */
public class u3 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public m53.i4 f324100e;

    /* renamed from: g, reason: collision with root package name */
    public m53.d4 f324102g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f324099d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f324101f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f324103h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.u3)) {
            return false;
        }
        m53.u3 u3Var = (m53.u3) fVar;
        return n51.f.a(this.f324099d, u3Var.f324099d) && n51.f.a(this.f324100e, u3Var.f324100e) && n51.f.a(this.f324101f, u3Var.f324101f) && n51.f.a(this.f324102g, u3Var.f324102g) && n51.f.a(this.f324103h, u3Var.f324103h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f324103h;
        java.util.LinkedList linkedList2 = this.f324101f;
        java.util.LinkedList linkedList3 = this.f324099d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            m53.i4 i4Var = this.f324100e;
            if (i4Var != null) {
                fVar.i(2, i4Var.computeSize());
                this.f324100e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList2);
            m53.d4 d4Var = this.f324102g;
            if (d4Var != null) {
                fVar.i(4, d4Var.computeSize());
                this.f324102g.writeFields(fVar);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList3) + 0;
            m53.i4 i4Var2 = this.f324100e;
            if (i4Var2 != null) {
                g17 += b36.f.i(2, i4Var2.computeSize());
            }
            int g18 = g17 + b36.f.g(3, 8, linkedList2);
            m53.d4 d4Var2 = this.f324102g;
            if (d4Var2 != null) {
                g18 += b36.f.i(4, d4Var2.computeSize());
            }
            return g18 + b36.f.g(5, 8, linkedList);
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
        m53.u3 u3Var = (m53.u3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                m53.d dVar = new m53.d();
                if (bArr2 != null && bArr2.length > 0) {
                    dVar.parseFrom(bArr2);
                }
                u3Var.f324099d.add(dVar);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                m53.i4 i4Var3 = new m53.i4();
                if (bArr3 != null && bArr3.length > 0) {
                    i4Var3.parseFrom(bArr3);
                }
                u3Var.f324100e = i4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr4 = (byte[]) j19.get(i27);
                m53.u uVar = new m53.u();
                if (bArr4 != null && bArr4.length > 0) {
                    uVar.parseFrom(bArr4);
                }
                u3Var.f324101f.add(uVar);
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr5 = (byte[]) j27.get(i28);
                m53.d4 d4Var3 = new m53.d4();
                if (bArr5 != null && bArr5.length > 0) {
                    d4Var3.parseFrom(bArr5);
                }
                u3Var.f324102g = d4Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i29 = 0; i29 < size5; i29++) {
            byte[] bArr6 = (byte[]) j28.get(i29);
            m53.g5 g5Var = new m53.g5();
            if (bArr6 != null && bArr6.length > 0) {
                g5Var.parseFrom(bArr6);
            }
            u3Var.f324103h.add(g5Var);
        }
        return 0;
    }
}
