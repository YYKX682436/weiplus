package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class t4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f218642d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.k4 f218644f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f218645g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.s4 f218646h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f218643e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f218647i = new boolean[6];

    static {
        new com.tencent.wechat.mm.biz.t4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.t4 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.t4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.t4)) {
            return false;
        }
        com.tencent.wechat.mm.biz.t4 t4Var = (com.tencent.wechat.mm.biz.t4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f218642d), java.lang.Integer.valueOf(t4Var.f218642d)) && n51.f.a(this.f218643e, t4Var.f218643e) && n51.f.a(this.f218644f, t4Var.f218644f) && n51.f.a(this.f218645g, t4Var.f218645g) && n51.f.a(this.f218646h, t4Var.f218646h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.t4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f218643e;
        boolean[] zArr = this.f218647i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f218642d);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.wechat.mm.biz.k4 k4Var = this.f218644f;
            if (k4Var != null && zArr[3]) {
                fVar.i(3, k4Var.computeSize());
                this.f218644f.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f218645g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            com.tencent.wechat.mm.biz.s4 s4Var = this.f218646h;
            if (s4Var != null && zArr[5]) {
                fVar.e(5, s4Var.f218621d);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f218642d) : 0) + b36.f.g(2, 8, linkedList);
            com.tencent.wechat.mm.biz.k4 k4Var2 = this.f218644f;
            if (k4Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, k4Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f218645g;
            if (gVar2 != null && zArr[4]) {
                e17 += b36.f.b(4, gVar2);
            }
            com.tencent.wechat.mm.biz.s4 s4Var2 = this.f218646h;
            return (s4Var2 == null || !zArr[5]) ? e17 : e17 + b36.f.e(5, s4Var2.f218621d);
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
            this.f218642d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.biz.h4 h4Var = new com.tencent.wechat.mm.biz.h4();
                if (bArr != null && bArr.length > 0) {
                    h4Var.parseFrom(bArr);
                }
                linkedList.add(h4Var);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f218645g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            int g17 = aVar2.g(intValue);
            this.f218646h = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.mm.biz.s4.FinderShowType_FINDER_RECOMMEND_HORIZON : com.tencent.wechat.mm.biz.s4.FinderShowType_FINDER_NORMAL : com.tencent.wechat.mm.biz.s4.FinderShowType_DEFAULT;
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.mm.biz.k4 k4Var3 = new com.tencent.wechat.mm.biz.k4();
            if (bArr2 != null && bArr2.length > 0) {
                k4Var3.parseFrom(bArr2);
            }
            this.f218644f = k4Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
