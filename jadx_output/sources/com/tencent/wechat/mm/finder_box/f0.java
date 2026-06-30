package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class f0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219406d;

    /* renamed from: e, reason: collision with root package name */
    public int f219407e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219408f;

    /* renamed from: g, reason: collision with root package name */
    public int f219409g;

    /* renamed from: h, reason: collision with root package name */
    public int f219410h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f219411i = new boolean[6];

    static {
        new com.tencent.wechat.mm.finder_box.f0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.f0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.f0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.f0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.f0 f0Var = (com.tencent.wechat.mm.finder_box.f0) fVar;
        return n51.f.a(this.f219406d, f0Var.f219406d) && n51.f.a(java.lang.Integer.valueOf(this.f219407e), java.lang.Integer.valueOf(f0Var.f219407e)) && n51.f.a(this.f219408f, f0Var.f219408f) && n51.f.a(java.lang.Integer.valueOf(this.f219409g), java.lang.Integer.valueOf(f0Var.f219409g)) && n51.f.a(java.lang.Integer.valueOf(this.f219410h), java.lang.Integer.valueOf(f0Var.f219410h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.f0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f219411i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219406d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219407e);
            }
            java.lang.String str2 = this.f219408f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f219409g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f219410h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f219406d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f219407e);
            }
            java.lang.String str4 = this.f219408f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f219409g);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f219410h) : i18;
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
            this.f219406d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f219407e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f219408f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f219409g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f219410h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
