package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class op implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.q f205219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.up f205220g;

    public op(com.tencent.mm.ui.chatting.viewitems.up upVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str, com.tencent.mm.ui.chatting.adapter.q qVar) {
        this.f205220g = upVar;
        this.f205217d = f9Var;
        this.f205218e = str;
        this.f205219f = qVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        c01.n8.c();
        c01.t8 c17 = c01.n8.c();
        com.tencent.mm.storage.f9 f9Var = this.f205217d;
        long msgId = f9Var.getMsgId();
        boolean contains = ((java.util.ArrayList) ((zf4.l) c17).f472675g).contains(java.lang.Long.valueOf(msgId));
        com.tencent.mm.ui.chatting.viewitems.up upVar = this.f205220g;
        if (!contains && i17 == 0 && i18 == 0 && ((bt3.l0) m1Var).L().equals(this.f205218e)) {
            com.tencent.mm.storage.f9 M1 = com.tencent.mm.storage.f9.M1(f9Var);
            M1.i1(f9Var.J0());
            M1.setMsgId(-1L);
            ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) upVar.f205723s.f460708c.a(sb5.q2.class))).p0().j(this.f205219f.getAdapterPosition(), M1);
        }
        c01.d9.e().q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, upVar.f205724t);
        upVar.f205724t = null;
    }
}
