package com.tencent.wechat.mm.biz;

/* loaded from: classes8.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.b f217887u = new com.tencent.wechat.mm.biz.b();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.biz.u f217888d = new com.tencent.wechat.iam.biz.u();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217889e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217890f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217891g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217892h = "";

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.a f217893i = new com.tencent.wechat.mm.biz.a();

    /* renamed from: m, reason: collision with root package name */
    public boolean f217894m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f217895n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f217896o = "";

    /* renamed from: p, reason: collision with root package name */
    public boolean f217897p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f217898q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f217899r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f217900s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f217901t = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.b)) {
            return false;
        }
        com.tencent.wechat.mm.biz.b bVar = (com.tencent.wechat.mm.biz.b) fVar;
        return n51.f.a(this.f217888d, bVar.f217888d) && n51.f.a(this.f217889e, bVar.f217889e) && n51.f.a(this.f217890f, bVar.f217890f) && n51.f.a(this.f217891g, bVar.f217891g) && n51.f.a(this.f217892h, bVar.f217892h) && n51.f.a(this.f217893i, bVar.f217893i) && n51.f.a(java.lang.Boolean.valueOf(this.f217894m), java.lang.Boolean.valueOf(bVar.f217894m)) && n51.f.a(java.lang.Integer.valueOf(this.f217895n), java.lang.Integer.valueOf(bVar.f217895n)) && n51.f.a(this.f217896o, bVar.f217896o) && n51.f.a(java.lang.Boolean.valueOf(this.f217897p), java.lang.Boolean.valueOf(bVar.f217897p)) && n51.f.a(java.lang.Integer.valueOf(this.f217898q), java.lang.Integer.valueOf(bVar.f217898q)) && n51.f.a(java.lang.Integer.valueOf(this.f217899r), java.lang.Integer.valueOf(bVar.f217899r)) && n51.f.a(java.lang.Integer.valueOf(this.f217900s), java.lang.Integer.valueOf(bVar.f217900s)) && n51.f.a(java.lang.Integer.valueOf(this.f217901t), java.lang.Integer.valueOf(bVar.f217901t));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.b();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.biz.u uVar = this.f217888d;
            if (uVar != null) {
                fVar.i(1, uVar.computeSize());
                this.f217888d.writeFields(fVar);
            }
            java.lang.String str = this.f217889e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f217890f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f217891g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f217892h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.tencent.wechat.mm.biz.a aVar = this.f217893i;
            if (aVar != null) {
                fVar.i(6, aVar.computeSize());
                this.f217893i.writeFields(fVar);
            }
            fVar.a(7, this.f217894m);
            fVar.e(8, this.f217895n);
            java.lang.String str5 = this.f217896o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.a(10, this.f217897p);
            fVar.e(11, this.f217898q);
            fVar.e(12, this.f217899r);
            fVar.e(13, this.f217900s);
            fVar.e(14, this.f217901t);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.biz.u uVar2 = this.f217888d;
            int i18 = uVar2 != null ? b36.f.i(1, uVar2.computeSize()) + 0 : 0;
            java.lang.String str6 = this.f217889e;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f217890f;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f217891g;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f217892h;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            com.tencent.wechat.mm.biz.a aVar2 = this.f217893i;
            if (aVar2 != null) {
                i18 += b36.f.i(6, aVar2.computeSize());
            }
            int a17 = i18 + b36.f.a(7, this.f217894m) + b36.f.e(8, this.f217895n);
            java.lang.String str10 = this.f217896o;
            if (str10 != null) {
                a17 += b36.f.j(9, str10);
            }
            return a17 + b36.f.a(10, this.f217897p) + b36.f.e(11, this.f217898q) + b36.f.e(12, this.f217899r) + b36.f.e(13, this.f217900s) + b36.f.e(14, this.f217901t);
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.iam.biz.u uVar3 = new com.tencent.wechat.iam.biz.u();
                    if (bArr != null && bArr.length > 0) {
                        uVar3.parseFrom(bArr);
                    }
                    this.f217888d = uVar3;
                }
                return 0;
            case 2:
                this.f217889e = aVar4.k(intValue);
                return 0;
            case 3:
                this.f217890f = aVar4.k(intValue);
                return 0;
            case 4:
                this.f217891g = aVar4.k(intValue);
                return 0;
            case 5:
                this.f217892h = aVar4.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.biz.a aVar5 = new com.tencent.wechat.mm.biz.a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar5.parseFrom(bArr2);
                    }
                    this.f217893i = aVar5;
                }
                return 0;
            case 7:
                this.f217894m = aVar4.c(intValue);
                return 0;
            case 8:
                this.f217895n = aVar4.g(intValue);
                return 0;
            case 9:
                this.f217896o = aVar4.k(intValue);
                return 0;
            case 10:
                this.f217897p = aVar4.c(intValue);
                return 0;
            case 11:
                this.f217898q = aVar4.g(intValue);
                return 0;
            case 12:
                this.f217899r = aVar4.g(intValue);
                return 0;
            case 13:
                this.f217900s = aVar4.g(intValue);
                return 0;
            case 14:
                this.f217901t = aVar4.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.b) super.parseFrom(bArr);
    }
}
