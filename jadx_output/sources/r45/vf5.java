package r45;

/* loaded from: classes8.dex */
public class vf5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388187d;

    /* renamed from: e, reason: collision with root package name */
    public r45.jv3 f388188e;

    /* renamed from: f, reason: collision with root package name */
    public r45.o90 f388189f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ln f388190g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vf5)) {
            return false;
        }
        r45.vf5 vf5Var = (r45.vf5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388187d), java.lang.Integer.valueOf(vf5Var.f388187d)) && n51.f.a(this.f388188e, vf5Var.f388188e) && n51.f.a(this.f388189f, vf5Var.f388189f) && n51.f.a(this.f388190g, vf5Var.f388190g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388187d);
            r45.jv3 jv3Var = this.f388188e;
            if (jv3Var != null) {
                fVar.i(2, jv3Var.computeSize());
                this.f388188e.writeFields(fVar);
            }
            r45.o90 o90Var = this.f388189f;
            if (o90Var != null) {
                fVar.i(3, o90Var.computeSize());
                this.f388189f.writeFields(fVar);
            }
            r45.ln lnVar = this.f388190g;
            if (lnVar != null) {
                fVar.i(4, lnVar.computeSize());
                this.f388190g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388187d) + 0;
            r45.jv3 jv3Var2 = this.f388188e;
            if (jv3Var2 != null) {
                e17 += b36.f.i(2, jv3Var2.computeSize());
            }
            r45.o90 o90Var2 = this.f388189f;
            if (o90Var2 != null) {
                e17 += b36.f.i(3, o90Var2.computeSize());
            }
            r45.ln lnVar2 = this.f388190g;
            return lnVar2 != null ? e17 + b36.f.i(4, lnVar2.computeSize()) : e17;
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
        r45.vf5 vf5Var = (r45.vf5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vf5Var.f388187d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.jv3 jv3Var3 = new r45.jv3();
                if (bArr != null && bArr.length > 0) {
                    jv3Var3.parseFrom(bArr);
                }
                vf5Var.f388188e = jv3Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.o90 o90Var3 = new r45.o90();
                if (bArr2 != null && bArr2.length > 0) {
                    o90Var3.parseFrom(bArr2);
                }
                vf5Var.f388189f = o90Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            r45.ln lnVar3 = new r45.ln();
            if (bArr3 != null && bArr3.length > 0) {
                lnVar3.parseFrom(bArr3);
            }
            vf5Var.f388190g = lnVar3;
        }
        return 0;
    }
}
