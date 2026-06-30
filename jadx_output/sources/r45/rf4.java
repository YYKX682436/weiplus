package r45;

/* loaded from: classes15.dex */
public class rf4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f384809d;

    /* renamed from: e, reason: collision with root package name */
    public r45.uf4 f384810e;

    /* renamed from: f, reason: collision with root package name */
    public r45.tf4 f384811f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sf4 f384812g;

    /* renamed from: h, reason: collision with root package name */
    public r45.qf4 f384813h;

    /* renamed from: i, reason: collision with root package name */
    public r45.vf4 f384814i;

    /* renamed from: m, reason: collision with root package name */
    public r45.wf4 f384815m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rf4)) {
            return false;
        }
        r45.rf4 rf4Var = (r45.rf4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f384809d), java.lang.Integer.valueOf(rf4Var.f384809d)) && n51.f.a(this.f384810e, rf4Var.f384810e) && n51.f.a(this.f384811f, rf4Var.f384811f) && n51.f.a(this.f384812g, rf4Var.f384812g) && n51.f.a(this.f384813h, rf4Var.f384813h) && n51.f.a(this.f384814i, rf4Var.f384814i) && n51.f.a(this.f384815m, rf4Var.f384815m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f384809d);
            r45.uf4 uf4Var = this.f384810e;
            if (uf4Var != null) {
                fVar.i(2, uf4Var.computeSize());
                this.f384810e.writeFields(fVar);
            }
            r45.tf4 tf4Var = this.f384811f;
            if (tf4Var != null) {
                fVar.i(3, tf4Var.computeSize());
                this.f384811f.writeFields(fVar);
            }
            r45.sf4 sf4Var = this.f384812g;
            if (sf4Var != null) {
                fVar.i(4, sf4Var.computeSize());
                this.f384812g.writeFields(fVar);
            }
            r45.qf4 qf4Var = this.f384813h;
            if (qf4Var != null) {
                fVar.i(5, qf4Var.computeSize());
                this.f384813h.writeFields(fVar);
            }
            r45.vf4 vf4Var = this.f384814i;
            if (vf4Var != null) {
                fVar.i(6, vf4Var.computeSize());
                this.f384814i.writeFields(fVar);
            }
            r45.wf4 wf4Var = this.f384815m;
            if (wf4Var != null) {
                fVar.i(7, wf4Var.computeSize());
                this.f384815m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f384809d) + 0;
            r45.uf4 uf4Var2 = this.f384810e;
            if (uf4Var2 != null) {
                e17 += b36.f.i(2, uf4Var2.computeSize());
            }
            r45.tf4 tf4Var2 = this.f384811f;
            if (tf4Var2 != null) {
                e17 += b36.f.i(3, tf4Var2.computeSize());
            }
            r45.sf4 sf4Var2 = this.f384812g;
            if (sf4Var2 != null) {
                e17 += b36.f.i(4, sf4Var2.computeSize());
            }
            r45.qf4 qf4Var2 = this.f384813h;
            if (qf4Var2 != null) {
                e17 += b36.f.i(5, qf4Var2.computeSize());
            }
            r45.vf4 vf4Var2 = this.f384814i;
            if (vf4Var2 != null) {
                e17 += b36.f.i(6, vf4Var2.computeSize());
            }
            r45.wf4 wf4Var2 = this.f384815m;
            return wf4Var2 != null ? e17 + b36.f.i(7, wf4Var2.computeSize()) : e17;
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
        r45.rf4 rf4Var = (r45.rf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rf4Var.f384809d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.uf4 uf4Var3 = new r45.uf4();
                    if (bArr != null && bArr.length > 0) {
                        uf4Var3.parseFrom(bArr);
                    }
                    rf4Var.f384810e = uf4Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.tf4 tf4Var3 = new r45.tf4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tf4Var3.parseFrom(bArr2);
                    }
                    rf4Var.f384811f = tf4Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.sf4 sf4Var3 = new r45.sf4();
                    if (bArr3 != null && bArr3.length > 0) {
                        sf4Var3.parseFrom(bArr3);
                    }
                    rf4Var.f384812g = sf4Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.qf4 qf4Var3 = new r45.qf4();
                    if (bArr4 != null && bArr4.length > 0) {
                        qf4Var3.parseFrom(bArr4);
                    }
                    rf4Var.f384813h = qf4Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.vf4 vf4Var3 = new r45.vf4();
                    if (bArr5 != null && bArr5.length > 0) {
                        vf4Var3.parseFrom(bArr5);
                    }
                    rf4Var.f384814i = vf4Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    r45.wf4 wf4Var3 = new r45.wf4();
                    if (bArr6 != null && bArr6.length > 0) {
                        wf4Var3.parseFrom(bArr6);
                    }
                    rf4Var.f384815m = wf4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
