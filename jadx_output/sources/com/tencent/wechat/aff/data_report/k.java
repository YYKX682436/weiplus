package com.tencent.wechat.aff.data_report;

/* loaded from: classes15.dex */
public class k extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216616d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f216617e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f216618f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f216619g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f216620h = 0;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.aff.data_report.i f216621i = com.tencent.wechat.aff.data_report.i.DEFAULT;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f216622m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f216623n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f216624o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f216625p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f216626q = "";

    static {
        new com.tencent.wechat.aff.data_report.k();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.data_report.k)) {
            return false;
        }
        com.tencent.wechat.aff.data_report.k kVar = (com.tencent.wechat.aff.data_report.k) fVar;
        return n51.f.a(this.f216616d, kVar.f216616d) && n51.f.a(java.lang.Integer.valueOf(this.f216617e), java.lang.Integer.valueOf(kVar.f216617e)) && n51.f.a(java.lang.Integer.valueOf(this.f216618f), java.lang.Integer.valueOf(kVar.f216618f)) && n51.f.a(java.lang.Integer.valueOf(this.f216619g), java.lang.Integer.valueOf(kVar.f216619g)) && n51.f.a(java.lang.Long.valueOf(this.f216620h), java.lang.Long.valueOf(kVar.f216620h)) && n51.f.a(this.f216621i, kVar.f216621i) && n51.f.a(this.f216622m, kVar.f216622m) && n51.f.a(java.lang.Integer.valueOf(this.f216623n), java.lang.Integer.valueOf(kVar.f216623n)) && n51.f.a(java.lang.Integer.valueOf(this.f216624o), java.lang.Integer.valueOf(kVar.f216624o)) && n51.f.a(java.lang.Boolean.valueOf(this.f216625p), java.lang.Boolean.valueOf(kVar.f216625p)) && n51.f.a(this.f216626q, kVar.f216626q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.data_report.k();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216616d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f216617e);
            fVar.e(3, this.f216618f);
            fVar.e(4, this.f216619g);
            fVar.h(5, this.f216620h);
            com.tencent.wechat.aff.data_report.i iVar = this.f216621i;
            if (iVar != null) {
                fVar.e(6, iVar.f216613d);
            }
            java.lang.String str2 = this.f216622m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f216623n);
            fVar.e(9, this.f216624o);
            fVar.a(10, this.f216625p);
            java.lang.String str3 = this.f216626q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f216616d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f216617e) + b36.f.e(3, this.f216618f) + b36.f.e(4, this.f216619g) + b36.f.h(5, this.f216620h);
            com.tencent.wechat.aff.data_report.i iVar2 = this.f216621i;
            if (iVar2 != null) {
                j17 += b36.f.e(6, iVar2.f216613d);
            }
            java.lang.String str5 = this.f216622m;
            if (str5 != null) {
                j17 += b36.f.j(7, str5);
            }
            int e17 = j17 + b36.f.e(8, this.f216623n) + b36.f.e(9, this.f216624o) + b36.f.a(10, this.f216625p);
            java.lang.String str6 = this.f216626q;
            return str6 != null ? e17 + b36.f.j(11, str6) : e17;
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
                this.f216616d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f216617e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f216618f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f216619g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f216620h = aVar2.i(intValue);
                return 0;
            case 6:
                int g17 = aVar2.g(intValue);
                this.f216621i = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.aff.data_report.i.SESSION_OUT : com.tencent.wechat.aff.data_report.i.PAGE_OUT : com.tencent.wechat.aff.data_report.i.DEFAULT;
                return 0;
            case 7:
                this.f216622m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f216623n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f216624o = aVar2.g(intValue);
                return 0;
            case 10:
                this.f216625p = aVar2.c(intValue);
                return 0;
            case 11:
                this.f216626q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.data_report.k) super.parseFrom(bArr);
    }
}
