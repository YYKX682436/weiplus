package r45;

/* loaded from: classes11.dex */
public class f35 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373987d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373988e;

    /* renamed from: g, reason: collision with root package name */
    public int f373990g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373991h;

    /* renamed from: m, reason: collision with root package name */
    public int f373993m;

    /* renamed from: n, reason: collision with root package name */
    public int f373994n;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f373989f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f373992i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f35)) {
            return false;
        }
        r45.f35 f35Var = (r45.f35) fVar;
        return n51.f.a(this.f373987d, f35Var.f373987d) && n51.f.a(this.f373988e, f35Var.f373988e) && n51.f.a(this.f373989f, f35Var.f373989f) && n51.f.a(java.lang.Integer.valueOf(this.f373990g), java.lang.Integer.valueOf(f35Var.f373990g)) && n51.f.a(this.f373991h, f35Var.f373991h) && n51.f.a(this.f373992i, f35Var.f373992i) && n51.f.a(java.lang.Integer.valueOf(this.f373993m), java.lang.Integer.valueOf(f35Var.f373993m)) && n51.f.a(java.lang.Integer.valueOf(this.f373994n), java.lang.Integer.valueOf(f35Var.f373994n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373987d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f373988e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, this.f373989f);
            fVar.e(4, this.f373990g);
            java.lang.String str3 = this.f373991h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, this.f373992i);
            fVar.e(7, this.f373993m);
            fVar.e(8, this.f373994n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f373987d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f373988e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int g17 = j17 + b36.f.g(3, 8, this.f373989f) + b36.f.e(4, this.f373990g);
            java.lang.String str6 = this.f373991h;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            return g17 + b36.f.g(6, 8, this.f373992i) + b36.f.e(7, this.f373993m) + b36.f.e(8, this.f373994n);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f373989f.clear();
            this.f373992i.clear();
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
        r45.f35 f35Var = (r45.f35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                f35Var.f373987d = aVar2.k(intValue);
                return 0;
            case 2:
                f35Var.f373988e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.e35 e35Var = new r45.e35();
                    if (bArr2 != null && bArr2.length > 0) {
                        e35Var.parseFrom(bArr2);
                    }
                    f35Var.f373989f.add(e35Var);
                }
                return 0;
            case 4:
                f35Var.f373990g = aVar2.g(intValue);
                return 0;
            case 5:
                f35Var.f373991h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.f35 f35Var2 = new r45.f35();
                    if (bArr3 != null && bArr3.length > 0) {
                        f35Var2.parseFrom(bArr3);
                    }
                    f35Var.f373992i.add(f35Var2);
                }
                return 0;
            case 7:
                f35Var.f373993m = aVar2.g(intValue);
                return 0;
            case 8:
                f35Var.f373994n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
