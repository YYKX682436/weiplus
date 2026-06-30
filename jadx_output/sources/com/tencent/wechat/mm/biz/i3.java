package com.tencent.wechat.mm.biz;

/* loaded from: classes8.dex */
public class i3 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.i3 f218182m = new com.tencent.wechat.mm.biz.i3();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.biz.u f218183d = new com.tencent.wechat.iam.biz.u();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.i0 f218184e = new com.tencent.wechat.mm.biz.i0();

    /* renamed from: f, reason: collision with root package name */
    public int f218185f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f218186g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f218187h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f218188i = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.i3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.i3 i3Var = (com.tencent.wechat.mm.biz.i3) fVar;
        return n51.f.a(this.f218183d, i3Var.f218183d) && n51.f.a(this.f218184e, i3Var.f218184e) && n51.f.a(java.lang.Integer.valueOf(this.f218185f), java.lang.Integer.valueOf(i3Var.f218185f)) && n51.f.a(java.lang.Integer.valueOf(this.f218186g), java.lang.Integer.valueOf(i3Var.f218186g)) && n51.f.a(java.lang.Integer.valueOf(this.f218187h), java.lang.Integer.valueOf(i3Var.f218187h)) && n51.f.a(java.lang.Integer.valueOf(this.f218188i), java.lang.Integer.valueOf(i3Var.f218188i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.i3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.biz.u uVar = this.f218183d;
            if (uVar != null) {
                fVar.i(1, uVar.computeSize());
                this.f218183d.writeFields(fVar);
            }
            com.tencent.wechat.mm.biz.i0 i0Var = this.f218184e;
            if (i0Var != null) {
                fVar.i(2, i0Var.computeSize());
                this.f218184e.writeFields(fVar);
            }
            fVar.e(3, this.f218185f);
            fVar.e(4, this.f218186g);
            fVar.e(5, this.f218187h);
            fVar.e(6, this.f218188i);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.biz.u uVar2 = this.f218183d;
            int i18 = uVar2 != null ? 0 + b36.f.i(1, uVar2.computeSize()) : 0;
            com.tencent.wechat.mm.biz.i0 i0Var2 = this.f218184e;
            if (i0Var2 != null) {
                i18 += b36.f.i(2, i0Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f218185f) + b36.f.e(4, this.f218186g) + b36.f.e(5, this.f218187h) + b36.f.e(6, this.f218188i);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.iam.biz.u uVar3 = new com.tencent.wechat.iam.biz.u();
                    if (bArr != null && bArr.length > 0) {
                        uVar3.parseFrom(bArr);
                    }
                    this.f218183d = uVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.biz.i0 i0Var3 = new com.tencent.wechat.mm.biz.i0();
                    if (bArr2 != null && bArr2.length > 0) {
                        i0Var3.parseFrom(bArr2);
                    }
                    this.f218184e = i0Var3;
                }
                return 0;
            case 3:
                this.f218185f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f218186g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f218187h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f218188i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.i3) super.parseFrom(bArr);
    }
}
