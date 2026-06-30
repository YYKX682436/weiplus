package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class p extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.p f215940h = new com.tencent.wechat.aff.affroam.p();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f215941d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f215942e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.w f215943f = com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_UNKNOWN;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f215944g = com.tencent.mm.protobuf.g.f192155b;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.p)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.p pVar = (com.tencent.wechat.aff.affroam.p) fVar;
        return n51.f.a(this.f215941d, pVar.f215941d) && n51.f.a(this.f215942e, pVar.f215942e) && n51.f.a(this.f215943f, pVar.f215943f) && n51.f.a(this.f215944g, pVar.f215944g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.p();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f215941d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f215942e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.wechat.aff.affroam.w wVar = this.f215943f;
            if (wVar != null) {
                fVar.e(3, wVar.f216005d);
            }
            com.tencent.mm.protobuf.g gVar = this.f215944g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f215941d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f215942e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.tencent.wechat.aff.affroam.w wVar2 = this.f215943f;
            if (wVar2 != null) {
                j17 += b36.f.e(3, wVar2.f216005d);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f215944g;
            return gVar2 != null ? j17 + b36.f.b(4, gVar2) : j17;
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
            this.f215941d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f215942e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            int g17 = aVar2.g(intValue);
            this.f215943f = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? g17 != 5 ? null : com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_PORTABLE_DISK : com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_MAC : com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_WINDOWS : com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_ICLOUD : com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_NAS : com.tencent.wechat.aff.affroam.w.AFFROAM_DEVICE_TYPE_UNKNOWN;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f215944g = aVar2.d(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.p) super.parseFrom(bArr);
    }
}
