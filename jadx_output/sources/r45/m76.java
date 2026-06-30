package r45;

/* loaded from: classes4.dex */
public class m76 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380205d;

    /* renamed from: e, reason: collision with root package name */
    public long f380206e;

    /* renamed from: f, reason: collision with root package name */
    public long f380207f;

    /* renamed from: g, reason: collision with root package name */
    public int f380208g;

    /* renamed from: h, reason: collision with root package name */
    public long f380209h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f380210i;

    /* renamed from: m, reason: collision with root package name */
    public int f380211m;

    /* renamed from: n, reason: collision with root package name */
    public int f380212n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f380213o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f380214p;

    /* renamed from: q, reason: collision with root package name */
    public int f380215q;

    /* renamed from: r, reason: collision with root package name */
    public long f380216r;

    /* renamed from: s, reason: collision with root package name */
    public long f380217s;

    /* renamed from: t, reason: collision with root package name */
    public long f380218t;

    /* renamed from: u, reason: collision with root package name */
    public int f380219u;

    /* renamed from: v, reason: collision with root package name */
    public long f380220v;

    /* renamed from: w, reason: collision with root package name */
    public r45.cu5 f380221w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m76)) {
            return false;
        }
        r45.m76 m76Var = (r45.m76) fVar;
        return n51.f.a(this.BaseRequest, m76Var.BaseRequest) && n51.f.a(this.f380205d, m76Var.f380205d) && n51.f.a(java.lang.Long.valueOf(this.f380206e), java.lang.Long.valueOf(m76Var.f380206e)) && n51.f.a(java.lang.Long.valueOf(this.f380207f), java.lang.Long.valueOf(m76Var.f380207f)) && n51.f.a(java.lang.Integer.valueOf(this.f380208g), java.lang.Integer.valueOf(m76Var.f380208g)) && n51.f.a(java.lang.Long.valueOf(this.f380209h), java.lang.Long.valueOf(m76Var.f380209h)) && n51.f.a(this.f380210i, m76Var.f380210i) && n51.f.a(java.lang.Integer.valueOf(this.f380211m), java.lang.Integer.valueOf(m76Var.f380211m)) && n51.f.a(java.lang.Integer.valueOf(this.f380212n), java.lang.Integer.valueOf(m76Var.f380212n)) && n51.f.a(this.f380213o, m76Var.f380213o) && n51.f.a(java.lang.Integer.valueOf(this.f380214p), java.lang.Integer.valueOf(m76Var.f380214p)) && n51.f.a(java.lang.Integer.valueOf(this.f380215q), java.lang.Integer.valueOf(m76Var.f380215q)) && n51.f.a(java.lang.Long.valueOf(this.f380216r), java.lang.Long.valueOf(m76Var.f380216r)) && n51.f.a(java.lang.Long.valueOf(this.f380217s), java.lang.Long.valueOf(m76Var.f380217s)) && n51.f.a(java.lang.Long.valueOf(this.f380218t), java.lang.Long.valueOf(m76Var.f380218t)) && n51.f.a(java.lang.Integer.valueOf(this.f380219u), java.lang.Integer.valueOf(m76Var.f380219u)) && n51.f.a(java.lang.Long.valueOf(this.f380220v), java.lang.Long.valueOf(m76Var.f380220v)) && n51.f.a(this.f380221w, m76Var.f380221w);
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
            java.lang.String str = this.f380205d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f380206e);
            fVar.h(4, this.f380207f);
            fVar.e(5, this.f380208g);
            fVar.h(6, this.f380209h);
            r45.cu5 cu5Var = this.f380210i;
            if (cu5Var != null) {
                fVar.i(7, cu5Var.computeSize());
                this.f380210i.writeFields(fVar);
            }
            fVar.e(8, this.f380211m);
            fVar.e(11, this.f380212n);
            fVar.k(12, 3, this.f380213o);
            fVar.e(13, this.f380214p);
            fVar.e(14, this.f380215q);
            fVar.h(15, this.f380216r);
            fVar.h(16, this.f380217s);
            fVar.h(17, this.f380218t);
            fVar.e(18, this.f380219u);
            fVar.h(19, this.f380220v);
            r45.cu5 cu5Var2 = this.f380221w;
            if (cu5Var2 == null) {
                return 0;
            }
            fVar.i(20, cu5Var2.computeSize());
            this.f380221w.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f380205d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int h17 = i18 + b36.f.h(3, this.f380206e) + b36.f.h(4, this.f380207f) + b36.f.e(5, this.f380208g) + b36.f.h(6, this.f380209h);
            r45.cu5 cu5Var3 = this.f380210i;
            if (cu5Var3 != null) {
                h17 += b36.f.i(7, cu5Var3.computeSize());
            }
            int e17 = h17 + b36.f.e(8, this.f380211m) + b36.f.e(11, this.f380212n) + b36.f.k(12, 3, this.f380213o) + b36.f.e(13, this.f380214p) + b36.f.e(14, this.f380215q) + b36.f.h(15, this.f380216r) + b36.f.h(16, this.f380217s) + b36.f.h(17, this.f380218t) + b36.f.e(18, this.f380219u) + b36.f.h(19, this.f380220v);
            r45.cu5 cu5Var4 = this.f380221w;
            return cu5Var4 != null ? e17 + b36.f.i(20, cu5Var4.computeSize()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f380213o.clear();
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
        r45.m76 m76Var = (r45.m76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    m76Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                m76Var.f380205d = aVar2.k(intValue);
                return 0;
            case 3:
                m76Var.f380206e = aVar2.i(intValue);
                return 0;
            case 4:
                m76Var.f380207f = aVar2.i(intValue);
                return 0;
            case 5:
                m76Var.f380208g = aVar2.g(intValue);
                return 0;
            case 6:
                m76Var.f380209h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    m76Var.f380210i = cu5Var5;
                }
                return 0;
            case 8:
                m76Var.f380211m = aVar2.g(intValue);
                return 0;
            case 9:
            case 10:
            default:
                return -1;
            case 11:
                m76Var.f380212n = aVar2.g(intValue);
                return 0;
            case 12:
                byte[] bArr4 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (aVar3.f247596c < aVar3.f247595b) {
                    linkedList.add(java.lang.Long.valueOf(aVar3.g()));
                }
                m76Var.f380213o = linkedList;
                return 0;
            case 13:
                m76Var.f380214p = aVar2.g(intValue);
                return 0;
            case 14:
                m76Var.f380215q = aVar2.g(intValue);
                return 0;
            case 15:
                m76Var.f380216r = aVar2.i(intValue);
                return 0;
            case 16:
                m76Var.f380217s = aVar2.i(intValue);
                return 0;
            case 17:
                m76Var.f380218t = aVar2.i(intValue);
                return 0;
            case 18:
                m76Var.f380219u = aVar2.g(intValue);
                return 0;
            case 19:
                m76Var.f380220v = aVar2.i(intValue);
                return 0;
            case 20:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr5 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var6.b(bArr5);
                    }
                    m76Var.f380221w = cu5Var6;
                }
                return 0;
        }
    }
}
