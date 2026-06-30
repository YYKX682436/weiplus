package r45;

/* loaded from: classes14.dex */
public class h27 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375793d;

    /* renamed from: e, reason: collision with root package name */
    public int f375794e;

    /* renamed from: f, reason: collision with root package name */
    public long f375795f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375796g;

    /* renamed from: h, reason: collision with root package name */
    public r45.s37 f375797h;

    /* renamed from: i, reason: collision with root package name */
    public int f375798i;

    /* renamed from: m, reason: collision with root package name */
    public long f375799m;

    /* renamed from: n, reason: collision with root package name */
    public int f375800n;

    /* renamed from: o, reason: collision with root package name */
    public int f375801o;

    /* renamed from: p, reason: collision with root package name */
    public int f375802p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h27)) {
            return false;
        }
        r45.h27 h27Var = (r45.h27) fVar;
        return n51.f.a(this.BaseRequest, h27Var.BaseRequest) && n51.f.a(this.f375793d, h27Var.f375793d) && n51.f.a(java.lang.Integer.valueOf(this.f375794e), java.lang.Integer.valueOf(h27Var.f375794e)) && n51.f.a(java.lang.Long.valueOf(this.f375795f), java.lang.Long.valueOf(h27Var.f375795f)) && n51.f.a(this.f375796g, h27Var.f375796g) && n51.f.a(this.f375797h, h27Var.f375797h) && n51.f.a(java.lang.Integer.valueOf(this.f375798i), java.lang.Integer.valueOf(h27Var.f375798i)) && n51.f.a(java.lang.Long.valueOf(this.f375799m), java.lang.Long.valueOf(h27Var.f375799m)) && n51.f.a(java.lang.Integer.valueOf(this.f375800n), java.lang.Integer.valueOf(h27Var.f375800n)) && n51.f.a(java.lang.Integer.valueOf(this.f375801o), java.lang.Integer.valueOf(h27Var.f375801o)) && n51.f.a(java.lang.Integer.valueOf(this.f375802p), java.lang.Integer.valueOf(h27Var.f375802p));
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
            java.lang.String str = this.f375793d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f375794e);
            fVar.h(4, this.f375795f);
            java.lang.String str2 = this.f375796g;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.s37 s37Var = this.f375797h;
            if (s37Var != null) {
                fVar.i(8, s37Var.computeSize());
                this.f375797h.writeFields(fVar);
            }
            fVar.e(9, this.f375798i);
            fVar.h(10, this.f375799m);
            fVar.e(11, this.f375800n);
            fVar.e(12, this.f375801o);
            fVar.e(13, this.f375802p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f375793d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f375794e) + b36.f.h(4, this.f375795f);
            java.lang.String str4 = this.f375796g;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            r45.s37 s37Var2 = this.f375797h;
            if (s37Var2 != null) {
                e17 += b36.f.i(8, s37Var2.computeSize());
            }
            return e17 + b36.f.e(9, this.f375798i) + b36.f.h(10, this.f375799m) + b36.f.e(11, this.f375800n) + b36.f.e(12, this.f375801o) + b36.f.e(13, this.f375802p);
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
        r45.h27 h27Var = (r45.h27) objArr[1];
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
                    h27Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                h27Var.f375793d = aVar2.k(intValue);
                return 0;
            case 3:
                h27Var.f375794e = aVar2.g(intValue);
                return 0;
            case 4:
                h27Var.f375795f = aVar2.i(intValue);
                return 0;
            case 5:
            case 7:
            default:
                return -1;
            case 6:
                h27Var.f375796g = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.s37 s37Var3 = new r45.s37();
                    if (bArr2 != null && bArr2.length > 0) {
                        s37Var3.parseFrom(bArr2);
                    }
                    h27Var.f375797h = s37Var3;
                }
                return 0;
            case 9:
                h27Var.f375798i = aVar2.g(intValue);
                return 0;
            case 10:
                h27Var.f375799m = aVar2.i(intValue);
                return 0;
            case 11:
                h27Var.f375800n = aVar2.g(intValue);
                return 0;
            case 12:
                h27Var.f375801o = aVar2.g(intValue);
                return 0;
            case 13:
                h27Var.f375802p = aVar2.g(intValue);
                return 0;
        }
    }
}
