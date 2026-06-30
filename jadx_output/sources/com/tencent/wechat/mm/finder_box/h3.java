package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class h3 extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.h3 f219487g = new com.tencent.wechat.mm.finder_box.h3();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.finder_box.h f219488d = new com.tencent.wechat.iam.finder_box.h();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f219489e = com.tencent.mm.protobuf.g.f192155b;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.i3 f219490f = new com.tencent.wechat.mm.finder_box.i3();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.h3)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.h3 h3Var = (com.tencent.wechat.mm.finder_box.h3) fVar;
        return n51.f.a(this.f219488d, h3Var.f219488d) && n51.f.a(this.f219489e, h3Var.f219489e) && n51.f.a(this.f219490f, h3Var.f219490f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.h3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.finder_box.h hVar = this.f219488d;
            if (hVar != null) {
                fVar.i(1, hVar.computeSize());
                this.f219488d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f219489e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.tencent.wechat.mm.finder_box.i3 i3Var = this.f219490f;
            if (i3Var != null) {
                fVar.i(3, i3Var.computeSize());
                this.f219490f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.finder_box.h hVar2 = this.f219488d;
            int i18 = hVar2 != null ? 0 + b36.f.i(1, hVar2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f219489e;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            com.tencent.wechat.mm.finder_box.i3 i3Var2 = this.f219490f;
            return i3Var2 != null ? i18 + b36.f.i(3, i3Var2.computeSize()) : i18;
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
                this.f219488d = hVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f219489e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.wechat.mm.finder_box.i3 i3Var3 = new com.tencent.wechat.mm.finder_box.i3();
            if (bArr2 != null && bArr2.length > 0) {
                i3Var3.parseFrom(bArr2);
            }
            this.f219490f = i3Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.h3) super.parseFrom(bArr);
    }
}
