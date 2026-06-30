package com.tencent.mm.plugin.vqm;

/* loaded from: classes2.dex */
public class y extends com.tencent.mm.protobuf.f {

    /* renamed from: n, reason: collision with root package name */
    public static final com.tencent.mm.plugin.vqm.y f177516n = new com.tencent.mm.plugin.vqm.y();

    /* renamed from: d, reason: collision with root package name */
    public long f177517d;

    /* renamed from: e, reason: collision with root package name */
    public long f177518e;

    /* renamed from: f, reason: collision with root package name */
    public int f177519f;

    /* renamed from: g, reason: collision with root package name */
    public long f177520g;

    /* renamed from: h, reason: collision with root package name */
    public long f177521h;

    /* renamed from: i, reason: collision with root package name */
    public int f177522i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f177523m = new boolean[7];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.vqm.y)) {
            return false;
        }
        com.tencent.mm.plugin.vqm.y yVar = (com.tencent.mm.plugin.vqm.y) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f177517d), java.lang.Long.valueOf(yVar.f177517d)) && n51.f.a(java.lang.Long.valueOf(this.f177518e), java.lang.Long.valueOf(yVar.f177518e)) && n51.f.a(java.lang.Integer.valueOf(this.f177519f), java.lang.Integer.valueOf(yVar.f177519f)) && n51.f.a(java.lang.Long.valueOf(this.f177520g), java.lang.Long.valueOf(yVar.f177520g)) && n51.f.a(java.lang.Long.valueOf(this.f177521h), java.lang.Long.valueOf(yVar.f177521h)) && n51.f.a(java.lang.Integer.valueOf(this.f177522i), java.lang.Integer.valueOf(yVar.f177522i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mm.plugin.vqm.y();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f177523m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f177517d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f177518e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f177519f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f177520g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f177521h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f177522i);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f177517d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f177518e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f177519f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f177520g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f177521h);
            }
            return zArr[6] ? h17 + b36.f.e(6, this.f177522i) : h17;
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
                this.f177517d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f177518e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f177519f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f177520g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f177521h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f177522i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.mm.plugin.vqm.y) super.parseFrom(bArr);
    }
}
