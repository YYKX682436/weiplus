package r45;

/* loaded from: classes4.dex */
public class yb7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.vb7 f390952d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f390953e;

    /* renamed from: f, reason: collision with root package name */
    public r45.l63 f390954f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yb7)) {
            return false;
        }
        r45.yb7 yb7Var = (r45.yb7) fVar;
        return n51.f.a(this.f390952d, yb7Var.f390952d) && n51.f.a(this.f390953e, yb7Var.f390953e) && n51.f.a(this.f390954f, yb7Var.f390954f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.vb7 vb7Var = this.f390952d;
            if (vb7Var != null) {
                fVar.i(1, vb7Var.computeSize());
                this.f390952d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f390953e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            r45.l63 l63Var = this.f390954f;
            if (l63Var != null) {
                fVar.i(3, l63Var.computeSize());
                this.f390954f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.vb7 vb7Var2 = this.f390952d;
            int i18 = vb7Var2 != null ? 0 + b36.f.i(1, vb7Var2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f390953e;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            r45.l63 l63Var2 = this.f390954f;
            return l63Var2 != null ? i18 + b36.f.i(3, l63Var2.computeSize()) : i18;
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
        r45.yb7 yb7Var = (r45.yb7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.vb7 vb7Var3 = new r45.vb7();
                if (bArr != null && bArr.length > 0) {
                    vb7Var3.parseFrom(bArr);
                }
                yb7Var.f390952d = vb7Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            yb7Var.f390953e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.l63 l63Var3 = new r45.l63();
            if (bArr2 != null && bArr2.length > 0) {
                l63Var3.parseFrom(bArr2);
            }
            yb7Var.f390954f = l63Var3;
        }
        return 0;
    }
}
