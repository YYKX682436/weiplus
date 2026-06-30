package r45;

/* loaded from: classes7.dex */
public class iz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f377417d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f377418e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f377419f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f377420g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f377421h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f377422i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f377423m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f377424n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f377425o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iz6)) {
            return false;
        }
        r45.iz6 iz6Var = (r45.iz6) fVar;
        return n51.f.a(this.f377417d, iz6Var.f377417d) && n51.f.a(this.f377418e, iz6Var.f377418e) && n51.f.a(this.f377419f, iz6Var.f377419f) && n51.f.a(this.f377420g, iz6Var.f377420g) && n51.f.a(this.f377421h, iz6Var.f377421h) && n51.f.a(this.f377422i, iz6Var.f377422i) && n51.f.a(this.f377423m, iz6Var.f377423m) && n51.f.a(this.f377424n, iz6Var.f377424n) && n51.f.a(this.f377425o, iz6Var.f377425o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, this.f377417d);
            fVar.g(2, 2, this.f377418e);
            fVar.g(3, 5, this.f377419f);
            fVar.g(4, 2, this.f377420g);
            fVar.g(5, 5, this.f377421h);
            fVar.g(6, 5, this.f377422i);
            fVar.g(7, 8, this.f377423m);
            fVar.g(8, 5, this.f377424n);
            java.lang.String str = this.f377425o;
            if (str != null) {
                fVar.j(9, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 2, this.f377417d) + 0 + b36.f.g(2, 2, this.f377418e) + b36.f.g(3, 5, this.f377419f) + b36.f.g(4, 2, this.f377420g) + b36.f.g(5, 5, this.f377421h) + b36.f.g(6, 5, this.f377422i) + b36.f.g(7, 8, this.f377423m) + b36.f.g(8, 5, this.f377424n);
            java.lang.String str2 = this.f377425o;
            return str2 != null ? g17 + b36.f.j(9, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377417d.clear();
            this.f377418e.clear();
            this.f377419f.clear();
            this.f377420g.clear();
            this.f377421h.clear();
            this.f377422i.clear();
            this.f377423m.clear();
            this.f377424n.clear();
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
        r45.iz6 iz6Var = (r45.iz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                iz6Var.f377417d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 2:
                iz6Var.f377418e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 3:
                iz6Var.f377419f.add(java.lang.Float.valueOf(aVar2.f(intValue)));
                return 0;
            case 4:
                iz6Var.f377420g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 5:
                iz6Var.f377421h.add(java.lang.Float.valueOf(aVar2.f(intValue)));
                return 0;
            case 6:
                iz6Var.f377422i.add(java.lang.Float.valueOf(aVar2.f(intValue)));
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.pi0 pi0Var = new r45.pi0();
                    if (bArr2 != null && bArr2.length > 0) {
                        pi0Var.parseFrom(bArr2);
                    }
                    iz6Var.f377423m.add(pi0Var);
                }
                return 0;
            case 8:
                iz6Var.f377424n.add(java.lang.Float.valueOf(aVar2.f(intValue)));
                return 0;
            case 9:
                iz6Var.f377425o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
