package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class h3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.biz.t f218136d = new com.tencent.wechat.iam.biz.t();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218137e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f218138f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f218139g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f218140h = 0;

    static {
        new com.tencent.wechat.mm.biz.h3();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.h3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.h3 h3Var = (com.tencent.wechat.mm.biz.h3) fVar;
        return n51.f.a(this.f218136d, h3Var.f218136d) && n51.f.a(this.f218137e, h3Var.f218137e) && n51.f.a(this.f218138f, h3Var.f218138f) && n51.f.a(java.lang.Integer.valueOf(this.f218139g), java.lang.Integer.valueOf(h3Var.f218139g)) && n51.f.a(java.lang.Integer.valueOf(this.f218140h), java.lang.Integer.valueOf(h3Var.f218140h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.h3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.biz.t tVar = this.f218136d;
            if (tVar != null) {
                fVar.i(1, tVar.computeSize());
                this.f218136d.writeFields(fVar);
            }
            java.lang.String str = this.f218137e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f218138f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f218139g);
            fVar.e(5, this.f218140h);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.biz.t tVar2 = this.f218136d;
            int i18 = tVar2 != null ? 0 + b36.f.i(1, tVar2.computeSize()) : 0;
            java.lang.String str3 = this.f218137e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f218138f;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f218139g) + b36.f.e(5, this.f218140h);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.iam.biz.t tVar3 = new com.tencent.wechat.iam.biz.t();
                if (bArr != null && bArr.length > 0) {
                    tVar3.parseFrom(bArr);
                }
                this.f218136d = tVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f218137e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f218138f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f218139g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f218140h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.h3) super.parseFrom(bArr);
    }
}
