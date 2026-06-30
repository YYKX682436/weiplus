package r45;

/* loaded from: classes9.dex */
public class xx5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f390580d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ig0 f390581e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f390582f;

    /* renamed from: g, reason: collision with root package name */
    public int f390583g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f390584h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f390585i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xx5)) {
            return false;
        }
        r45.xx5 xx5Var = (r45.xx5) fVar;
        return n51.f.a(this.f390580d, xx5Var.f390580d) && n51.f.a(this.f390581e, xx5Var.f390581e) && n51.f.a(this.f390582f, xx5Var.f390582f) && n51.f.a(java.lang.Integer.valueOf(this.f390583g), java.lang.Integer.valueOf(xx5Var.f390583g)) && n51.f.a(this.f390584h, xx5Var.f390584h) && n51.f.a(this.f390585i, xx5Var.f390585i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cu5 cu5Var = this.f390580d;
            if (cu5Var != null) {
                fVar.i(1, cu5Var.computeSize());
                this.f390580d.writeFields(fVar);
            }
            r45.ig0 ig0Var = this.f390581e;
            if (ig0Var != null) {
                fVar.i(2, ig0Var.computeSize());
                this.f390581e.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f390582f;
            if (cu5Var2 != null) {
                fVar.i(3, cu5Var2.computeSize());
                this.f390582f.writeFields(fVar);
            }
            fVar.e(4, this.f390583g);
            r45.cu5 cu5Var3 = this.f390584h;
            if (cu5Var3 != null) {
                fVar.i(5, cu5Var3.computeSize());
                this.f390584h.writeFields(fVar);
            }
            r45.cu5 cu5Var4 = this.f390585i;
            if (cu5Var4 != null) {
                fVar.i(6, cu5Var4.computeSize());
                this.f390585i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cu5 cu5Var5 = this.f390580d;
            int i18 = cu5Var5 != null ? 0 + b36.f.i(1, cu5Var5.computeSize()) : 0;
            r45.ig0 ig0Var2 = this.f390581e;
            if (ig0Var2 != null) {
                i18 += b36.f.i(2, ig0Var2.computeSize());
            }
            r45.cu5 cu5Var6 = this.f390582f;
            if (cu5Var6 != null) {
                i18 += b36.f.i(3, cu5Var6.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f390583g);
            r45.cu5 cu5Var7 = this.f390584h;
            if (cu5Var7 != null) {
                e17 += b36.f.i(5, cu5Var7.computeSize());
            }
            r45.cu5 cu5Var8 = this.f390585i;
            return cu5Var8 != null ? e17 + b36.f.i(6, cu5Var8.computeSize()) : e17;
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
        r45.xx5 xx5Var = (r45.xx5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var9.b(bArr);
                    }
                    xx5Var.f390580d = cu5Var9;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ig0 ig0Var3 = new r45.ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig0Var3.parseFrom(bArr2);
                    }
                    xx5Var.f390581e = ig0Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var10 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var10.b(bArr3);
                    }
                    xx5Var.f390582f = cu5Var10;
                }
                return 0;
            case 4:
                xx5Var.f390583g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var11.b(bArr4);
                    }
                    xx5Var.f390584h = cu5Var11;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var12.b(bArr5);
                    }
                    xx5Var.f390585i = cu5Var12;
                }
                return 0;
            default:
                return -1;
        }
    }
}
