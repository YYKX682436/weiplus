package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class k2 extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.k2 f219577m = new com.tencent.wechat.mm.finder_box.k2();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.finder_box.i f219578d = new com.tencent.wechat.iam.finder_box.i();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.e0 f219579e = new com.tencent.wechat.mm.finder_box.e0();

    /* renamed from: f, reason: collision with root package name */
    public int f219580f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f219581g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f219582h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f219583i = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.k2)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.k2 k2Var = (com.tencent.wechat.mm.finder_box.k2) fVar;
        return n51.f.a(this.f219578d, k2Var.f219578d) && n51.f.a(this.f219579e, k2Var.f219579e) && n51.f.a(java.lang.Integer.valueOf(this.f219580f), java.lang.Integer.valueOf(k2Var.f219580f)) && n51.f.a(java.lang.Integer.valueOf(this.f219581g), java.lang.Integer.valueOf(k2Var.f219581g)) && n51.f.a(java.lang.Integer.valueOf(this.f219582h), java.lang.Integer.valueOf(k2Var.f219582h)) && n51.f.a(java.lang.Integer.valueOf(this.f219583i), java.lang.Integer.valueOf(k2Var.f219583i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.k2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.finder_box.i iVar = this.f219578d;
            if (iVar != null) {
                fVar.i(1, iVar.computeSize());
                this.f219578d.writeFields(fVar);
            }
            com.tencent.wechat.mm.finder_box.e0 e0Var = this.f219579e;
            if (e0Var != null) {
                fVar.i(2, e0Var.computeSize());
                this.f219579e.writeFields(fVar);
            }
            fVar.e(3, this.f219580f);
            fVar.e(4, this.f219581g);
            fVar.e(5, this.f219582h);
            fVar.e(6, this.f219583i);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.finder_box.i iVar2 = this.f219578d;
            int i18 = iVar2 != null ? 0 + b36.f.i(1, iVar2.computeSize()) : 0;
            com.tencent.wechat.mm.finder_box.e0 e0Var2 = this.f219579e;
            if (e0Var2 != null) {
                i18 += b36.f.i(2, e0Var2.computeSize());
            }
            return i18 + b36.f.e(3, this.f219580f) + b36.f.e(4, this.f219581g) + b36.f.e(5, this.f219582h) + b36.f.e(6, this.f219583i);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.iam.finder_box.i iVar3 = new com.tencent.wechat.iam.finder_box.i();
                    if (bArr != null && bArr.length > 0) {
                        iVar3.parseFrom(bArr);
                    }
                    this.f219578d = iVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.finder_box.e0 e0Var3 = new com.tencent.wechat.mm.finder_box.e0();
                    if (bArr2 != null && bArr2.length > 0) {
                        e0Var3.parseFrom(bArr2);
                    }
                    this.f219579e = e0Var3;
                }
                return 0;
            case 3:
                this.f219580f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f219581g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f219582h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f219583i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.k2) super.parseFrom(bArr);
    }
}
