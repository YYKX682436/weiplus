package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes12.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voipmp.platform.i f177267h = new com.tencent.mm.plugin.voipmp.platform.i();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.voipmp.platform.b f177268d;

    /* renamed from: e, reason: collision with root package name */
    public int f177269e;

    /* renamed from: f, reason: collision with root package name */
    public int f177270f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f177271g = new boolean[4];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.voipmp.platform.i)) {
            return false;
        }
        com.tencent.mm.plugin.voipmp.platform.i iVar = (com.tencent.mm.plugin.voipmp.platform.i) fVar;
        return n51.f.a(this.f177268d, iVar.f177268d) && n51.f.a(java.lang.Integer.valueOf(this.f177269e), java.lang.Integer.valueOf(iVar.f177269e)) && n51.f.a(java.lang.Integer.valueOf(this.f177270f), java.lang.Integer.valueOf(iVar.f177270f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mm.plugin.voipmp.platform.i();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f177271g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.voipmp.platform.b bVar = this.f177268d;
            if (bVar != null && zArr[1]) {
                fVar.e(1, bVar.f177227d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f177269e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f177270f);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.voipmp.platform.b bVar2 = this.f177268d;
            if (bVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bVar2.f177227d);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f177269e);
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f177270f) : i18;
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
            int g17 = aVar2.g(intValue);
            this.f177268d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.tencent.mm.plugin.voipmp.platform.b.VoIPMPCameraDefinition1080P : com.tencent.mm.plugin.voipmp.platform.b.VoIPMPCameraDefinition720P : com.tencent.mm.plugin.voipmp.platform.b.VoIPMPCameraDefinition480P;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f177269e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f177270f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.mm.plugin.voipmp.platform.i) super.parseFrom(bArr);
    }
}
