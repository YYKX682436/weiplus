package lj2;

/* loaded from: classes10.dex */
public final class d implements ai2.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f318838a;

    /* renamed from: b, reason: collision with root package name */
    public final qi2.r1 f318839b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f318840c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f318841d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f318842e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f318843f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f318844g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f318845h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f318846i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f318847j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f318848k;

    /* renamed from: l, reason: collision with root package name */
    public kotlinx.coroutines.r2 f318849l;

    public d(android.view.ViewGroup root, qi2.r1 service) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(service, "service");
        this.f318838a = root;
        this.f318839b = service;
        this.f318840c = "FinderLiveBattleResultBarWidget";
        this.f318841d = "finder_live_pk_result_win.pag";
        this.f318842e = "finder_live_pk_result_win_en.pag";
        this.f318843f = "finder_live_pk_result_draw.pag";
        this.f318844g = "finder_live_pk_result_draw_en.pag";
        this.f318845h = "finder_live_pk_result_win_streak.pag";
        this.f318846i = "finder_live_pk_result_win_streak_en.pag";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.eoi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f318847j = (com.tencent.mm.view.MMPAGView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.eog);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f318848k = textView;
        textView.setTextSize(1, 28.0f);
        zl2.r4.f473950a.b3(textView);
    }

    @Override // ai2.a
    public android.view.View h() {
        return this.f318838a;
    }

    @Override // ai2.a
    public void i(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f318840c, "battleStart withAnim:" + z17);
        this.f318847j.setVisibility(8);
        this.f318848k.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0136, code lost:
    
        if (com.tencent.mm.sdk.platformtools.m2.j() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0159, code lost:
    
        r2 = r18.f318842e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0156, code lost:
    
        r2 = r18.f318841d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.tencent.mm.sdk.platformtools.m2.j() != false) goto L99;
     */
    @Override // ai2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(boolean r19, dk2.u4 r20) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lj2.d.j(boolean, dk2.u4):void");
    }

    @Override // ai2.a
    public void reset() {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f318847j;
        mMPAGView.n();
        mMPAGView.setVisibility(8);
        this.f318848k.setVisibility(8);
        this.f318838a.setVisibility(8);
        kotlinx.coroutines.r2 r2Var = this.f318849l;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f318849l = null;
    }
}
