package mc4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final mc4.c f325645a = new mc4.c();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.plugin.sns.storage.SnsInfo f325646b;

    /* renamed from: c, reason: collision with root package name */
    public static mc4.e f325647c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f325648d;

    public static final void a(mc4.c cVar, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$postAgainBySecurityPass", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postAgainBySecurityPass", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveSnsSecurityPassFooterHelper", "postAgainBySecurityPass >> " + str);
        com.tencent.mm.autogen.events.SnsRepostEvent snsRepostEvent = new com.tencent.mm.autogen.events.SnsRepostEvent();
        snsRepostEvent.f54837g.f8038a = str;
        snsRepostEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postAgainBySecurityPass", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$postAgainBySecurityPass", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [android.view.View] */
    public final android.view.View b(android.content.Context context, java.lang.String localId, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealSpanText", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(localId, "localId");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveSnsSecurityPassFooterHelper", "dealSpanText >> " + context + ' ' + localId);
        android.view.ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            viewGroup2 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dwz, (android.view.ViewGroup) null);
        }
        android.view.View findViewById = viewGroup2.findViewById(com.tencent.mm.R.id.s6x);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        textView.setText("");
        textView.append(i65.a.r(context, com.tencent.mm.R.string.n2c));
        java.lang.String r17 = i65.a.r(context, com.tencent.mm.R.string.n2a);
        android.text.SpannableString spannableString = new android.text.SpannableString(r17);
        spannableString.setSpan(((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Di("", i65.a.d(context, com.tencent.mm.R.color.f479308vo), i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_2), false, new mc4.a(localId, viewGroup2)), 0, r17.length(), 17);
        textView.append(spannableString);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealSpanText", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        return viewGroup2;
    }

    public final void c(android.content.Context context, mc4.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showRetryPostAlert", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showRetryPostAlert ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = f325646b;
        sb6.append(snsInfo != null ? snsInfo.getLocalid() : null);
        sb6.append(' ');
        sb6.append(f325648d);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveSnsSecurityPassFooterHelper", sb6.toString());
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = f325646b;
        if (f325648d && snsInfo2 != null) {
            db5.e1.B(context, i65.a.r(context, com.tencent.mm.R.string.n2b), "", i65.a.r(context, com.tencent.mm.R.string.n2a), i65.a.r(context, com.tencent.mm.R.string.f490347sg), new mc4.b(snsInfo2, dVar), null, com.tencent.mm.R.color.f478734fp);
        }
        f325646b = null;
        f325648d = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showRetryPostAlert", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
    }
}
