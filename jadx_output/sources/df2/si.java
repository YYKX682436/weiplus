package df2;

/* loaded from: classes3.dex */
public final class si implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.wi f231341a;

    public si(df2.wi wiVar) {
        this.f231341a = wiVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public final void a(boolean z17, boolean z18) {
        if (z17) {
            if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 18) {
                com.tencent.mm.plugin.finder.assist.x2.f102672a.b(6);
            }
            df2.wi wiVar = this.f231341a;
            ((mm2.s1) wiVar.business(mm2.s1.class)).S6((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) wiVar.business(mm2.g1.class)).f329068f).getValue());
            com.tencent.mm.autogen.events.FinderGamePostEvent finderGamePostEvent = new com.tencent.mm.autogen.events.FinderGamePostEvent();
            finderGamePostEvent.f54277g.f6829a = true;
            finderGamePostEvent.e();
        }
    }
}
