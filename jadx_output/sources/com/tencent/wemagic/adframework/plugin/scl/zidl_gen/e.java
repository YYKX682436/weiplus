package com.tencent.wemagic.adframework.plugin.scl.zidl_gen;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f220060d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f220061e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f220062f = new boolean[3];

    static {
        new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e parseFrom(byte[] bArr) {
        return (com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e)) {
            return false;
        }
        com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e eVar = (com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e) fVar;
        return n51.f.a(this.f220060d, eVar.f220060d) && n51.f.a(this.f220061e, eVar.f220061e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wemagic.adframework.plugin.scl.zidl_gen.e();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f220062f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f220060d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f220061e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f220060d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f220061e;
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
            this.f220060d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f220061e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
