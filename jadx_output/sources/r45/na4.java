package r45;

/* loaded from: classes4.dex */
public class na4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.oa4 f381195d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ja4 f381196e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ka4 f381197f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f381198g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.na4)) {
            return false;
        }
        r45.na4 na4Var = (r45.na4) fVar;
        return n51.f.a(this.f381195d, na4Var.f381195d) && n51.f.a(this.f381196e, na4Var.f381196e) && n51.f.a(this.f381197f, na4Var.f381197f) && n51.f.a(this.f381198g, na4Var.f381198g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381198g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.oa4 oa4Var = this.f381195d;
            if (oa4Var != null) {
                fVar.i(1, oa4Var.computeSize());
                this.f381195d.writeFields(fVar);
            }
            r45.ja4 ja4Var = this.f381196e;
            if (ja4Var != null) {
                fVar.i(2, ja4Var.computeSize());
                this.f381196e.writeFields(fVar);
            }
            r45.ka4 ka4Var = this.f381197f;
            if (ka4Var != null) {
                fVar.i(3, ka4Var.computeSize());
                this.f381197f.writeFields(fVar);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.oa4 oa4Var2 = this.f381195d;
            int i18 = oa4Var2 != null ? 0 + b36.f.i(1, oa4Var2.computeSize()) : 0;
            r45.ja4 ja4Var2 = this.f381196e;
            if (ja4Var2 != null) {
                i18 += b36.f.i(2, ja4Var2.computeSize());
            }
            r45.ka4 ka4Var2 = this.f381197f;
            if (ka4Var2 != null) {
                i18 += b36.f.i(3, ka4Var2.computeSize());
            }
            return i18 + b36.f.g(4, 8, linkedList);
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
        r45.na4 na4Var = (r45.na4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.oa4 oa4Var3 = new r45.oa4();
                if (bArr2 != null && bArr2.length > 0) {
                    oa4Var3.parseFrom(bArr2);
                }
                na4Var.f381195d = oa4Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.ja4 ja4Var3 = new r45.ja4();
                if (bArr3 != null && bArr3.length > 0) {
                    ja4Var3.parseFrom(bArr3);
                }
                na4Var.f381196e = ja4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                r45.ka4 ka4Var3 = new r45.ka4();
                if (bArr4 != null && bArr4.length > 0) {
                    ka4Var3.parseFrom(bArr4);
                }
                na4Var.f381197f = ka4Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr5 = (byte[]) j27.get(i29);
            r45.la4 la4Var = new r45.la4();
            if (bArr5 != null && bArr5.length > 0) {
                la4Var.parseFrom(bArr5);
            }
            na4Var.f381198g.add(la4Var);
        }
        return 0;
    }
}
