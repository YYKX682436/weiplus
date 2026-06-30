package ub3;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ub3.j f426092g;

    public b(ub3.j jVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f426092g = jVar;
        this.f426089d = str;
        this.f426090e = str2;
        this.f426091f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ub3.j jVar = this.f426092g;
        java.util.ArrayList arrayList = (java.util.ArrayList) jVar.f426113d.f145083t;
        java.lang.String str = this.f426089d;
        if (arrayList.contains(str)) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = jVar.f426113d;
        ((java.util.ArrayList) luckyMoneyF2FQRCodeUI.f145083t).add(0, str);
        java.lang.String str2 = this.f426090e;
        if (!c01.e2.J(str2)) {
            com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
            r0Var.f70529a = str2;
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
        }
        ((java.util.HashMap) luckyMoneyF2FQRCodeUI.f145084u).put(str, str2);
        com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView = luckyMoneyF2FQRCodeUI.f145093z;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) shuffleView.f145112d;
        if (arrayList2.size() > 0) {
            if (shuffleView.f145117i.isStarted()) {
                shuffleView.f145117i.end();
            }
            if (shuffleView.f145116h.isStarted()) {
                shuffleView.f145116h.end();
            }
            android.view.View view = shuffleView.f145123r;
            if (view != null) {
                shuffleView.f145121p = view;
                arrayList2.remove(view);
                android.animation.ValueAnimator valueAnimator = shuffleView.f145114f;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                shuffleView.i(shuffleView.f145124s);
                if (shuffleView.f145127v > 0) {
                    int random = (int) (java.lang.Math.random() * shuffleView.f145127v);
                    shuffleView.f145124s = random;
                    shuffleView.f145123r = (android.view.View) arrayList2.get(random);
                } else {
                    shuffleView.f145123r = null;
                    shuffleView.f145124s = 0;
                }
            } else {
                shuffleView.j((int) (java.lang.Math.random() * shuffleView.f145127v));
                shuffleView.f145121p = shuffleView.f145123r;
                shuffleView.f145117i.addListener(new ub3.h0(shuffleView));
            }
        }
        ((java.util.ArrayList) luckyMoneyF2FQRCodeUI.A).remove(luckyMoneyF2FQRCodeUI.f145093z.getExitView());
        luckyMoneyF2FQRCodeUI.G.c(0L, 60000L);
        ((java.util.LinkedList) luckyMoneyF2FQRCodeUI.f145085v).add(new android.util.Pair(str2, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P(this.f426091f, 0))));
    }
}
