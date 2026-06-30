package r45;

/* loaded from: classes2.dex */
public class x95 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389895d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389896e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389897f;

    /* renamed from: g, reason: collision with root package name */
    public int f389898g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389899h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f389900i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x95)) {
            return false;
        }
        r45.x95 x95Var = (r45.x95) fVar;
        return n51.f.a(this.f389895d, x95Var.f389895d) && n51.f.a(this.f389896e, x95Var.f389896e) && n51.f.a(this.f389897f, x95Var.f389897f) && n51.f.a(java.lang.Integer.valueOf(this.f389898g), java.lang.Integer.valueOf(x95Var.f389898g)) && n51.f.a(this.f389899h, x95Var.f389899h) && n51.f.a(this.f389900i, x95Var.f389900i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389900i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389895d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f389896e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f389897f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f389898g);
            java.lang.String str4 = this.f389899h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f389895d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f389896e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f389897f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f389898g);
            java.lang.String str8 = this.f389899h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.g(6, 8, linkedList);
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
        r45.x95 x95Var = (r45.x95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x95Var.f389895d = aVar2.k(intValue);
                return 0;
            case 2:
                x95Var.f389896e = aVar2.k(intValue);
                return 0;
            case 3:
                x95Var.f389897f = aVar2.k(intValue);
                return 0;
            case 4:
                x95Var.f389898g = aVar2.g(intValue);
                return 0;
            case 5:
                x95Var.f389899h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.y95 y95Var = new r45.y95();
                    if (bArr2 != null && bArr2.length > 0) {
                        y95Var.parseFrom(bArr2);
                    }
                    x95Var.f389900i.add(y95Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
