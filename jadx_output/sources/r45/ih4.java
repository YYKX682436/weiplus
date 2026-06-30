package r45;

/* loaded from: classes7.dex */
public class ih4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377045d;

    /* renamed from: e, reason: collision with root package name */
    public float f377046e;

    /* renamed from: f, reason: collision with root package name */
    public float f377047f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f377048g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public long f377049h;

    /* renamed from: i, reason: collision with root package name */
    public long f377050i;

    /* renamed from: m, reason: collision with root package name */
    public long f377051m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377052n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ih4)) {
            return false;
        }
        r45.ih4 ih4Var = (r45.ih4) fVar;
        return n51.f.a(this.BaseRequest, ih4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377045d), java.lang.Integer.valueOf(ih4Var.f377045d)) && n51.f.a(java.lang.Float.valueOf(this.f377046e), java.lang.Float.valueOf(ih4Var.f377046e)) && n51.f.a(java.lang.Float.valueOf(this.f377047f), java.lang.Float.valueOf(ih4Var.f377047f)) && n51.f.a(this.f377048g, ih4Var.f377048g) && n51.f.a(java.lang.Long.valueOf(this.f377049h), java.lang.Long.valueOf(ih4Var.f377049h)) && n51.f.a(java.lang.Long.valueOf(this.f377050i), java.lang.Long.valueOf(ih4Var.f377050i)) && n51.f.a(java.lang.Long.valueOf(this.f377051m), java.lang.Long.valueOf(ih4Var.f377051m)) && n51.f.a(this.f377052n, ih4Var.f377052n);
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
            fVar.e(2, this.f377045d);
            fVar.d(3, this.f377046e);
            fVar.d(4, this.f377047f);
            fVar.g(5, 6, this.f377048g);
            fVar.h(6, this.f377049h);
            fVar.h(7, this.f377050i);
            fVar.h(8, this.f377051m);
            com.tencent.mm.protobuf.g gVar = this.f377052n;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377045d) + b36.f.d(3, this.f377046e) + b36.f.d(4, this.f377047f) + b36.f.g(5, 6, this.f377048g) + b36.f.h(6, this.f377049h) + b36.f.h(7, this.f377050i) + b36.f.h(8, this.f377051m);
            com.tencent.mm.protobuf.g gVar2 = this.f377052n;
            return gVar2 != null ? i18 + b36.f.b(9, gVar2) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377048g.clear();
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
        r45.ih4 ih4Var = (r45.ih4) objArr[1];
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
                    ih4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ih4Var.f377045d = aVar2.g(intValue);
                return 0;
            case 3:
                ih4Var.f377046e = aVar2.f(intValue);
                return 0;
            case 4:
                ih4Var.f377047f = aVar2.f(intValue);
                return 0;
            case 5:
                ih4Var.f377048g.add(aVar2.d(intValue));
                return 0;
            case 6:
                ih4Var.f377049h = aVar2.i(intValue);
                return 0;
            case 7:
                ih4Var.f377050i = aVar2.i(intValue);
                return 0;
            case 8:
                ih4Var.f377051m = aVar2.i(intValue);
                return 0;
            case 9:
                ih4Var.f377052n = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
