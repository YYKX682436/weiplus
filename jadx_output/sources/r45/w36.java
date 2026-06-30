package r45;

/* loaded from: classes9.dex */
public class w36 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f388853d;

    /* renamed from: e, reason: collision with root package name */
    public int f388854e;

    /* renamed from: f, reason: collision with root package name */
    public int f388855f;

    /* renamed from: g, reason: collision with root package name */
    public float f388856g;

    /* renamed from: h, reason: collision with root package name */
    public int f388857h;

    /* renamed from: i, reason: collision with root package name */
    public int f388858i;

    /* renamed from: m, reason: collision with root package name */
    public float f388859m;

    /* renamed from: n, reason: collision with root package name */
    public float f388860n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w36)) {
            return false;
        }
        r45.w36 w36Var = (r45.w36) fVar;
        return n51.f.a(this.BaseRequest, w36Var.BaseRequest) && n51.f.a(this.f388853d, w36Var.f388853d) && n51.f.a(java.lang.Integer.valueOf(this.f388854e), java.lang.Integer.valueOf(w36Var.f388854e)) && n51.f.a(java.lang.Integer.valueOf(this.f388855f), java.lang.Integer.valueOf(w36Var.f388855f)) && n51.f.a(java.lang.Float.valueOf(this.f388856g), java.lang.Float.valueOf(w36Var.f388856g)) && n51.f.a(java.lang.Integer.valueOf(this.f388857h), java.lang.Integer.valueOf(w36Var.f388857h)) && n51.f.a(java.lang.Integer.valueOf(this.f388858i), java.lang.Integer.valueOf(w36Var.f388858i)) && n51.f.a(java.lang.Float.valueOf(this.f388859m), java.lang.Float.valueOf(w36Var.f388859m)) && n51.f.a(java.lang.Float.valueOf(this.f388860n), java.lang.Float.valueOf(w36Var.f388860n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f388853d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f388853d.writeFields(fVar);
            }
            fVar.e(3, this.f388854e);
            fVar.e(4, this.f388855f);
            fVar.d(5, this.f388856g);
            fVar.e(6, this.f388857h);
            fVar.e(7, this.f388858i);
            fVar.d(8, this.f388859m);
            fVar.d(9, this.f388860n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.cu5 cu5Var2 = this.f388853d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f388854e) + b36.f.e(4, this.f388855f) + b36.f.d(5, this.f388856g) + b36.f.e(6, this.f388857h) + b36.f.e(7, this.f388858i) + b36.f.d(8, this.f388859m) + b36.f.d(9, this.f388860n);
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
        r45.w36 w36Var = (r45.w36) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    w36Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    w36Var.f388853d = cu5Var3;
                }
                return 0;
            case 3:
                w36Var.f388854e = aVar2.g(intValue);
                return 0;
            case 4:
                w36Var.f388855f = aVar2.g(intValue);
                return 0;
            case 5:
                w36Var.f388856g = aVar2.f(intValue);
                return 0;
            case 6:
                w36Var.f388857h = aVar2.g(intValue);
                return 0;
            case 7:
                w36Var.f388858i = aVar2.g(intValue);
                return 0;
            case 8:
                w36Var.f388859m = aVar2.f(intValue);
                return 0;
            case 9:
                w36Var.f388860n = aVar2.f(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
