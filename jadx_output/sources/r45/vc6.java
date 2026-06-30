package r45;

/* loaded from: classes14.dex */
public class vc6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388099d;

    /* renamed from: e, reason: collision with root package name */
    public int f388100e;

    /* renamed from: f, reason: collision with root package name */
    public int f388101f;

    /* renamed from: g, reason: collision with root package name */
    public r45.b27 f388102g;

    /* renamed from: h, reason: collision with root package name */
    public int f388103h;

    /* renamed from: i, reason: collision with root package name */
    public int f388104i;

    /* renamed from: m, reason: collision with root package name */
    public int f388105m;

    /* renamed from: n, reason: collision with root package name */
    public int f388106n;

    /* renamed from: p, reason: collision with root package name */
    public int f388108p;

    /* renamed from: r, reason: collision with root package name */
    public int f388110r;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f388112t;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f388107o = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f388109q = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f388111s = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vc6)) {
            return false;
        }
        r45.vc6 vc6Var = (r45.vc6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388099d), java.lang.Integer.valueOf(vc6Var.f388099d)) && n51.f.a(java.lang.Integer.valueOf(this.f388100e), java.lang.Integer.valueOf(vc6Var.f388100e)) && n51.f.a(java.lang.Integer.valueOf(this.f388101f), java.lang.Integer.valueOf(vc6Var.f388101f)) && n51.f.a(this.f388102g, vc6Var.f388102g) && n51.f.a(java.lang.Integer.valueOf(this.f388103h), java.lang.Integer.valueOf(vc6Var.f388103h)) && n51.f.a(java.lang.Integer.valueOf(this.f388104i), java.lang.Integer.valueOf(vc6Var.f388104i)) && n51.f.a(java.lang.Integer.valueOf(this.f388105m), java.lang.Integer.valueOf(vc6Var.f388105m)) && n51.f.a(java.lang.Integer.valueOf(this.f388106n), java.lang.Integer.valueOf(vc6Var.f388106n)) && n51.f.a(this.f388107o, vc6Var.f388107o) && n51.f.a(java.lang.Integer.valueOf(this.f388108p), java.lang.Integer.valueOf(vc6Var.f388108p)) && n51.f.a(this.f388109q, vc6Var.f388109q) && n51.f.a(java.lang.Integer.valueOf(this.f388110r), java.lang.Integer.valueOf(vc6Var.f388110r)) && n51.f.a(this.f388111s, vc6Var.f388111s) && n51.f.a(this.f388112t, vc6Var.f388112t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388099d);
            fVar.e(2, this.f388100e);
            fVar.e(3, this.f388101f);
            r45.b27 b27Var = this.f388102g;
            if (b27Var != null) {
                fVar.i(4, b27Var.computeSize());
                this.f388102g.writeFields(fVar);
            }
            fVar.e(5, this.f388103h);
            fVar.e(6, this.f388104i);
            fVar.e(7, this.f388105m);
            fVar.e(8, this.f388106n);
            fVar.k(9, 2, this.f388107o);
            fVar.e(10, this.f388108p);
            fVar.k(11, 2, this.f388109q);
            fVar.e(12, this.f388110r);
            fVar.k(13, 2, this.f388111s);
            java.lang.String str = this.f388112t;
            if (str == null) {
                return 0;
            }
            fVar.j(14, str);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388099d) + 0 + b36.f.e(2, this.f388100e) + b36.f.e(3, this.f388101f);
            r45.b27 b27Var2 = this.f388102g;
            if (b27Var2 != null) {
                e17 += b36.f.i(4, b27Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(5, this.f388103h) + b36.f.e(6, this.f388104i) + b36.f.e(7, this.f388105m) + b36.f.e(8, this.f388106n) + b36.f.k(9, 2, this.f388107o) + b36.f.e(10, this.f388108p) + b36.f.k(11, 2, this.f388109q) + b36.f.e(12, this.f388110r) + b36.f.k(13, 2, this.f388111s);
            java.lang.String str2 = this.f388112t;
            return str2 != null ? e18 + b36.f.j(14, str2) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f388107o.clear();
            this.f388109q.clear();
            this.f388111s.clear();
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
        r45.vc6 vc6Var = (r45.vc6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vc6Var.f388099d = aVar2.g(intValue);
                return 0;
            case 2:
                vc6Var.f388100e = aVar2.g(intValue);
                return 0;
            case 3:
                vc6Var.f388101f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.b27 b27Var3 = new r45.b27();
                    if (bArr2 != null && bArr2.length > 0) {
                        b27Var3.parseFrom(bArr2);
                    }
                    vc6Var.f388102g = b27Var3;
                }
                return 0;
            case 5:
                vc6Var.f388103h = aVar2.g(intValue);
                return 0;
            case 6:
                vc6Var.f388104i = aVar2.g(intValue);
                return 0;
            case 7:
                vc6Var.f388105m = aVar2.g(intValue);
                return 0;
            case 8:
                vc6Var.f388106n = aVar2.g(intValue);
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
                vc6Var.f388107o = linkedList;
                return 0;
            case 10:
                vc6Var.f388108p = aVar2.g(intValue);
                return 0;
            case 11:
                byte[] bArr4 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler2 = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler2, "unknownTagHandler");
                e36.a aVar4 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                while (aVar4.f247596c < aVar4.f247595b) {
                    linkedList2.add(java.lang.Integer.valueOf(aVar4.f()));
                }
                vc6Var.f388109q = linkedList2;
                return 0;
            case 12:
                vc6Var.f388110r = aVar2.g(intValue);
                return 0;
            case 13:
                byte[] bArr5 = aVar2.d(intValue).f192156a;
                d36.b unknownTagHandler3 = com.tencent.mm.protobuf.f.unknownTagHandler;
                kotlin.jvm.internal.o.g(unknownTagHandler3, "unknownTagHandler");
                e36.a aVar5 = new e36.a(bArr5, 0, bArr5.length);
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                while (aVar5.f247596c < aVar5.f247595b) {
                    linkedList3.add(java.lang.Integer.valueOf(aVar5.f()));
                }
                vc6Var.f388111s = linkedList3;
                return 0;
            case 14:
                vc6Var.f388112t = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
