package vd2;

/* loaded from: classes3.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f435963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f435965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f435966g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435967h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.m84 f435968i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.wk0 f435969m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435970n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f435971o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f435972p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kotlin.jvm.internal.h0 h0Var, android.content.Context context, vd2.f1 f1Var, kotlin.jvm.internal.h0 h0Var2, android.content.Intent intent, r45.m84 m84Var, r45.wk0 wk0Var, android.content.Intent intent2, ss5.d0 d0Var, kotlin.jvm.internal.h0 h0Var3) {
        super(0);
        this.f435963d = h0Var;
        this.f435964e = context;
        this.f435965f = f1Var;
        this.f435966g = h0Var2;
        this.f435967h = intent;
        this.f435968i = m84Var;
        this.f435969m = wk0Var;
        this.f435970n = intent2;
        this.f435971o = d0Var;
        this.f435972p = h0Var3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.lang.String str;
        r45.q82 q82Var;
        r45.ma4 ma4Var;
        java.lang.String string;
        r45.q82 q82Var2;
        java.lang.String string2;
        kotlin.jvm.internal.h0 h0Var = this.f435963d;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f310123d;
        boolean z17 = charSequence == null || charSequence.length() == 0;
        vd2.f1 f1Var = this.f435965f;
        r45.wk0 wk0Var = this.f435969m;
        kotlin.jvm.internal.h0 h0Var2 = this.f435966g;
        java.lang.String str2 = "";
        r45.m84 m84Var = this.f435968i;
        if (z17 || !kotlin.jvm.internal.o.b(h0Var.f310123d, xy2.c.e(this.f435964e))) {
            com.tencent.mars.xlog.Log.i(f1Var.f435725d, "enterLiveB visitor");
            android.content.Intent intent = this.f435970n;
            if (intent == null) {
                intent = new android.content.Intent();
            }
            com.tencent.mm.plugin.finder.report.q5 q5Var = new com.tencent.mm.plugin.finder.report.q5();
            q5Var.f125268a = java.lang.System.currentTimeMillis();
            q5Var.f125273f = false;
            com.tencent.mm.plugin.finder.report.r5.f125336b = q5Var;
            com.tencent.mm.plugin.finder.report.q1.f125258d = null;
            com.tencent.mm.plugin.finder.report.q1.f125256b = 0L;
            com.tencent.mm.plugin.finder.report.q1.f125257c = 0L;
            com.tencent.mm.plugin.finder.report.q1.f125259e = false;
            com.tencent.mm.plugin.finder.report.q1.f125261g = true;
            com.tencent.mm.plugin.finder.report.p1 p1Var = new com.tencent.mm.plugin.finder.report.p1();
            p1Var.f125230a = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.plugin.finder.report.q1.f125258d = p1Var;
            com.tencent.mm.plugin.finder.report.q1.f125256b = 1L;
            com.tencent.mm.plugin.finder.report.q1.f125257c = 1L;
            p1Var.f125231b = 0L;
            p1Var.f125232c = 0L;
            p1Var.f125233d = 0L;
            p1Var.f125234e = 0L;
            p1Var.f125235f = 0L;
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Bk(m84Var.getLong(1));
            r45.nw1 nw1Var = (r45.nw1) h0Var2.f310123d;
            if (nw1Var != null && 1 == nw1Var.getInteger(2)) {
                r45.nw1 nw1Var2 = (r45.nw1) h0Var2.f310123d;
                str = nw1Var2 != null ? nw1Var2.getString(3) : null;
                if (str == null) {
                    str = "";
                }
                r45.nw1 nw1Var3 = (r45.nw1) h0Var2.f310123d;
                i17 = (nw1Var3 == null || (q82Var2 = (r45.q82) nw1Var3.getCustom(9)) == null) ? 1 : q82Var2.getInteger(0);
                r45.nw1 nw1Var4 = (r45.nw1) h0Var2.f310123d;
                ma4Var = nw1Var4 != null ? (r45.ma4) nw1Var4.getCustom(23) : null;
                r45.nw1 nw1Var5 = (r45.nw1) h0Var2.f310123d;
                q82Var = nw1Var5 != null ? (r45.q82) nw1Var5.getCustom(9) : null;
            } else {
                i17 = 1;
                str = "";
                q82Var = null;
                ma4Var = null;
            }
            en0.g gVar = new en0.g();
            gVar.f255246a = 1;
            gVar.f255248c = m84Var.getLong(1);
            gVar.f255262q = m84Var.getString(2);
            gVar.f255254i = str;
            gVar.f255255j = i17;
            gVar.f255256k = m84Var.getLong(0);
            gVar.f255251f = (java.lang.String) h0Var.f310123d;
            gVar.f255257l = m84Var.getString(5);
            gVar.f255268w = m84Var.getString(4);
            gVar.C = ma4Var != null ? ma4Var.toByteArray() : null;
            gVar.f255258m = intent.getIntExtra("key_enter_live_param_bind_type", 0);
            java.lang.String stringExtra = intent.getStringExtra("key_enter_live_param_by_biz_username");
            if (stringExtra == null) {
                stringExtra = "";
            }
            gVar.f255259n = stringExtra;
            java.lang.String stringExtra2 = intent.getStringExtra("key_enter_live_param_by_biz_nickname");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            gVar.f255260o = stringExtra2;
            java.lang.String stringExtra3 = intent.getStringExtra("key_enter_live_param_by_biz_headurl");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            gVar.f255261p = stringExtra3;
            gVar.D = q82Var != null ? q82Var.toByteArray() : null;
            r45.y74 y74Var = (r45.y74) wk0Var.getCustom(6);
            if (y74Var != null && (string = y74Var.getString(8)) != null) {
                str2 = string;
            }
            gVar.f255269x = str2;
            com.tencent.mm.live.api.LiveConfig a17 = gVar.a();
            r45.v74 v74Var = new r45.v74();
            v74Var.set(0, (com.tencent.mm.protocal.protobuf.FinderObject) this.f435972p.f310123d);
            v74Var.set(1, (r45.nw1) h0Var2.f310123d);
            v74Var.set(2, (r45.u74) wk0Var.getCustom(8));
            a17.f68546p0 = v74Var;
            this.f435965f.Ui(0, kz5.b0.c(a17), this.f435969m, intent, null, this.f435971o, this.f435964e);
        } else {
            com.tencent.mars.xlog.Log.i(f1Var.f435725d, "enterLiveB anchor");
            r45.nw1 nw1Var6 = (r45.nw1) h0Var2.f310123d;
            if (nw1Var6 != null) {
                this.f435967h.putExtra("KEY_PARAMS_SOURCE_TYPE", nw1Var6.getInteger(12));
            }
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Intent intent2 = this.f435967h;
            android.content.Context context = this.f435964e;
            long j17 = m84Var.getLong(0);
            java.lang.Long valueOf = java.lang.Long.valueOf(m84Var.getLong(1));
            java.lang.String string3 = m84Var.getString(2);
            java.lang.String str3 = string3 == null ? "" : string3;
            java.lang.String string4 = m84Var.getString(5);
            java.lang.String string5 = wk0Var.getString(0);
            java.lang.String str4 = string5 == null ? "" : string5;
            java.lang.String string6 = m84Var.getString(4);
            r45.y74 y74Var2 = (r45.y74) wk0Var.getCustom(6);
            ((com.tencent.mm.feature.finder.live.v4) w0Var).oj(intent2, context, j17, valueOf, str3, string4, str4, string6, (y74Var2 == null || (string2 = y74Var2.getString(8)) == null) ? "" : string2);
        }
        return jz5.f0.f302826a;
    }
}
