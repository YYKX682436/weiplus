package r45;

/* loaded from: classes8.dex */
public class ve3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f388154d;

    /* renamed from: e, reason: collision with root package name */
    public int f388155e;

    /* renamed from: f, reason: collision with root package name */
    public int f388156f;

    /* renamed from: g, reason: collision with root package name */
    public int f388157g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f388158h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388159i;

    /* renamed from: m, reason: collision with root package name */
    public long f388160m;

    static {
        new r45.ve3();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ve3)) {
            return false;
        }
        r45.ve3 ve3Var = (r45.ve3) fVar;
        return n51.f.a(this.BaseRequest, ve3Var.BaseRequest) && n51.f.a(this.f388154d, ve3Var.f388154d) && n51.f.a(java.lang.Integer.valueOf(this.f388155e), java.lang.Integer.valueOf(ve3Var.f388155e)) && n51.f.a(java.lang.Integer.valueOf(this.f388156f), java.lang.Integer.valueOf(ve3Var.f388156f)) && n51.f.a(java.lang.Integer.valueOf(this.f388157g), java.lang.Integer.valueOf(ve3Var.f388157g)) && n51.f.a(this.f388158h, ve3Var.f388158h) && n51.f.a(this.f388159i, ve3Var.f388159i) && n51.f.a(java.lang.Long.valueOf(this.f388160m), java.lang.Long.valueOf(ve3Var.f388160m));
    }

    @Override // r45.mr5, r45.my3
    public r45.he getBaseRequest() {
        return this.BaseRequest;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.ve3();
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
            r45.cu5 cu5Var = this.f388154d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f388154d.writeFields(fVar);
            }
            fVar.e(3, this.f388155e);
            fVar.e(4, this.f388156f);
            fVar.e(5, this.f388157g);
            r45.cu5 cu5Var2 = this.f388158h;
            if (cu5Var2 != null) {
                fVar.i(6, cu5Var2.computeSize());
                this.f388158h.writeFields(fVar);
            }
            java.lang.String str = this.f388159i;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.h(8, this.f388160m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.cu5 cu5Var3 = this.f388154d;
            if (cu5Var3 != null) {
                i18 += b36.f.i(2, cu5Var3.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f388155e) + b36.f.e(4, this.f388156f) + b36.f.e(5, this.f388157g);
            r45.cu5 cu5Var4 = this.f388158h;
            if (cu5Var4 != null) {
                e17 += b36.f.i(6, cu5Var4.computeSize());
            }
            java.lang.String str2 = this.f388159i;
            if (str2 != null) {
                e17 += b36.f.j(7, str2);
            }
            return e17 + b36.f.h(8, this.f388160m);
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
                    this.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    this.f388154d = cu5Var5;
                }
                return 0;
            case 3:
                this.f388155e = aVar2.g(intValue);
                return 0;
            case 4:
                this.f388156f = aVar2.g(intValue);
                return 0;
            case 5:
                this.f388157g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    this.f388158h = cu5Var6;
                }
                return 0;
            case 7:
                this.f388159i = aVar2.k(intValue);
                return 0;
            case 8:
                this.f388160m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.ve3) super.parseFrom(bArr);
    }

    @Override // r45.mr5, r45.my3
    public r45.my3 setBaseRequest(r45.he heVar) {
        this.BaseRequest = heVar;
        return this;
    }
}
