package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class yp implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f206096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.q f206098f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.aq f206099g;

    public yp(com.tencent.mm.ui.chatting.viewitems.aq aqVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str, com.tencent.mm.ui.chatting.adapter.q qVar) {
        this.f206099g = aqVar;
        this.f206096d = f9Var;
        this.f206097e = str;
        this.f206098f = qVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        c01.n8.c();
        c01.t8 c17 = c01.n8.c();
        com.tencent.mm.storage.f9 f9Var = this.f206096d;
        long msgId = f9Var.getMsgId();
        boolean contains = ((java.util.ArrayList) ((zf4.l) c17).f472675g).contains(java.lang.Long.valueOf(msgId));
        com.tencent.mm.ui.chatting.viewitems.aq aqVar = this.f206099g;
        if (!contains && i17 == 0 && i18 == 0 && ((bt3.l0) m1Var).L().equals(this.f206097e)) {
            ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) aqVar.f203402s.f460708c.a(sb5.q2.class))).p0().k(this.f206098f.getAdapterPosition(), f9Var);
        }
        c01.d9.e().q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, aqVar.f203403t);
        aqVar.f203403t = null;
    }
}
