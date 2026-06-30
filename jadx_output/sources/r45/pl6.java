package r45;

/* loaded from: classes2.dex */
public class pl6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.db7 f383164d;

    /* renamed from: e, reason: collision with root package name */
    public long f383165e;

    /* renamed from: f, reason: collision with root package name */
    public long f383166f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383167g;

    /* renamed from: h, reason: collision with root package name */
    public long f383168h;

    /* renamed from: i, reason: collision with root package name */
    public long f383169i;

    /* renamed from: m, reason: collision with root package name */
    public long f383170m;

    /* renamed from: n, reason: collision with root package name */
    public long f383171n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f383172o = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pl6)) {
            return false;
        }
        r45.pl6 pl6Var = (r45.pl6) fVar;
        return n51.f.a(this.f383164d, pl6Var.f383164d) && n51.f.a(java.lang.Long.valueOf(this.f383165e), java.lang.Long.valueOf(pl6Var.f383165e)) && n51.f.a(java.lang.Long.valueOf(this.f383166f), java.lang.Long.valueOf(pl6Var.f383166f)) && n51.f.a(this.f383167g, pl6Var.f383167g) && n51.f.a(java.lang.Long.valueOf(this.f383168h), java.lang.Long.valueOf(pl6Var.f383168h)) && n51.f.a(java.lang.Long.valueOf(this.f383169i), java.lang.Long.valueOf(pl6Var.f383169i)) && n51.f.a(java.lang.Long.valueOf(this.f383170m), java.lang.Long.valueOf(pl6Var.f383170m)) && n51.f.a(java.lang.Long.valueOf(this.f383171n), java.lang.Long.valueOf(pl6Var.f383171n)) && n51.f.a(this.f383172o, pl6Var.f383172o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383172o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.db7 db7Var = this.f383164d;
            if (db7Var != null) {
                fVar.i(1, db7Var.computeSize());
                this.f383164d.writeFields(fVar);
            }
            fVar.h(2, this.f383165e);
            fVar.h(3, this.f383166f);
            java.lang.String str = this.f383167g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f383168h);
            fVar.h(6, this.f383169i);
            fVar.h(7, this.f383170m);
            fVar.h(8, this.f383171n);
            fVar.g(9, 6, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.db7 db7Var2 = this.f383164d;
            int i18 = (db7Var2 != null ? 0 + b36.f.i(1, db7Var2.computeSize()) : 0) + b36.f.h(2, this.f383165e) + b36.f.h(3, this.f383166f);
            java.lang.String str2 = this.f383167g;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.h(5, this.f383168h) + b36.f.h(6, this.f383169i) + b36.f.h(7, this.f383170m) + b36.f.h(8, this.f383171n) + b36.f.g(9, 6, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.pl6 pl6Var = (r45.pl6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.db7 db7Var3 = new r45.db7();
                    if (bArr2 != null && bArr2.length > 0) {
                        db7Var3.parseFrom(bArr2);
                    }
                    pl6Var.f383164d = db7Var3;
                }
                return 0;
            case 2:
                pl6Var.f383165e = aVar2.i(intValue);
                return 0;
            case 3:
                pl6Var.f383166f = aVar2.i(intValue);
                return 0;
            case 4:
                pl6Var.f383167g = aVar2.k(intValue);
                return 0;
            case 5:
                pl6Var.f383168h = aVar2.i(intValue);
                return 0;
            case 6:
                pl6Var.f383169i = aVar2.i(intValue);
                return 0;
            case 7:
                pl6Var.f383170m = aVar2.i(intValue);
                return 0;
            case 8:
                pl6Var.f383171n = aVar2.i(intValue);
                return 0;
            case 9:
                pl6Var.f383172o.add(aVar2.d(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
