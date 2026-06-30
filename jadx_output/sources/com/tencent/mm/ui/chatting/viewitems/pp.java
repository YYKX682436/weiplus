package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class pp implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f205283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.up f205284e;

    public pp(com.tencent.mm.ui.chatting.viewitems.up upVar, com.tencent.mm.pluginsdk.model.app.d dVar) {
        this.f205284e = upVar;
        this.f205283d = dVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        if (((bt3.l0) m1Var).L().equals(this.f205283d.field_mediaSvrId)) {
            com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
            com.tencent.mm.ui.chatting.viewitems.up upVar = this.f205284e;
            e17.q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, upVar.f205724t);
            upVar.f205724t = null;
        }
    }
}
