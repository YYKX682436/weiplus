package r45;

/* loaded from: classes12.dex */
public class zd extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f391922d;

    /* renamed from: e, reason: collision with root package name */
    public r45.z57 f391923e;

    /* renamed from: f, reason: collision with root package name */
    public r45.sb7 f391924f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f391925g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f391926h;

    /* renamed from: i, reason: collision with root package name */
    public int f391927i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391928m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zd)) {
            return false;
        }
        r45.zd zdVar = (r45.zd) fVar;
        return n51.f.a(this.f391922d, zdVar.f391922d) && n51.f.a(this.f391923e, zdVar.f391923e) && n51.f.a(this.f391924f, zdVar.f391924f) && n51.f.a(this.f391925g, zdVar.f391925g) && n51.f.a(this.f391926h, zdVar.f391926h) && n51.f.a(java.lang.Integer.valueOf(this.f391927i), java.lang.Integer.valueOf(zdVar.f391927i)) && n51.f.a(this.f391928m, zdVar.f391928m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cu5 cu5Var = this.f391922d;
            if (cu5Var != null) {
                fVar.i(1, cu5Var.computeSize());
                this.f391922d.writeFields(fVar);
            }
            r45.z57 z57Var = this.f391923e;
            if (z57Var != null) {
                fVar.i(2, z57Var.computeSize());
                this.f391923e.writeFields(fVar);
            }
            r45.sb7 sb7Var = this.f391924f;
            if (sb7Var != null) {
                fVar.i(3, sb7Var.computeSize());
                this.f391924f.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f391925g;
            if (cu5Var2 != null) {
                fVar.i(4, cu5Var2.computeSize());
                this.f391925g.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f391926h;
            if (cu5Var3 != null) {
                fVar.i(5, cu5Var3.computeSize());
                this.f391926h.writeFields(fVar);
            }
            fVar.e(6, this.f391927i);
            java.lang.String str = this.f391928m;
            if (str != null) {
                fVar.j(7, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cu5 cu5Var4 = this.f391922d;
            int i18 = cu5Var4 != null ? 0 + b36.f.i(1, cu5Var4.computeSize()) : 0;
            r45.z57 z57Var2 = this.f391923e;
            if (z57Var2 != null) {
                i18 += b36.f.i(2, z57Var2.computeSize());
            }
            r45.sb7 sb7Var2 = this.f391924f;
            if (sb7Var2 != null) {
                i18 += b36.f.i(3, sb7Var2.computeSize());
            }
            r45.cu5 cu5Var5 = this.f391925g;
            if (cu5Var5 != null) {
                i18 += b36.f.i(4, cu5Var5.computeSize());
            }
            r45.cu5 cu5Var6 = this.f391926h;
            if (cu5Var6 != null) {
                i18 += b36.f.i(5, cu5Var6.computeSize());
            }
            int e17 = i18 + b36.f.e(6, this.f391927i);
            java.lang.String str2 = this.f391928m;
            return str2 != null ? e17 + b36.f.j(7, str2) : e17;
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
        r45.zd zdVar = (r45.zd) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var7.b(bArr);
                    }
                    zdVar.f391922d = cu5Var7;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.z57 z57Var3 = new r45.z57();
                    if (bArr2 != null && bArr2.length > 0) {
                        z57Var3.parseFrom(bArr2);
                    }
                    zdVar.f391923e = z57Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.sb7 sb7Var3 = new r45.sb7();
                    if (bArr3 != null && bArr3.length > 0) {
                        sb7Var3.parseFrom(bArr3);
                    }
                    zdVar.f391924f = sb7Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var8.b(bArr4);
                    }
                    zdVar.f391925g = cu5Var8;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var9.b(bArr5);
                    }
                    zdVar.f391926h = cu5Var9;
                }
                return 0;
            case 6:
                zdVar.f391927i = aVar2.g(intValue);
                return 0;
            case 7:
                zdVar.f391928m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
