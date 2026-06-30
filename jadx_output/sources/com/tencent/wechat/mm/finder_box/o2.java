package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class o2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219696d;

    /* renamed from: e, reason: collision with root package name */
    public int f219697e;

    /* renamed from: f, reason: collision with root package name */
    public int f219698f;

    /* renamed from: g, reason: collision with root package name */
    public int f219699g;

    /* renamed from: h, reason: collision with root package name */
    public int f219700h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f219701i = new boolean[6];

    static {
        new com.tencent.wechat.mm.finder_box.o2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.o2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.o2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.o2)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.o2 o2Var = (com.tencent.wechat.mm.finder_box.o2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219696d), java.lang.Integer.valueOf(o2Var.f219696d)) && n51.f.a(java.lang.Integer.valueOf(this.f219697e), java.lang.Integer.valueOf(o2Var.f219697e)) && n51.f.a(java.lang.Integer.valueOf(this.f219698f), java.lang.Integer.valueOf(o2Var.f219698f)) && n51.f.a(java.lang.Integer.valueOf(this.f219699g), java.lang.Integer.valueOf(o2Var.f219699g)) && n51.f.a(java.lang.Integer.valueOf(this.f219700h), java.lang.Integer.valueOf(o2Var.f219700h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.o2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219701i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f219696d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f219697e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f219698f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f219699g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f219700h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f219696d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f219697e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f219698f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f219699g);
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f219700h) : e17;
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
            this.f219696d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f219697e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f219698f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f219699g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f219700h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}
