package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class g4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219462d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f219463e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f219464f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f219465g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f219466h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f219467i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f219468m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f219469n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f219470o = 0;

    static {
        new com.tencent.wechat.mm.finder_box.g4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.g4 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.g4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.g4)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.g4 g4Var = (com.tencent.wechat.mm.finder_box.g4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219462d), java.lang.Integer.valueOf(g4Var.f219462d)) && n51.f.a(java.lang.Integer.valueOf(this.f219463e), java.lang.Integer.valueOf(g4Var.f219463e)) && n51.f.a(java.lang.Integer.valueOf(this.f219464f), java.lang.Integer.valueOf(g4Var.f219464f)) && n51.f.a(java.lang.Integer.valueOf(this.f219465g), java.lang.Integer.valueOf(g4Var.f219465g)) && n51.f.a(java.lang.Integer.valueOf(this.f219466h), java.lang.Integer.valueOf(g4Var.f219466h)) && n51.f.a(java.lang.Integer.valueOf(this.f219467i), java.lang.Integer.valueOf(g4Var.f219467i)) && n51.f.a(java.lang.Integer.valueOf(this.f219468m), java.lang.Integer.valueOf(g4Var.f219468m)) && n51.f.a(java.lang.Integer.valueOf(this.f219469n), java.lang.Integer.valueOf(g4Var.f219469n)) && n51.f.a(java.lang.Integer.valueOf(this.f219470o), java.lang.Integer.valueOf(g4Var.f219470o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.g4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f219462d);
            fVar.e(2, this.f219463e);
            fVar.e(3, this.f219464f);
            fVar.e(4, this.f219465g);
            fVar.e(5, this.f219466h);
            fVar.e(6, this.f219467i);
            fVar.e(7, this.f219468m);
            fVar.e(8, this.f219469n);
            fVar.e(9, this.f219470o);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f219462d) + 0 + b36.f.e(2, this.f219463e) + b36.f.e(3, this.f219464f) + b36.f.e(4, this.f219465g) + b36.f.e(5, this.f219466h) + b36.f.e(6, this.f219467i) + b36.f.e(7, this.f219468m) + b36.f.e(8, this.f219469n) + b36.f.e(9, this.f219470o);
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
        switch (intValue) {
            case 1:
                this.f219462d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f219463e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f219464f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f219465g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f219466h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f219467i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f219468m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f219469n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f219470o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
