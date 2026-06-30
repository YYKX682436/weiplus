package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class b4 extends com.tencent.mm.protobuf.f {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.b4 f219332f = new com.tencent.wechat.mm.finder_box.b4();

    /* renamed from: d, reason: collision with root package name */
    public long f219333d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f219334e = new boolean[2];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof com.tencent.wechat.mm.finder_box.b4) && n51.f.a(java.lang.Long.valueOf(this.f219333d), java.lang.Long.valueOf(((com.tencent.wechat.mm.finder_box.b4) fVar).f219333d));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.b4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219334e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f219333d);
            }
            return 0;
        }
        if (i17 == 1) {
            if (zArr[1]) {
                return 0 + b36.f.h(1, this.f219333d);
            }
            return 0;
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
            return -1;
        }
        this.f219333d = aVar2.i(intValue);
        zArr[1] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.b4) super.parseFrom(bArr);
    }
}
