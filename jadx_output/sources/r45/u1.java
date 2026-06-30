package r45;

/* loaded from: classes2.dex */
public class u1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f386921d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f386922e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yt5 f386923f;

    /* renamed from: g, reason: collision with root package name */
    public r45.e90 f386924g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u1)) {
            return false;
        }
        r45.u1 u1Var = (r45.u1) fVar;
        return n51.f.a(this.f386921d, u1Var.f386921d) && n51.f.a(this.f386922e, u1Var.f386922e) && n51.f.a(this.f386923f, u1Var.f386923f) && n51.f.a(this.f386924g, u1Var.f386924g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f386921d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.computeSize());
                this.f386921d.writeFields(fVar);
            }
            r45.rl6 rl6Var2 = this.f386922e;
            if (rl6Var2 != null) {
                fVar.i(2, rl6Var2.computeSize());
                this.f386922e.writeFields(fVar);
            }
            r45.yt5 yt5Var = this.f386923f;
            if (yt5Var != null) {
                fVar.i(3, yt5Var.computeSize());
                this.f386923f.writeFields(fVar);
            }
            r45.e90 e90Var = this.f386924g;
            if (e90Var != null) {
                fVar.i(4, e90Var.computeSize());
                this.f386924g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var3 = this.f386921d;
            int i18 = rl6Var3 != null ? 0 + b36.f.i(1, rl6Var3.computeSize()) : 0;
            r45.rl6 rl6Var4 = this.f386922e;
            if (rl6Var4 != null) {
                i18 += b36.f.i(2, rl6Var4.computeSize());
            }
            r45.yt5 yt5Var2 = this.f386923f;
            if (yt5Var2 != null) {
                i18 += b36.f.i(3, yt5Var2.computeSize());
            }
            r45.e90 e90Var2 = this.f386924g;
            return e90Var2 != null ? i18 + b36.f.i(4, e90Var2.computeSize()) : i18;
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
        r45.u1 u1Var = (r45.u1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.rl6 rl6Var5 = new r45.rl6();
                if (bArr != null && bArr.length > 0) {
                    rl6Var5.parseFrom(bArr);
                }
                u1Var.f386921d = rl6Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.rl6 rl6Var6 = new r45.rl6();
                if (bArr2 != null && bArr2.length > 0) {
                    rl6Var6.parseFrom(bArr2);
                }
                u1Var.f386922e = rl6Var6;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.yt5 yt5Var3 = new r45.yt5();
                if (bArr3 != null && bArr3.length > 0) {
                    yt5Var3.parseFrom(bArr3);
                }
                u1Var.f386923f = yt5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.e90 e90Var3 = new r45.e90();
            if (bArr4 != null && bArr4.length > 0) {
                e90Var3.parseFrom(bArr4);
            }
            u1Var.f386924g = e90Var3;
        }
        return 0;
    }
}
