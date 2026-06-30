package r45;

/* loaded from: classes9.dex */
public class g45 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374872e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374873f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374874g;

    /* renamed from: h, reason: collision with root package name */
    public int f374875h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f374876i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374877m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f374878n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g45)) {
            return false;
        }
        r45.g45 g45Var = (r45.g45) fVar;
        return n51.f.a(this.f374871d, g45Var.f374871d) && n51.f.a(this.f374872e, g45Var.f374872e) && n51.f.a(this.f374873f, g45Var.f374873f) && n51.f.a(this.f374874g, g45Var.f374874g) && n51.f.a(java.lang.Integer.valueOf(this.f374875h), java.lang.Integer.valueOf(g45Var.f374875h)) && n51.f.a(this.f374876i, g45Var.f374876i) && n51.f.a(this.f374877m, g45Var.f374877m) && n51.f.a(this.f374878n, g45Var.f374878n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374876i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374871d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374872e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f374873f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f374874g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f374875h);
            fVar.g(6, 8, linkedList);
            java.lang.String str5 = this.f374877m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f374878n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f374871d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f374872e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f374873f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f374874g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f374875h) + b36.f.g(6, 8, linkedList);
            java.lang.String str11 = this.f374877m;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f374878n;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.g45 g45Var = (r45.g45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g45Var.f374871d = aVar2.k(intValue);
                return 0;
            case 2:
                g45Var.f374872e = aVar2.k(intValue);
                return 0;
            case 3:
                g45Var.f374873f = aVar2.k(intValue);
                return 0;
            case 4:
                g45Var.f374874g = aVar2.k(intValue);
                return 0;
            case 5:
                g45Var.f374875h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.st stVar = new r45.st();
                    if (bArr2 != null && bArr2.length > 0) {
                        stVar.parseFrom(bArr2);
                    }
                    g45Var.f374876i.add(stVar);
                }
                return 0;
            case 7:
                g45Var.f374877m = aVar2.k(intValue);
                return 0;
            case 8:
                g45Var.f374878n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
