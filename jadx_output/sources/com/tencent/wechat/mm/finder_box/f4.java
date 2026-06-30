package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class f4 extends com.tencent.mm.protobuf.f {

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.f4 f219420u = new com.tencent.wechat.mm.finder_box.f4();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.finder_box.i f219421d = new com.tencent.wechat.iam.finder_box.i();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219422e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219423f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219424g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f219425h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219426i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f219427m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f219428n = false;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.g4 f219429o = new com.tencent.wechat.mm.finder_box.g4();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f219430p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f219431q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f219432r = "";

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.e4 f219433s = new com.tencent.wechat.mm.finder_box.e4();

    /* renamed from: t, reason: collision with root package name */
    public int f219434t = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.f4)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.f4 f4Var = (com.tencent.wechat.mm.finder_box.f4) fVar;
        return n51.f.a(this.f219421d, f4Var.f219421d) && n51.f.a(this.f219422e, f4Var.f219422e) && n51.f.a(this.f219423f, f4Var.f219423f) && n51.f.a(this.f219424g, f4Var.f219424g) && n51.f.a(java.lang.Integer.valueOf(this.f219425h), java.lang.Integer.valueOf(f4Var.f219425h)) && n51.f.a(this.f219426i, f4Var.f219426i) && n51.f.a(this.f219427m, f4Var.f219427m) && n51.f.a(java.lang.Boolean.valueOf(this.f219428n), java.lang.Boolean.valueOf(f4Var.f219428n)) && n51.f.a(this.f219429o, f4Var.f219429o) && n51.f.a(this.f219430p, f4Var.f219430p) && n51.f.a(this.f219431q, f4Var.f219431q) && n51.f.a(this.f219432r, f4Var.f219432r) && n51.f.a(this.f219433s, f4Var.f219433s) && n51.f.a(java.lang.Integer.valueOf(this.f219434t), java.lang.Integer.valueOf(f4Var.f219434t));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.f4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.finder_box.i iVar = this.f219421d;
            if (iVar != null) {
                fVar.i(1, iVar.computeSize());
                this.f219421d.writeFields(fVar);
            }
            java.lang.String str = this.f219422e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f219423f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f219424g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f219425h);
            java.lang.String str4 = this.f219426i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f219427m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.a(8, this.f219428n);
            com.tencent.wechat.mm.finder_box.g4 g4Var = this.f219429o;
            if (g4Var != null) {
                fVar.i(9, g4Var.computeSize());
                this.f219429o.writeFields(fVar);
            }
            java.lang.String str6 = this.f219430p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f219431q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f219432r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            com.tencent.wechat.mm.finder_box.e4 e4Var = this.f219433s;
            if (e4Var != null) {
                fVar.i(13, e4Var.computeSize());
                this.f219433s.writeFields(fVar);
            }
            fVar.e(14, this.f219434t);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.finder_box.i iVar2 = this.f219421d;
            int i18 = iVar2 != null ? b36.f.i(1, iVar2.computeSize()) + 0 : 0;
            java.lang.String str9 = this.f219422e;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f219423f;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f219424g;
            if (str11 != null) {
                i18 += b36.f.j(4, str11);
            }
            int e17 = i18 + b36.f.e(5, this.f219425h);
            java.lang.String str12 = this.f219426i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f219427m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            int a17 = e17 + b36.f.a(8, this.f219428n);
            com.tencent.wechat.mm.finder_box.g4 g4Var2 = this.f219429o;
            if (g4Var2 != null) {
                a17 += b36.f.i(9, g4Var2.computeSize());
            }
            java.lang.String str14 = this.f219430p;
            if (str14 != null) {
                a17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f219431q;
            if (str15 != null) {
                a17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f219432r;
            if (str16 != null) {
                a17 += b36.f.j(12, str16);
            }
            com.tencent.wechat.mm.finder_box.e4 e4Var2 = this.f219433s;
            if (e4Var2 != null) {
                a17 += b36.f.i(13, e4Var2.computeSize());
            }
            return a17 + b36.f.e(14, this.f219434t);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.iam.finder_box.i iVar3 = new com.tencent.wechat.iam.finder_box.i();
                    if (bArr != null && bArr.length > 0) {
                        iVar3.parseFrom(bArr);
                    }
                    this.f219421d = iVar3;
                }
                return 0;
            case 2:
                this.f219422e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f219423f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f219424g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f219425h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f219426i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f219427m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f219428n = aVar2.c(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.finder_box.g4 g4Var3 = new com.tencent.wechat.mm.finder_box.g4();
                    if (bArr2 != null && bArr2.length > 0) {
                        g4Var3.parseFrom(bArr2);
                    }
                    this.f219429o = g4Var3;
                }
                return 0;
            case 10:
                this.f219430p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f219431q = aVar2.k(intValue);
                return 0;
            case 12:
                this.f219432r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.mm.finder_box.e4 e4Var3 = new com.tencent.wechat.mm.finder_box.e4();
                    if (bArr3 != null && bArr3.length > 0) {
                        e4Var3.parseFrom(bArr3);
                    }
                    this.f219433s = e4Var3;
                }
                return 0;
            case 14:
                this.f219434t = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.f4) super.parseFrom(bArr);
    }
}
