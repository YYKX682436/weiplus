package r45;

/* loaded from: classes2.dex */
public class fo4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.nv3 f374489d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ov3 f374490e;

    /* renamed from: f, reason: collision with root package name */
    public int f374491f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fo4)) {
            return false;
        }
        r45.fo4 fo4Var = (r45.fo4) fVar;
        return n51.f.a(this.f374489d, fo4Var.f374489d) && n51.f.a(this.f374490e, fo4Var.f374490e) && n51.f.a(java.lang.Integer.valueOf(this.f374491f), java.lang.Integer.valueOf(fo4Var.f374491f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.nv3 nv3Var = this.f374489d;
            if (nv3Var != null) {
                fVar.i(1, nv3Var.computeSize());
                this.f374489d.writeFields(fVar);
            }
            r45.ov3 ov3Var = this.f374490e;
            if (ov3Var != null) {
                fVar.i(2, ov3Var.computeSize());
                this.f374490e.writeFields(fVar);
            }
            fVar.e(3, this.f374491f);
            return 0;
        }
        if (i17 == 1) {
            r45.nv3 nv3Var2 = this.f374489d;
            int i18 = nv3Var2 != null ? 0 + b36.f.i(1, nv3Var2.computeSize()) : 0;
            r45.ov3 ov3Var2 = this.f374490e;
            if (ov3Var2 != null) {
                i18 += b36.f.i(2, ov3Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f374491f);
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
        r45.fo4 fo4Var = (r45.fo4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.nv3 nv3Var3 = new r45.nv3();
                if (bArr != null && bArr.length > 0) {
                    nv3Var3.parseFrom(bArr);
                }
                fo4Var.f374489d = nv3Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            fo4Var.f374491f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ov3 ov3Var3 = new r45.ov3();
            if (bArr2 != null && bArr2.length > 0) {
                ov3Var3.parseFrom(bArr2);
            }
            fo4Var.f374490e = ov3Var3;
        }
        return 0;
    }
}
