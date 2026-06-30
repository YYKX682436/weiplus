package r45;

/* loaded from: classes4.dex */
public class uv6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387686d;

    /* renamed from: e, reason: collision with root package name */
    public int f387687e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387688f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387689g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387690h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387691i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f387692m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uv6)) {
            return false;
        }
        r45.uv6 uv6Var = (r45.uv6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387686d), java.lang.Integer.valueOf(uv6Var.f387686d)) && n51.f.a(java.lang.Integer.valueOf(this.f387687e), java.lang.Integer.valueOf(uv6Var.f387687e)) && n51.f.a(this.f387688f, uv6Var.f387688f) && n51.f.a(this.f387689g, uv6Var.f387689g) && n51.f.a(this.f387690h, uv6Var.f387690h) && n51.f.a(this.f387691i, uv6Var.f387691i) && n51.f.a(this.f387692m, uv6Var.f387692m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387692m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387686d);
            fVar.e(2, this.f387687e);
            java.lang.String str = this.f387688f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f387689g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f387690h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f387691i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387686d) + 0 + b36.f.e(2, this.f387687e);
            java.lang.String str5 = this.f387688f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f387689g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f387690h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f387691i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            return e17 + b36.f.g(7, 8, linkedList);
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
        r45.uv6 uv6Var = (r45.uv6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                uv6Var.f387686d = aVar2.g(intValue);
                return 0;
            case 2:
                uv6Var.f387687e = aVar2.g(intValue);
                return 0;
            case 3:
                uv6Var.f387688f = aVar2.k(intValue);
                return 0;
            case 4:
                uv6Var.f387689g = aVar2.k(intValue);
                return 0;
            case 5:
                uv6Var.f387690h = aVar2.k(intValue);
                return 0;
            case 6:
                uv6Var.f387691i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.mv mvVar = new r45.mv();
                    if (bArr2 != null && bArr2.length > 0) {
                        mvVar.parseFrom(bArr2);
                    }
                    uv6Var.f387692m.add(mvVar);
                }
                return 0;
            default:
                return -1;
        }
    }
}
