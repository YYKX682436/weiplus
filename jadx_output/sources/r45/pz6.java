package r45;

/* loaded from: classes12.dex */
public class pz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qz6 f383504d;

    /* renamed from: e, reason: collision with root package name */
    public long f383505e;

    /* renamed from: f, reason: collision with root package name */
    public long f383506f;

    /* renamed from: g, reason: collision with root package name */
    public long f383507g;

    /* renamed from: h, reason: collision with root package name */
    public long f383508h;

    /* renamed from: i, reason: collision with root package name */
    public long f383509i;

    /* renamed from: m, reason: collision with root package name */
    public long f383510m;

    /* renamed from: n, reason: collision with root package name */
    public int f383511n;

    /* renamed from: o, reason: collision with root package name */
    public int f383512o;

    /* renamed from: p, reason: collision with root package name */
    public int f383513p;

    /* renamed from: q, reason: collision with root package name */
    public int f383514q;

    /* renamed from: r, reason: collision with root package name */
    public int f383515r;

    /* renamed from: s, reason: collision with root package name */
    public long f383516s;

    /* renamed from: t, reason: collision with root package name */
    public int f383517t;

    /* renamed from: u, reason: collision with root package name */
    public int f383518u;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pz6)) {
            return false;
        }
        r45.pz6 pz6Var = (r45.pz6) fVar;
        return n51.f.a(this.f383504d, pz6Var.f383504d) && n51.f.a(java.lang.Long.valueOf(this.f383505e), java.lang.Long.valueOf(pz6Var.f383505e)) && n51.f.a(java.lang.Long.valueOf(this.f383506f), java.lang.Long.valueOf(pz6Var.f383506f)) && n51.f.a(java.lang.Long.valueOf(this.f383507g), java.lang.Long.valueOf(pz6Var.f383507g)) && n51.f.a(java.lang.Long.valueOf(this.f383508h), java.lang.Long.valueOf(pz6Var.f383508h)) && n51.f.a(java.lang.Long.valueOf(this.f383509i), java.lang.Long.valueOf(pz6Var.f383509i)) && n51.f.a(java.lang.Long.valueOf(this.f383510m), java.lang.Long.valueOf(pz6Var.f383510m)) && n51.f.a(java.lang.Integer.valueOf(this.f383511n), java.lang.Integer.valueOf(pz6Var.f383511n)) && n51.f.a(java.lang.Integer.valueOf(this.f383512o), java.lang.Integer.valueOf(pz6Var.f383512o)) && n51.f.a(java.lang.Integer.valueOf(this.f383513p), java.lang.Integer.valueOf(pz6Var.f383513p)) && n51.f.a(java.lang.Integer.valueOf(this.f383514q), java.lang.Integer.valueOf(pz6Var.f383514q)) && n51.f.a(java.lang.Integer.valueOf(this.f383515r), java.lang.Integer.valueOf(pz6Var.f383515r)) && n51.f.a(java.lang.Long.valueOf(this.f383516s), java.lang.Long.valueOf(pz6Var.f383516s)) && n51.f.a(java.lang.Integer.valueOf(this.f383517t), java.lang.Integer.valueOf(pz6Var.f383517t)) && n51.f.a(java.lang.Integer.valueOf(this.f383518u), java.lang.Integer.valueOf(pz6Var.f383518u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qz6 qz6Var = this.f383504d;
            if (qz6Var != null) {
                fVar.i(1, qz6Var.computeSize());
                this.f383504d.writeFields(fVar);
            }
            fVar.h(2, this.f383505e);
            fVar.h(3, this.f383506f);
            fVar.h(4, this.f383507g);
            fVar.h(5, this.f383508h);
            fVar.h(6, this.f383509i);
            fVar.h(7, this.f383510m);
            fVar.e(8, this.f383511n);
            fVar.e(9, this.f383512o);
            fVar.e(10, this.f383513p);
            fVar.e(11, this.f383514q);
            fVar.e(12, this.f383515r);
            fVar.h(13, this.f383516s);
            fVar.e(14, this.f383517t);
            fVar.e(15, this.f383518u);
            return 0;
        }
        if (i17 == 1) {
            r45.qz6 qz6Var2 = this.f383504d;
            return (qz6Var2 != null ? b36.f.i(1, qz6Var2.computeSize()) + 0 : 0) + b36.f.h(2, this.f383505e) + b36.f.h(3, this.f383506f) + b36.f.h(4, this.f383507g) + b36.f.h(5, this.f383508h) + b36.f.h(6, this.f383509i) + b36.f.h(7, this.f383510m) + b36.f.e(8, this.f383511n) + b36.f.e(9, this.f383512o) + b36.f.e(10, this.f383513p) + b36.f.e(11, this.f383514q) + b36.f.e(12, this.f383515r) + b36.f.h(13, this.f383516s) + b36.f.e(14, this.f383517t) + b36.f.e(15, this.f383518u);
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
        r45.pz6 pz6Var = (r45.pz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.qz6 qz6Var3 = new r45.qz6();
                    if (bArr != null && bArr.length > 0) {
                        qz6Var3.parseFrom(bArr);
                    }
                    pz6Var.f383504d = qz6Var3;
                }
                return 0;
            case 2:
                pz6Var.f383505e = aVar2.i(intValue);
                return 0;
            case 3:
                pz6Var.f383506f = aVar2.i(intValue);
                return 0;
            case 4:
                pz6Var.f383507g = aVar2.i(intValue);
                return 0;
            case 5:
                pz6Var.f383508h = aVar2.i(intValue);
                return 0;
            case 6:
                pz6Var.f383509i = aVar2.i(intValue);
                return 0;
            case 7:
                pz6Var.f383510m = aVar2.i(intValue);
                return 0;
            case 8:
                pz6Var.f383511n = aVar2.g(intValue);
                return 0;
            case 9:
                pz6Var.f383512o = aVar2.g(intValue);
                return 0;
            case 10:
                pz6Var.f383513p = aVar2.g(intValue);
                return 0;
            case 11:
                pz6Var.f383514q = aVar2.g(intValue);
                return 0;
            case 12:
                pz6Var.f383515r = aVar2.g(intValue);
                return 0;
            case 13:
                pz6Var.f383516s = aVar2.i(intValue);
                return 0;
            case 14:
                pz6Var.f383517t = aVar2.g(intValue);
                return 0;
            case 15:
                pz6Var.f383518u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
