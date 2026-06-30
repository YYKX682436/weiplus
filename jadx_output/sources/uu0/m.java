package uu0;

/* loaded from: classes5.dex */
public class m implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uu0.o f431253a;

    public m(uu0.o oVar) {
        this.f431253a = oVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.Record.MJAudioRecorder", "state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        uu0.n nVar = this.f431253a.f431261h;
        if (nVar != null) {
            uu0.d dVar = (uu0.d) nVar;
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecordMgr", "onRecError state:%d, detailState:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            dVar.f431229a.f(1);
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        uu0.o oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.MJAudioRecorder", "onRecPcmDataReady()");
        uu0.o oVar2 = this.f431253a;
        uu0.a aVar = oVar2.f431262i;
        if (aVar != null) {
            qu0.b bVar = (qu0.b) aVar;
            if (bArr != null) {
                qu0.i iVar = bVar.f366720a;
                wu0.a aVar2 = iVar.f366737h;
                int i18 = iVar.a().f431244b;
                int i19 = iVar.a().f431245c;
                aVar2.getClass();
                com.tencent.mm.mj_publisher.finder.movie_composing.audio.services.MJAudioChannels3aInterface mJAudioChannels3aInterface = aVar2.f449649a;
                if (mJAudioChannels3aInterface != null) {
                    mJAudioChannels3aInterface.processRecordedData(bArr, i17, i18, i19);
                }
            }
        }
        uu0.n nVar = oVar2.f431261h;
        if (nVar != null) {
            uu0.c cVar = ((uu0.d) nVar).f431229a;
            tu0.g gVar = cVar.f431214i;
            if (gVar != null) {
                gVar.h(bArr, i17, cVar.f431215j);
            }
            tu0.f fVar = cVar.f431211f;
            if (fVar == null || (oVar = cVar.f431206a) == null) {
                return;
            }
            tl.w wVar = oVar.f431254a;
            cVar.f431216k += wVar != null ? wVar.f420155h : oVar.f431259f;
            try {
                tu0.h hVar = (tu0.h) fVar;
                hVar.a(bArr, i17, cVar.f431215j);
                int length = bArr.length;
                try {
                    java.io.OutputStream outputStream = hVar.f422084f;
                    if (outputStream != null) {
                        outputStream.write(bArr, 0, length);
                    }
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.MJAudioRecordMgr", e17, "onRecPcmDataReady", new java.lang.Object[0]);
            }
        }
    }
}
