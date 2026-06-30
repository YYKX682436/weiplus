package com.tencent.wechat.mm.finder_box;

/* loaded from: classes9.dex */
public class r2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f219785d;

    /* renamed from: e, reason: collision with root package name */
    public long f219786e;

    /* renamed from: f, reason: collision with root package name */
    public int f219787f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f219788g = new boolean[4];

    static {
        new com.tencent.wechat.mm.finder_box.r2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.r2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.r2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.r2)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.r2 r2Var = (com.tencent.wechat.mm.finder_box.r2) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f219785d), java.lang.Long.valueOf(r2Var.f219785d)) && n51.f.a(java.lang.Long.valueOf(this.f219786e), java.lang.Long.valueOf(r2Var.f219786e)) && n51.f.a(java.lang.Integer.valueOf(this.f219787f), java.lang.Integer.valueOf(r2Var.f219787f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.r2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219788g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f219785d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f219786e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f219787f);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f219785d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f219786e);
            }
            return zArr[3] ? h17 + b36.f.e(3, this.f219787f) : h17;
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
            this.f219785d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f219786e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f219787f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
