package com.tencent.wechat.mm.finder_box;

/* loaded from: classes11.dex */
public class t0 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.t0 f219822h = new com.tencent.wechat.mm.finder_box.t0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f219823d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219824e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.s0 f219825f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f219826g = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.t0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.t0 t0Var = (com.tencent.wechat.mm.finder_box.t0) fVar;
        return n51.f.a(this.f219823d, t0Var.f219823d) && n51.f.a(this.f219824e, t0Var.f219824e) && n51.f.a(this.f219825f, t0Var.f219825f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.t0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219826g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f219823d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f219824e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            com.tencent.wechat.mm.finder_box.s0 s0Var = this.f219825f;
            if (s0Var != null && zArr[3]) {
                fVar.e(3, s0Var.f219796d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f219823d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f219824e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            com.tencent.wechat.mm.finder_box.s0 s0Var2 = this.f219825f;
            return (s0Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.e(3, s0Var2.f219796d);
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
            this.f219823d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f219824e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f219825f = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.tencent.wechat.mm.finder_box.s0.BoxModeLiving : com.tencent.wechat.mm.finder_box.s0.BoxModeLiveEnd : com.tencent.wechat.mm.finder_box.s0.BoxModeHide;
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.t0) super.parseFrom(bArr);
    }
}
