package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class p2 extends com.tencent.mm.protobuf.f {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.p2 f219731i = new com.tencent.wechat.mm.finder_box.p2();

    /* renamed from: d, reason: collision with root package name */
    public int f219732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219733e;

    /* renamed from: f, reason: collision with root package name */
    public int f219734f;

    /* renamed from: g, reason: collision with root package name */
    public int f219735g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f219736h = new boolean[5];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.p2)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.p2 p2Var = (com.tencent.wechat.mm.finder_box.p2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219732d), java.lang.Integer.valueOf(p2Var.f219732d)) && n51.f.a(this.f219733e, p2Var.f219733e) && n51.f.a(java.lang.Integer.valueOf(this.f219734f), java.lang.Integer.valueOf(p2Var.f219734f)) && n51.f.a(java.lang.Integer.valueOf(this.f219735g), java.lang.Integer.valueOf(p2Var.f219735g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.p2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219736h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f219732d);
            }
            java.lang.String str = this.f219733e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f219734f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f219735g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f219732d) : 0;
            java.lang.String str2 = this.f219733e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f219734f);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f219735g) : e17;
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
        if (intValue == 1) {
            this.f219732d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f219733e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f219734f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f219735g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.p2) super.parseFrom(bArr);
    }
}
