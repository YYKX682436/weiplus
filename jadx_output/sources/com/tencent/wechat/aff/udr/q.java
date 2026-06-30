package com.tencent.wechat.aff.udr;

/* loaded from: classes7.dex */
public class q extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f217547d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f217548e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f217549f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f217550g = new boolean[4];

    static {
        new com.tencent.wechat.aff.udr.q();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.udr.q parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.udr.q) super.parseFrom(bArr);
    }

    public com.tencent.wechat.aff.udr.q c(java.lang.String str) {
        this.f217547d = str;
        this.f217550g[1] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.udr.q)) {
            return false;
        }
        com.tencent.wechat.aff.udr.q qVar = (com.tencent.wechat.aff.udr.q) fVar;
        return n51.f.a(this.f217547d, qVar.f217547d) && n51.f.a(this.f217548e, qVar.f217548e) && n51.f.a(this.f217549f, qVar.f217549f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.udr.q();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217550g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f217547d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, this.f217548e);
            fVar.g(3, 8, this.f217549f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f217547d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            return i18 + b36.f.g(2, 1, this.f217548e) + b36.f.g(3, 8, this.f217549f);
        }
        if (i17 == 2) {
            this.f217548e.clear();
            this.f217549f.clear();
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
            this.f217547d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217548e.add(aVar2.k(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.aff.udr.v vVar = new com.tencent.wechat.aff.udr.v();
            if (bArr != null && bArr.length > 0) {
                vVar.parseFrom(bArr);
            }
            this.f217549f.add(vVar);
        }
        zArr[3] = true;
        return 0;
    }
}
