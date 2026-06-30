package com.tencent.wechat.aff.game;

/* loaded from: classes8.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f216915d;

    /* renamed from: e, reason: collision with root package name */
    public long f216916e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216917f;

    /* renamed from: g, reason: collision with root package name */
    public int f216918g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f216919h = new boolean[5];

    static {
        new com.tencent.wechat.aff.game.b();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.game.b parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.game.b) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.game.b)) {
            return false;
        }
        com.tencent.wechat.aff.game.b bVar = (com.tencent.wechat.aff.game.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216915d), java.lang.Integer.valueOf(bVar.f216915d)) && n51.f.a(java.lang.Long.valueOf(this.f216916e), java.lang.Long.valueOf(bVar.f216916e)) && n51.f.a(this.f216917f, bVar.f216917f) && n51.f.a(java.lang.Integer.valueOf(this.f216918g), java.lang.Integer.valueOf(bVar.f216918g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.game.b();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216919h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216915d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f216916e);
            }
            java.lang.String str = this.f216917f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f216918g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f216915d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f216916e);
            }
            java.lang.String str2 = this.f216917f;
            if (str2 != null && zArr[3]) {
                e17 += b36.f.j(3, str2);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f216918g) : e17;
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
            this.f216915d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216916e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216917f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f216918g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
