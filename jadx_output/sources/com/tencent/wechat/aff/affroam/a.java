package com.tencent.wechat.aff.affroam;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f215765d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f215766e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f215767f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f215768g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f215769h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f215770i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f215771m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f215772n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f215773o = new boolean[9];

    static {
        new com.tencent.wechat.aff.affroam.a();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.affroam.a parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.a) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.a)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.a aVar = (com.tencent.wechat.aff.affroam.a) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f215765d), java.lang.Long.valueOf(aVar.f215765d)) && n51.f.a(this.f215766e, aVar.f215766e) && n51.f.a(this.f215767f, aVar.f215767f) && n51.f.a(this.f215768g, aVar.f215768g) && n51.f.a(this.f215769h, aVar.f215769h) && n51.f.a(this.f215770i, aVar.f215770i) && n51.f.a(this.f215771m, aVar.f215771m) && n51.f.a(this.f215772n, aVar.f215772n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.a();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f215772n;
        java.util.LinkedList linkedList2 = this.f215771m;
        java.util.LinkedList linkedList3 = this.f215770i;
        java.util.LinkedList linkedList4 = this.f215769h;
        java.util.LinkedList linkedList5 = this.f215768g;
        java.util.LinkedList linkedList6 = this.f215767f;
        java.util.LinkedList linkedList7 = this.f215766e;
        boolean[] zArr = this.f215773o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f215765d);
            }
            fVar.g(2, 1, linkedList7);
            fVar.g(3, 2, linkedList6);
            fVar.g(4, 1, linkedList5);
            fVar.g(5, 1, linkedList4);
            fVar.g(6, 2, linkedList3);
            fVar.g(7, 3, linkedList2);
            fVar.g(8, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return (zArr[1] ? b36.f.h(1, this.f215765d) + 0 : 0) + b36.f.g(2, 1, linkedList7) + b36.f.g(3, 2, linkedList6) + b36.f.g(4, 1, linkedList5) + b36.f.g(5, 1, linkedList4) + b36.f.g(6, 2, linkedList3) + b36.f.g(7, 3, linkedList2) + b36.f.g(8, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList7.clear();
            linkedList6.clear();
            linkedList5.clear();
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
        switch (intValue) {
            case 1:
                this.f215765d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                linkedList7.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                linkedList6.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[3] = true;
                return 0;
            case 4:
                linkedList5.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                linkedList4.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                linkedList3.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[6] = true;
                return 0;
            case 7:
                linkedList2.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                zArr[7] = true;
                return 0;
            case 8:
                linkedList.add(aVar2.k(intValue));
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
