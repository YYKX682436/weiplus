package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class e0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f209301d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f209302e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f209303f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f209304g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f209305h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f209306i;

    /* renamed from: m, reason: collision with root package name */
    public int f209307m;

    /* renamed from: n, reason: collision with root package name */
    public em.j2 f209308n;

    /* renamed from: o, reason: collision with root package name */
    public int f209309o;

    /* renamed from: p, reason: collision with root package name */
    public int f209310p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f209311q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f209312r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f209313s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f209309o = -1;
        this.f209310p = -1;
        this.f209311q = getContext().getString(com.tencent.mm.R.string.iex);
        new java.util.LinkedList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0121, code lost:
    
        if (r19.f209306i != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6(wi5.n0 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.mvvm.uic.conversation.recent.e0.T6(wi5.n0, boolean):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        j75.f Q6;
        super.onActivityResult(i17, i18, intent);
        if (i18 != -1 || intent == null) {
            return;
        }
        switch (i17) {
            case 74517:
                j75.f Q62 = Q6();
                if (Q62 == null || (stringExtra = intent.getStringExtra("Select_Conv_User")) == null) {
                    return;
                }
                Q62.B3(new wi5.c0(kz5.b0.c(stringExtra), -1));
                return;
            case 74518:
                java.lang.String stringExtra2 = intent.getStringExtra("Select_Conv_User");
                java.util.List f07 = stringExtra2 != null ? r26.n0.f0(stringExtra2, new java.lang.String[]{","}, false, 0, 6, null) : null;
                boolean z17 = false;
                if (f07 != null && (!f07.isEmpty())) {
                    z17 = true;
                }
                java.util.List list = z17 ? f07 : null;
                if (list == null || (Q6 = Q6()) == null) {
                    return;
                }
                Q6.B3(new wi5.m0(list, -1));
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "non-MM process, remove YuanBao forward entry");
            getActivity().getIntent().removeExtra("KEY_IS_SUPPORT_FORWARD_TO_YUANBAO");
        }
        S6(new com.tencent.mm.ui.mvvm.uic.conversation.recent.v(this));
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_IS_ONLY_MULTI_SELECT_MODE", false);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 == null || (stateCenter = P6.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new com.tencent.mm.ui.mvvm.uic.conversation.recent.w(this, booleanExtra));
    }
}
