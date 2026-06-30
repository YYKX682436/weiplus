package r45;

/* loaded from: classes4.dex */
public class rf3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f384799d;

    /* renamed from: e, reason: collision with root package name */
    public long f384800e;

    /* renamed from: f, reason: collision with root package name */
    public int f384801f;

    /* renamed from: g, reason: collision with root package name */
    public int f384802g;

    /* renamed from: h, reason: collision with root package name */
    public int f384803h;

    /* renamed from: i, reason: collision with root package name */
    public long f384804i;

    /* renamed from: m, reason: collision with root package name */
    public long f384805m;

    /* renamed from: n, reason: collision with root package name */
    public long f384806n;

    /* renamed from: o, reason: collision with root package name */
    public int f384807o;

    /* renamed from: p, reason: collision with root package name */
    public r45.fp0 f384808p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rf3)) {
            return false;
        }
        r45.rf3 rf3Var = (r45.rf3) fVar;
        return n51.f.a(this.BaseRequest, rf3Var.BaseRequest) && n51.f.a(java.lang.Long.valueOf(this.f384799d), java.lang.Long.valueOf(rf3Var.f384799d)) && n51.f.a(java.lang.Long.valueOf(this.f384800e), java.lang.Long.valueOf(rf3Var.f384800e)) && n51.f.a(java.lang.Integer.valueOf(this.f384801f), java.lang.Integer.valueOf(rf3Var.f384801f)) && n51.f.a(java.lang.Integer.valueOf(this.f384802g), java.lang.Integer.valueOf(rf3Var.f384802g)) && n51.f.a(java.lang.Integer.valueOf(this.f384803h), java.lang.Integer.valueOf(rf3Var.f384803h)) && n51.f.a(java.lang.Long.valueOf(this.f384804i), java.lang.Long.valueOf(rf3Var.f384804i)) && n51.f.a(java.lang.Long.valueOf(this.f384805m), java.lang.Long.valueOf(rf3Var.f384805m)) && n51.f.a(java.lang.Long.valueOf(this.f384806n), java.lang.Long.valueOf(rf3Var.f384806n)) && n51.f.a(java.lang.Integer.valueOf(this.f384807o), java.lang.Integer.valueOf(rf3Var.f384807o)) && n51.f.a(this.f384808p, rf3Var.f384808p);
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
            fVar.h(2, this.f384799d);
            fVar.h(3, this.f384800e);
            fVar.e(4, this.f384801f);
            fVar.e(5, this.f384802g);
            fVar.e(6, this.f384803h);
            fVar.h(7, this.f384804i);
            fVar.h(8, this.f384805m);
            fVar.h(9, this.f384806n);
            fVar.e(10, this.f384807o);
            r45.fp0 fp0Var = this.f384808p;
            if (fp0Var != null) {
                fVar.i(11, fp0Var.computeSize());
                this.f384808p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.h(2, this.f384799d) + b36.f.h(3, this.f384800e) + b36.f.e(4, this.f384801f) + b36.f.e(5, this.f384802g) + b36.f.e(6, this.f384803h) + b36.f.h(7, this.f384804i) + b36.f.h(8, this.f384805m) + b36.f.h(9, this.f384806n) + b36.f.e(10, this.f384807o);
            r45.fp0 fp0Var2 = this.f384808p;
            return fp0Var2 != null ? i18 + b36.f.i(11, fp0Var2.computeSize()) : i18;
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
        r45.rf3 rf3Var = (r45.rf3) objArr[1];
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
                    rf3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                rf3Var.f384799d = aVar2.i(intValue);
                return 0;
            case 3:
                rf3Var.f384800e = aVar2.i(intValue);
                return 0;
            case 4:
                rf3Var.f384801f = aVar2.g(intValue);
                return 0;
            case 5:
                rf3Var.f384802g = aVar2.g(intValue);
                return 0;
            case 6:
                rf3Var.f384803h = aVar2.g(intValue);
                return 0;
            case 7:
                rf3Var.f384804i = aVar2.i(intValue);
                return 0;
            case 8:
                rf3Var.f384805m = aVar2.i(intValue);
                return 0;
            case 9:
                rf3Var.f384806n = aVar2.i(intValue);
                return 0;
            case 10:
                rf3Var.f384807o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.fp0 fp0Var3 = new r45.fp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        fp0Var3.parseFrom(bArr2);
                    }
                    rf3Var.f384808p = fp0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
