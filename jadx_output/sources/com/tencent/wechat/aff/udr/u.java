package com.tencent.wechat.aff.udr;

/* loaded from: classes7.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217575d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217576e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f217577f = new boolean[3];

    static {
        new com.tencent.wechat.aff.udr.u();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.udr.u parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.udr.u) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.udr.u)) {
            return false;
        }
        com.tencent.wechat.aff.udr.u uVar = (com.tencent.wechat.aff.udr.u) fVar;
        return n51.f.a(this.f217575d, uVar.f217575d) && n51.f.a(this.f217576e, uVar.f217576e);
    }

    public java.lang.String getKey() {
        return this.f217577f[1] ? this.f217575d : "";
    }

    public java.lang.String getValue() {
        return this.f217577f[2] ? this.f217576e : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.udr.u();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217577f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217575d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f217576e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f217575d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f217576e;
            return (str4 == null || !zArr[2]) ? i18 : i18 + b36.f.j(2, str4);
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
            this.f217575d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f217576e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
