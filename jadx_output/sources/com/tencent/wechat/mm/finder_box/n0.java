package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class n0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219660d;

    /* renamed from: e, reason: collision with root package name */
    public int f219661e;

    /* renamed from: f, reason: collision with root package name */
    public int f219662f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219663g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219664h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219665i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f219666m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f219667n = new boolean[8];

    static {
        new com.tencent.wechat.mm.finder_box.n0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.n0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.n0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.n0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.n0 n0Var = (com.tencent.wechat.mm.finder_box.n0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219660d), java.lang.Integer.valueOf(n0Var.f219660d)) && n51.f.a(java.lang.Integer.valueOf(this.f219661e), java.lang.Integer.valueOf(n0Var.f219661e)) && n51.f.a(java.lang.Integer.valueOf(this.f219662f), java.lang.Integer.valueOf(n0Var.f219662f)) && n51.f.a(this.f219663g, n0Var.f219663g) && n51.f.a(this.f219664h, n0Var.f219664h) && n51.f.a(this.f219665i, n0Var.f219665i) && n51.f.a(this.f219666m, n0Var.f219666m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.n0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219667n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f219660d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219661e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f219662f);
            }
            java.lang.String str = this.f219663g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f219664h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f219665i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f219666m;
            if (str4 != null && zArr[7]) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f219660d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f219661e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f219662f);
            }
            java.lang.String str5 = this.f219663g;
            if (str5 != null && zArr[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f219664h;
            if (str6 != null && zArr[5]) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f219665i;
            if (str7 != null && zArr[6]) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f219666m;
            return (str8 == null || !zArr[7]) ? e17 : e17 + b36.f.j(7, str8);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f219660d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219661e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219662f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219663g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f219664h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219665i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f219666m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
