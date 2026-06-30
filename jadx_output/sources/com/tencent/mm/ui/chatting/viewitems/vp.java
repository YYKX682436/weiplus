package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class vp implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.xp f205886d;

    public vp(com.tencent.mm.ui.chatting.viewitems.xp xpVar) {
        this.f205886d = xpVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
        com.tencent.mm.ui.chatting.viewitems.xp xpVar = this.f205886d;
        e17.q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, xpVar.f206005t);
        xpVar.f206005t = null;
    }
}
