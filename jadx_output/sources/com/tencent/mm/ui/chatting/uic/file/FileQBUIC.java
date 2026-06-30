package com.tencent.mm.ui.chatting.uic.file;

/* loaded from: classes8.dex */
public final class FileQBUIC extends wm3.a implements com.tencent.mm.pluginsdk.ui.tools.w3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f202754d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f202755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileQBUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f202754d = jz5.h.b(new qe5.v1(this));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f202755e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.QBReaderLoadEndEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.uic.file.FileQBUIC$mLoadEndListener$1
            {
                this.__eventId = -1362078743;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.QBReaderLoadEndEvent qBReaderLoadEndEvent) {
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6;
                com.tencent.mm.autogen.events.QBReaderLoadEndEvent event = qBReaderLoadEndEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.ui.chatting.uic.file.FileQBUIC fileQBUIC = com.tencent.mm.ui.chatting.uic.file.FileQBUIC.this;
                kd5.e T6 = fileQBUIC.T6();
                if ((T6 != null ? T6.K : false) && (P6 = fileQBUIC.P6()) != null) {
                    P6.finish();
                }
                return false;
            }
        };
    }

    public final kd5.e T6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.getState();
        }
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.w3
    public ty.l0 i5() {
        jz5.g gVar = this.f202754d;
        return new ty.l0(false, ((em.d0) ((jz5.n) gVar).getValue()).h().getText().toString(), ((em.d0) ((jz5.n) gVar).getValue()).g().getText().toString(), "", ((em.d0) ((jz5.n) gVar).getValue()).h().getVisibility() == 0, ((em.d0) ((jz5.n) gVar).getValue()).g().getVisibility() == 0);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        this.f202755e.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f202755e.dead();
    }
}
