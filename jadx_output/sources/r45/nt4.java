package r45;

/* loaded from: classes2.dex */
public class nt4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f381660d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pt4 f381661e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ot4 f381662f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ot4 f381663g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nt4)) {
            return false;
        }
        r45.nt4 nt4Var = (r45.nt4) fVar;
        return n51.f.a(this.f381660d, nt4Var.f381660d) && n51.f.a(this.f381661e, nt4Var.f381661e) && n51.f.a(this.f381662f, nt4Var.f381662f) && n51.f.a(this.f381663g, nt4Var.f381663g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f381660d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.computeSize());
                this.f381660d.writeFields(fVar);
            }
            r45.pt4 pt4Var = this.f381661e;
            if (pt4Var != null) {
                fVar.i(2, pt4Var.computeSize());
                this.f381661e.writeFields(fVar);
            }
            r45.ot4 ot4Var = this.f381662f;
            if (ot4Var != null) {
                fVar.i(3, ot4Var.computeSize());
                this.f381662f.writeFields(fVar);
            }
            r45.ot4 ot4Var2 = this.f381663g;
            if (ot4Var2 != null) {
                fVar.i(4, ot4Var2.computeSize());
                this.f381663g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var2 = this.f381660d;
            int i18 = rl6Var2 != null ? 0 + b36.f.i(1, rl6Var2.computeSize()) : 0;
            r45.pt4 pt4Var2 = this.f381661e;
            if (pt4Var2 != null) {
                i18 += b36.f.i(2, pt4Var2.computeSize());
            }
            r45.ot4 ot4Var3 = this.f381662f;
            if (ot4Var3 != null) {
                i18 += b36.f.i(3, ot4Var3.computeSize());
            }
            r45.ot4 ot4Var4 = this.f381663g;
            return ot4Var4 != null ? i18 + b36.f.i(4, ot4Var4.computeSize()) : i18;
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
        r45.nt4 nt4Var = (r45.nt4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.rl6 rl6Var3 = new r45.rl6();
                if (bArr != null && bArr.length > 0) {
                    rl6Var3.parseFrom(bArr);
                }
                nt4Var.f381660d = rl6Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.pt4 pt4Var3 = new r45.pt4();
                if (bArr2 != null && bArr2.length > 0) {
                    pt4Var3.parseFrom(bArr2);
                }
                nt4Var.f381661e = pt4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.ot4 ot4Var5 = new r45.ot4();
                if (bArr3 != null && bArr3.length > 0) {
                    ot4Var5.parseFrom(bArr3);
                }
                nt4Var.f381662f = ot4Var5;
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
            r45.ot4 ot4Var6 = new r45.ot4();
            if (bArr4 != null && bArr4.length > 0) {
                ot4Var6.parseFrom(bArr4);
            }
            nt4Var.f381663g = ot4Var6;
        }
        return 0;
    }
}
