package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class w3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219929d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219930e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219931f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219932g;

    /* renamed from: h, reason: collision with root package name */
    public int f219933h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f219934i = new boolean[6];

    static {
        new com.tencent.wechat.mm.finder_box.w3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.w3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.w3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.w3)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.w3 w3Var = (com.tencent.wechat.mm.finder_box.w3) fVar;
        return n51.f.a(this.f219929d, w3Var.f219929d) && n51.f.a(this.f219930e, w3Var.f219930e) && n51.f.a(this.f219931f, w3Var.f219931f) && n51.f.a(this.f219932g, w3Var.f219932g) && n51.f.a(java.lang.Integer.valueOf(this.f219933h), java.lang.Integer.valueOf(w3Var.f219933h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.w3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f219934i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219929d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f219930e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f219931f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f219932g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f219933h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f219929d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f219930e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f219931f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f219932g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f219933h) : i18;
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
            this.f219929d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f219930e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f219931f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f219932g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f219933h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
