package com.tencent.mm.plugin.sns;

/* loaded from: classes4.dex */
public final class SnsStarListDataUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public ca4.l f162527d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f162528e;

    /* renamed from: f, reason: collision with root package name */
    public int f162529f;

    /* renamed from: g, reason: collision with root package name */
    public int f162530g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f162531h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f162532i;

    /* renamed from: m, reason: collision with root package name */
    public int f162533m;

    /* renamed from: n, reason: collision with root package name */
    public long f162534n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f162535o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f162536p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f162537q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f162538r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f162539s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsStarListDataUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f162528e = new java.util.ArrayList();
        this.f162532i = "";
        this.f162537q = true;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f162539s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsStarFeedOperateEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1
            {
                this.__eventId = 778735630;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsStarFeedOperateEvent snsStarFeedOperateEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1");
                com.tencent.mm.autogen.events.SnsStarFeedOperateEvent event = snsStarFeedOperateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                ((ku5.t0) ku5.t0.f312615d).B(new n34.e4(event, com.tencent.mm.plugin.sns.SnsStarListDataUIC.this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.SnsStarListDataUIC$operateListener$1");
                return false;
            }
        };
    }

    public static final int O6(com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$findPosition", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        snsStarListDataUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findPosition", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        java.util.Iterator it = snsStarListDataUIC.f162528e.iterator();
        int i17 = -1;
        int i18 = -1;
        while (true) {
            if (!it.hasNext()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findPosition", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
                break;
            }
            i18++;
            if (((com.tencent.mm.plugin.sns.storage.SnsInfo) it.next()).getSnsId().equals(str)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findPosition", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
                i17 = i18;
                break;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$findPosition", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x01ef, code lost:
    
        if (r3.V6(r5) == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c2, code lost:
    
        if (r0.T6(r4, r5) == r6) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P6(com.tencent.mm.plugin.sns.SnsStarListDataUIC r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.SnsStarListDataUIC.P6(com.tencent.mm.plugin.sns.SnsStarListDataUIC, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final /* synthetic */ java.util.ArrayList Q6(com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getList$p", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        java.util.ArrayList arrayList = snsStarListDataUIC.f162528e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getList$p", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        return arrayList;
    }

    public static final /* synthetic */ java.lang.String R6(com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUserName$p", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        java.lang.String str = snsStarListDataUIC.f162532i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUserName$p", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        return str;
    }

    public static final /* synthetic */ java.lang.Object S6(com.tencent.mm.plugin.sns.SnsStarListDataUIC snsStarListDataUIC, java.util.List list, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$initFixData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        java.lang.Object T6 = snsStarListDataUIC.T6(list, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$initFixData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        return T6;
    }

    public final java.lang.Object T6(java.util.List list, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFixData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new n34.z3(list, this, null), continuation);
        if (g17 == pz5.a.f359186d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFixData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
            return g17;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFixData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        return f0Var;
    }

    public final void U6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        if (this.f162536p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListDataUIC", "loadData but is finish");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        } else if (this.f162538r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListDataUIC", "loadData and is loading data");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        } else {
            this.f162538r = true;
            pf5.e.launch$default(this, null, null, new n34.b4(this, null), 3, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadData", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        this.f162531h = getIntent().getBooleanExtra("KEY_IS_SELF", false);
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_USER_NAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f162532i = stringExtra;
        U6();
        this.f162539s.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
        this.f162539s.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.SnsStarListDataUIC");
    }
}
