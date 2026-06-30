package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.u f215987h = new com.tencent.wechat.aff.affroam.u();

    /* renamed from: d, reason: collision with root package name */
    public int f215988d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f215989e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f215990f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f215991g = "";

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.affroam.u parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.u) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.u)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.u uVar = (com.tencent.wechat.aff.affroam.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f215988d), java.lang.Integer.valueOf(uVar.f215988d)) && n51.f.a(this.f215989e, uVar.f215989e) && n51.f.a(this.f215990f, uVar.f215990f) && n51.f.a(this.f215991g, uVar.f215991g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.u();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f215988d);
            java.lang.String str = this.f215989e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f215990f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f215991g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f215988d) + 0;
            java.lang.String str4 = this.f215989e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f215990f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f215991g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
            this.f215988d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f215989e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f215990f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f215991g = aVar2.k(intValue);
        return 0;
    }
}
