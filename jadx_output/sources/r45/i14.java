package r45;

/* loaded from: classes8.dex */
public class i14 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.j14 f376661d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376663f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f376662e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f376664g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i14)) {
            return false;
        }
        r45.i14 i14Var = (r45.i14) fVar;
        return n51.f.a(this.BaseResponse, i14Var.BaseResponse) && n51.f.a(this.f376661d, i14Var.f376661d) && n51.f.a(this.f376662e, i14Var.f376662e) && n51.f.a(this.f376663f, i14Var.f376663f) && n51.f.a(this.f376664g, i14Var.f376664g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376664g;
        java.util.LinkedList linkedList2 = this.f376662e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.j14 j14Var = this.f376661d;
            if (j14Var != null) {
                fVar.i(2, j14Var.computeSize());
                this.f376661d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList2);
            java.lang.String str = this.f376663f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.j14 j14Var2 = this.f376661d;
            if (j14Var2 != null) {
                i18 += b36.f.i(2, j14Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList2);
            java.lang.String str2 = this.f376663f;
            if (str2 != null) {
                g17 += b36.f.j(4, str2);
            }
            return g17 + b36.f.g(5, 8, linkedList);
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
        r45.i14 i14Var = (r45.i14) objArr[1];
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
                i14Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.j14 j14Var3 = new r45.j14();
                if (bArr3 != null && bArr3.length > 0) {
                    j14Var3.parseFrom(bArr3);
                }
                i14Var.f376661d = j14Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                r45.g14 g14Var = new r45.g14();
                if (bArr4 != null && bArr4.length > 0) {
                    g14Var.parseFrom(bArr4);
                }
                i14Var.f376662e.add(g14Var);
            }
            return 0;
        }
        if (intValue == 4) {
            i14Var.f376663f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr5 = (byte[]) j27.get(i29);
            r45.q24 q24Var = new r45.q24();
            if (bArr5 != null && bArr5.length > 0) {
                q24Var.parseFrom(bArr5);
            }
            i14Var.f376664g.add(q24Var);
        }
        return 0;
    }
}
