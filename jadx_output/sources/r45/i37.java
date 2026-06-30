package r45;

/* loaded from: classes12.dex */
public class i37 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f376704d;

    /* renamed from: e, reason: collision with root package name */
    public long f376705e;

    /* renamed from: f, reason: collision with root package name */
    public int f376706f;

    /* renamed from: g, reason: collision with root package name */
    public int f376707g;

    /* renamed from: h, reason: collision with root package name */
    public int f376708h;

    /* renamed from: m, reason: collision with root package name */
    public int f376710m;

    /* renamed from: n, reason: collision with root package name */
    public int f376711n;

    /* renamed from: p, reason: collision with root package name */
    public int f376713p;

    /* renamed from: q, reason: collision with root package name */
    public int f376714q;

    /* renamed from: r, reason: collision with root package name */
    public long f376715r;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f376709i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f376712o = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i37)) {
            return false;
        }
        r45.i37 i37Var = (r45.i37) fVar;
        return n51.f.a(this.BaseRequest, i37Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f376704d), java.lang.Integer.valueOf(i37Var.f376704d)) && n51.f.a(java.lang.Long.valueOf(this.f376705e), java.lang.Long.valueOf(i37Var.f376705e)) && n51.f.a(java.lang.Integer.valueOf(this.f376706f), java.lang.Integer.valueOf(i37Var.f376706f)) && n51.f.a(java.lang.Integer.valueOf(this.f376707g), java.lang.Integer.valueOf(i37Var.f376707g)) && n51.f.a(java.lang.Integer.valueOf(this.f376708h), java.lang.Integer.valueOf(i37Var.f376708h)) && n51.f.a(this.f376709i, i37Var.f376709i) && n51.f.a(java.lang.Integer.valueOf(this.f376710m), java.lang.Integer.valueOf(i37Var.f376710m)) && n51.f.a(java.lang.Integer.valueOf(this.f376711n), java.lang.Integer.valueOf(i37Var.f376711n)) && n51.f.a(this.f376712o, i37Var.f376712o) && n51.f.a(java.lang.Integer.valueOf(this.f376713p), java.lang.Integer.valueOf(i37Var.f376713p)) && n51.f.a(java.lang.Integer.valueOf(this.f376714q), java.lang.Integer.valueOf(i37Var.f376714q)) && n51.f.a(java.lang.Long.valueOf(this.f376715r), java.lang.Long.valueOf(i37Var.f376715r));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f376709i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f376704d);
            fVar.h(3, this.f376705e);
            fVar.e(4, this.f376706f);
            fVar.e(5, this.f376707g);
            fVar.e(6, this.f376708h);
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f376710m);
            fVar.e(9, this.f376711n);
            fVar.g(10, 8, this.f376712o);
            fVar.e(11, this.f376713p);
            fVar.e(12, this.f376714q);
            fVar.h(14, this.f376715r);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f376704d) + b36.f.h(3, this.f376705e) + b36.f.e(4, this.f376706f) + b36.f.e(5, this.f376707g) + b36.f.e(6, this.f376708h) + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f376710m) + b36.f.e(9, this.f376711n) + b36.f.g(10, 8, this.f376712o) + b36.f.e(11, this.f376713p) + b36.f.e(12, this.f376714q) + b36.f.h(14, this.f376715r);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f376712o.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.i37 i37Var = (r45.i37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    i37Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                i37Var.f376704d = aVar2.g(intValue);
                return 0;
            case 3:
                i37Var.f376705e = aVar2.i(intValue);
                return 0;
            case 4:
                i37Var.f376706f = aVar2.g(intValue);
                return 0;
            case 5:
                i37Var.f376707g = aVar2.g(intValue);
                return 0;
            case 6:
                i37Var.f376708h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.l37 l37Var = new r45.l37();
                    if (bArr3 != null && bArr3.length > 0) {
                        l37Var.parseFrom(bArr3);
                    }
                    i37Var.f376709i.add(l37Var);
                }
                return 0;
            case 8:
                i37Var.f376710m = aVar2.g(intValue);
                return 0;
            case 9:
                i37Var.f376711n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.et4 et4Var = new r45.et4();
                    if (bArr4 != null && bArr4.length > 0) {
                        et4Var.parseFrom(bArr4);
                    }
                    i37Var.f376712o.add(et4Var);
                }
                return 0;
            case 11:
                i37Var.f376713p = aVar2.g(intValue);
                return 0;
            case 12:
                i37Var.f376714q = aVar2.g(intValue);
                return 0;
            case 13:
            default:
                return -1;
            case 14:
                i37Var.f376715r = aVar2.i(intValue);
                return 0;
        }
    }
}
