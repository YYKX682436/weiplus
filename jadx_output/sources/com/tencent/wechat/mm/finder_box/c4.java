package com.tencent.wechat.mm.finder_box;

/* loaded from: classes9.dex */
public class c4 extends com.tencent.mm.protobuf.f {

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.c4 f219347n = new com.tencent.wechat.mm.finder_box.c4();

    /* renamed from: d, reason: collision with root package name */
    public long f219348d;

    /* renamed from: e, reason: collision with root package name */
    public int f219349e;

    /* renamed from: f, reason: collision with root package name */
    public int f219350f;

    /* renamed from: g, reason: collision with root package name */
    public int f219351g;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.r2 f219353i;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f219352h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f219354m = new boolean[7];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.c4)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.c4 c4Var = (com.tencent.wechat.mm.finder_box.c4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f219348d), java.lang.Long.valueOf(c4Var.f219348d)) && n51.f.a(java.lang.Integer.valueOf(this.f219349e), java.lang.Integer.valueOf(c4Var.f219349e)) && n51.f.a(java.lang.Integer.valueOf(this.f219350f), java.lang.Integer.valueOf(c4Var.f219350f)) && n51.f.a(java.lang.Integer.valueOf(this.f219351g), java.lang.Integer.valueOf(c4Var.f219351g)) && n51.f.a(this.f219352h, c4Var.f219352h) && n51.f.a(this.f219353i, c4Var.f219353i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.c4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219352h;
        boolean[] zArr = this.f219354m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f219348d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219349e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f219350f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f219351g);
            }
            fVar.g(5, 3, linkedList);
            com.tencent.wechat.mm.finder_box.r2 r2Var = this.f219353i;
            if (r2Var != null && zArr[6]) {
                fVar.i(6, r2Var.computeSize());
                this.f219353i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f219348d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f219349e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f219350f);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f219351g);
            }
            int g17 = h17 + b36.f.g(5, 3, linkedList);
            com.tencent.wechat.mm.finder_box.r2 r2Var2 = this.f219353i;
            return (r2Var2 == null || !zArr[6]) ? g17 : g17 + b36.f.i(6, r2Var2.computeSize());
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
        switch (intValue) {
            case 1:
                this.f219348d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219349e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219350f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f219351g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                linkedList.add(java.lang.Long.valueOf(aVar2.i(intValue)));
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.mm.finder_box.r2 r2Var3 = new com.tencent.wechat.mm.finder_box.r2();
                    if (bArr != null && bArr.length > 0) {
                        r2Var3.parseFrom(bArr);
                    }
                    this.f219353i = r2Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.c4) super.parseFrom(bArr);
    }
}
