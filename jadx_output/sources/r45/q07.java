package r45;

/* loaded from: classes8.dex */
public class q07 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383541d;

    /* renamed from: e, reason: collision with root package name */
    public long f383542e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383543f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383544g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383545h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383546i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f383547m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383548n;

    /* renamed from: o, reason: collision with root package name */
    public long f383549o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q07)) {
            return false;
        }
        r45.q07 q07Var = (r45.q07) fVar;
        return n51.f.a(this.f383541d, q07Var.f383541d) && n51.f.a(java.lang.Long.valueOf(this.f383542e), java.lang.Long.valueOf(q07Var.f383542e)) && n51.f.a(this.f383543f, q07Var.f383543f) && n51.f.a(this.f383544g, q07Var.f383544g) && n51.f.a(this.f383545h, q07Var.f383545h) && n51.f.a(this.f383546i, q07Var.f383546i) && n51.f.a(this.f383547m, q07Var.f383547m) && n51.f.a(this.f383548n, q07Var.f383548n) && n51.f.a(java.lang.Long.valueOf(this.f383549o), java.lang.Long.valueOf(q07Var.f383549o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383547m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383541d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f383542e);
            java.lang.String str2 = this.f383543f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383544g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f383545h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f383546i;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.g(7, 8, linkedList);
            java.lang.String str5 = this.f383548n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.h(9, this.f383549o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f383541d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.h(2, this.f383542e);
            java.lang.String str7 = this.f383543f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f383544g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f383545h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f383546i;
            if (gVar2 != null) {
                j17 += b36.f.b(6, gVar2);
            }
            int g17 = j17 + b36.f.g(7, 8, linkedList);
            java.lang.String str10 = this.f383548n;
            if (str10 != null) {
                g17 += b36.f.j(8, str10);
            }
            return g17 + b36.f.h(9, this.f383549o);
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
        r45.q07 q07Var = (r45.q07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q07Var.f383541d = aVar2.k(intValue);
                return 0;
            case 2:
                q07Var.f383542e = aVar2.i(intValue);
                return 0;
            case 3:
                q07Var.f383543f = aVar2.k(intValue);
                return 0;
            case 4:
                q07Var.f383544g = aVar2.k(intValue);
                return 0;
            case 5:
                q07Var.f383545h = aVar2.k(intValue);
                return 0;
            case 6:
                q07Var.f383546i = aVar2.d(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.y07 y07Var = new r45.y07();
                    if (bArr2 != null && bArr2.length > 0) {
                        y07Var.parseFrom(bArr2);
                    }
                    q07Var.f383547m.add(y07Var);
                }
                return 0;
            case 8:
                q07Var.f383548n = aVar2.k(intValue);
                return 0;
            case 9:
                q07Var.f383549o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
