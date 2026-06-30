package r45;

/* loaded from: classes14.dex */
public class uv3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ce f387664d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rs f387665e;

    /* renamed from: f, reason: collision with root package name */
    public r45.pk4 f387666f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ie6 f387667g;

    /* renamed from: h, reason: collision with root package name */
    public r45.pv5 f387668h;

    /* renamed from: i, reason: collision with root package name */
    public r45.h50 f387669i;

    /* renamed from: m, reason: collision with root package name */
    public r45.yq0 f387670m;

    /* renamed from: n, reason: collision with root package name */
    public r45.v53 f387671n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uv3)) {
            return false;
        }
        r45.uv3 uv3Var = (r45.uv3) fVar;
        return n51.f.a(this.f387664d, uv3Var.f387664d) && n51.f.a(this.f387665e, uv3Var.f387665e) && n51.f.a(this.f387666f, uv3Var.f387666f) && n51.f.a(this.f387667g, uv3Var.f387667g) && n51.f.a(this.f387668h, uv3Var.f387668h) && n51.f.a(this.f387669i, uv3Var.f387669i) && n51.f.a(this.f387670m, uv3Var.f387670m) && n51.f.a(this.f387671n, uv3Var.f387671n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ce ceVar = this.f387664d;
            if (ceVar != null) {
                fVar.i(1, ceVar.computeSize());
                this.f387664d.writeFields(fVar);
            }
            r45.rs rsVar = this.f387665e;
            if (rsVar != null) {
                fVar.i(2, rsVar.computeSize());
                this.f387665e.writeFields(fVar);
            }
            r45.pk4 pk4Var = this.f387666f;
            if (pk4Var != null) {
                fVar.i(3, pk4Var.computeSize());
                this.f387666f.writeFields(fVar);
            }
            r45.ie6 ie6Var = this.f387667g;
            if (ie6Var != null) {
                fVar.i(4, ie6Var.computeSize());
                this.f387667g.writeFields(fVar);
            }
            r45.pv5 pv5Var = this.f387668h;
            if (pv5Var != null) {
                fVar.i(6, pv5Var.computeSize());
                this.f387668h.writeFields(fVar);
            }
            r45.h50 h50Var = this.f387669i;
            if (h50Var != null) {
                fVar.i(7, h50Var.computeSize());
                this.f387669i.writeFields(fVar);
            }
            r45.yq0 yq0Var = this.f387670m;
            if (yq0Var != null) {
                fVar.i(8, yq0Var.computeSize());
                this.f387670m.writeFields(fVar);
            }
            r45.v53 v53Var = this.f387671n;
            if (v53Var != null) {
                fVar.i(9, v53Var.computeSize());
                this.f387671n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ce ceVar2 = this.f387664d;
            int i18 = ceVar2 != null ? 0 + b36.f.i(1, ceVar2.computeSize()) : 0;
            r45.rs rsVar2 = this.f387665e;
            if (rsVar2 != null) {
                i18 += b36.f.i(2, rsVar2.computeSize());
            }
            r45.pk4 pk4Var2 = this.f387666f;
            if (pk4Var2 != null) {
                i18 += b36.f.i(3, pk4Var2.computeSize());
            }
            r45.ie6 ie6Var2 = this.f387667g;
            if (ie6Var2 != null) {
                i18 += b36.f.i(4, ie6Var2.computeSize());
            }
            r45.pv5 pv5Var2 = this.f387668h;
            if (pv5Var2 != null) {
                i18 += b36.f.i(6, pv5Var2.computeSize());
            }
            r45.h50 h50Var2 = this.f387669i;
            if (h50Var2 != null) {
                i18 += b36.f.i(7, h50Var2.computeSize());
            }
            r45.yq0 yq0Var2 = this.f387670m;
            if (yq0Var2 != null) {
                i18 += b36.f.i(8, yq0Var2.computeSize());
            }
            r45.v53 v53Var2 = this.f387671n;
            return v53Var2 != null ? i18 + b36.f.i(9, v53Var2.computeSize()) : i18;
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
        r45.uv3 uv3Var = (r45.uv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ce ceVar3 = new r45.ce();
                    if (bArr != null && bArr.length > 0) {
                        ceVar3.parseFrom(bArr);
                    }
                    uv3Var.f387664d = ceVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.rs rsVar3 = new r45.rs();
                    if (bArr2 != null && bArr2.length > 0) {
                        rsVar3.parseFrom(bArr2);
                    }
                    uv3Var.f387665e = rsVar3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.pk4 pk4Var3 = new r45.pk4();
                    if (bArr3 != null && bArr3.length > 0) {
                        pk4Var3.parseFrom(bArr3);
                    }
                    uv3Var.f387666f = pk4Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.ie6 ie6Var3 = new r45.ie6();
                    if (bArr4 != null && bArr4.length > 0) {
                        ie6Var3.parseFrom(bArr4);
                    }
                    uv3Var.f387667g = ie6Var3;
                }
                return 0;
            case 5:
            default:
                return -1;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.pv5 pv5Var3 = new r45.pv5();
                    if (bArr5 != null && bArr5.length > 0) {
                        pv5Var3.parseFrom(bArr5);
                    }
                    uv3Var.f387668h = pv5Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.h50 h50Var3 = new r45.h50();
                    if (bArr6 != null && bArr6.length > 0) {
                        h50Var3.parseFrom(bArr6);
                    }
                    uv3Var.f387669i = h50Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.yq0 yq0Var3 = new r45.yq0();
                    if (bArr7 != null && bArr7.length > 0) {
                        yq0Var3.parseFrom(bArr7);
                    }
                    uv3Var.f387670m = yq0Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.v53 v53Var3 = new r45.v53();
                    if (bArr8 != null && bArr8.length > 0) {
                        v53Var3.parseFrom(bArr8);
                    }
                    uv3Var.f387671n = v53Var3;
                }
                return 0;
        }
    }
}
