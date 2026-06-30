package r45;

/* loaded from: classes9.dex */
public class lt3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bz3 f379813d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f379814e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bz3 f379815f;

    /* renamed from: g, reason: collision with root package name */
    public r45.yt5 f379816g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lt3)) {
            return false;
        }
        r45.lt3 lt3Var = (r45.lt3) fVar;
        return n51.f.a(this.f379813d, lt3Var.f379813d) && n51.f.a(this.f379814e, lt3Var.f379814e) && n51.f.a(this.f379815f, lt3Var.f379815f) && n51.f.a(this.f379816g, lt3Var.f379816g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bz3 bz3Var = this.f379813d;
            if (bz3Var != null) {
                fVar.i(1, bz3Var.computeSize());
                this.f379813d.writeFields(fVar);
            }
            r45.rl6 rl6Var = this.f379814e;
            if (rl6Var != null) {
                fVar.i(2, rl6Var.computeSize());
                this.f379814e.writeFields(fVar);
            }
            r45.bz3 bz3Var2 = this.f379815f;
            if (bz3Var2 != null) {
                fVar.i(3, bz3Var2.computeSize());
                this.f379815f.writeFields(fVar);
            }
            r45.yt5 yt5Var = this.f379816g;
            if (yt5Var != null) {
                fVar.i(4, yt5Var.computeSize());
                this.f379816g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.bz3 bz3Var3 = this.f379813d;
            int i18 = bz3Var3 != null ? 0 + b36.f.i(1, bz3Var3.computeSize()) : 0;
            r45.rl6 rl6Var2 = this.f379814e;
            if (rl6Var2 != null) {
                i18 += b36.f.i(2, rl6Var2.computeSize());
            }
            r45.bz3 bz3Var4 = this.f379815f;
            if (bz3Var4 != null) {
                i18 += b36.f.i(3, bz3Var4.computeSize());
            }
            r45.yt5 yt5Var2 = this.f379816g;
            return yt5Var2 != null ? i18 + b36.f.i(4, yt5Var2.computeSize()) : i18;
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
        r45.lt3 lt3Var = (r45.lt3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.bz3 bz3Var5 = new r45.bz3();
                if (bArr != null && bArr.length > 0) {
                    bz3Var5.parseFrom(bArr);
                }
                lt3Var.f379813d = bz3Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.rl6 rl6Var3 = new r45.rl6();
                if (bArr2 != null && bArr2.length > 0) {
                    rl6Var3.parseFrom(bArr2);
                }
                lt3Var.f379814e = rl6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.bz3 bz3Var6 = new r45.bz3();
                if (bArr3 != null && bArr3.length > 0) {
                    bz3Var6.parseFrom(bArr3);
                }
                lt3Var.f379815f = bz3Var6;
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
            r45.yt5 yt5Var3 = new r45.yt5();
            if (bArr4 != null && bArr4.length > 0) {
                yt5Var3.parseFrom(bArr4);
            }
            lt3Var.f379816g = yt5Var3;
        }
        return 0;
    }
}
