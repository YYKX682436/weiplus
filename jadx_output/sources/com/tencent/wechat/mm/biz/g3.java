package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class g3 extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.mm.biz.g3 f218079i = new com.tencent.wechat.mm.biz.g3();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.biz.u f218080d;

    /* renamed from: f, reason: collision with root package name */
    public long f218082f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f218083g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f218081e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f218084h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.g3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.g3 g3Var = (com.tencent.wechat.mm.biz.g3) fVar;
        return n51.f.a(this.f218080d, g3Var.f218080d) && n51.f.a(this.f218081e, g3Var.f218081e) && n51.f.a(java.lang.Long.valueOf(this.f218082f), java.lang.Long.valueOf(g3Var.f218082f)) && n51.f.a(java.lang.Boolean.valueOf(this.f218083g), java.lang.Boolean.valueOf(g3Var.f218083g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.g3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218081e;
        boolean[] zArr = this.f218084h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.biz.u uVar = this.f218080d;
            if (uVar != null && zArr[1]) {
                fVar.i(1, uVar.computeSize());
                this.f218080d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.h(3, this.f218082f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f218083g);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.biz.u uVar2 = this.f218080d;
            if (uVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, uVar2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.h(3, this.f218082f);
            }
            return zArr[4] ? g17 + b36.f.a(4, this.f218083g) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.iam.biz.u uVar3 = new com.tencent.wechat.iam.biz.u();
                if (bArr != null && bArr.length > 0) {
                    uVar3.parseFrom(bArr);
                }
                this.f218080d = uVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f218082f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f218083g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.wechat.mm.biz.f3 f3Var = new com.tencent.wechat.mm.biz.f3();
            if (bArr2 != null && bArr2.length > 0) {
                f3Var.parseFrom(bArr2);
            }
            linkedList.add(f3Var);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.g3) super.parseFrom(bArr);
    }
}
