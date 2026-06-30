package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes9.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voipmp.platform.h f177261i = new com.tencent.mm.plugin.voipmp.platform.h();

    /* renamed from: d, reason: collision with root package name */
    public float f177262d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f177263e;

    /* renamed from: f, reason: collision with root package name */
    public float f177264f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f177265g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f177266h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.voipmp.platform.h)) {
            return false;
        }
        com.tencent.mm.plugin.voipmp.platform.h hVar = (com.tencent.mm.plugin.voipmp.platform.h) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f177262d), java.lang.Float.valueOf(hVar.f177262d)) && n51.f.a(java.lang.Boolean.valueOf(this.f177263e), java.lang.Boolean.valueOf(hVar.f177263e)) && n51.f.a(java.lang.Float.valueOf(this.f177264f), java.lang.Float.valueOf(hVar.f177264f)) && n51.f.a(java.lang.Boolean.valueOf(this.f177265g), java.lang.Boolean.valueOf(hVar.f177265g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mm.plugin.voipmp.platform.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f177266h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.d(1, this.f177262d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f177263e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f177264f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f177265g);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[1] ? 0 + b36.f.d(1, this.f177262d) : 0;
            if (zArr[2]) {
                d17 += b36.f.a(2, this.f177263e);
            }
            if (zArr[3]) {
                d17 += b36.f.d(3, this.f177264f);
            }
            return zArr[4] ? d17 + b36.f.a(4, this.f177265g) : d17;
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
            this.f177262d = aVar2.f(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f177263e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f177264f = aVar2.f(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f177265g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.mm.plugin.voipmp.platform.h) super.parseFrom(bArr);
    }
}
