package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
public class d2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f217962d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f217963e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f217964f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.c2 f217965g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f217966h = new boolean[5];

    static {
        new com.tencent.wechat.mm.biz.d2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.d2 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.d2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.d2)) {
            return false;
        }
        com.tencent.wechat.mm.biz.d2 d2Var = (com.tencent.wechat.mm.biz.d2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f217962d), java.lang.Integer.valueOf(d2Var.f217962d)) && n51.f.a(this.f217963e, d2Var.f217963e) && n51.f.a(java.lang.Boolean.valueOf(this.f217964f), java.lang.Boolean.valueOf(d2Var.f217964f)) && n51.f.a(this.f217965g, d2Var.f217965g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.d2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f217966h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f217962d);
            }
            java.lang.String str = this.f217963e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f217964f);
            }
            com.tencent.wechat.mm.biz.c2 c2Var = this.f217965g;
            if (c2Var != null && zArr[4]) {
                fVar.i(4, c2Var.computeSize());
                this.f217965g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f217962d) : 0;
            java.lang.String str2 = this.f217963e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f217964f);
            }
            com.tencent.wechat.mm.biz.c2 c2Var2 = this.f217965g;
            return (c2Var2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, c2Var2.computeSize());
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
            this.f217962d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f217963e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f217964f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.wechat.mm.biz.c2 c2Var3 = new com.tencent.wechat.mm.biz.c2();
            if (bArr != null && bArr.length > 0) {
                c2Var3.parseFrom(bArr);
            }
            this.f217965g = c2Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
