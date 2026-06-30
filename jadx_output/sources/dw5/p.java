package dw5;

/* loaded from: classes9.dex */
public class p extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f244404d;

    /* renamed from: e, reason: collision with root package name */
    public dw5.g f244405e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f244406f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f244407g = new boolean[4];

    static {
        new dw5.p();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof dw5.p)) {
            return false;
        }
        dw5.p pVar = (dw5.p) fVar;
        return n51.f.a(this.f244404d, pVar.f244404d) && n51.f.a(this.f244405e, pVar.f244405e) && n51.f.a(this.f244406f, pVar.f244406f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new dw5.p();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f244406f;
        boolean[] zArr = this.f244407g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f244404d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            dw5.g gVar = this.f244405e;
            if (gVar != null && zArr[2]) {
                fVar.i(2, gVar.computeSize());
                this.f244405e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f244404d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            dw5.g gVar2 = this.f244405e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, gVar2.computeSize());
            }
            return i18 + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f244404d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                dw5.g gVar3 = new dw5.g();
                if (bArr != null && bArr.length > 0) {
                    gVar3.parseFrom(bArr);
                }
                this.f244405e = gVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            dw5.g gVar4 = new dw5.g();
            if (bArr2 != null && bArr2.length > 0) {
                gVar4.parseFrom(bArr2);
            }
            linkedList.add(gVar4);
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (dw5.p) super.parseFrom(bArr);
    }
}
