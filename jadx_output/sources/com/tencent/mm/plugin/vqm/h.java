package com.tencent.mm.plugin.vqm;

/* loaded from: classes9.dex */
public class h extends com.tencent.mm.protobuf.f {

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vqm.h f177334n = new com.tencent.mm.plugin.vqm.h();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.i f177335d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.i f177336e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.vqm.i f177337f;

    /* renamed from: g, reason: collision with root package name */
    public long f177338g;

    /* renamed from: h, reason: collision with root package name */
    public int f177339h;

    /* renamed from: i, reason: collision with root package name */
    public int f177340i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f177341m = new boolean[7];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.vqm.h)) {
            return false;
        }
        com.tencent.mm.plugin.vqm.h hVar = (com.tencent.mm.plugin.vqm.h) fVar;
        return n51.f.a(this.f177335d, hVar.f177335d) && n51.f.a(this.f177336e, hVar.f177336e) && n51.f.a(this.f177337f, hVar.f177337f) && n51.f.a(java.lang.Long.valueOf(this.f177338g), java.lang.Long.valueOf(hVar.f177338g)) && n51.f.a(java.lang.Integer.valueOf(this.f177339h), java.lang.Integer.valueOf(hVar.f177339h)) && n51.f.a(java.lang.Integer.valueOf(this.f177340i), java.lang.Integer.valueOf(hVar.f177340i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mm.plugin.vqm.h();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f177341m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.vqm.i iVar = this.f177335d;
            if (iVar != null && zArr[1]) {
                fVar.e(1, iVar.f177347d);
            }
            com.tencent.mm.plugin.vqm.i iVar2 = this.f177336e;
            if (iVar2 != null && zArr[2]) {
                fVar.e(2, iVar2.f177347d);
            }
            com.tencent.mm.plugin.vqm.i iVar3 = this.f177337f;
            if (iVar3 != null && zArr[3]) {
                fVar.e(3, iVar3.f177347d);
            }
            if (zArr[4]) {
                fVar.h(4, this.f177338g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f177339h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f177340i);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.vqm.i iVar4 = this.f177335d;
            if (iVar4 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, iVar4.f177347d);
            }
            com.tencent.mm.plugin.vqm.i iVar5 = this.f177336e;
            if (iVar5 != null && zArr[2]) {
                i18 += b36.f.e(2, iVar5.f177347d);
            }
            com.tencent.mm.plugin.vqm.i iVar6 = this.f177337f;
            if (iVar6 != null && zArr[3]) {
                i18 += b36.f.e(3, iVar6.f177347d);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f177338g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f177339h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f177340i) : i18;
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
                this.f177335d = com.tencent.mm.plugin.vqm.i.a(aVar2.g(intValue));
                zArr[1] = true;
                return 0;
            case 2:
                this.f177336e = com.tencent.mm.plugin.vqm.i.a(aVar2.g(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                this.f177337f = com.tencent.mm.plugin.vqm.i.a(aVar2.g(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f177338g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f177339h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f177340i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.mm.plugin.vqm.h) super.parseFrom(bArr);
    }
}
