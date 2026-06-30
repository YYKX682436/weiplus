package r45;

/* loaded from: classes9.dex */
public class aw6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cw6 f370316d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zv6 f370317e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bw6 f370318f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aw6)) {
            return false;
        }
        r45.aw6 aw6Var = (r45.aw6) fVar;
        return n51.f.a(this.f370316d, aw6Var.f370316d) && n51.f.a(this.f370317e, aw6Var.f370317e) && n51.f.a(this.f370318f, aw6Var.f370318f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cw6 cw6Var = this.f370316d;
            if (cw6Var != null) {
                fVar.i(1, cw6Var.computeSize());
                this.f370316d.writeFields(fVar);
            }
            r45.zv6 zv6Var = this.f370317e;
            if (zv6Var != null) {
                fVar.i(2, zv6Var.computeSize());
                this.f370317e.writeFields(fVar);
            }
            r45.bw6 bw6Var = this.f370318f;
            if (bw6Var != null) {
                fVar.i(3, bw6Var.computeSize());
                this.f370318f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cw6 cw6Var2 = this.f370316d;
            int i18 = cw6Var2 != null ? 0 + b36.f.i(1, cw6Var2.computeSize()) : 0;
            r45.zv6 zv6Var2 = this.f370317e;
            if (zv6Var2 != null) {
                i18 += b36.f.i(2, zv6Var2.computeSize());
            }
            r45.bw6 bw6Var2 = this.f370318f;
            return bw6Var2 != null ? i18 + b36.f.i(3, bw6Var2.computeSize()) : i18;
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
        r45.aw6 aw6Var = (r45.aw6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.cw6 cw6Var3 = new r45.cw6();
                if (bArr != null && bArr.length > 0) {
                    cw6Var3.parseFrom(bArr);
                }
                aw6Var.f370316d = cw6Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.zv6 zv6Var3 = new r45.zv6();
                if (bArr2 != null && bArr2.length > 0) {
                    zv6Var3.parseFrom(bArr2);
                }
                aw6Var.f370317e = zv6Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.bw6 bw6Var3 = new r45.bw6();
            if (bArr3 != null && bArr3.length > 0) {
                bw6Var3.parseFrom(bArr3);
            }
            aw6Var.f370318f = bw6Var3;
        }
        return 0;
    }
}
