package com.tencent.wechat.aff.game;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.game.b f216920d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.game.a f216921e;

    /* renamed from: f, reason: collision with root package name */
    public int f216922f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f216923g = new boolean[4];

    static {
        new com.tencent.wechat.aff.game.c();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.game.c)) {
            return false;
        }
        com.tencent.wechat.aff.game.c cVar = (com.tencent.wechat.aff.game.c) fVar;
        return n51.f.a(this.f216920d, cVar.f216920d) && n51.f.a(this.f216921e, cVar.f216921e) && n51.f.a(java.lang.Integer.valueOf(this.f216922f), java.lang.Integer.valueOf(cVar.f216922f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.game.c();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216923g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.game.b bVar = this.f216920d;
            if (bVar != null && zArr[1]) {
                fVar.i(1, bVar.computeSize());
                this.f216920d.writeFields(fVar);
            }
            com.tencent.wechat.aff.game.a aVar = this.f216921e;
            if (aVar != null && zArr[2]) {
                fVar.i(2, aVar.computeSize());
                this.f216921e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f216922f);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.game.b bVar2 = this.f216920d;
            if (bVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, bVar2.computeSize());
            }
            com.tencent.wechat.aff.game.a aVar2 = this.f216921e;
            if (aVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, aVar2.computeSize());
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f216922f) : i18;
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar4.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.aff.game.b bVar3 = new com.tencent.wechat.aff.game.b();
                if (bArr != null && bArr.length > 0) {
                    bVar3.parseFrom(bArr);
                }
                this.f216920d = bVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f216922f = aVar4.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar4.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            com.tencent.wechat.aff.game.a aVar5 = new com.tencent.wechat.aff.game.a();
            if (bArr2 != null && bArr2.length > 0) {
                aVar5.parseFrom(bArr2);
            }
            this.f216921e = aVar5;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.game.c) super.parseFrom(bArr);
    }
}
