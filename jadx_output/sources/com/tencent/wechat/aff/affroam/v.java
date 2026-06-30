package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class v extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.v f215992i = new com.tencent.wechat.aff.affroam.v();

    /* renamed from: d, reason: collision with root package name */
    public long f215993d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f215994e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f215995f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f215996g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f215997h = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.v)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.v vVar = (com.tencent.wechat.aff.affroam.v) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f215993d), java.lang.Long.valueOf(vVar.f215993d)) && n51.f.a(java.lang.Long.valueOf(this.f215994e), java.lang.Long.valueOf(vVar.f215994e)) && n51.f.a(java.lang.Long.valueOf(this.f215995f), java.lang.Long.valueOf(vVar.f215995f)) && n51.f.a(java.lang.Long.valueOf(this.f215996g), java.lang.Long.valueOf(vVar.f215996g)) && n51.f.a(java.lang.Boolean.valueOf(this.f215997h), java.lang.Boolean.valueOf(vVar.f215997h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.v();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f215993d);
            fVar.h(2, this.f215994e);
            fVar.h(3, this.f215995f);
            fVar.h(4, this.f215996g);
            fVar.a(5, this.f215997h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f215993d) + 0 + b36.f.h(2, this.f215994e) + b36.f.h(3, this.f215995f) + b36.f.h(4, this.f215996g) + b36.f.a(5, this.f215997h);
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
            this.f215993d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f215994e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f215995f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f215996g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f215997h = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.v) super.parseFrom(bArr);
    }
}
