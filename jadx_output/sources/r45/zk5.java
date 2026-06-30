package r45;

/* loaded from: classes9.dex */
public class zk5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f392176d;

    /* renamed from: e, reason: collision with root package name */
    public int f392177e;

    /* renamed from: f, reason: collision with root package name */
    public int f392178f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f392179g;

    /* renamed from: h, reason: collision with root package name */
    public int f392180h;

    /* renamed from: i, reason: collision with root package name */
    public r45.x25 f392181i;

    /* renamed from: m, reason: collision with root package name */
    public int f392182m;

    /* renamed from: n, reason: collision with root package name */
    public int f392183n;

    /* renamed from: o, reason: collision with root package name */
    public int f392184o;

    /* renamed from: p, reason: collision with root package name */
    public int f392185p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zk5)) {
            return false;
        }
        r45.zk5 zk5Var = (r45.zk5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f392176d), java.lang.Integer.valueOf(zk5Var.f392176d)) && n51.f.a(java.lang.Integer.valueOf(this.f392177e), java.lang.Integer.valueOf(zk5Var.f392177e)) && n51.f.a(java.lang.Integer.valueOf(this.f392178f), java.lang.Integer.valueOf(zk5Var.f392178f)) && n51.f.a(java.lang.Boolean.valueOf(this.f392179g), java.lang.Boolean.valueOf(zk5Var.f392179g)) && n51.f.a(java.lang.Integer.valueOf(this.f392180h), java.lang.Integer.valueOf(zk5Var.f392180h)) && n51.f.a(this.f392181i, zk5Var.f392181i) && n51.f.a(java.lang.Integer.valueOf(this.f392182m), java.lang.Integer.valueOf(zk5Var.f392182m)) && n51.f.a(java.lang.Integer.valueOf(this.f392183n), java.lang.Integer.valueOf(zk5Var.f392183n)) && n51.f.a(java.lang.Integer.valueOf(this.f392184o), java.lang.Integer.valueOf(zk5Var.f392184o)) && n51.f.a(java.lang.Integer.valueOf(this.f392185p), java.lang.Integer.valueOf(zk5Var.f392185p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f392176d);
            fVar.e(2, this.f392177e);
            fVar.e(3, this.f392178f);
            fVar.a(4, this.f392179g);
            fVar.e(5, this.f392180h);
            r45.x25 x25Var = this.f392181i;
            if (x25Var != null) {
                fVar.i(6, x25Var.computeSize());
                this.f392181i.writeFields(fVar);
            }
            fVar.e(7, this.f392182m);
            fVar.e(8, this.f392183n);
            fVar.e(9, this.f392184o);
            fVar.e(10, this.f392185p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f392176d) + 0 + b36.f.e(2, this.f392177e) + b36.f.e(3, this.f392178f) + b36.f.a(4, this.f392179g) + b36.f.e(5, this.f392180h);
            r45.x25 x25Var2 = this.f392181i;
            if (x25Var2 != null) {
                e17 += b36.f.i(6, x25Var2.computeSize());
            }
            return e17 + b36.f.e(7, this.f392182m) + b36.f.e(8, this.f392183n) + b36.f.e(9, this.f392184o) + b36.f.e(10, this.f392185p);
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
        r45.zk5 zk5Var = (r45.zk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zk5Var.f392176d = aVar2.g(intValue);
                return 0;
            case 2:
                zk5Var.f392177e = aVar2.g(intValue);
                return 0;
            case 3:
                zk5Var.f392178f = aVar2.g(intValue);
                return 0;
            case 4:
                zk5Var.f392179g = aVar2.c(intValue);
                return 0;
            case 5:
                zk5Var.f392180h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.x25 x25Var3 = new r45.x25();
                    if (bArr != null && bArr.length > 0) {
                        x25Var3.parseFrom(bArr);
                    }
                    zk5Var.f392181i = x25Var3;
                }
                return 0;
            case 7:
                zk5Var.f392182m = aVar2.g(intValue);
                return 0;
            case 8:
                zk5Var.f392183n = aVar2.g(intValue);
                return 0;
            case 9:
                zk5Var.f392184o = aVar2.g(intValue);
                return 0;
            case 10:
                zk5Var.f392185p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
