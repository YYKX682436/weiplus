package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class u3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f218682d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f218683e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.t3 f218684f = new com.tencent.wechat.mm.biz.t3();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f218685g = "";

    static {
        new com.tencent.wechat.mm.biz.u3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.u3 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.u3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.u3)) {
            return false;
        }
        com.tencent.wechat.mm.biz.u3 u3Var = (com.tencent.wechat.mm.biz.u3) fVar;
        return n51.f.a(this.f218682d, u3Var.f218682d) && n51.f.a(this.f218683e, u3Var.f218683e) && n51.f.a(this.f218684f, u3Var.f218684f) && n51.f.a(this.f218685g, u3Var.f218685g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.u3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f218682d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f218683e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.tencent.wechat.mm.biz.t3 t3Var = this.f218684f;
            if (t3Var != null) {
                fVar.i(3, t3Var.computeSize());
                this.f218684f.writeFields(fVar);
            }
            java.lang.String str3 = this.f218685g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f218682d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f218683e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            com.tencent.wechat.mm.biz.t3 t3Var2 = this.f218684f;
            if (t3Var2 != null) {
                j17 += b36.f.i(3, t3Var2.computeSize());
            }
            java.lang.String str6 = this.f218685g;
            return str6 != null ? j17 + b36.f.j(4, str6) : j17;
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
            this.f218682d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f218683e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f218685g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.tencent.wechat.mm.biz.t3 t3Var3 = new com.tencent.wechat.mm.biz.t3();
            if (bArr != null && bArr.length > 0) {
                t3Var3.parseFrom(bArr);
            }
            this.f218684f = t3Var3;
        }
        return 0;
    }
}
