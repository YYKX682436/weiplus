package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.y0.class)
/* loaded from: classes5.dex */
public final class oe extends com.tencent.mm.ui.chatting.component.a implements sb5.y0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f199640e;

    /* renamed from: f, reason: collision with root package name */
    public final xg3.h0 f199641f = new com.tencent.mm.ui.chatting.component.me(this);

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).n0(this.f199641f, android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).za(this.f199641f);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        if (this.f198580d.g().getIntent().getBooleanExtra("return_to_origin_when_inactive", false)) {
            if (this.f199640e) {
                this.f198580d.f460717l.setBooleanExtra("finish_direct", false);
                com.tencent.mars.xlog.Log.i("MicroMsg.HasSentMsgComponent", "set KFinishDirect to false");
            } else {
                this.f198580d.f460717l.setBooleanExtra("finish_direct", true);
                com.tencent.mars.xlog.Log.i("MicroMsg.HasSentMsgComponent", "set KFinishDirect to true");
            }
        }
    }
}
