package r45;

/* loaded from: classes10.dex */
public class ka0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.aj4 f378526d;

    /* renamed from: e, reason: collision with root package name */
    public r45.vl5 f378527e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vl5 f378528f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vl5 f378529g;

    /* renamed from: h, reason: collision with root package name */
    public r45.vl5 f378530h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ka0)) {
            return false;
        }
        r45.ka0 ka0Var = (r45.ka0) fVar;
        return n51.f.a(this.f378526d, ka0Var.f378526d) && n51.f.a(this.f378527e, ka0Var.f378527e) && n51.f.a(this.f378528f, ka0Var.f378528f) && n51.f.a(this.f378529g, ka0Var.f378529g) && n51.f.a(this.f378530h, ka0Var.f378530h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.aj4 aj4Var = this.f378526d;
            if (aj4Var != null) {
                fVar.i(1, aj4Var.computeSize());
                this.f378526d.writeFields(fVar);
            }
            r45.vl5 vl5Var = this.f378527e;
            if (vl5Var != null) {
                fVar.i(2, vl5Var.computeSize());
                this.f378527e.writeFields(fVar);
            }
            r45.vl5 vl5Var2 = this.f378528f;
            if (vl5Var2 != null) {
                fVar.i(3, vl5Var2.computeSize());
                this.f378528f.writeFields(fVar);
            }
            r45.vl5 vl5Var3 = this.f378529g;
            if (vl5Var3 != null) {
                fVar.i(4, vl5Var3.computeSize());
                this.f378529g.writeFields(fVar);
            }
            r45.vl5 vl5Var4 = this.f378530h;
            if (vl5Var4 != null) {
                fVar.i(5, vl5Var4.computeSize());
                this.f378530h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.aj4 aj4Var2 = this.f378526d;
            int i18 = aj4Var2 != null ? 0 + b36.f.i(1, aj4Var2.computeSize()) : 0;
            r45.vl5 vl5Var5 = this.f378527e;
            if (vl5Var5 != null) {
                i18 += b36.f.i(2, vl5Var5.computeSize());
            }
            r45.vl5 vl5Var6 = this.f378528f;
            if (vl5Var6 != null) {
                i18 += b36.f.i(3, vl5Var6.computeSize());
            }
            r45.vl5 vl5Var7 = this.f378529g;
            if (vl5Var7 != null) {
                i18 += b36.f.i(4, vl5Var7.computeSize());
            }
            r45.vl5 vl5Var8 = this.f378530h;
            return vl5Var8 != null ? i18 + b36.f.i(5, vl5Var8.computeSize()) : i18;
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
        r45.ka0 ka0Var = (r45.ka0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.aj4 aj4Var3 = new r45.aj4();
                if (bArr != null && bArr.length > 0) {
                    aj4Var3.parseFrom(bArr);
                }
                ka0Var.f378526d = aj4Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.vl5 vl5Var9 = new r45.vl5();
                if (bArr2 != null && bArr2.length > 0) {
                    vl5Var9.parseFrom(bArr2);
                }
                ka0Var.f378527e = vl5Var9;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.vl5 vl5Var10 = new r45.vl5();
                if (bArr3 != null && bArr3.length > 0) {
                    vl5Var10.parseFrom(bArr3);
                }
                ka0Var.f378528f = vl5Var10;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i29 = 0; i29 < size4; i29++) {
                byte[] bArr4 = (byte[]) j27.get(i29);
                r45.vl5 vl5Var11 = new r45.vl5();
                if (bArr4 != null && bArr4.length > 0) {
                    vl5Var11.parseFrom(bArr4);
                }
                ka0Var.f378529g = vl5Var11;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i37 = 0; i37 < size5; i37++) {
            byte[] bArr5 = (byte[]) j28.get(i37);
            r45.vl5 vl5Var12 = new r45.vl5();
            if (bArr5 != null && bArr5.length > 0) {
                vl5Var12.parseFrom(bArr5);
            }
            ka0Var.f378530h = vl5Var12;
        }
        return 0;
    }
}
