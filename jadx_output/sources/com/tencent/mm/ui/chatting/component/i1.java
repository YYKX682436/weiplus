package com.tencent.mm.ui.chatting.component;

@yn.c
/* loaded from: classes9.dex */
public final class i1 extends com.tencent.mm.ui.chatting.component.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f199207e = jz5.h.b(com.tencent.mm.ui.chatting.component.h1.f199136d);

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f199208f;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        com.tencent.mm.sdk.event.IListener iListener = this.f199208f;
        if (iListener != null) {
            iListener.alive();
        } else {
            kotlin.jvm.internal.o.o("floatBallClickListener");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        com.tencent.mm.sdk.event.IListener iListener = this.f199208f;
        if (iListener != null) {
            iListener.dead();
        } else {
            kotlin.jvm.internal.o.o("floatBallClickListener");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mm.sdk.event.IListener iListener = this.f199208f;
        if (iListener != null) {
            iListener.dead();
        } else {
            kotlin.jvm.internal.o.o("floatBallClickListener");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        final com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198580d.f460717l;
        this.f199208f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsFloatBallClickEvent>(baseChattingUIFragment) { // from class: com.tencent.mm.ui.chatting.component.ChatRecordsTtsFloatBallComponent$onChattingInit$1
            {
                this.__eventId = -729024933;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsFloatBallClickEvent chatRecordsTtsFloatBallClickEvent) {
                com.tencent.mm.feature.chatrecordstts.api.ChatRecordsTtsFloatBallClickEvent event = chatRecordsTtsFloatBallClickEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.ui.chatting.component.i1 i1Var = com.tencent.mm.ui.chatting.component.i1.this;
                java.lang.String x17 = i1Var.f198580d.x();
                java.lang.String str = event.f65343g;
                if (!kotlin.jvm.internal.o.b(x17, str)) {
                    com.tencent.mars.xlog.Log.i("ChatRecordsTtsFloatBallComponent", "floatBallClick ignored, different talker current=" + x17 + " event=" + str);
                    return false;
                }
                com.tencent.mars.xlog.Log.i("ChatRecordsTtsFloatBallComponent", "floatBallClick locating to msgId=" + event.f65344h + " talker=" + str);
                com.tencent.mm.ui.chatting.gb gbVar = i1Var.f198580d.f460719n;
                if (gbVar == null || ((com.tencent.mm.ui.chatting.ChattingUIFragment) gbVar).B == null) {
                    return false;
                }
                ((com.tencent.mm.feature.chatrecordstts.b1) ((oy.i) ((jz5.n) i1Var.f199207e).getValue())).nj();
                com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
                if (lifecycleScope != null) {
                    v65.i.b(lifecycleScope, null, new com.tencent.mm.ui.chatting.component.g1(i1Var, null), 1, null);
                }
                sb5.z zVar = (sb5.z) i1Var.f198580d.f460708c.a(sb5.z.class);
                java.lang.String str2 = event.f65343g;
                long j17 = event.f65344h;
                hd5.n nVar = hd5.n.ACTION_POSITION;
                sb5.y yVar = new sb5.y();
                yVar.f405597b = true;
                yVar.f405599d = true;
                yVar.f405598c = true;
                yVar.f405601f = true;
                ((com.tencent.mm.ui.chatting.adapter.k) zVar).T0(str2, j17, nVar, yVar);
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
    }
}
