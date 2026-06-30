package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes9.dex */
public final class j implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f208489d;

    public j(com.tencent.mm.ipcinvoker.r rVar) {
        this.f208489d = rVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r70.h hVar = (r70.h) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentImgForwardTask", "Image send result: " + hVar.f393109a + ", msgLocalId: " + hVar.f393111c + ", imgLocalId: " + hVar.f393112d);
        if (com.tencent.mm.ui.feature.api.screenshot.i.f208483a[hVar.f393109a.ordinal()] == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecentImgForwardTask", "Image sent successfully");
            com.tencent.mm.ipcinvoker.r rVar = this.f208489d;
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
            }
        }
        return jz5.f0.f302826a;
    }
}
