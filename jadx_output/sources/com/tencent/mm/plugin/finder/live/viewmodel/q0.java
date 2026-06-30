package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class q0 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.a1 f117333a;

    public q0(com.tencent.mm.plugin.finder.live.viewmodel.a1 a1Var) {
        this.f117333a = a1Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public final void a(boolean z17, boolean z18) {
        if (z17) {
            this.f117333a.C = true;
            if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 18) {
                com.tencent.mm.plugin.finder.assist.x2.f102672a.b(6);
            }
            com.tencent.mm.autogen.events.FinderGamePostEvent finderGamePostEvent = new com.tencent.mm.autogen.events.FinderGamePostEvent();
            finderGamePostEvent.f54277g.f6829a = true;
            finderGamePostEvent.e();
        }
    }
}
