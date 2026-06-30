package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class b1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216954d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216955e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f216956f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216957g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f216958h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f216959i = "";

    /* renamed from: m, reason: collision with root package name */
    public boolean f216960m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f216961n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f216962o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f216963p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f216964q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f216965r = "";

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f216966s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public int f216967t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f216968u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f216969v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.z f216970w = com.tencent.wechat.aff.iam_scan.z.Unknown;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.w f216971x = com.tencent.wechat.aff.iam_scan.w.SCAN_VIDEO;

    /* renamed from: y, reason: collision with root package name */
    public boolean f216972y = false;

    /* renamed from: z, reason: collision with root package name */
    public int f216973z = 0;
    public int A = 0;
    public boolean B = false;

    static {
        new com.tencent.wechat.aff.iam_scan.b1();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.b1)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.b1 b1Var = (com.tencent.wechat.aff.iam_scan.b1) fVar;
        return n51.f.a(this.f216954d, b1Var.f216954d) && n51.f.a(this.f216955e, b1Var.f216955e) && n51.f.a(java.lang.Boolean.valueOf(this.f216956f), java.lang.Boolean.valueOf(b1Var.f216956f)) && n51.f.a(this.f216957g, b1Var.f216957g) && n51.f.a(java.lang.Boolean.valueOf(this.f216958h), java.lang.Boolean.valueOf(b1Var.f216958h)) && n51.f.a(this.f216959i, b1Var.f216959i) && n51.f.a(java.lang.Boolean.valueOf(this.f216960m), java.lang.Boolean.valueOf(b1Var.f216960m)) && n51.f.a(this.f216961n, b1Var.f216961n) && n51.f.a(this.f216962o, b1Var.f216962o) && n51.f.a(this.f216963p, b1Var.f216963p) && n51.f.a(this.f216964q, b1Var.f216964q) && n51.f.a(this.f216965r, b1Var.f216965r) && n51.f.a(this.f216966s, b1Var.f216966s) && n51.f.a(java.lang.Integer.valueOf(this.f216967t), java.lang.Integer.valueOf(b1Var.f216967t)) && n51.f.a(this.f216968u, b1Var.f216968u) && n51.f.a(this.f216969v, b1Var.f216969v) && n51.f.a(this.f216970w, b1Var.f216970w) && n51.f.a(this.f216971x, b1Var.f216971x) && n51.f.a(java.lang.Boolean.valueOf(this.f216972y), java.lang.Boolean.valueOf(b1Var.f216972y)) && n51.f.a(java.lang.Integer.valueOf(this.f216973z), java.lang.Integer.valueOf(b1Var.f216973z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(b1Var.A)) && n51.f.a(java.lang.Boolean.valueOf(this.B), java.lang.Boolean.valueOf(b1Var.B));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.b1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216969v;
        java.util.LinkedList linkedList2 = this.f216968u;
        java.util.LinkedList linkedList3 = this.f216966s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216954d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f216955e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f216956f);
            java.lang.String str3 = this.f216957g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.a(5, this.f216958h);
            java.lang.String str4 = this.f216959i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.a(7, this.f216960m);
            java.lang.String str5 = this.f216961n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f216962o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f216963p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f216964q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            java.lang.String str9 = this.f216965r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            fVar.g(13, 2, linkedList3);
            fVar.e(14, this.f216967t);
            fVar.g(15, 1, linkedList2);
            fVar.g(16, 1, linkedList);
            com.tencent.wechat.aff.iam_scan.z zVar = this.f216970w;
            if (zVar != null) {
                fVar.e(17, zVar.f217201d);
            }
            com.tencent.wechat.aff.iam_scan.w wVar = this.f216971x;
            if (wVar != null) {
                fVar.e(18, wVar.f217148d);
            }
            fVar.a(19, this.f216972y);
            fVar.e(20, this.f216973z);
            fVar.e(21, this.A);
            fVar.a(22, this.B);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f216954d;
            int j17 = str10 != null ? b36.f.j(1, str10) + 0 : 0;
            java.lang.String str11 = this.f216955e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            int a17 = j17 + b36.f.a(3, this.f216956f);
            java.lang.String str12 = this.f216957g;
            if (str12 != null) {
                a17 += b36.f.j(4, str12);
            }
            int a18 = a17 + b36.f.a(5, this.f216958h);
            java.lang.String str13 = this.f216959i;
            if (str13 != null) {
                a18 += b36.f.j(6, str13);
            }
            int a19 = a18 + b36.f.a(7, this.f216960m);
            java.lang.String str14 = this.f216961n;
            if (str14 != null) {
                a19 += b36.f.j(8, str14);
            }
            java.lang.String str15 = this.f216962o;
            if (str15 != null) {
                a19 += b36.f.j(9, str15);
            }
            java.lang.String str16 = this.f216963p;
            if (str16 != null) {
                a19 += b36.f.j(10, str16);
            }
            java.lang.String str17 = this.f216964q;
            if (str17 != null) {
                a19 += b36.f.j(11, str17);
            }
            java.lang.String str18 = this.f216965r;
            if (str18 != null) {
                a19 += b36.f.j(12, str18);
            }
            int g17 = a19 + b36.f.g(13, 2, linkedList3) + b36.f.e(14, this.f216967t) + b36.f.g(15, 1, linkedList2) + b36.f.g(16, 1, linkedList);
            com.tencent.wechat.aff.iam_scan.z zVar2 = this.f216970w;
            if (zVar2 != null) {
                g17 += b36.f.e(17, zVar2.f217201d);
            }
            com.tencent.wechat.aff.iam_scan.w wVar2 = this.f216971x;
            if (wVar2 != null) {
                g17 += b36.f.e(18, wVar2.f217148d);
            }
            return g17 + b36.f.a(19, this.f216972y) + b36.f.e(20, this.f216973z) + b36.f.e(21, this.A) + b36.f.a(22, this.B);
        }
        if (i17 == 2) {
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
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
        com.tencent.wechat.aff.iam_scan.z zVar3 = null;
        com.tencent.wechat.aff.iam_scan.w wVar3 = null;
        switch (intValue) {
            case 1:
                this.f216954d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f216955e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f216956f = aVar2.c(intValue);
                return 0;
            case 4:
                this.f216957g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f216958h = aVar2.c(intValue);
                return 0;
            case 6:
                this.f216959i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f216960m = aVar2.c(intValue);
                return 0;
            case 8:
                this.f216961n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f216962o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f216963p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f216964q = aVar2.k(intValue);
                return 0;
            case 12:
                this.f216965r = aVar2.k(intValue);
                return 0;
            case 13:
                linkedList3.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 14:
                this.f216967t = aVar2.g(intValue);
                return 0;
            case 15:
                linkedList2.add(aVar2.k(intValue));
                return 0;
            case 16:
                linkedList.add(aVar2.k(intValue));
                return 0;
            case 17:
                int g18 = aVar2.g(intValue);
                if (g18 == -1) {
                    zVar3 = com.tencent.wechat.aff.iam_scan.z.Unknown;
                } else if (g18 == 1) {
                    zVar3 = com.tencent.wechat.aff.iam_scan.z.Android_Native;
                } else if (g18 == 2) {
                    zVar3 = com.tencent.wechat.aff.iam_scan.z.Android_CrossPlatform;
                } else if (g18 == 3) {
                    zVar3 = com.tencent.wechat.aff.iam_scan.z.Ohos_CrossPlatform;
                } else if (g18 == 4) {
                    zVar3 = com.tencent.wechat.aff.iam_scan.z.iOS_Native;
                } else if (g18 == 5) {
                    zVar3 = com.tencent.wechat.aff.iam_scan.z.iOS_CrossPlatform;
                }
                this.f216970w = zVar3;
                return 0;
            case 18:
                int g19 = aVar2.g(intValue);
                if (g19 == 1) {
                    wVar3 = com.tencent.wechat.aff.iam_scan.w.SCAN_VIDEO;
                } else if (g19 == 2) {
                    wVar3 = com.tencent.wechat.aff.iam_scan.w.SCAN_FILE;
                }
                this.f216971x = wVar3;
                return 0;
            case 19:
                this.f216972y = aVar2.c(intValue);
                return 0;
            case 20:
                this.f216973z = aVar2.g(intValue);
                return 0;
            case 21:
                this.A = aVar2.g(intValue);
                return 0;
            case 22:
                this.B = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.b1) super.parseFrom(bArr);
    }
}
