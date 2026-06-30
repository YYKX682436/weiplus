package r45;

/* loaded from: classes4.dex */
public class sf3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f385663d;

    /* renamed from: e, reason: collision with root package name */
    public long f385664e;

    /* renamed from: f, reason: collision with root package name */
    public int f385665f;

    /* renamed from: g, reason: collision with root package name */
    public int f385666g;

    /* renamed from: h, reason: collision with root package name */
    public int f385667h;

    /* renamed from: i, reason: collision with root package name */
    public long f385668i;

    /* renamed from: m, reason: collision with root package name */
    public long f385669m;

    /* renamed from: n, reason: collision with root package name */
    public long f385670n;

    /* renamed from: o, reason: collision with root package name */
    public int f385671o;

    /* renamed from: p, reason: collision with root package name */
    public r45.fp0 f385672p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sf3)) {
            return false;
        }
        r45.sf3 sf3Var = (r45.sf3) fVar;
        return n51.f.a(this.BaseResponse, sf3Var.BaseResponse) && n51.f.a(java.lang.Long.valueOf(this.f385663d), java.lang.Long.valueOf(sf3Var.f385663d)) && n51.f.a(java.lang.Long.valueOf(this.f385664e), java.lang.Long.valueOf(sf3Var.f385664e)) && n51.f.a(java.lang.Integer.valueOf(this.f385665f), java.lang.Integer.valueOf(sf3Var.f385665f)) && n51.f.a(java.lang.Integer.valueOf(this.f385666g), java.lang.Integer.valueOf(sf3Var.f385666g)) && n51.f.a(java.lang.Integer.valueOf(this.f385667h), java.lang.Integer.valueOf(sf3Var.f385667h)) && n51.f.a(java.lang.Long.valueOf(this.f385668i), java.lang.Long.valueOf(sf3Var.f385668i)) && n51.f.a(java.lang.Long.valueOf(this.f385669m), java.lang.Long.valueOf(sf3Var.f385669m)) && n51.f.a(java.lang.Long.valueOf(this.f385670n), java.lang.Long.valueOf(sf3Var.f385670n)) && n51.f.a(java.lang.Integer.valueOf(this.f385671o), java.lang.Integer.valueOf(sf3Var.f385671o)) && n51.f.a(this.f385672p, sf3Var.f385672p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.h(2, this.f385663d);
            fVar.h(3, this.f385664e);
            fVar.e(4, this.f385665f);
            fVar.e(5, this.f385666g);
            fVar.e(6, this.f385667h);
            fVar.h(7, this.f385668i);
            fVar.h(8, this.f385669m);
            fVar.h(9, this.f385670n);
            fVar.e(10, this.f385671o);
            r45.fp0 fp0Var = this.f385672p;
            if (fp0Var != null) {
                fVar.i(11, fp0Var.computeSize());
                this.f385672p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.h(2, this.f385663d) + b36.f.h(3, this.f385664e) + b36.f.e(4, this.f385665f) + b36.f.e(5, this.f385666g) + b36.f.e(6, this.f385667h) + b36.f.h(7, this.f385668i) + b36.f.h(8, this.f385669m) + b36.f.h(9, this.f385670n) + b36.f.e(10, this.f385671o);
            r45.fp0 fp0Var2 = this.f385672p;
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
        r45.sf3 sf3Var = (r45.sf3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    sf3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                sf3Var.f385663d = aVar2.i(intValue);
                return 0;
            case 3:
                sf3Var.f385664e = aVar2.i(intValue);
                return 0;
            case 4:
                sf3Var.f385665f = aVar2.g(intValue);
                return 0;
            case 5:
                sf3Var.f385666g = aVar2.g(intValue);
                return 0;
            case 6:
                sf3Var.f385667h = aVar2.g(intValue);
                return 0;
            case 7:
                sf3Var.f385668i = aVar2.i(intValue);
                return 0;
            case 8:
                sf3Var.f385669m = aVar2.i(intValue);
                return 0;
            case 9:
                sf3Var.f385670n = aVar2.i(intValue);
                return 0;
            case 10:
                sf3Var.f385671o = aVar2.g(intValue);
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
                    sf3Var.f385672p = fp0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
