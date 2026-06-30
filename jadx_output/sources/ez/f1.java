package ez;

@j95.b
/* loaded from: classes4.dex */
public final class f1 extends i95.w implements pt.o0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f257729d = jz5.h.b(ez.d1.f257722d);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.feature.common.MMTypingFeatureService$typingNotifyListener$1 f257730e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.feature.common.MMTypingFeatureService$typingNotifyListener$1] */
    public f1() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f257730e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizMMTypingTicketNotifyEvent>(a0Var) { // from class: com.tencent.mm.feature.common.MMTypingFeatureService$typingNotifyListener$1
            {
                this.__eventId = -1889773009;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BypCommonBizMMTypingTicketNotifyEvent bypCommonBizMMTypingTicketNotifyEvent) {
                com.tencent.mm.autogen.events.BypCommonBizMMTypingTicketNotifyEvent event = bypCommonBizMMTypingTicketNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_BYP_INFO_KEY_LONG_SYNC, 0L);
                com.tencent.mars.xlog.Log.i("MMTypingFeatureService", "typingNotifyListener callback!! docgi syncKey=" + t17);
                ez.f1.wi(ez.f1.this, t17, 3);
                return true;
            }
        };
    }

    public static final void wi(ez.f1 f1Var, long j17, int i17) {
        f1Var.getClass();
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new ez.c1(j17, i17, f1Var, null), 1, null);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        dead();
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            en1.k kVar = (en1.k) i95.n0.c(en1.k.class);
            ((dn1.i) kVar).f241874d.v(new ez.e1(this));
        }
    }
}
