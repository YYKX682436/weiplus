package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class j2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.finder_box.h f219547d = new com.tencent.wechat.iam.finder_box.h();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219548e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219549f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f219550g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f219551h = 0;

    static {
        new com.tencent.wechat.mm.finder_box.j2();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.j2)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.j2 j2Var = (com.tencent.wechat.mm.finder_box.j2) fVar;
        return n51.f.a(this.f219547d, j2Var.f219547d) && n51.f.a(this.f219548e, j2Var.f219548e) && n51.f.a(this.f219549f, j2Var.f219549f) && n51.f.a(java.lang.Integer.valueOf(this.f219550g), java.lang.Integer.valueOf(j2Var.f219550g)) && n51.f.a(java.lang.Integer.valueOf(this.f219551h), java.lang.Integer.valueOf(j2Var.f219551h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.j2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.finder_box.h hVar = this.f219547d;
            if (hVar != null) {
                fVar.i(1, hVar.computeSize());
                this.f219547d.writeFields(fVar);
            }
            java.lang.String str = this.f219548e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f219549f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f219550g);
            fVar.e(5, this.f219551h);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.finder_box.h hVar2 = this.f219547d;
            int i18 = hVar2 != null ? 0 + b36.f.i(1, hVar2.computeSize()) : 0;
            java.lang.String str3 = this.f219548e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f219549f;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f219550g) + b36.f.e(5, this.f219551h);
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
                com.tencent.wechat.iam.finder_box.h hVar3 = new com.tencent.wechat.iam.finder_box.h();
                if (bArr != null && bArr.length > 0) {
                    hVar3.parseFrom(bArr);
                }
                this.f219547d = hVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f219548e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f219549f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f219550g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f219551h = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.j2) super.parseFrom(bArr);
    }
}
