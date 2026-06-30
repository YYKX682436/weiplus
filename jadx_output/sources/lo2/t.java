package lo2;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI f320169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI finderMemberPreviewUI) {
        super(0);
        this.f320169d = finderMemberPreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        final com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI finderMemberPreviewUI = this.f320169d;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveNotifyPayVipEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI$payMemberListener$2$1
            {
                this.__eventId = 151670266;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveNotifyPayVipEvent finderLiveNotifyPayVipEvent) {
                com.tencent.mm.autogen.events.FinderLiveNotifyPayVipEvent event = finderLiveNotifyPayVipEvent;
                kotlin.jvm.internal.o.g(event, "event");
                androidx.appcompat.app.AppCompatActivity context = com.tencent.mm.plugin.finder.member.ui.FinderMemberPreviewUI.this.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.member.preview.f0.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                com.tencent.mm.plugin.finder.member.preview.f0.V6((com.tencent.mm.plugin.finder.member.preview.f0) a17, null, null, 3, null);
                return false;
            }
        };
    }
}
