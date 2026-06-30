package com.tencent.wemagic.adframework.plugin.scl.zidl_gen;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f220044d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e f220045e;

    /* renamed from: g, reason: collision with root package name */
    public double f220047g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f220048h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f220050m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f220051n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f220052o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f220053p;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f220046f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f220049i = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f220054q = new boolean[11];

    static {
        new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.c();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wemagic.adframework.plugin.scl.zidl_gen.c)) {
            return false;
        }
        com.tencent.wemagic.adframework.plugin.scl.zidl_gen.c cVar = (com.tencent.wemagic.adframework.plugin.scl.zidl_gen.c) fVar;
        return n51.f.a(this.f220044d, cVar.f220044d) && n51.f.a(this.f220045e, cVar.f220045e) && n51.f.a(this.f220046f, cVar.f220046f) && n51.f.a(java.lang.Double.valueOf(this.f220047g), java.lang.Double.valueOf(cVar.f220047g)) && n51.f.a(this.f220048h, cVar.f220048h) && n51.f.a(this.f220049i, cVar.f220049i) && n51.f.a(this.f220050m, cVar.f220050m) && n51.f.a(this.f220051n, cVar.f220051n) && n51.f.a(java.lang.Boolean.valueOf(this.f220052o), java.lang.Boolean.valueOf(cVar.f220052o)) && n51.f.a(java.lang.Boolean.valueOf(this.f220053p), java.lang.Boolean.valueOf(cVar.f220053p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.c();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f220054q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f220044d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e eVar = this.f220045e;
            if (eVar != null && zArr[2]) {
                fVar.i(2, eVar.computeSize());
                this.f220045e.writeFields(fVar);
            }
            fVar.g(3, 1, this.f220046f);
            if (zArr[4]) {
                fVar.c(4, this.f220047g);
            }
            java.lang.String str2 = this.f220048h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            fVar.g(6, 1, this.f220049i);
            java.lang.String str3 = this.f220050m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f220051n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.a(9, this.f220052o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f220053p);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f220044d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e eVar2 = this.f220045e;
            if (eVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, eVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 1, this.f220046f);
            if (zArr[4]) {
                g17 += b36.f.c(4, this.f220047g);
            }
            java.lang.String str6 = this.f220048h;
            if (str6 != null && zArr[5]) {
                g17 += b36.f.j(5, str6);
            }
            int g18 = g17 + b36.f.g(6, 1, this.f220049i);
            java.lang.String str7 = this.f220050m;
            if (str7 != null && zArr[7]) {
                g18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f220051n;
            if (str8 != null && zArr[8]) {
                g18 += b36.f.j(8, str8);
            }
            if (zArr[9]) {
                g18 += b36.f.a(9, this.f220052o);
            }
            return zArr[10] ? g18 + b36.f.a(10, this.f220053p) : g18;
        }
        if (i17 == 2) {
            this.f220046f.clear();
            this.f220049i.clear();
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
                this.f220044d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e eVar3 = new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e();
                    if (bArr != null && bArr.length > 0) {
                        eVar3.parseFrom(bArr);
                    }
                    this.f220045e = eVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f220046f.add(aVar2.k(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f220047g = aVar2.e(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f220048h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f220049i.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                this.f220050m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f220051n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f220052o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f220053p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wemagic.adframework.plugin.scl.zidl_gen.c) super.parseFrom(bArr);
    }
}
