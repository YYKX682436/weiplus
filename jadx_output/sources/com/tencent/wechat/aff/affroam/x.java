package com.tencent.wechat.aff.affroam;

/* loaded from: classes15.dex */
public class x extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.x f216006i = new com.tencent.wechat.aff.affroam.x();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.y f216007d = com.tencent.wechat.aff.affroam.y.kAffRoamDiskTypeUnknown;

    /* renamed from: e, reason: collision with root package name */
    public long f216008e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f216009f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f216010g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f216011h = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.x)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.x xVar = (com.tencent.wechat.aff.affroam.x) fVar;
        return n51.f.a(this.f216007d, xVar.f216007d) && n51.f.a(java.lang.Long.valueOf(this.f216008e), java.lang.Long.valueOf(xVar.f216008e)) && n51.f.a(java.lang.Long.valueOf(this.f216009f), java.lang.Long.valueOf(xVar.f216009f)) && n51.f.a(java.lang.Long.valueOf(this.f216010g), java.lang.Long.valueOf(xVar.f216010g)) && n51.f.a(java.lang.Boolean.valueOf(this.f216011h), java.lang.Boolean.valueOf(xVar.f216011h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.x();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.affroam.y yVar = this.f216007d;
            if (yVar != null) {
                fVar.e(1, yVar.f216021d);
            }
            fVar.h(2, this.f216008e);
            fVar.h(3, this.f216009f);
            fVar.h(4, this.f216010g);
            fVar.a(5, this.f216011h);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.affroam.y yVar2 = this.f216007d;
            return (yVar2 != null ? 0 + b36.f.e(1, yVar2.f216021d) : 0) + b36.f.h(2, this.f216008e) + b36.f.h(3, this.f216009f) + b36.f.h(4, this.f216010g) + b36.f.a(5, this.f216011h);
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
            int g17 = aVar2.g(intValue);
            this.f216007d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? g17 != 5 ? null : com.tencent.wechat.aff.affroam.y.kAffRoamDiskTypePortableDisk : com.tencent.wechat.aff.affroam.y.kAffRoamDiskTypeMacOS : com.tencent.wechat.aff.affroam.y.kAffRoamDiskTypeWindows : com.tencent.wechat.aff.affroam.y.kAffRoamDiskTypeICloud : com.tencent.wechat.aff.affroam.y.kAffRoamDiskTypeNas : com.tencent.wechat.aff.affroam.y.kAffRoamDiskTypeUnknown;
            return 0;
        }
        if (intValue == 2) {
            this.f216008e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f216009f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f216010g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f216011h = aVar2.c(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.x) super.parseFrom(bArr);
    }
}
