package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes9.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f217014d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f217015e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f217016f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f217017g = new java.util.LinkedList();

    static {
        new com.tencent.wechat.aff.iam_scan.g();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.iam_scan.g parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.iam_scan.g) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.iam_scan.g)) {
            return false;
        }
        com.tencent.wechat.aff.iam_scan.g gVar = (com.tencent.wechat.aff.iam_scan.g) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f217014d), java.lang.Long.valueOf(gVar.f217014d)) && n51.f.a(this.f217015e, gVar.f217015e) && n51.f.a(this.f217016f, gVar.f217016f) && n51.f.a(this.f217017g, gVar.f217017g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.iam_scan.g();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f217017g;
        java.util.LinkedList linkedList2 = this.f217015e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f217014d);
            fVar.g(2, 8, linkedList2);
            java.lang.String str = this.f217016f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f217014d) + 0 + b36.f.g(2, 8, linkedList2);
            java.lang.String str2 = this.f217016f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
            this.f217014d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.aff.iam_scan.i0 i0Var = new com.tencent.wechat.aff.iam_scan.i0();
                if (bArr != null && bArr.length > 0) {
                    i0Var.parseFrom(bArr);
                }
                linkedList2.add(i0Var);
            }
            return 0;
        }
        if (intValue == 3) {
            this.f217016f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.aff.iam_scan.g1 g1Var = new com.tencent.wechat.aff.iam_scan.g1();
            if (bArr2 != null && bArr2.length > 0) {
                g1Var.parseFrom(bArr2);
            }
            linkedList.add(g1Var);
        }
        return 0;
    }
}
