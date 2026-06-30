package com.tencent.wechat.aff.wenote;

/* loaded from: classes8.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f217687d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f217688e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f217689f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f217690g = new boolean[4];

    static {
        new com.tencent.wechat.aff.wenote.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.wenote.f)) {
            return false;
        }
        com.tencent.wechat.aff.wenote.f fVar2 = (com.tencent.wechat.aff.wenote.f) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f217687d), java.lang.Boolean.valueOf(fVar2.f217687d)) && n51.f.a(java.lang.Boolean.valueOf(this.f217688e), java.lang.Boolean.valueOf(fVar2.f217688e)) && n51.f.a(java.lang.Boolean.valueOf(this.f217689f), java.lang.Boolean.valueOf(fVar2.f217689f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.wenote.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217690g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f217687d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f217688e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f217689f);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f217687d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f217688e);
            }
            return zArr[3] ? a17 + b36.f.a(3, this.f217689f) : a17;
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
            this.f217687d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217688e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f217689f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.wenote.f) super.parseFrom(bArr);
    }
}
