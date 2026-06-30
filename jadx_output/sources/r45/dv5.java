package r45;

/* loaded from: classes9.dex */
public class dv5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.si f372771d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f372772e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f372773f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sk6 f372774g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dv5)) {
            return false;
        }
        r45.dv5 dv5Var = (r45.dv5) fVar;
        return n51.f.a(this.f372771d, dv5Var.f372771d) && n51.f.a(this.f372772e, dv5Var.f372772e) && n51.f.a(this.f372773f, dv5Var.f372773f) && n51.f.a(this.f372774g, dv5Var.f372774g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372772e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.si siVar = this.f372771d;
            if (siVar != null) {
                fVar.i(1, siVar.computeSize());
                this.f372771d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f372773f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.sk6 sk6Var = this.f372774g;
            if (sk6Var != null) {
                fVar.i(4, sk6Var.computeSize());
                this.f372774g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.si siVar2 = this.f372771d;
            int i18 = (siVar2 != null ? 0 + b36.f.i(1, siVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f372773f;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            r45.sk6 sk6Var2 = this.f372774g;
            return sk6Var2 != null ? i18 + b36.f.i(4, sk6Var2.computeSize()) : i18;
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
        r45.dv5 dv5Var = (r45.dv5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.si siVar3 = new r45.si();
                if (bArr2 != null && bArr2.length > 0) {
                    siVar3.parseFrom(bArr2);
                }
                dv5Var.f372771d = siVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.qi qiVar = new r45.qi();
                if (bArr3 != null && bArr3.length > 0) {
                    qiVar.parseFrom(bArr3);
                }
                dv5Var.f372772e.add(qiVar);
            }
            return 0;
        }
        if (intValue == 3) {
            dv5Var.f372773f = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.sk6 sk6Var3 = new r45.sk6();
            if (bArr4 != null && bArr4.length > 0) {
                sk6Var3.parseFrom(bArr4);
            }
            dv5Var.f372774g = sk6Var3;
        }
        return 0;
    }
}
