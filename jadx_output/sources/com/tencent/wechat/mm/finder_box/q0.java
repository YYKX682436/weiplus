package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class q0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219744d;

    /* renamed from: e, reason: collision with root package name */
    public int f219745e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219746f;

    /* renamed from: g, reason: collision with root package name */
    public int f219747g;

    /* renamed from: h, reason: collision with root package name */
    public int f219748h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f219749i = new boolean[6];

    static {
        new com.tencent.wechat.mm.finder_box.q0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.q0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.q0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.q0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.q0 q0Var = (com.tencent.wechat.mm.finder_box.q0) fVar;
        return n51.f.a(this.f219744d, q0Var.f219744d) && n51.f.a(java.lang.Integer.valueOf(this.f219745e), java.lang.Integer.valueOf(q0Var.f219745e)) && n51.f.a(this.f219746f, q0Var.f219746f) && n51.f.a(java.lang.Integer.valueOf(this.f219747g), java.lang.Integer.valueOf(q0Var.f219747g)) && n51.f.a(java.lang.Integer.valueOf(this.f219748h), java.lang.Integer.valueOf(q0Var.f219748h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.q0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f219749i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219744d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219745e);
            }
            java.lang.String str2 = this.f219746f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f219747g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f219748h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f219744d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f219745e);
            }
            java.lang.String str4 = this.f219746f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f219747g);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f219748h) : i18;
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
            this.f219744d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f219745e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f219746f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f219747g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f219748h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
