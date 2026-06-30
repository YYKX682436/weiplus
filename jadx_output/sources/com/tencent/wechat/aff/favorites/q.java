package com.tencent.wechat.aff.favorites;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f216856e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f216855d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f216857f = new boolean[3];

    static {
        new com.tencent.wechat.aff.favorites.q();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.q)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.q qVar = (com.tencent.wechat.aff.favorites.q) fVar;
        return n51.f.a(this.f216855d, qVar.f216855d) && n51.f.a(this.f216856e, qVar.f216856e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.q();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216857f;
        java.util.LinkedList linkedList = this.f216855d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                linkedList2.add(java.lang.Integer.valueOf(((com.tencent.wechat.aff.favorites.u) it.next()).f216871d));
            }
            fVar.g(1, 2, linkedList2);
            com.tencent.mm.protobuf.g gVar = this.f216856e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                linkedList3.add(java.lang.Integer.valueOf(((com.tencent.wechat.aff.favorites.u) it6.next()).f216871d));
            }
            int g17 = 0 + b36.f.g(1, 2, linkedList3);
            com.tencent.mm.protobuf.g gVar2 = this.f216856e;
            return (gVar2 == null || !zArr[2]) ? g17 : g17 + b36.f.b(2, gVar2);
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
            linkedList.add(com.tencent.wechat.aff.favorites.u.a(aVar2.g(intValue)));
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f216856e = aVar2.d(intValue);
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.q) super.parseFrom(bArr);
    }
}
