package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class d3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f217967d;

    /* renamed from: e, reason: collision with root package name */
    public int f217968e;

    /* renamed from: f, reason: collision with root package name */
    public int f217969f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217970g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217971h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f217972i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f217973m = new boolean[7];

    static {
        new com.tencent.wechat.mm.biz.d3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.d3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.d3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.d3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.d3 d3Var = (com.tencent.wechat.mm.biz.d3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f217967d), java.lang.Integer.valueOf(d3Var.f217967d)) && n51.f.a(java.lang.Integer.valueOf(this.f217968e), java.lang.Integer.valueOf(d3Var.f217968e)) && n51.f.a(java.lang.Integer.valueOf(this.f217969f), java.lang.Integer.valueOf(d3Var.f217969f)) && n51.f.a(this.f217970g, d3Var.f217970g) && n51.f.a(this.f217971h, d3Var.f217971h) && n51.f.a(this.f217972i, d3Var.f217972i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.d3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217973m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f217967d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f217968e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f217969f);
            }
            java.lang.String str = this.f217970g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f217971h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f217972i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f217967d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f217968e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f217969f);
            }
            java.lang.String str4 = this.f217970g;
            if (str4 != null && zArr[4]) {
                e17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f217971h;
            if (str5 != null && zArr[5]) {
                e17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f217972i;
            return (str6 == null || !zArr[6]) ? e17 : e17 + b36.f.j(6, str6);
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
                this.f217967d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f217968e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f217969f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f217970g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f217971h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f217972i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
