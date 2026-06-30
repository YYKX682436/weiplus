package r45;

/* loaded from: classes14.dex */
public class q37 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383637d;

    /* renamed from: e, reason: collision with root package name */
    public int f383638e;

    /* renamed from: f, reason: collision with root package name */
    public int f383639f;

    /* renamed from: g, reason: collision with root package name */
    public int f383640g;

    /* renamed from: h, reason: collision with root package name */
    public int f383641h;

    /* renamed from: i, reason: collision with root package name */
    public int f383642i;

    /* renamed from: m, reason: collision with root package name */
    public int f383643m;

    /* renamed from: o, reason: collision with root package name */
    public int f383645o;

    /* renamed from: p, reason: collision with root package name */
    public int f383646p;

    /* renamed from: r, reason: collision with root package name */
    public int f383648r;

    /* renamed from: s, reason: collision with root package name */
    public int f383649s;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f383644n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f383647q = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q37)) {
            return false;
        }
        r45.q37 q37Var = (r45.q37) fVar;
        return n51.f.a(this.BaseRequest, q37Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f383637d), java.lang.Integer.valueOf(q37Var.f383637d)) && n51.f.a(java.lang.Integer.valueOf(this.f383638e), java.lang.Integer.valueOf(q37Var.f383638e)) && n51.f.a(java.lang.Integer.valueOf(this.f383639f), java.lang.Integer.valueOf(q37Var.f383639f)) && n51.f.a(java.lang.Integer.valueOf(this.f383640g), java.lang.Integer.valueOf(q37Var.f383640g)) && n51.f.a(java.lang.Integer.valueOf(this.f383641h), java.lang.Integer.valueOf(q37Var.f383641h)) && n51.f.a(java.lang.Integer.valueOf(this.f383642i), java.lang.Integer.valueOf(q37Var.f383642i)) && n51.f.a(java.lang.Integer.valueOf(this.f383643m), java.lang.Integer.valueOf(q37Var.f383643m)) && n51.f.a(this.f383644n, q37Var.f383644n) && n51.f.a(java.lang.Integer.valueOf(this.f383645o), java.lang.Integer.valueOf(q37Var.f383645o)) && n51.f.a(java.lang.Integer.valueOf(this.f383646p), java.lang.Integer.valueOf(q37Var.f383646p)) && n51.f.a(this.f383647q, q37Var.f383647q) && n51.f.a(java.lang.Integer.valueOf(this.f383648r), java.lang.Integer.valueOf(q37Var.f383648r)) && n51.f.a(java.lang.Integer.valueOf(this.f383649s), java.lang.Integer.valueOf(q37Var.f383649s));
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
            fVar.e(2, this.f383637d);
            fVar.e(3, this.f383638e);
            fVar.e(4, this.f383639f);
            fVar.e(5, this.f383640g);
            fVar.e(6, this.f383641h);
            fVar.e(7, this.f383642i);
            fVar.e(8, this.f383643m);
            fVar.k(9, 2, this.f383644n);
            fVar.e(10, this.f383645o);
            fVar.e(11, this.f383646p);
            fVar.k(12, 2, this.f383647q);
            fVar.e(13, this.f383648r);
            fVar.e(14, this.f383649s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            return (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f383637d) + b36.f.e(3, this.f383638e) + b36.f.e(4, this.f383639f) + b36.f.e(5, this.f383640g) + b36.f.e(6, this.f383641h) + b36.f.e(7, this.f383642i) + b36.f.e(8, this.f383643m) + b36.f.k(9, 2, this.f383644n) + b36.f.e(10, this.f383645o) + b36.f.e(11, this.f383646p) + b36.f.k(12, 2, this.f383647q) + b36.f.e(13, this.f383648r) + b36.f.e(14, this.f383649s);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f383644n.clear();
            this.f383647q.clear();
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
        r45.q37 q37Var = (r45.q37) objArr[1];
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
                    q37Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                q37Var.f383637d = aVar2.g(intValue);
                return 0;
            case 3:
                q37Var.f383638e = aVar2.g(intValue);
                return 0;
            case 4:
                q37Var.f383639f = aVar2.g(intValue);
                return 0;
            case 5:
                q37Var.f383640g = aVar2.g(intValue);
                return 0;
            case 6:
                q37Var.f383641h = aVar2.g(intValue);
                return 0;
            case 7:
                q37Var.f383642i = aVar2.g(intValue);
                return 0;
            case 8:
                q37Var.f383643m = aVar2.g(intValue);
                return 0;
            case 9:
                byte[] bArr3 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                q37Var.f383644n = linkedList;
                return 0;
            case 10:
                q37Var.f383645o = aVar2.g(intValue);
                return 0;
            case 11:
                q37Var.f383646p = aVar2.g(intValue);
                return 0;
            case 12:
                byte[] bArr4 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler2 = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                while (aVar4.f247596c < aVar4.f247595b) {
                    linkedList2.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                q37Var.f383647q = linkedList2;
                return 0;
            case 13:
                q37Var.f383648r = aVar2.g(intValue);
                return 0;
            case 14:
                q37Var.f383649s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
