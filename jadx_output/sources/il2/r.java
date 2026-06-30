package il2;

/* loaded from: classes3.dex */
public final class r extends com.tencent.mm.plugin.finder.live.plugin.l implements jl2.a {

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f292082p;

    /* renamed from: q, reason: collision with root package name */
    public kl2.n f292083q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f292084r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f292085s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f292082p = new java.util.HashMap();
        this.f292084r = jz5.h.b(new il2.k(root, this));
    }

    public static final void t1(il2.r rVar, mm2.p5 data) {
        r45.f82 f82Var = ((mm2.v5) rVar.P0(mm2.v5.class)).f329486i;
        com.tencent.mars.xlog.Log.i("FinderLiveRestrictConsumePlugin", "receive consume dialog it: " + data);
        if (f82Var != null) {
            if (rVar.f292083q == null) {
                android.content.Context context = rVar.f365323d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                rVar.f292083q = new kl2.n(context, rVar);
            }
            kl2.n nVar = rVar.f292083q;
            if (nVar != null) {
                km2.j jVar = ((mm2.v5) rVar.P0(mm2.v5.class)).f329487m;
                kotlin.jvm.internal.o.g(data, "data");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showPanel data: ");
                sb6.append(data);
                sb6.append(" balanceData: ");
                sb6.append(jVar);
                sb6.append(" info: ");
                r45.ql1 ql1Var = (r45.ql1) f82Var.getCustom(2);
                sb6.append(ql1Var != null ? java.lang.Long.valueOf(ql1Var.getLong(1)) : null);
                com.tencent.mars.xlog.Log.i("RestrictConsumeDialogWidget", sb6.toString());
                nVar.f308800t = data;
                long j17 = data.f329350b;
                nVar.f308797q = j17;
                zl2.d5 a17 = zl2.j5.f473850a.a(j17, f82Var);
                nVar.f308798r = a17;
                if (a17 == zl2.d5.f473724e || a17 == zl2.d5.f473725f) {
                    java.lang.String str = data.f329352d;
                    if (str == null || str.length() == 0) {
                        com.tencent.mars.xlog.Log.e("RestrictConsumeDialogWidget", "showPanel verifyUrl is null or empty, change to normal mode, oriOoticeType: " + nVar.f308798r);
                        nVar.f308798r = zl2.d5.f473723d;
                    }
                }
                int ordinal = nVar.f308798r.ordinal();
                android.content.Context context2 = nVar.f118381d;
                if (ordinal == 0) {
                    android.widget.TextView textView = nVar.f308793m;
                    if (textView == null) {
                        kotlin.jvm.internal.o.o("contentText");
                        throw null;
                    }
                    textView.setText(context2.getString(com.tencent.mm.R.string.ebe, java.lang.Long.valueOf(j17)));
                    android.widget.TextView textView2 = nVar.f308796p;
                    if (textView2 == null) {
                        kotlin.jvm.internal.o.o("rightBtn");
                        throw null;
                    }
                    textView2.setText(context2.getString(com.tencent.mm.R.string.ebf));
                } else if (ordinal == 1) {
                    android.widget.TextView textView3 = nVar.f308793m;
                    if (textView3 == null) {
                        kotlin.jvm.internal.o.o("contentText");
                        throw null;
                    }
                    textView3.setText(context2.getString(com.tencent.mm.R.string.ebc, java.lang.Long.valueOf(j17)));
                    android.widget.TextView textView4 = nVar.f308796p;
                    if (textView4 == null) {
                        kotlin.jvm.internal.o.o("rightBtn");
                        throw null;
                    }
                    textView4.setText(context2.getString(com.tencent.mm.R.string.ebo));
                }
                il2.s.f292086a.a(zl2.e5.f473738e, j17);
                android.widget.TextView textView5 = nVar.f308794n;
                if (textView5 == null) {
                    kotlin.jvm.internal.o.o("consumeText");
                    throw null;
                }
                java.lang.String string = textView5.getContext().getResources().getString(com.tencent.mm.R.string.ebd);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = textView5.getContext().getResources().getString(com.tencent.mm.R.string.ebb);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{string}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                int L = r26.n0.L(format, string, 0, false, 6, null);
                int length = string.length() + L;
                android.text.SpannableString spannableString = new android.text.SpannableString(format);
                spannableString.setSpan(new kl2.m(nVar), L, length, 33);
                textView5.setHighlightColor(textView5.getContext().getResources().getColor(android.R.color.transparent));
                textView5.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                textView5.setText(spannableString);
                nVar.w();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r9 = r0.getValue();
     */
    @Override // qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            boolean r10 = r8.f292085s
            if (r10 == 0) goto L4a
            java.util.HashMap r10 = r8.f292082p
            monitor-enter(r10)
            java.util.Set r11 = r10.entrySet()     // Catch: java.lang.Throwable -> L47
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> L47
        Lf:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> L47
            r1 = 0
            if (r0 == 0) goto L33
            java.lang.Object r0 = r11.next()     // Catch: java.lang.Throwable -> L47
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L47
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L47
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L47
            if (r2 != r9) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            if (r2 == 0) goto Lf
            java.lang.Object r9 = r0.getValue()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r10)
            goto L35
        L33:
            monitor-exit(r10)
            r9 = r1
        L35:
            il2.a r9 = (il2.a) r9
            if (r9 == 0) goto L4a
            r3 = 0
            r4 = 0
            il2.j r5 = new il2.j
            r5.<init>(r8, r9, r1)
            r6 = 3
            r7 = 0
            r2 = r8
            com.tencent.mm.plugin.finder.live.util.y.m(r2, r3, r4, r5, r6, r7)
            goto L4a
        L47:
            r9 = move-exception
            monitor-exit(r10)
            throw r9
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il2.r.A0(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kl2.n nVar;
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        if (il2.b.f292037a[status.ordinal()] != 1 || (nVar = this.f292083q) == null) {
            return;
        }
        nVar.a();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        kl2.n nVar = this.f292083q;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // jl2.b
    public void b0(int i17, long j17, yz5.q callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new il2.d(this, i17, j17, callback, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void f1(float f17) {
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // jl2.b
    public void n(il2.a verifyData) {
        kotlin.jvm.internal.o.g(verifyData, "verifyData");
        java.util.HashMap hashMap = this.f292082p;
        int i17 = verifyData.f292033a;
        hashMap.put(java.lang.Integer.valueOf(i17 + 194735), verifyData);
        this.f292085s = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("open_custom_style_url", true);
        intent.putExtra("forceHideShare", true);
        intent.putExtra("show_native_web_view", true);
        intent.putExtra("rawUrl", verifyData.f292035c);
        intent.putExtra("screen_orientation", 1);
        j45.l.n(this.f365323d.getContext(), "webview", ".ui.tools.WebViewUI", intent, i17 + 194735);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void n1() {
        ((mm2.v5) P0(mm2.v5.class)).f329483f.observe(this, new il2.n(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public void u1(r45.ql1 quotaData, boolean z17) {
        kotlin.jvm.internal.o.g(quotaData, "quotaData");
        com.tencent.mars.xlog.Log.i("FinderLiveRestrictConsumePlugin", "updateQuotaMoneySetting amount " + quotaData.getLong(1) + " enable: " + quotaData.getInteger(0));
        com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new il2.q(quotaData, z17, null), 3, null);
    }
}
