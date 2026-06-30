package r45;

/* loaded from: classes4.dex */
public class vg4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388201d;

    /* renamed from: e, reason: collision with root package name */
    public int f388202e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388203f;

    /* renamed from: g, reason: collision with root package name */
    public float f388204g;

    /* renamed from: h, reason: collision with root package name */
    public float f388205h;

    /* renamed from: m, reason: collision with root package name */
    public long f388207m;

    /* renamed from: n, reason: collision with root package name */
    public long f388208n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388209o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f388211q;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f388206i = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f388210p = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vg4)) {
            return false;
        }
        r45.vg4 vg4Var = (r45.vg4) fVar;
        return n51.f.a(this.BaseRequest, vg4Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f388201d), java.lang.Integer.valueOf(vg4Var.f388201d)) && n51.f.a(java.lang.Integer.valueOf(this.f388202e), java.lang.Integer.valueOf(vg4Var.f388202e)) && n51.f.a(this.f388203f, vg4Var.f388203f) && n51.f.a(java.lang.Float.valueOf(this.f388204g), java.lang.Float.valueOf(vg4Var.f388204g)) && n51.f.a(java.lang.Float.valueOf(this.f388205h), java.lang.Float.valueOf(vg4Var.f388205h)) && n51.f.a(this.f388206i, vg4Var.f388206i) && n51.f.a(java.lang.Long.valueOf(this.f388207m), java.lang.Long.valueOf(vg4Var.f388207m)) && n51.f.a(java.lang.Long.valueOf(this.f388208n), java.lang.Long.valueOf(vg4Var.f388208n)) && n51.f.a(this.f388209o, vg4Var.f388209o) && n51.f.a(this.f388210p, vg4Var.f388210p) && n51.f.a(this.f388211q, vg4Var.f388211q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388210p;
        java.util.LinkedList linkedList2 = this.f388206i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f388201d);
            fVar.e(3, this.f388202e);
            com.tencent.mm.protobuf.g gVar = this.f388203f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.d(5, this.f388204g);
            fVar.d(6, this.f388205h);
            fVar.g(7, 6, linkedList2);
            fVar.h(8, this.f388207m);
            fVar.h(9, this.f388208n);
            com.tencent.mm.protobuf.g gVar2 = this.f388209o;
            if (gVar2 != null) {
                fVar.b(10, gVar2);
            }
            fVar.g(11, 1, linkedList);
            java.lang.String str = this.f388211q;
            if (str != null) {
                fVar.j(12, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f388201d) + b36.f.e(3, this.f388202e);
            com.tencent.mm.protobuf.g gVar3 = this.f388203f;
            if (gVar3 != null) {
                i18 += b36.f.b(4, gVar3);
            }
            int d17 = i18 + b36.f.d(5, this.f388204g) + b36.f.d(6, this.f388205h) + b36.f.g(7, 6, linkedList2) + b36.f.h(8, this.f388207m) + b36.f.h(9, this.f388208n);
            com.tencent.mm.protobuf.g gVar4 = this.f388209o;
            if (gVar4 != null) {
                d17 += b36.f.b(10, gVar4);
            }
            int g17 = d17 + b36.f.g(11, 1, linkedList);
            java.lang.String str2 = this.f388211q;
            return str2 != null ? g17 + b36.f.j(12, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.vg4 vg4Var = (r45.vg4) objArr[1];
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
                    vg4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                vg4Var.f388201d = aVar2.g(intValue);
                return 0;
            case 3:
                vg4Var.f388202e = aVar2.g(intValue);
                return 0;
            case 4:
                vg4Var.f388203f = aVar2.d(intValue);
                return 0;
            case 5:
                vg4Var.f388204g = aVar2.f(intValue);
                return 0;
            case 6:
                vg4Var.f388205h = aVar2.f(intValue);
                return 0;
            case 7:
                vg4Var.f388206i.add(aVar2.d(intValue));
                return 0;
            case 8:
                vg4Var.f388207m = aVar2.i(intValue);
                return 0;
            case 9:
                vg4Var.f388208n = aVar2.i(intValue);
                return 0;
            case 10:
                vg4Var.f388209o = aVar2.d(intValue);
                return 0;
            case 11:
                vg4Var.f388210p.add(aVar2.k(intValue));
                return 0;
            case 12:
                vg4Var.f388211q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
