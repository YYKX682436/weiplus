package r45;

/* loaded from: classes4.dex */
public class j50 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377584d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377585e;

    /* renamed from: f, reason: collision with root package name */
    public int f377586f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377587g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f377588h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f377589i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f377590m;

    /* renamed from: n, reason: collision with root package name */
    public long f377591n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j50)) {
            return false;
        }
        r45.j50 j50Var = (r45.j50) fVar;
        return n51.f.a(this.BaseRequest, j50Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377584d), java.lang.Integer.valueOf(j50Var.f377584d)) && n51.f.a(this.f377585e, j50Var.f377585e) && n51.f.a(java.lang.Integer.valueOf(this.f377586f), java.lang.Integer.valueOf(j50Var.f377586f)) && n51.f.a(this.f377587g, j50Var.f377587g) && n51.f.a(this.f377588h, j50Var.f377588h) && n51.f.a(java.lang.Integer.valueOf(this.f377589i), java.lang.Integer.valueOf(j50Var.f377589i)) && n51.f.a(this.f377590m, j50Var.f377590m) && n51.f.a(java.lang.Long.valueOf(this.f377591n), java.lang.Long.valueOf(j50Var.f377591n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377588h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f377584d);
            java.lang.String str = this.f377585e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f377586f);
            com.tencent.mm.protobuf.g gVar = this.f377587g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f377589i);
            java.lang.String str2 = this.f377590m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            fVar.h(9, this.f377591n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377584d);
            java.lang.String str3 = this.f377585e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f377586f);
            com.tencent.mm.protobuf.g gVar2 = this.f377587g;
            if (gVar2 != null) {
                e17 += b36.f.b(5, gVar2);
            }
            int g17 = e17 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f377589i);
            java.lang.String str4 = this.f377590m;
            if (str4 != null) {
                g17 += b36.f.j(8, str4);
            }
            return g17 + b36.f.h(9, this.f377591n);
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
        r45.j50 j50Var = (r45.j50) objArr[1];
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
                    j50Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                j50Var.f377584d = aVar2.g(intValue);
                return 0;
            case 3:
                j50Var.f377585e = aVar2.k(intValue);
                return 0;
            case 4:
                j50Var.f377586f = aVar2.g(intValue);
                return 0;
            case 5:
                j50Var.f377587g = aVar2.d(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.es0 es0Var = new r45.es0();
                    if (bArr3 != null && bArr3.length > 0) {
                        es0Var.parseFrom(bArr3);
                    }
                    j50Var.f377588h.add(es0Var);
                }
                return 0;
            case 7:
                j50Var.f377589i = aVar2.g(intValue);
                return 0;
            case 8:
                j50Var.f377590m = aVar2.k(intValue);
                return 0;
            case 9:
                j50Var.f377591n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
