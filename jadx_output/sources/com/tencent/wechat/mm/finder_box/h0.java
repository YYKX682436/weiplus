package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class h0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219471d;

    /* renamed from: e, reason: collision with root package name */
    public int f219472e;

    /* renamed from: f, reason: collision with root package name */
    public int f219473f;

    /* renamed from: g, reason: collision with root package name */
    public int f219474g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f219475h = new boolean[5];

    static {
        new com.tencent.wechat.mm.finder_box.h0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.h0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.h0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.h0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.h0 h0Var = (com.tencent.wechat.mm.finder_box.h0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219471d), java.lang.Integer.valueOf(h0Var.f219471d)) && n51.f.a(java.lang.Integer.valueOf(this.f219472e), java.lang.Integer.valueOf(h0Var.f219472e)) && n51.f.a(java.lang.Integer.valueOf(this.f219473f), java.lang.Integer.valueOf(h0Var.f219473f)) && n51.f.a(java.lang.Integer.valueOf(this.f219474g), java.lang.Integer.valueOf(h0Var.f219474g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.h0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219475h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f219471d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219472e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f219473f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f219474g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f219471d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f219472e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f219473f);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f219474g) : e17;
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
            this.f219471d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f219472e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f219473f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f219474g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
