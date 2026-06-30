package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes11.dex */
public class a0 extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public c01.q9 f207492m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f207493n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f207494o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f207495p;

    public a0(android.content.Context context) {
        super(context);
        this.f207492m = null;
        c01.t9.e().f37467a = new com.tencent.mm.ui.conversation.banner.r(this);
        c01.s9 s9Var = c01.t9.e().f37467a;
        if (s9Var != null) {
            ((com.tencent.mm.ui.conversation.banner.r) s9Var).a();
        }
    }

    public static void l(com.tencent.mm.ui.conversation.banner.a0 a0Var, android.content.Context context, boolean z17) {
        a0Var.getClass();
        if (context == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(context, com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
        intent.putExtra("key_upload_scene", 8);
        if (z17) {
            intent.putExtra("bind_scene", 2);
        }
        intent.putExtra("KEnterFromBanner", true);
        com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 3, 1);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 1, 1);
        }
    }

    @Override // s35.b
    public void a() {
        c01.t9.e().f37467a = null;
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.bvr;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.f207494o = view.findViewById(com.tencent.mm.R.id.aey);
        this.f207493n = view.findViewById(com.tencent.mm.R.id.f483351af3);
        this.f207495p = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j9d);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // s35.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.banner.a0.i():boolean");
    }

    @Override // s35.b
    public void k(int i17) {
        if (!this.f402844i) {
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MainFrameBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.view.View view = this.f207494o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/MainFrameBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/MainFrameBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
