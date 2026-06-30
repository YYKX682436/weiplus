package r45;

/* loaded from: classes8.dex */
public class vc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388088d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f388089e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kx3 f388090f;

    /* renamed from: g, reason: collision with root package name */
    public int f388091g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f388092h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388093i;

    /* renamed from: m, reason: collision with root package name */
    public int f388094m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vc)) {
            return false;
        }
        r45.vc vcVar = (r45.vc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388088d), java.lang.Integer.valueOf(vcVar.f388088d)) && n51.f.a(this.f388089e, vcVar.f388089e) && n51.f.a(this.f388090f, vcVar.f388090f) && n51.f.a(java.lang.Integer.valueOf(this.f388091g), java.lang.Integer.valueOf(vcVar.f388091g)) && n51.f.a(this.f388092h, vcVar.f388092h) && n51.f.a(this.f388093i, vcVar.f388093i) && n51.f.a(java.lang.Integer.valueOf(this.f388094m), java.lang.Integer.valueOf(vcVar.f388094m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388088d);
            r45.cu5 cu5Var = this.f388089e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f388089e.writeFields(fVar);
            }
            r45.kx3 kx3Var = this.f388090f;
            if (kx3Var != null) {
                fVar.i(3, kx3Var.computeSize());
                this.f388090f.writeFields(fVar);
            }
            fVar.e(4, this.f388091g);
            r45.cu5 cu5Var2 = this.f388092h;
            if (cu5Var2 != null) {
                fVar.i(5, cu5Var2.computeSize());
                this.f388092h.writeFields(fVar);
            }
            java.lang.String str = this.f388093i;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f388094m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388088d) + 0;
            r45.cu5 cu5Var3 = this.f388089e;
            if (cu5Var3 != null) {
                e17 += b36.f.i(2, cu5Var3.computeSize());
            }
            r45.kx3 kx3Var2 = this.f388090f;
            if (kx3Var2 != null) {
                e17 += b36.f.i(3, kx3Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(4, this.f388091g);
            r45.cu5 cu5Var4 = this.f388092h;
            if (cu5Var4 != null) {
                e18 += b36.f.i(5, cu5Var4.computeSize());
            }
            java.lang.String str2 = this.f388093i;
            if (str2 != null) {
                e18 += b36.f.j(6, str2);
            }
            return e18 + b36.f.e(7, this.f388094m);
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
        r45.vc vcVar = (r45.vc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vcVar.f388088d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var5.b(bArr);
                    }
                    vcVar.f388089e = cu5Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.kx3 kx3Var3 = new r45.kx3();
                    if (bArr2 != null && bArr2.length > 0) {
                        kx3Var3.parseFrom(bArr2);
                    }
                    vcVar.f388090f = kx3Var3;
                }
                return 0;
            case 4:
                vcVar.f388091g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    vcVar.f388092h = cu5Var6;
                }
                return 0;
            case 6:
                vcVar.f388093i = aVar2.k(intValue);
                return 0;
            case 7:
                vcVar.f388094m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
