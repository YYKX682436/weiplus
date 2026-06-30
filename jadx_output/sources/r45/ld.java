package r45;

/* loaded from: classes4.dex */
public class ld extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379316d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zx4 f379317e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zx4 f379318f;

    /* renamed from: g, reason: collision with root package name */
    public r45.zx4 f379319g;

    /* renamed from: h, reason: collision with root package name */
    public r45.zx4 f379320h;

    /* renamed from: i, reason: collision with root package name */
    public int f379321i;

    /* renamed from: m, reason: collision with root package name */
    public int f379322m;

    /* renamed from: n, reason: collision with root package name */
    public int f379323n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ld)) {
            return false;
        }
        r45.ld ldVar = (r45.ld) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379316d), java.lang.Integer.valueOf(ldVar.f379316d)) && n51.f.a(this.f379317e, ldVar.f379317e) && n51.f.a(this.f379318f, ldVar.f379318f) && n51.f.a(this.f379319g, ldVar.f379319g) && n51.f.a(this.f379320h, ldVar.f379320h) && n51.f.a(java.lang.Integer.valueOf(this.f379321i), java.lang.Integer.valueOf(ldVar.f379321i)) && n51.f.a(java.lang.Integer.valueOf(this.f379322m), java.lang.Integer.valueOf(ldVar.f379322m)) && n51.f.a(java.lang.Integer.valueOf(this.f379323n), java.lang.Integer.valueOf(ldVar.f379323n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379316d);
            r45.zx4 zx4Var = this.f379317e;
            if (zx4Var != null) {
                fVar.i(2, zx4Var.computeSize());
                this.f379317e.writeFields(fVar);
            }
            r45.zx4 zx4Var2 = this.f379318f;
            if (zx4Var2 != null) {
                fVar.i(3, zx4Var2.computeSize());
                this.f379318f.writeFields(fVar);
            }
            r45.zx4 zx4Var3 = this.f379319g;
            if (zx4Var3 != null) {
                fVar.i(4, zx4Var3.computeSize());
                this.f379319g.writeFields(fVar);
            }
            r45.zx4 zx4Var4 = this.f379320h;
            if (zx4Var4 != null) {
                fVar.i(11, zx4Var4.computeSize());
                this.f379320h.writeFields(fVar);
            }
            fVar.e(100, this.f379321i);
            fVar.e(101, this.f379322m);
            fVar.e(102, this.f379323n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379316d) + 0;
            r45.zx4 zx4Var5 = this.f379317e;
            if (zx4Var5 != null) {
                e17 += b36.f.i(2, zx4Var5.computeSize());
            }
            r45.zx4 zx4Var6 = this.f379318f;
            if (zx4Var6 != null) {
                e17 += b36.f.i(3, zx4Var6.computeSize());
            }
            r45.zx4 zx4Var7 = this.f379319g;
            if (zx4Var7 != null) {
                e17 += b36.f.i(4, zx4Var7.computeSize());
            }
            r45.zx4 zx4Var8 = this.f379320h;
            if (zx4Var8 != null) {
                e17 += b36.f.i(11, zx4Var8.computeSize());
            }
            return e17 + b36.f.e(100, this.f379321i) + b36.f.e(101, this.f379322m) + b36.f.e(102, this.f379323n);
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
        r45.ld ldVar = (r45.ld) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ldVar.f379316d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.zx4 zx4Var9 = new r45.zx4();
                if (bArr != null && bArr.length > 0) {
                    zx4Var9.parseFrom(bArr);
                }
                ldVar.f379317e = zx4Var9;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.zx4 zx4Var10 = new r45.zx4();
                if (bArr2 != null && bArr2.length > 0) {
                    zx4Var10.parseFrom(bArr2);
                }
                ldVar.f379318f = zx4Var10;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                r45.zx4 zx4Var11 = new r45.zx4();
                if (bArr3 != null && bArr3.length > 0) {
                    zx4Var11.parseFrom(bArr3);
                }
                ldVar.f379319g = zx4Var11;
            }
            return 0;
        }
        if (intValue != 11) {
            switch (intValue) {
                case 100:
                    ldVar.f379321i = aVar2.g(intValue);
                    return 0;
                case 101:
                    ldVar.f379322m = aVar2.g(intValue);
                    return 0;
                case 102:
                    ldVar.f379323n = aVar2.g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr4 = (byte[]) j27.get(i28);
            r45.zx4 zx4Var12 = new r45.zx4();
            if (bArr4 != null && bArr4.length > 0) {
                zx4Var12.parseFrom(bArr4);
            }
            ldVar.f379320h = zx4Var12;
        }
        return 0;
    }
}
