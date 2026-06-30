package r45;

/* loaded from: classes4.dex */
public class bz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371159d;

    /* renamed from: e, reason: collision with root package name */
    public int f371160e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371162g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371163h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f371164i;

    /* renamed from: m, reason: collision with root package name */
    public int f371165m;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f371161f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f371166n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bz)) {
            return false;
        }
        r45.bz bzVar = (r45.bz) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371159d), java.lang.Integer.valueOf(bzVar.f371159d)) && n51.f.a(java.lang.Integer.valueOf(this.f371160e), java.lang.Integer.valueOf(bzVar.f371160e)) && n51.f.a(this.f371161f, bzVar.f371161f) && n51.f.a(this.f371162g, bzVar.f371162g) && n51.f.a(this.f371163h, bzVar.f371163h) && n51.f.a(this.f371164i, bzVar.f371164i) && n51.f.a(java.lang.Integer.valueOf(this.f371165m), java.lang.Integer.valueOf(bzVar.f371165m)) && n51.f.a(this.f371166n, bzVar.f371166n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371166n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371159d);
            fVar.e(2, this.f371160e);
            fVar.g(3, 8, this.f371161f);
            java.lang.String str = this.f371162g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f371163h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f371164i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.e(7, this.f371165m);
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371159d) + 0 + b36.f.e(2, this.f371160e) + b36.f.g(3, 8, this.f371161f);
            java.lang.String str4 = this.f371162g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f371163h;
            if (str5 != null) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f371164i;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            return e17 + b36.f.e(7, this.f371165m) + b36.f.g(8, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f371161f.clear();
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
        r45.bz bzVar = (r45.bz) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bzVar.f371159d = aVar2.g(intValue);
                return 0;
            case 2:
                bzVar.f371160e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.hk4 hk4Var = new r45.hk4();
                    if (bArr2 != null && bArr2.length > 0) {
                        hk4Var.parseFrom(bArr2);
                    }
                    bzVar.f371161f.add(hk4Var);
                }
                return 0;
            case 4:
                bzVar.f371162g = aVar2.k(intValue);
                return 0;
            case 5:
                bzVar.f371163h = aVar2.k(intValue);
                return 0;
            case 6:
                bzVar.f371164i = aVar2.k(intValue);
                return 0;
            case 7:
                bzVar.f371165m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.nt5 nt5Var = new r45.nt5();
                    if (bArr3 != null && bArr3.length > 0) {
                        nt5Var.parseFrom(bArr3);
                    }
                    bzVar.f371166n.add(nt5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
