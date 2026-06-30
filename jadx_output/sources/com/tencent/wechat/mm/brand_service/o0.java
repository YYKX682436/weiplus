package com.tencent.wechat.mm.brand_service;

/* loaded from: classes4.dex */
public class o0 extends com.tencent.mm.protobuf.f {

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.wechat.mm.brand_service.o0 f219108o = new com.tencent.wechat.mm.brand_service.o0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219109d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f219110e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f219111f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219112g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219113h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f219114i = "";

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.k0 f219115m = new com.tencent.wechat.mm.brand_service.k0();

    /* renamed from: n, reason: collision with root package name */
    public boolean f219116n = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.o0)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.o0 o0Var = (com.tencent.wechat.mm.brand_service.o0) fVar;
        return n51.f.a(this.f219109d, o0Var.f219109d) && n51.f.a(this.f219110e, o0Var.f219110e) && n51.f.a(java.lang.Integer.valueOf(this.f219111f), java.lang.Integer.valueOf(o0Var.f219111f)) && n51.f.a(this.f219112g, o0Var.f219112g) && n51.f.a(this.f219113h, o0Var.f219113h) && n51.f.a(this.f219114i, o0Var.f219114i) && n51.f.a(this.f219115m, o0Var.f219115m) && n51.f.a(java.lang.Boolean.valueOf(this.f219116n), java.lang.Boolean.valueOf(o0Var.f219116n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.o0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219110e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219109d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f219111f);
            java.lang.String str2 = this.f219112g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f219113h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f219114i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            com.tencent.wechat.mm.brand_service.k0 k0Var = this.f219115m;
            if (k0Var != null) {
                fVar.i(7, k0Var.computeSize());
                this.f219115m.writeFields(fVar);
            }
            fVar.a(8, this.f219116n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f219109d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f219111f);
            java.lang.String str6 = this.f219112g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f219113h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f219114i;
            if (str8 != null) {
                j17 += b36.f.j(6, str8);
            }
            com.tencent.wechat.mm.brand_service.k0 k0Var2 = this.f219115m;
            if (k0Var2 != null) {
                j17 += b36.f.i(7, k0Var2.computeSize());
            }
            return j17 + b36.f.a(8, this.f219116n);
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
                this.f219109d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.mm.brand_service.n0 n0Var = new com.tencent.wechat.mm.brand_service.n0();
                    if (bArr != null && bArr.length > 0) {
                        n0Var.parseFrom(bArr);
                    }
                    linkedList.add(n0Var);
                }
                return 0;
            case 3:
                this.f219111f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f219112g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f219113h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f219114i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.tencent.wechat.mm.brand_service.k0 k0Var3 = new com.tencent.wechat.mm.brand_service.k0();
                    if (bArr2 != null && bArr2.length > 0) {
                        k0Var3.parseFrom(bArr2);
                    }
                    this.f219115m = k0Var3;
                }
                return 0;
            case 8:
                this.f219116n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.o0) super.parseFrom(bArr);
    }
}
