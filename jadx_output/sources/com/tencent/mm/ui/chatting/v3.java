package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class v3 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f202786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f202787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f202788f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f202790h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f202791i;

    public v3(ot0.q qVar, com.tencent.mm.pluginsdk.model.app.d dVar, android.content.Context context, java.lang.String str, com.tencent.mm.storage.f9 f9Var, boolean z17) {
        this.f202786d = qVar;
        this.f202787e = dVar;
        this.f202788f = context;
        this.f202789g = str;
        this.f202790h = f9Var;
        this.f202791i = z17;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.pluginsdk.model.app.d dVar;
        if (i17 == 0 && hVar != null && hVar.field_retCode == 0) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f202786d.A) && (dVar = this.f202787e) != null) {
                dVar.field_status = 199L;
                dVar.field_offset = dVar.field_totalLen;
                com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar, new java.lang.String[0]);
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(dVar.field_msgInfoTalker, dVar.field_msgInfoId);
                Li.r1(3);
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
            }
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.ui.chatting.u3(this));
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
