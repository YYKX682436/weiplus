package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class y1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.z1 f219982d;

    /* renamed from: e, reason: collision with root package name */
    public int f219983e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219984f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f219985g = new boolean[4];

    static {
        new com.tencent.wechat.mm.finder_box.y1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.y1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.y1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.y1)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.y1 y1Var = (com.tencent.wechat.mm.finder_box.y1) fVar;
        return n51.f.a(this.f219982d, y1Var.f219982d) && n51.f.a(java.lang.Integer.valueOf(this.f219983e), java.lang.Integer.valueOf(y1Var.f219983e)) && n51.f.a(this.f219984f, y1Var.f219984f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.y1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219985g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.mm.finder_box.z1 z1Var = this.f219982d;
            if (z1Var != null && zArr[1]) {
                fVar.i(1, z1Var.computeSize());
                this.f219982d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219983e);
            }
            java.lang.String str = this.f219984f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.mm.finder_box.z1 z1Var2 = this.f219982d;
            if (z1Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, z1Var2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f219983e);
            }
            java.lang.String str2 = this.f219984f;
            return (str2 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str2);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f219983e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f219984f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.mm.finder_box.z1 z1Var3 = new com.tencent.wechat.mm.finder_box.z1();
            if (bArr != null && bArr.length > 0) {
                z1Var3.parseFrom(bArr);
            }
            this.f219982d = z1Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
