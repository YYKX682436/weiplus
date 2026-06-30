package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class c3 extends com.tencent.mm.ui.component.UIComponent implements ed0.z0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f158372d;

    /* renamed from: e, reason: collision with root package name */
    public long f158373e;

    /* renamed from: f, reason: collision with root package name */
    public int f158374f;

    /* renamed from: g, reason: collision with root package name */
    public int f158375g;

    /* renamed from: h, reason: collision with root package name */
    public final long f158376h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158372d = "";
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f158376h = java.lang.System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        if (r4 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O6(long r20, int r22, ox3.f r23, long r24) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ringtone.uic.c3.O6(long, int, ox3.f, long):void");
    }

    public void P6(long j17, int i17) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.ringtone.uic.d2 d2Var = (com.tencent.mm.plugin.ringtone.uic.d2) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.ringtone.uic.d2.class);
        java.lang.String R6 = d2Var != null ? d2Var.R6() : "";
        long j18 = this.f158373e;
        com.tencent.mm.autogen.mmdata.rpt.ring_search_tips_and_historyStruct ring_search_tips_and_historystruct = new com.tencent.mm.autogen.mmdata.rpt.ring_search_tips_and_historyStruct();
        ring_search_tips_and_historystruct.f63158d = j17;
        ring_search_tips_and_historystruct.f63161g = i17 + 1;
        ring_search_tips_and_historystruct.f63159e = ring_search_tips_and_historystruct.b("sessionid", java.lang.String.valueOf(j18), true);
        ring_search_tips_and_historystruct.f63160f = ring_search_tips_and_historystruct.b("search_request_id", R6, true);
        ring_search_tips_and_historystruct.k();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        getIntent().getIntExtra("ringtone_caller", 1);
        java.lang.String stringExtra = getIntent().getStringExtra("exclusvie_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f158372d = stringExtra;
        if (stringExtra.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneKVReportUIC", "not pass exclusive ringtone name, default my username");
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            this.f158372d = r17;
        }
        if (qx3.b.a(this.f158372d.hashCode()) == null) {
            mx3.i0.d(this.f158372d);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        getIntent().getIntExtra("ringtone_caller", 1);
        java.lang.String stringExtra = getIntent().getStringExtra("exclusvie_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f158372d = stringExtra;
        this.f158375g = getIntent().getIntExtra("ringtone_channel", 0);
        if (this.f158374f == 0) {
            this.f158374f = getIntent().getIntExtra("ringtone_scene", 0);
        }
        if (this.f158372d.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneKVReportUIC", "not pass exclusive ringtone name, default my username");
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            this.f158372d = r17;
        }
        long longExtra = getIntent().getLongExtra("ringtone_session_id", 0L);
        this.f158373e = longExtra;
        if (longExtra == 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f158373e = java.lang.System.currentTimeMillis();
        }
        if (qx3.b.a(this.f158372d.hashCode()) == null) {
            mx3.i0.d(this.f158372d);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
    }
}
