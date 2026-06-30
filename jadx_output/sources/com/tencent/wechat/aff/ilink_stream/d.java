package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes12.dex */
public class d extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217254d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.ilink_stream.w f217255e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217256f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f217257g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.aff.ilink_stream.e f217258h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f217259i = new boolean[6];

    static {
        new com.tencent.wechat.aff.ilink_stream.d();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.ilink_stream.d)) {
            return false;
        }
        com.tencent.wechat.aff.ilink_stream.d dVar = (com.tencent.wechat.aff.ilink_stream.d) fVar;
        return n51.f.a(this.f217254d, dVar.f217254d) && n51.f.a(this.f217255e, dVar.f217255e) && n51.f.a(this.f217256f, dVar.f217256f) && n51.f.a(this.f217257g, dVar.f217257g) && n51.f.a(this.f217258h, dVar.f217258h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.ilink_stream.d();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f217259i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217254d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.wechat.aff.ilink_stream.w wVar = this.f217255e;
            if (wVar != null && zArr[2]) {
                fVar.e(2, wVar.f217330d);
            }
            java.lang.String str2 = this.f217256f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f217257g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            com.tencent.wechat.aff.ilink_stream.e eVar = this.f217258h;
            if (eVar != null && zArr[5]) {
                fVar.e(5, eVar.f217265d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f217254d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            com.tencent.wechat.aff.ilink_stream.w wVar2 = this.f217255e;
            if (wVar2 != null && zArr[2]) {
                i18 += b36.f.e(2, wVar2.f217330d);
            }
            java.lang.String str5 = this.f217256f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f217257g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            com.tencent.wechat.aff.ilink_stream.e eVar2 = this.f217258h;
            return (eVar2 == null || !zArr[5]) ? i18 : i18 + b36.f.e(5, eVar2.f217265d);
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
            this.f217254d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217255e = com.tencent.wechat.aff.ilink_stream.w.a(aVar2.g(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f217256f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f217257g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f217258h = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.tencent.wechat.aff.ilink_stream.e.kDebugEnvSG995 : com.tencent.wechat.aff.ilink_stream.e.kDebugEnvShenzhen995 : com.tencent.wechat.aff.ilink_stream.e.kDebugEnvShanghai995 : com.tencent.wechat.aff.ilink_stream.e.kDebugEnvNone;
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.ilink_stream.d) super.parseFrom(bArr);
    }
}
