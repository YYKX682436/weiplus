package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ka implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f201901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x72.b f201902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f201903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.la f201904g;

    public ka(com.tencent.mm.ui.chatting.la laVar, com.tencent.mm.pluginsdk.model.app.d dVar, x72.b bVar, java.lang.Object obj) {
        this.f201904g = laVar;
        this.f201901d = dVar;
        this.f201902e = bVar;
        this.f201903f = obj;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f201901d;
        if (i17 == 0 && gVar != null) {
            dVar.field_offset = gVar.field_finishedLength;
            com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar, new java.lang.String[0]);
        }
        if (i17 == 0 && hVar != null && hVar.field_retCode == 0) {
            dVar.field_status = 199L;
            dVar.field_offset = dVar.field_totalLen;
            com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar, new java.lang.String[0]);
            x72.b bVar = this.f201902e;
            bVar.f452435d.r1(3);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(bVar.f452435d.getMsgId(), bVar.f452435d);
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.ui.chatting.ja(this));
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
