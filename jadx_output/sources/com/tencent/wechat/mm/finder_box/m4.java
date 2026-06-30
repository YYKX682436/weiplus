package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class m4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219650d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219651e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219652f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.l4 f219653g;

    /* renamed from: h, reason: collision with root package name */
    public int f219654h;

    /* renamed from: i, reason: collision with root package name */
    public int f219655i;

    /* renamed from: m, reason: collision with root package name */
    public int f219656m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.j4 f219657n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.k4 f219658o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f219659p = new boolean[10];

    static {
        new com.tencent.wechat.mm.finder_box.m4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.m4 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.m4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.m4)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.m4 m4Var = (com.tencent.wechat.mm.finder_box.m4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219650d), java.lang.Integer.valueOf(m4Var.f219650d)) && n51.f.a(this.f219651e, m4Var.f219651e) && n51.f.a(this.f219652f, m4Var.f219652f) && n51.f.a(this.f219653g, m4Var.f219653g) && n51.f.a(java.lang.Integer.valueOf(this.f219654h), java.lang.Integer.valueOf(m4Var.f219654h)) && n51.f.a(java.lang.Integer.valueOf(this.f219655i), java.lang.Integer.valueOf(m4Var.f219655i)) && n51.f.a(java.lang.Integer.valueOf(this.f219656m), java.lang.Integer.valueOf(m4Var.f219656m)) && n51.f.a(this.f219657n, m4Var.f219657n) && n51.f.a(this.f219658o, m4Var.f219658o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.m4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f219659p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f219650d);
            }
            java.lang.String str = this.f219651e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f219652f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            com.tencent.wechat.mm.finder_box.l4 l4Var = this.f219653g;
            if (l4Var != null && zArr[4]) {
                fVar.i(4, l4Var.computeSize());
                this.f219653g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f219654h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f219655i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f219656m);
            }
            com.tencent.wechat.mm.finder_box.j4 j4Var = this.f219657n;
            if (j4Var != null && zArr[8]) {
                fVar.i(8, j4Var.computeSize());
                this.f219657n.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.k4 k4Var = this.f219658o;
            if (k4Var != null && zArr[9]) {
                fVar.i(9, k4Var.computeSize());
                this.f219658o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f219650d) : 0;
            java.lang.String str3 = this.f219651e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f219652f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            com.tencent.wechat.mm.finder_box.l4 l4Var2 = this.f219653g;
            if (l4Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, l4Var2.computeSize());
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f219654h);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f219655i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f219656m);
            }
            com.tencent.wechat.mm.finder_box.j4 j4Var2 = this.f219657n;
            if (j4Var2 != null && zArr[8]) {
                e17 += b36.f.i(8, j4Var2.computeSize());
            }
            com.tencent.wechat.mm.finder_box.k4 k4Var2 = this.f219658o;
            return (k4Var2 == null || !zArr[9]) ? e17 : e17 + b36.f.i(9, k4Var2.computeSize());
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
                this.f219650d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f219651e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f219652f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.mm.finder_box.l4 l4Var3 = new com.tencent.wechat.mm.finder_box.l4();
                    if (bArr != null && bArr.length > 0) {
                        l4Var3.parseFrom(bArr);
                    }
                    this.f219653g = l4Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f219654h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f219655i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f219656m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.mm.finder_box.j4 j4Var3 = new com.tencent.wechat.mm.finder_box.j4();
                    if (bArr2 != null && bArr2.length > 0) {
                        j4Var3.parseFrom(bArr2);
                    }
                    this.f219657n = j4Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.wechat.mm.finder_box.k4 k4Var3 = new com.tencent.wechat.mm.finder_box.k4();
                    if (bArr3 != null && bArr3.length > 0) {
                        k4Var3.parseFrom(bArr3);
                    }
                    this.f219658o = k4Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
