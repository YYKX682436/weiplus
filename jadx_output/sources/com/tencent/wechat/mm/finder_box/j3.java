package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class j3 extends com.tencent.mm.protobuf.f {

    /* renamed from: s, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.j3 f219552s = new com.tencent.wechat.mm.finder_box.j3();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.finder_box.h f219553d = new com.tencent.wechat.iam.finder_box.h();

    /* renamed from: e, reason: collision with root package name */
    public int f219554e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f219555f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f219556g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f219557h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f219558i = 0;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.m2 f219559m = new com.tencent.wechat.mm.finder_box.m2();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f219560n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.i2 f219561o = new com.tencent.wechat.mm.finder_box.i2();

    /* renamed from: p, reason: collision with root package name */
    public int f219562p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f219563q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f219564r = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.j3)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.j3 j3Var = (com.tencent.wechat.mm.finder_box.j3) fVar;
        return n51.f.a(this.f219553d, j3Var.f219553d) && n51.f.a(java.lang.Integer.valueOf(this.f219554e), java.lang.Integer.valueOf(j3Var.f219554e)) && n51.f.a(java.lang.Integer.valueOf(this.f219555f), java.lang.Integer.valueOf(j3Var.f219555f)) && n51.f.a(java.lang.Integer.valueOf(this.f219556g), java.lang.Integer.valueOf(j3Var.f219556g)) && n51.f.a(java.lang.Integer.valueOf(this.f219557h), java.lang.Integer.valueOf(j3Var.f219557h)) && n51.f.a(java.lang.Integer.valueOf(this.f219558i), java.lang.Integer.valueOf(j3Var.f219558i)) && n51.f.a(this.f219559m, j3Var.f219559m) && n51.f.a(this.f219560n, j3Var.f219560n) && n51.f.a(this.f219561o, j3Var.f219561o) && n51.f.a(java.lang.Integer.valueOf(this.f219562p), java.lang.Integer.valueOf(j3Var.f219562p)) && n51.f.a(java.lang.Integer.valueOf(this.f219563q), java.lang.Integer.valueOf(j3Var.f219563q)) && n51.f.a(java.lang.Integer.valueOf(this.f219564r), java.lang.Integer.valueOf(j3Var.f219564r));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.j3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f219560n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.finder_box.h hVar = this.f219553d;
            if (hVar != null) {
                fVar.i(1, hVar.computeSize());
                this.f219553d.writeFields(fVar);
            }
            fVar.e(2, this.f219554e);
            fVar.e(3, this.f219555f);
            fVar.e(4, this.f219556g);
            fVar.e(5, this.f219557h);
            fVar.e(6, this.f219558i);
            com.tencent.wechat.mm.finder_box.m2 m2Var = this.f219559m;
            if (m2Var != null) {
                fVar.i(7, m2Var.computeSize());
                this.f219559m.writeFields(fVar);
            }
            fVar.g(8, 2, linkedList);
            com.tencent.wechat.mm.finder_box.i2 i2Var = this.f219561o;
            if (i2Var != null) {
                fVar.i(9, i2Var.computeSize());
                this.f219561o.writeFields(fVar);
            }
            fVar.e(10, this.f219562p);
            fVar.e(11, this.f219563q);
            fVar.e(12, this.f219564r);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.finder_box.h hVar2 = this.f219553d;
            int i18 = (hVar2 != null ? 0 + b36.f.i(1, hVar2.computeSize()) : 0) + b36.f.e(2, this.f219554e) + b36.f.e(3, this.f219555f) + b36.f.e(4, this.f219556g) + b36.f.e(5, this.f219557h) + b36.f.e(6, this.f219558i);
            com.tencent.wechat.mm.finder_box.m2 m2Var2 = this.f219559m;
            if (m2Var2 != null) {
                i18 += b36.f.i(7, m2Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(8, 2, linkedList);
            com.tencent.wechat.mm.finder_box.i2 i2Var2 = this.f219561o;
            if (i2Var2 != null) {
                g17 += b36.f.i(9, i2Var2.computeSize());
            }
            return g17 + b36.f.e(10, this.f219562p) + b36.f.e(11, this.f219563q) + b36.f.e(12, this.f219564r);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.iam.finder_box.h hVar3 = new com.tencent.wechat.iam.finder_box.h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.parseFrom(bArr);
                    }
                    this.f219553d = hVar3;
                }
                return 0;
            case 2:
                this.f219554e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f219555f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f219556g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f219557h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f219558i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.finder_box.m2 m2Var3 = new com.tencent.wechat.mm.finder_box.m2();
                    if (bArr2 != null && bArr2.length > 0) {
                        m2Var3.parseFrom(bArr2);
                    }
                    this.f219559m = m2Var3;
                }
                return 0;
            case 8:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.mm.finder_box.i2 i2Var3 = new com.tencent.wechat.mm.finder_box.i2();
                    if (bArr3 != null && bArr3.length > 0) {
                        i2Var3.parseFrom(bArr3);
                    }
                    this.f219561o = i2Var3;
                }
                return 0;
            case 10:
                this.f219562p = aVar2.g(intValue);
                return 0;
            case 11:
                this.f219563q = aVar2.g(intValue);
                return 0;
            case 12:
                this.f219564r = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.j3) super.parseFrom(bArr);
    }
}
