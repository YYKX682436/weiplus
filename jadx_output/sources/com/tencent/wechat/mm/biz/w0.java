package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class w0 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f218727e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218728f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f218726d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f218729g = new boolean[4];

    static {
        new com.tencent.wechat.mm.biz.w0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.w0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.w0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.w0)) {
            return false;
        }
        com.tencent.wechat.mm.biz.w0 w0Var = (com.tencent.wechat.mm.biz.w0) fVar;
        return n51.f.a(this.f218726d, w0Var.f218726d) && n51.f.a(java.lang.Integer.valueOf(this.f218727e), java.lang.Integer.valueOf(w0Var.f218727e)) && n51.f.a(this.f218728f, w0Var.f218728f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.w0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218726d;
        boolean[] zArr = this.f218729g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f218727e);
            }
            java.lang.String str = this.f218728f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f218727e);
            }
            java.lang.String str2 = this.f218728f;
            return (str2 == null || !zArr[3]) ? g17 : g17 + b36.f.j(3, str2);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f218727e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f218728f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.mm.biz.v0 v0Var = new com.tencent.wechat.mm.biz.v0();
            if (bArr != null && bArr.length > 0) {
                v0Var.parseFrom(bArr);
            }
            linkedList.add(v0Var);
        }
        zArr[1] = true;
        return 0;
    }
}
