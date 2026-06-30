package ot0;

/* loaded from: classes8.dex */
public class m0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f348576d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f348577e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f348578f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f348579g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f348580h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f348581i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f348582m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ot0.m0)) {
            return false;
        }
        ot0.m0 m0Var = (ot0.m0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f348576d), java.lang.Integer.valueOf(m0Var.f348576d)) && n51.f.a(this.f348577e, m0Var.f348577e) && n51.f.a(this.f348578f, m0Var.f348578f) && n51.f.a(this.f348579g, m0Var.f348579g) && n51.f.a(this.f348580h, m0Var.f348580h) && n51.f.a(this.f348581i, m0Var.f348581i) && n51.f.a(java.lang.Integer.valueOf(this.f348582m), java.lang.Integer.valueOf(m0Var.f348582m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f348581i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f348576d);
            java.lang.String str = this.f348577e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f348578f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f348579g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f348580h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f348582m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f348576d) + 0;
            java.lang.String str5 = this.f348577e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f348578f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f348579g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f348580h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            return e17 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f348582m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        ot0.m0 m0Var = (ot0.m0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m0Var.f348576d = aVar2.g(intValue);
                return 0;
            case 2:
                m0Var.f348577e = aVar2.k(intValue);
                return 0;
            case 3:
                m0Var.f348578f = aVar2.k(intValue);
                return 0;
            case 4:
                m0Var.f348579g = aVar2.k(intValue);
                return 0;
            case 5:
                m0Var.f348580h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    ot0.s0 s0Var = new ot0.s0();
                    if (bArr2 != null && bArr2.length > 0) {
                        s0Var.parseFrom(bArr2);
                    }
                    m0Var.f348581i.add(s0Var);
                }
                return 0;
            case 7:
                m0Var.f348582m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
