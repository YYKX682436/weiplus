package r45;

/* loaded from: classes7.dex */
public class o83 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382020d;

    /* renamed from: e, reason: collision with root package name */
    public int f382021e;

    /* renamed from: f, reason: collision with root package name */
    public int f382022f;

    /* renamed from: g, reason: collision with root package name */
    public int f382023g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382024h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f382025i;

    /* renamed from: m, reason: collision with root package name */
    public int f382026m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f382027n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f382028o = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o83)) {
            return false;
        }
        r45.o83 o83Var = (r45.o83) fVar;
        return n51.f.a(this.BaseRequest, o83Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f382020d), java.lang.Integer.valueOf(o83Var.f382020d)) && n51.f.a(java.lang.Integer.valueOf(this.f382021e), java.lang.Integer.valueOf(o83Var.f382021e)) && n51.f.a(java.lang.Integer.valueOf(this.f382022f), java.lang.Integer.valueOf(o83Var.f382022f)) && n51.f.a(java.lang.Integer.valueOf(this.f382023g), java.lang.Integer.valueOf(o83Var.f382023g)) && n51.f.a(this.f382024h, o83Var.f382024h) && n51.f.a(this.f382025i, o83Var.f382025i) && n51.f.a(java.lang.Integer.valueOf(this.f382026m), java.lang.Integer.valueOf(o83Var.f382026m)) && n51.f.a(this.f382027n, o83Var.f382027n) && n51.f.a(this.f382028o, o83Var.f382028o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382027n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f382020d);
            fVar.e(3, this.f382021e);
            fVar.e(4, this.f382022f);
            fVar.e(5, this.f382023g);
            java.lang.String str = this.f382024h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f382025i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f382026m);
            fVar.g(9, 8, linkedList);
            fVar.g(10, 6, this.f382028o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f382020d) + b36.f.e(3, this.f382021e) + b36.f.e(4, this.f382022f) + b36.f.e(5, this.f382023g);
            java.lang.String str3 = this.f382024h;
            if (str3 != null) {
                i18 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f382025i;
            if (str4 != null) {
                i18 += b36.f.j(7, str4);
            }
            return i18 + b36.f.e(8, this.f382026m) + b36.f.g(9, 8, linkedList) + b36.f.g(10, 6, this.f382028o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f382028o.clear();
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
        r45.o83 o83Var = (r45.o83) objArr[1];
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
                    o83Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                o83Var.f382020d = aVar2.g(intValue);
                return 0;
            case 3:
                o83Var.f382021e = aVar2.g(intValue);
                return 0;
            case 4:
                o83Var.f382022f = aVar2.g(intValue);
                return 0;
            case 5:
                o83Var.f382023g = aVar2.g(intValue);
                return 0;
            case 6:
                o83Var.f382024h = aVar2.k(intValue);
                return 0;
            case 7:
                o83Var.f382025i = aVar2.k(intValue);
                return 0;
            case 8:
                o83Var.f382026m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.n83 n83Var = new r45.n83();
                    if (bArr3 != null && bArr3.length > 0) {
                        n83Var.parseFrom(bArr3);
                    }
                    o83Var.f382027n.add(n83Var);
                }
                return 0;
            case 10:
                o83Var.f382028o.add(aVar2.d(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
