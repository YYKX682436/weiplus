package r45;

/* loaded from: classes9.dex */
public class qf5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383945d;

    /* renamed from: e, reason: collision with root package name */
    public long f383946e;

    /* renamed from: f, reason: collision with root package name */
    public long f383947f;

    /* renamed from: g, reason: collision with root package name */
    public long f383948g;

    /* renamed from: h, reason: collision with root package name */
    public int f383949h;

    /* renamed from: i, reason: collision with root package name */
    public int f383950i;

    /* renamed from: m, reason: collision with root package name */
    public int f383951m;

    /* renamed from: n, reason: collision with root package name */
    public long f383952n;

    /* renamed from: o, reason: collision with root package name */
    public long f383953o;

    /* renamed from: p, reason: collision with root package name */
    public int f383954p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f383955q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qf5)) {
            return false;
        }
        r45.qf5 qf5Var = (r45.qf5) fVar;
        return n51.f.a(this.BaseRequest, qf5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f383945d), java.lang.Integer.valueOf(qf5Var.f383945d)) && n51.f.a(java.lang.Long.valueOf(this.f383946e), java.lang.Long.valueOf(qf5Var.f383946e)) && n51.f.a(java.lang.Long.valueOf(this.f383947f), java.lang.Long.valueOf(qf5Var.f383947f)) && n51.f.a(java.lang.Long.valueOf(this.f383948g), java.lang.Long.valueOf(qf5Var.f383948g)) && n51.f.a(java.lang.Integer.valueOf(this.f383949h), java.lang.Integer.valueOf(qf5Var.f383949h)) && n51.f.a(java.lang.Integer.valueOf(this.f383950i), java.lang.Integer.valueOf(qf5Var.f383950i)) && n51.f.a(java.lang.Integer.valueOf(this.f383951m), java.lang.Integer.valueOf(qf5Var.f383951m)) && n51.f.a(java.lang.Long.valueOf(this.f383952n), java.lang.Long.valueOf(qf5Var.f383952n)) && n51.f.a(java.lang.Long.valueOf(this.f383953o), java.lang.Long.valueOf(qf5Var.f383953o)) && n51.f.a(java.lang.Integer.valueOf(this.f383954p), java.lang.Integer.valueOf(qf5Var.f383954p)) && n51.f.a(this.f383955q, qf5Var.f383955q);
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
            fVar.e(2, this.f383945d);
            fVar.h(3, this.f383946e);
            fVar.h(4, this.f383947f);
            fVar.h(5, this.f383948g);
            fVar.e(6, this.f383949h);
            fVar.e(7, this.f383950i);
            fVar.e(8, this.f383951m);
            fVar.h(9, this.f383952n);
            fVar.h(10, this.f383953o);
            fVar.e(11, this.f383954p);
            java.lang.String str = this.f383955q;
            if (str != null) {
                fVar.j(12, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f383945d) + b36.f.h(3, this.f383946e) + b36.f.h(4, this.f383947f) + b36.f.h(5, this.f383948g) + b36.f.e(6, this.f383949h) + b36.f.e(7, this.f383950i) + b36.f.e(8, this.f383951m) + b36.f.h(9, this.f383952n) + b36.f.h(10, this.f383953o) + b36.f.e(11, this.f383954p);
            java.lang.String str2 = this.f383955q;
            return str2 != null ? i18 + b36.f.j(12, str2) : i18;
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
        r45.qf5 qf5Var = (r45.qf5) objArr[1];
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
                    qf5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                qf5Var.f383945d = aVar2.g(intValue);
                return 0;
            case 3:
                qf5Var.f383946e = aVar2.i(intValue);
                return 0;
            case 4:
                qf5Var.f383947f = aVar2.i(intValue);
                return 0;
            case 5:
                qf5Var.f383948g = aVar2.i(intValue);
                return 0;
            case 6:
                qf5Var.f383949h = aVar2.g(intValue);
                return 0;
            case 7:
                qf5Var.f383950i = aVar2.g(intValue);
                return 0;
            case 8:
                qf5Var.f383951m = aVar2.g(intValue);
                return 0;
            case 9:
                qf5Var.f383952n = aVar2.i(intValue);
                return 0;
            case 10:
                qf5Var.f383953o = aVar2.i(intValue);
                return 0;
            case 11:
                qf5Var.f383954p = aVar2.g(intValue);
                return 0;
            case 12:
                qf5Var.f383955q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
