package com.tencent.wemagic.adframework.plugin.scl.zidl_gen;

/* loaded from: classes4.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f220055d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f220056e;

    /* renamed from: f, reason: collision with root package name */
    public int f220057f;

    /* renamed from: g, reason: collision with root package name */
    public int f220058g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f220059h = new boolean[5];

    static {
        new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.d();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wemagic.adframework.plugin.scl.zidl_gen.d)) {
            return false;
        }
        com.tencent.wemagic.adframework.plugin.scl.zidl_gen.d dVar = (com.tencent.wemagic.adframework.plugin.scl.zidl_gen.d) fVar;
        return n51.f.a(this.f220055d, dVar.f220055d) && n51.f.a(this.f220056e, dVar.f220056e) && n51.f.a(java.lang.Integer.valueOf(this.f220057f), java.lang.Integer.valueOf(dVar.f220057f)) && n51.f.a(java.lang.Integer.valueOf(this.f220058g), java.lang.Integer.valueOf(dVar.f220058g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.d();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f220059h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f220055d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f220056e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            if (zArr[3]) {
                fVar.e(3, this.f220057f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f220058g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f220055d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f220056e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f220057f);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f220058g) : i18;
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
        if (intValue == 1) {
            this.f220055d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f220056e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f220057f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f220058g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wemagic.adframework.plugin.scl.zidl_gen.d) super.parseFrom(bArr);
    }
}
