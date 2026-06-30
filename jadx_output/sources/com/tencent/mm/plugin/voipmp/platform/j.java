package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.protobuf.f {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.voipmp.platform.j f177273g = new com.tencent.mm.plugin.voipmp.platform.j();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.voipmp.platform.c f177274d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.voipmp.platform.d f177275e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f177276f = new boolean[3];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.plugin.voipmp.platform.j)) {
            return false;
        }
        com.tencent.mm.plugin.voipmp.platform.j jVar = (com.tencent.mm.plugin.voipmp.platform.j) fVar;
        return n51.f.a(this.f177274d, jVar.f177274d) && n51.f.a(this.f177275e, jVar.f177275e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mm.plugin.voipmp.platform.j();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f177276f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.plugin.voipmp.platform.c cVar = this.f177274d;
            if (cVar != null && zArr[1]) {
                fVar.e(1, cVar.f177231d);
            }
            com.tencent.mm.plugin.voipmp.platform.d dVar = this.f177275e;
            if (dVar != null && zArr[2]) {
                fVar.e(2, dVar.f177237d);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.voipmp.platform.c cVar2 = this.f177274d;
            if (cVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, cVar2.f177231d);
            }
            com.tencent.mm.plugin.voipmp.platform.d dVar2 = this.f177275e;
            return (dVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.e(2, dVar2.f177237d);
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
        com.tencent.mm.plugin.voipmp.platform.c cVar3 = null;
        com.tencent.mm.plugin.voipmp.platform.d dVar3 = null;
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            if (g17 == 0) {
                cVar3 = com.tencent.mm.plugin.voipmp.platform.c.VoIPMPCameraFacingFront;
            } else if (g17 == 1) {
                cVar3 = com.tencent.mm.plugin.voipmp.platform.c.VoIPMPCameraFacingBack;
            }
            this.f177274d = cVar3;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        int g18 = aVar2.g(intValue);
        if (g18 == 0) {
            dVar3 = com.tencent.mm.plugin.voipmp.platform.d.VoIPMPCameraSceneModePhoto;
        } else if (g18 == 1) {
            dVar3 = com.tencent.mm.plugin.voipmp.platform.d.VoIPMPCameraSceneModeVideo;
        }
        this.f177275e = dVar3;
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.mm.plugin.voipmp.platform.j) super.parseFrom(bArr);
    }
}
