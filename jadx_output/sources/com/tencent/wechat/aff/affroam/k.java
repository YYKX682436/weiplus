package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class k extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f215876d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f215877e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f215878f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f215879g = new java.util.LinkedList();

    static {
        new com.tencent.wechat.aff.affroam.k();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.affroam.k parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.k) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.k)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.k kVar = (com.tencent.wechat.aff.affroam.k) fVar;
        return n51.f.a(this.f215876d, kVar.f215876d) && n51.f.a(this.f215877e, kVar.f215877e) && n51.f.a(this.f215878f, kVar.f215878f) && n51.f.a(this.f215879g, kVar.f215879g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.k();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.wechat.aff.affroam.j jVar;
        java.util.LinkedList linkedList = this.f215879g;
        java.util.LinkedList linkedList2 = this.f215878f;
        java.util.LinkedList linkedList3 = this.f215877e;
        java.util.LinkedList linkedList4 = this.f215876d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList4);
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            java.util.Iterator it = linkedList3.iterator();
            while (it.hasNext()) {
                linkedList5.add(java.lang.Integer.valueOf(((com.tencent.wechat.aff.affroam.j) it.next()).f215873d));
            }
            fVar.g(2, 2, linkedList5);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList4) + 0;
            java.util.LinkedList linkedList6 = new java.util.LinkedList();
            java.util.Iterator it6 = linkedList3.iterator();
            while (it6.hasNext()) {
                linkedList6.add(java.lang.Integer.valueOf(((com.tencent.wechat.aff.affroam.j) it6.next()).f215873d));
            }
            return g17 + b36.f.g(2, 2, linkedList6) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList4.clear();
            linkedList3.clear();
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
            linkedList4.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            linkedList.add(aVar2.k(intValue));
            return 0;
        }
        switch (aVar2.g(intValue)) {
            case 1:
                jVar = com.tencent.wechat.aff.affroam.j.kAll;
                break;
            case 2:
                jVar = com.tencent.wechat.aff.affroam.j.kFriend;
                break;
            case 3:
                jVar = com.tencent.wechat.aff.affroam.j.kChatRoom;
                break;
            case 4:
                jVar = com.tencent.wechat.aff.affroam.j.kSticky;
                break;
            case 5:
                jVar = com.tencent.wechat.aff.affroam.j.kStar;
                break;
            case 6:
                jVar = com.tencent.wechat.aff.affroam.j.kFoldChatRoom;
                break;
            case 7:
                jVar = com.tencent.wechat.aff.affroam.j.kFriendSnsBlack;
                break;
            default:
                jVar = null;
                break;
        }
        linkedList3.add(jVar);
        return 0;
    }
}
