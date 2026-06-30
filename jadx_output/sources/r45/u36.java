package r45;

/* loaded from: classes9.dex */
public class u36 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f386991d;

    /* renamed from: e, reason: collision with root package name */
    public float f386992e;

    /* renamed from: f, reason: collision with root package name */
    public float f386993f;

    /* renamed from: g, reason: collision with root package name */
    public int f386994g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386995h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386996i;

    /* renamed from: m, reason: collision with root package name */
    public int f386997m;

    /* renamed from: n, reason: collision with root package name */
    public int f386998n;

    /* renamed from: o, reason: collision with root package name */
    public int f386999o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f387000p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cu5 f387001q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u36)) {
            return false;
        }
        r45.u36 u36Var = (r45.u36) fVar;
        return n51.f.a(this.BaseRequest, u36Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f386991d), java.lang.Integer.valueOf(u36Var.f386991d)) && n51.f.a(java.lang.Float.valueOf(this.f386992e), java.lang.Float.valueOf(u36Var.f386992e)) && n51.f.a(java.lang.Float.valueOf(this.f386993f), java.lang.Float.valueOf(u36Var.f386993f)) && n51.f.a(java.lang.Integer.valueOf(this.f386994g), java.lang.Integer.valueOf(u36Var.f386994g)) && n51.f.a(this.f386995h, u36Var.f386995h) && n51.f.a(this.f386996i, u36Var.f386996i) && n51.f.a(java.lang.Integer.valueOf(this.f386997m), java.lang.Integer.valueOf(u36Var.f386997m)) && n51.f.a(java.lang.Integer.valueOf(this.f386998n), java.lang.Integer.valueOf(u36Var.f386998n)) && n51.f.a(java.lang.Integer.valueOf(this.f386999o), java.lang.Integer.valueOf(u36Var.f386999o)) && n51.f.a(this.f387000p, u36Var.f387000p) && n51.f.a(this.f387001q, u36Var.f387001q);
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
            fVar.e(2, this.f386991d);
            fVar.d(3, this.f386992e);
            fVar.d(4, this.f386993f);
            fVar.e(5, this.f386994g);
            java.lang.String str = this.f386995h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f386996i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f386997m);
            fVar.e(9, this.f386998n);
            fVar.e(10, this.f386999o);
            r45.cu5 cu5Var = this.f387000p;
            if (cu5Var != null) {
                fVar.i(11, cu5Var.computeSize());
                this.f387000p.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f387001q;
            if (cu5Var2 != null) {
                fVar.i(12, cu5Var2.computeSize());
                this.f387001q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f386991d) + b36.f.d(3, this.f386992e) + b36.f.d(4, this.f386993f) + b36.f.e(5, this.f386994g);
            java.lang.String str3 = this.f386995h;
            if (str3 != null) {
                i18 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f386996i;
            if (str4 != null) {
                i18 += b36.f.j(7, str4);
            }
            int e17 = i18 + b36.f.e(8, this.f386997m) + b36.f.e(9, this.f386998n) + b36.f.e(10, this.f386999o);
            r45.cu5 cu5Var3 = this.f387000p;
            if (cu5Var3 != null) {
                e17 += b36.f.i(11, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f387001q;
            return cu5Var4 != null ? e17 + b36.f.i(12, cu5Var4.computeSize()) : e17;
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
        r45.u36 u36Var = (r45.u36) objArr[1];
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
                    u36Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                u36Var.f386991d = aVar2.g(intValue);
                return 0;
            case 3:
                u36Var.f386992e = aVar2.f(intValue);
                return 0;
            case 4:
                u36Var.f386993f = aVar2.f(intValue);
                return 0;
            case 5:
                u36Var.f386994g = aVar2.g(intValue);
                return 0;
            case 6:
                u36Var.f386995h = aVar2.k(intValue);
                return 0;
            case 7:
                u36Var.f386996i = aVar2.k(intValue);
                return 0;
            case 8:
                u36Var.f386997m = aVar2.g(intValue);
                return 0;
            case 9:
                u36Var.f386998n = aVar2.g(intValue);
                return 0;
            case 10:
                u36Var.f386999o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var5.b(bArr2);
                    }
                    u36Var.f387000p = cu5Var5;
                }
                return 0;
            case 12:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var6.b(bArr3);
                    }
                    u36Var.f387001q = cu5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
