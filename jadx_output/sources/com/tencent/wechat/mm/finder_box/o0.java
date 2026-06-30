package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class o0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219688d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f219690f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f219689e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f219691g = new boolean[4];

    static {
        new com.tencent.wechat.mm.finder_box.o0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.o0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.o0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.o0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.o0 o0Var = (com.tencent.wechat.mm.finder_box.o0) fVar;
        return n51.f.a(this.f219688d, o0Var.f219688d) && n51.f.a(this.f219689e, o0Var.f219689e) && n51.f.a(java.lang.Boolean.valueOf(this.f219690f), java.lang.Boolean.valueOf(o0Var.f219690f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.o0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219689e;
        boolean[] zArr = this.f219691g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219688d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.a(3, this.f219690f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f219688d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            return zArr[3] ? g17 + b36.f.a(3, this.f219690f) : g17;
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
            this.f219688d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f219690f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.tencent.wechat.mm.finder_box.q0 q0Var = new com.tencent.wechat.mm.finder_box.q0();
            if (bArr != null && bArr.length > 0) {
                q0Var.parseFrom(bArr);
            }
            linkedList.add(q0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
