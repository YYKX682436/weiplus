package com.tencent.mm.plugin.sns.ui.fake;

/* loaded from: classes10.dex */
public final class SnsFakeVideoPlayUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f168324d;

    /* renamed from: e, reason: collision with root package name */
    public long f168325e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f168326f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f168327g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f168328h;

    /* renamed from: i, reason: collision with root package name */
    public int f168329i;

    /* renamed from: m, reason: collision with root package name */
    public int f168330m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f168331n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f168332o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168333p;

    /* renamed from: q, reason: collision with root package name */
    public f25.m0 f168334q;

    /* renamed from: r, reason: collision with root package name */
    public final ec4.g0 f168335r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsFakeVideoPlayUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f168324d = jz5.h.b(new ec4.e0(this));
        this.f168325e = -1L;
        this.f168328h = "";
        this.f168329i = -1;
        this.f168330m = -1;
        this.f168333p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipCallingStatusEvent>(activity) { // from class: com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$voipCallEventListener$1
            {
                this.__eventId = 1965200980;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipCallingStatusEvent voipCallingStatusEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$voipCallEventListener$1");
                com.tencent.mm.autogen.events.VoipCallingStatusEvent event = voipCallingStatusEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$voipCallEventListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54942g.f8161d == 11) {
                    com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC = this;
                    com.tencent.mm.videocomposition.play.VideoCompositionPlayView O6 = com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC.O6(snsFakeVideoPlayUIC);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMutePlay$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                    boolean z17 = snsFakeVideoPlayUIC.f168331n;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMutePlay$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                    O6.f(z17);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$voipCallEventListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$voipCallEventListener$1");
                return false;
            }
        };
        this.f168335r = new ec4.g0(this, activity);
    }

    public static final /* synthetic */ com.tencent.mm.videocomposition.play.VideoCompositionPlayView O6(com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBackgroundVideoPreview", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView P6 = snsFakeVideoPlayUIC.P6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBackgroundVideoPreview", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        return P6;
    }

    public final com.tencent.mm.videocomposition.play.VideoCompositionPlayView P6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundVideoPreview", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        java.lang.Object value = ((jz5.n) this.f168324d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.videocomposition.play.VideoCompositionPlayView videoCompositionPlayView = (com.tencent.mm.videocomposition.play.VideoCompositionPlayView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundVideoPreview", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        return videoCompositionPlayView;
    }

    public final boolean Q6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestFoucs", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        f25.m0 m0Var = this.f168334q;
        if (m0Var != null) {
            kotlin.jvm.internal.o.d(m0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestFoucs", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            return ((g25.e) m0Var).f267980c;
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.x.f259116c, null);
        this.f168334q = m96;
        boolean z17 = false;
        if (m96 != null && ((g25.e) m96).f267980c) {
            z17 = true;
        }
        boolean z18 = !z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestFoucs", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        return z18;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        this.f168327g = getIntent().getBooleanExtra("intent_video_is_preview", false);
        java.lang.String stringExtra = getIntent().getStringExtra("intent_video_background_word_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f168328h = stringExtra;
        this.f168329i = getIntent().getIntExtra("intent_video_sns_local_id", -1);
        this.f168331n = getIntent().getBooleanExtra("intent_video_is_mute_play", false);
        this.f168330m = getIntent().getIntExtra("intent_video_sns_create_time", -1);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", "initView >> " + this.f168328h + ", " + this.f168327g + ", " + this.f168329i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        if (this.f168325e != -1) {
            n55.f fVar = (n55.f) i95.n0.c(n55.f.class);
            long j17 = this.f168325e;
            ((wp4.x) fVar).getClass();
            up4.g gVar = up4.g.f429873a;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayManager", "destroy: " + j17);
            java.util.HashMap hashMap = up4.g.f429874b;
            up4.h hVar = (up4.h) hashMap.get(java.lang.Long.valueOf(j17));
            if (hVar != null) {
                ((zv3.f) hVar.f429876b).a();
                hVar.f429877c.k();
            }
            hashMap.remove(java.lang.Long.valueOf(j17));
            P6().g();
        }
        kotlinx.coroutines.r2 r2Var = this.f168326f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        super.onPause();
        this.f168333p.dead();
        P6().pause();
        f25.m0 m0Var = this.f168334q;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f168334q = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        this.f168333p.alive();
        P6().h();
        boolean Q6 = Q6();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", "fake video preview gainFocus:" + Q6);
        P6().f(Q6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
    }
}
