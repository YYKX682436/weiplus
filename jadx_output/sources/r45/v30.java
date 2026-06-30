package r45;

/* loaded from: classes15.dex */
public class v30 extends com.tencent.mm.protobuf.f implements r45.k66 {

    /* renamed from: d, reason: collision with root package name */
    public int f387836d;

    /* renamed from: e, reason: collision with root package name */
    public int f387837e;

    /* renamed from: f, reason: collision with root package name */
    public int f387838f;

    /* renamed from: g, reason: collision with root package name */
    public int f387839g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f387840h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f387841i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f387842m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f387843n;

    /* renamed from: o, reason: collision with root package name */
    public int f387844o;

    /* renamed from: p, reason: collision with root package name */
    public int f387845p;

    /* renamed from: q, reason: collision with root package name */
    public r45.gw3 f387846q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v30)) {
            return false;
        }
        r45.v30 v30Var = (r45.v30) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387836d), java.lang.Integer.valueOf(v30Var.f387836d)) && n51.f.a(java.lang.Integer.valueOf(this.f387837e), java.lang.Integer.valueOf(v30Var.f387837e)) && n51.f.a(java.lang.Integer.valueOf(this.f387838f), java.lang.Integer.valueOf(v30Var.f387838f)) && n51.f.a(java.lang.Integer.valueOf(this.f387839g), java.lang.Integer.valueOf(v30Var.f387839g)) && n51.f.a(this.f387840h, v30Var.f387840h) && n51.f.a(this.f387841i, v30Var.f387841i) && n51.f.a(this.f387842m, v30Var.f387842m) && n51.f.a(java.lang.Integer.valueOf(this.f387843n), java.lang.Integer.valueOf(v30Var.f387843n)) && n51.f.a(java.lang.Integer.valueOf(this.f387844o), java.lang.Integer.valueOf(v30Var.f387844o)) && n51.f.a(java.lang.Integer.valueOf(this.f387845p), java.lang.Integer.valueOf(v30Var.f387845p)) && n51.f.a(this.f387846q, v30Var.f387846q);
    }

    @Override // r45.k66
    public final int getRet() {
        return this.f387836d;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387842m;
        java.util.LinkedList linkedList2 = this.f387841i;
        java.util.LinkedList linkedList3 = this.f387840h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387836d);
            fVar.e(2, this.f387837e);
            fVar.e(3, this.f387838f);
            fVar.e(4, this.f387839g);
            fVar.g(5, 8, linkedList3);
            fVar.g(6, 8, linkedList2);
            fVar.g(7, 8, linkedList);
            fVar.e(8, this.f387843n);
            fVar.e(9, this.f387844o);
            fVar.e(10, this.f387845p);
            r45.gw3 gw3Var = this.f387846q;
            if (gw3Var != null) {
                fVar.i(11, gw3Var.computeSize());
                this.f387846q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387836d) + 0 + b36.f.e(2, this.f387837e) + b36.f.e(3, this.f387838f) + b36.f.e(4, this.f387839g) + b36.f.g(5, 8, linkedList3) + b36.f.g(6, 8, linkedList2) + b36.f.g(7, 8, linkedList) + b36.f.e(8, this.f387843n) + b36.f.e(9, this.f387844o) + b36.f.e(10, this.f387845p);
            r45.gw3 gw3Var2 = this.f387846q;
            return gw3Var2 != null ? e17 + b36.f.i(11, gw3Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
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
        r45.v30 v30Var = (r45.v30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v30Var.f387836d = aVar2.g(intValue);
                return 0;
            case 2:
                v30Var.f387837e = aVar2.g(intValue);
                return 0;
            case 3:
                v30Var.f387838f = aVar2.g(intValue);
                return 0;
            case 4:
                v30Var.f387839g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nf6 nf6Var = new r45.nf6();
                    if (bArr2 != null && bArr2.length > 0) {
                        nf6Var.parseFrom(bArr2);
                    }
                    v30Var.f387840h.add(nf6Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.nf6 nf6Var2 = new r45.nf6();
                    if (bArr3 != null && bArr3.length > 0) {
                        nf6Var2.parseFrom(bArr3);
                    }
                    v30Var.f387841i.add(nf6Var2);
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.nf6 nf6Var3 = new r45.nf6();
                    if (bArr4 != null && bArr4.length > 0) {
                        nf6Var3.parseFrom(bArr4);
                    }
                    v30Var.f387842m.add(nf6Var3);
                }
                return 0;
            case 8:
                v30Var.f387843n = aVar2.g(intValue);
                return 0;
            case 9:
                v30Var.f387844o = aVar2.g(intValue);
                return 0;
            case 10:
                v30Var.f387845p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.gw3 gw3Var3 = new r45.gw3();
                    if (bArr5 != null && bArr5.length > 0) {
                        gw3Var3.parseFrom(bArr5);
                    }
                    v30Var.f387846q = gw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
