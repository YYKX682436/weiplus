package r45;

/* loaded from: classes10.dex */
public class f02 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373878d;

    /* renamed from: e, reason: collision with root package name */
    public r45.tl4 f373879e;

    /* renamed from: f, reason: collision with root package name */
    public r45.fm4 f373880f;

    /* renamed from: g, reason: collision with root package name */
    public int f373881g;

    /* renamed from: h, reason: collision with root package name */
    public r45.sl4 f373882h;

    /* renamed from: i, reason: collision with root package name */
    public r45.km4 f373883i;

    /* renamed from: m, reason: collision with root package name */
    public r45.em4 f373884m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ul4 f373885n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f02)) {
            return false;
        }
        r45.f02 f02Var = (r45.f02) fVar;
        return n51.f.a(this.f373878d, f02Var.f373878d) && n51.f.a(this.f373879e, f02Var.f373879e) && n51.f.a(this.f373880f, f02Var.f373880f) && n51.f.a(java.lang.Integer.valueOf(this.f373881g), java.lang.Integer.valueOf(f02Var.f373881g)) && n51.f.a(this.f373882h, f02Var.f373882h) && n51.f.a(this.f373883i, f02Var.f373883i) && n51.f.a(this.f373884m, f02Var.f373884m) && n51.f.a(this.f373885n, f02Var.f373885n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373878d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.tl4 tl4Var = this.f373879e;
            if (tl4Var != null) {
                fVar.i(2, tl4Var.computeSize());
                this.f373879e.writeFields(fVar);
            }
            r45.fm4 fm4Var = this.f373880f;
            if (fm4Var != null) {
                fVar.i(3, fm4Var.computeSize());
                this.f373880f.writeFields(fVar);
            }
            fVar.e(4, this.f373881g);
            r45.sl4 sl4Var = this.f373882h;
            if (sl4Var != null) {
                fVar.i(5, sl4Var.computeSize());
                this.f373882h.writeFields(fVar);
            }
            r45.km4 km4Var = this.f373883i;
            if (km4Var != null) {
                fVar.i(6, km4Var.computeSize());
                this.f373883i.writeFields(fVar);
            }
            r45.em4 em4Var = this.f373884m;
            if (em4Var != null) {
                fVar.i(7, em4Var.computeSize());
                this.f373884m.writeFields(fVar);
            }
            r45.ul4 ul4Var = this.f373885n;
            if (ul4Var != null) {
                fVar.i(8, ul4Var.computeSize());
                this.f373885n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f373878d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.tl4 tl4Var2 = this.f373879e;
            if (tl4Var2 != null) {
                j17 += b36.f.i(2, tl4Var2.computeSize());
            }
            r45.fm4 fm4Var2 = this.f373880f;
            if (fm4Var2 != null) {
                j17 += b36.f.i(3, fm4Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(4, this.f373881g);
            r45.sl4 sl4Var2 = this.f373882h;
            if (sl4Var2 != null) {
                e17 += b36.f.i(5, sl4Var2.computeSize());
            }
            r45.km4 km4Var2 = this.f373883i;
            if (km4Var2 != null) {
                e17 += b36.f.i(6, km4Var2.computeSize());
            }
            r45.em4 em4Var2 = this.f373884m;
            if (em4Var2 != null) {
                e17 += b36.f.i(7, em4Var2.computeSize());
            }
            r45.ul4 ul4Var2 = this.f373885n;
            return ul4Var2 != null ? e17 + b36.f.i(8, ul4Var2.computeSize()) : e17;
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
        r45.f02 f02Var = (r45.f02) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f02Var.f373878d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.tl4 tl4Var3 = new r45.tl4();
                    if (bArr != null && bArr.length > 0) {
                        tl4Var3.parseFrom(bArr);
                    }
                    f02Var.f373879e = tl4Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.fm4 fm4Var3 = new r45.fm4();
                    if (bArr2 != null && bArr2.length > 0) {
                        fm4Var3.parseFrom(bArr2);
                    }
                    f02Var.f373880f = fm4Var3;
                }
                return 0;
            case 4:
                f02Var.f373881g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.sl4 sl4Var3 = new r45.sl4();
                    if (bArr3 != null && bArr3.length > 0) {
                        sl4Var3.parseFrom(bArr3);
                    }
                    f02Var.f373882h = sl4Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    r45.km4 km4Var3 = new r45.km4();
                    if (bArr4 != null && bArr4.length > 0) {
                        km4Var3.parseFrom(bArr4);
                    }
                    f02Var.f373883i = km4Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    r45.em4 em4Var3 = new r45.em4();
                    if (bArr5 != null && bArr5.length > 0) {
                        em4Var3.parseFrom(bArr5);
                    }
                    f02Var.f373884m = em4Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    r45.ul4 ul4Var3 = new r45.ul4();
                    if (bArr6 != null && bArr6.length > 0) {
                        ul4Var3.parseFrom(bArr6);
                    }
                    f02Var.f373885n = ul4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
