package r45;

/* loaded from: classes8.dex */
public class jv3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.tm6 f378123d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378124e;

    /* renamed from: f, reason: collision with root package name */
    public r45.wf5 f378125f;

    /* renamed from: g, reason: collision with root package name */
    public r45.wf5 f378126g;

    /* renamed from: h, reason: collision with root package name */
    public int f378127h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f378128i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f378129m;

    /* renamed from: n, reason: collision with root package name */
    public r45.vd f378130n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jv3)) {
            return false;
        }
        r45.jv3 jv3Var = (r45.jv3) fVar;
        return n51.f.a(this.f378123d, jv3Var.f378123d) && n51.f.a(this.f378124e, jv3Var.f378124e) && n51.f.a(this.f378125f, jv3Var.f378125f) && n51.f.a(this.f378126g, jv3Var.f378126g) && n51.f.a(java.lang.Integer.valueOf(this.f378127h), java.lang.Integer.valueOf(jv3Var.f378127h)) && n51.f.a(this.f378128i, jv3Var.f378128i) && n51.f.a(java.lang.Boolean.valueOf(this.f378129m), java.lang.Boolean.valueOf(jv3Var.f378129m)) && n51.f.a(this.f378130n, jv3Var.f378130n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378128i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.tm6 tm6Var = this.f378123d;
            if (tm6Var != null) {
                fVar.i(1, tm6Var.computeSize());
                this.f378123d.writeFields(fVar);
            }
            java.lang.String str = this.f378124e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.wf5 wf5Var = this.f378125f;
            if (wf5Var != null) {
                fVar.i(3, wf5Var.computeSize());
                this.f378125f.writeFields(fVar);
            }
            r45.wf5 wf5Var2 = this.f378126g;
            if (wf5Var2 != null) {
                fVar.i(4, wf5Var2.computeSize());
                this.f378126g.writeFields(fVar);
            }
            fVar.e(5, this.f378127h);
            fVar.g(6, 1, linkedList);
            fVar.a(7, this.f378129m);
            r45.vd vdVar = this.f378130n;
            if (vdVar != null) {
                fVar.i(8, vdVar.computeSize());
                this.f378130n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.tm6 tm6Var2 = this.f378123d;
            int i18 = tm6Var2 != null ? 0 + b36.f.i(1, tm6Var2.computeSize()) : 0;
            java.lang.String str2 = this.f378124e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            r45.wf5 wf5Var3 = this.f378125f;
            if (wf5Var3 != null) {
                i18 += b36.f.i(3, wf5Var3.computeSize());
            }
            r45.wf5 wf5Var4 = this.f378126g;
            if (wf5Var4 != null) {
                i18 += b36.f.i(4, wf5Var4.computeSize());
            }
            int e17 = i18 + b36.f.e(5, this.f378127h) + b36.f.g(6, 1, linkedList) + b36.f.a(7, this.f378129m);
            r45.vd vdVar2 = this.f378130n;
            return vdVar2 != null ? e17 + b36.f.i(8, vdVar2.computeSize()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.jv3 jv3Var = (r45.jv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.tm6 tm6Var3 = new r45.tm6();
                    if (bArr2 != null && bArr2.length > 0) {
                        tm6Var3.parseFrom(bArr2);
                    }
                    jv3Var.f378123d = tm6Var3;
                }
                return 0;
            case 2:
                jv3Var.f378124e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.wf5 wf5Var5 = new r45.wf5();
                    if (bArr3 != null && bArr3.length > 0) {
                        wf5Var5.parseFrom(bArr3);
                    }
                    jv3Var.f378125f = wf5Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.wf5 wf5Var6 = new r45.wf5();
                    if (bArr4 != null && bArr4.length > 0) {
                        wf5Var6.parseFrom(bArr4);
                    }
                    jv3Var.f378126g = wf5Var6;
                }
                return 0;
            case 5:
                jv3Var.f378127h = aVar2.g(intValue);
                return 0;
            case 6:
                jv3Var.f378128i.add(aVar2.k(intValue));
                return 0;
            case 7:
                jv3Var.f378129m = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.vd vdVar3 = new r45.vd();
                    if (bArr5 != null && bArr5.length > 0) {
                        vdVar3.parseFrom(bArr5);
                    }
                    jv3Var.f378130n = vdVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
