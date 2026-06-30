package com.tencent.wechat.aff.affroam;

/* loaded from: classes15.dex */
public class a0 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.a0 f215774m = new com.tencent.wechat.aff.affroam.a0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f215775d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f215776e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f215777f = false;

    /* renamed from: g, reason: collision with root package name */
    public long f215778g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f215779h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f215780i = 0;

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.affroam.a0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.a0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.a0)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.a0 a0Var = (com.tencent.wechat.aff.affroam.a0) fVar;
        return n51.f.a(this.f215775d, a0Var.f215775d) && n51.f.a(this.f215776e, a0Var.f215776e) && n51.f.a(java.lang.Boolean.valueOf(this.f215777f), java.lang.Boolean.valueOf(a0Var.f215777f)) && n51.f.a(java.lang.Long.valueOf(this.f215778g), java.lang.Long.valueOf(a0Var.f215778g)) && n51.f.a(java.lang.Long.valueOf(this.f215779h), java.lang.Long.valueOf(a0Var.f215779h)) && n51.f.a(java.lang.Long.valueOf(this.f215780i), java.lang.Long.valueOf(a0Var.f215780i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.a0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f215775d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f215776e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f215777f);
            fVar.h(4, this.f215778g);
            fVar.h(5, this.f215779h);
            fVar.h(6, this.f215780i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f215775d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f215776e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.a(3, this.f215777f) + b36.f.h(4, this.f215778g) + b36.f.h(5, this.f215779h) + b36.f.h(6, this.f215780i);
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
        switch (intValue) {
            case 1:
                this.f215775d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f215776e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f215777f = aVar2.c(intValue);
                return 0;
            case 4:
                this.f215778g = aVar2.i(intValue);
                return 0;
            case 5:
                this.f215779h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f215780i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
