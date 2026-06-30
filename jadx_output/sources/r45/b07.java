package r45;

/* loaded from: classes11.dex */
public class b07 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370417d;

    /* renamed from: e, reason: collision with root package name */
    public int f370418e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370419f;

    /* renamed from: g, reason: collision with root package name */
    public int f370420g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f370421h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370422i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370423m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b07)) {
            return false;
        }
        r45.b07 b07Var = (r45.b07) fVar;
        return n51.f.a(this.f370417d, b07Var.f370417d) && n51.f.a(java.lang.Integer.valueOf(this.f370418e), java.lang.Integer.valueOf(b07Var.f370418e)) && n51.f.a(this.f370419f, b07Var.f370419f) && n51.f.a(java.lang.Integer.valueOf(this.f370420g), java.lang.Integer.valueOf(b07Var.f370420g)) && n51.f.a(this.f370421h, b07Var.f370421h) && n51.f.a(this.f370422i, b07Var.f370422i) && n51.f.a(this.f370423m, b07Var.f370423m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370421h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370417d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f370418e);
            java.lang.String str2 = this.f370419f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f370420g);
            fVar.g(5, 8, linkedList);
            java.lang.String str3 = this.f370422i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f370423m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f370417d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f370418e);
            java.lang.String str6 = this.f370419f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int e17 = j17 + b36.f.e(4, this.f370420g) + b36.f.g(5, 8, linkedList);
            java.lang.String str7 = this.f370422i;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f370423m;
            return str8 != null ? e17 + b36.f.j(7, str8) : e17;
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
        r45.b07 b07Var = (r45.b07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b07Var.f370417d = aVar2.k(intValue);
                return 0;
            case 2:
                b07Var.f370418e = aVar2.g(intValue);
                return 0;
            case 3:
                b07Var.f370419f = aVar2.k(intValue);
                return 0;
            case 4:
                b07Var.f370420g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.b45 b45Var = new r45.b45();
                    if (bArr2 != null && bArr2.length > 0) {
                        b45Var.parseFrom(bArr2);
                    }
                    b07Var.f370421h.add(b45Var);
                }
                return 0;
            case 6:
                b07Var.f370422i = aVar2.k(intValue);
                return 0;
            case 7:
                b07Var.f370423m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
