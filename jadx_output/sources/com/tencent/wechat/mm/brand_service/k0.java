package com.tencent.wechat.mm.brand_service;

/* loaded from: classes4.dex */
public class k0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219002d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f219003e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f219004f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219005g;

    /* renamed from: h, reason: collision with root package name */
    public long f219006h;

    /* renamed from: i, reason: collision with root package name */
    public int f219007i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f219008m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f219009n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public long f219010o;

    /* renamed from: p, reason: collision with root package name */
    public long f219011p;

    static {
        new com.tencent.wechat.mm.brand_service.k0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.k0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.k0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.k0)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.k0 k0Var = (com.tencent.wechat.mm.brand_service.k0) fVar;
        return n51.f.a(this.f219002d, k0Var.f219002d) && n51.f.a(java.lang.Boolean.valueOf(this.f219003e), java.lang.Boolean.valueOf(k0Var.f219003e)) && n51.f.a(java.lang.Boolean.valueOf(this.f219004f), java.lang.Boolean.valueOf(k0Var.f219004f)) && n51.f.a(this.f219005g, k0Var.f219005g) && n51.f.a(java.lang.Long.valueOf(this.f219006h), java.lang.Long.valueOf(k0Var.f219006h)) && n51.f.a(java.lang.Integer.valueOf(this.f219007i), java.lang.Integer.valueOf(k0Var.f219007i)) && n51.f.a(java.lang.Boolean.valueOf(this.f219008m), java.lang.Boolean.valueOf(k0Var.f219008m)) && n51.f.a(this.f219009n, k0Var.f219009n) && n51.f.a(java.lang.Long.valueOf(this.f219010o), java.lang.Long.valueOf(k0Var.f219010o)) && n51.f.a(java.lang.Long.valueOf(this.f219011p), java.lang.Long.valueOf(k0Var.f219011p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.k0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219009n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219002d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.a(2, this.f219003e);
            fVar.a(3, this.f219004f);
            java.lang.String str2 = this.f219005g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f219006h);
            fVar.e(6, this.f219007i);
            fVar.a(7, this.f219008m);
            fVar.g(8, 8, linkedList);
            fVar.h(9, this.f219010o);
            fVar.h(10, this.f219011p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f219002d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.a(2, this.f219003e) + b36.f.a(3, this.f219004f);
            java.lang.String str4 = this.f219005g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.h(5, this.f219006h) + b36.f.e(6, this.f219007i) + b36.f.a(7, this.f219008m) + b36.f.g(8, 8, linkedList) + b36.f.h(9, this.f219010o) + b36.f.h(10, this.f219011p);
        }
        if (i17 == 2) {
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
        switch (intValue) {
            case 1:
                this.f219002d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f219003e = aVar2.c(intValue);
                return 0;
            case 3:
                this.f219004f = aVar2.c(intValue);
                return 0;
            case 4:
                this.f219005g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f219006h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f219007i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f219008m = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.mm.brand_service.j0 j0Var = new com.tencent.wechat.mm.brand_service.j0();
                    if (bArr != null && bArr.length > 0) {
                        j0Var.parseFrom(bArr);
                    }
                    linkedList.add(j0Var);
                }
                return 0;
            case 9:
                this.f219010o = aVar2.i(intValue);
                return 0;
            case 10:
                this.f219011p = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
