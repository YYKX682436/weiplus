package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class y3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218803d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218804e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218805f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218806g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f218807h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218808i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f218809m = "";

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.x3 f218810n = new com.tencent.wechat.mm.biz.x3();

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f218811o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f218812p = "";

    static {
        new com.tencent.wechat.mm.biz.y3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.y3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.y3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.y3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.y3 y3Var = (com.tencent.wechat.mm.biz.y3) fVar;
        return n51.f.a(this.f218803d, y3Var.f218803d) && n51.f.a(this.f218804e, y3Var.f218804e) && n51.f.a(this.f218805f, y3Var.f218805f) && n51.f.a(this.f218806g, y3Var.f218806g) && n51.f.a(this.f218807h, y3Var.f218807h) && n51.f.a(this.f218808i, y3Var.f218808i) && n51.f.a(this.f218809m, y3Var.f218809m) && n51.f.a(this.f218810n, y3Var.f218810n) && n51.f.a(this.f218811o, y3Var.f218811o) && n51.f.a(this.f218812p, y3Var.f218812p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.y3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218803d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f218804e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f218805f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f218806g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f218807h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f218808i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f218809m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            com.tencent.wechat.mm.biz.x3 x3Var = this.f218810n;
            if (x3Var != null) {
                fVar.i(8, x3Var.computeSize());
                this.f218810n.writeFields(fVar);
            }
            java.lang.String str8 = this.f218811o;
            if (str8 != null) {
                fVar.j(9, str8);
            }
            java.lang.String str9 = this.f218812p;
            if (str9 != null) {
                fVar.j(10, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f218803d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f218804e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f218805f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f218806g;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f218807h;
            if (str14 != null) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f218808i;
            if (str15 != null) {
                j17 += b36.f.j(6, str15);
            }
            java.lang.String str16 = this.f218809m;
            if (str16 != null) {
                j17 += b36.f.j(7, str16);
            }
            com.tencent.wechat.mm.biz.x3 x3Var2 = this.f218810n;
            if (x3Var2 != null) {
                j17 += b36.f.i(8, x3Var2.computeSize());
            }
            java.lang.String str17 = this.f218811o;
            if (str17 != null) {
                j17 += b36.f.j(9, str17);
            }
            java.lang.String str18 = this.f218812p;
            return str18 != null ? j17 + b36.f.j(10, str18) : j17;
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
                this.f218803d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f218804e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f218805f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f218806g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f218807h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f218808i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f218809m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.mm.biz.x3 x3Var3 = new com.tencent.wechat.mm.biz.x3();
                    if (bArr != null && bArr.length > 0) {
                        x3Var3.parseFrom(bArr);
                    }
                    this.f218810n = x3Var3;
                }
                return 0;
            case 9:
                this.f218811o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f218812p = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
