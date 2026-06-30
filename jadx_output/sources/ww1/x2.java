package ww1;

/* loaded from: classes15.dex */
public class x2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f450342a;

    /* renamed from: b, reason: collision with root package name */
    public final int f450343b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f450344c;

    /* renamed from: d, reason: collision with root package name */
    public ww1.a3 f450345d;

    /* renamed from: e, reason: collision with root package name */
    public final ww1.b3 f450346e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f450347f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI f450348g;

    /* renamed from: h, reason: collision with root package name */
    public final int f450349h;

    /* renamed from: i, reason: collision with root package name */
    public final int f450350i;

    /* renamed from: j, reason: collision with root package name */
    public final int f450351j;

    /* renamed from: k, reason: collision with root package name */
    public final int f450352k;

    /* renamed from: l, reason: collision with root package name */
    public final int f450353l;

    public x2(int i17, android.content.Context context, ww1.a3 a3Var, ww1.b3 b3Var, com.tencent.mm.plugin.collect.ui.WalletCollectQrCodeUI walletCollectQrCodeUI) {
        this.f450343b = i17;
        this.f450344c = context;
        this.f450345d = a3Var;
        this.f450346e = b3Var;
        this.f450348g = walletCollectQrCodeUI;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f450349h = ((displayMetrics.widthPixels / 2) - i65.a.b(context, 8)) - i65.a.b(context, 16);
        this.f450351j = i65.a.b(context, 52);
        this.f450352k = i65.a.b(context, 35);
        this.f450353l = i65.a.b(context, 60);
        this.f450350i = i65.a.b(context, 64);
    }

    public void a(int i17) {
        int i18 = this.f450343b;
        int i19 = i17 == 0 ? i18 : i17;
        boolean z17 = this.f450342a;
        java.util.LinkedList linkedList = this.f450347f;
        if (z17) {
            linkedList.size();
            return;
        }
        if (linkedList.isEmpty()) {
            return;
        }
        ww1.b0 b0Var = (ww1.b0) linkedList.poll();
        if (i19 == 0) {
            i19 = i18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ToastAnimationHelper", "[doAnimation]，needRefreshType：%s", java.lang.Integer.valueOf(i19));
        this.f450342a = true;
        ww1.b3 b3Var = this.f450346e;
        android.widget.TextView textView = b3Var.f450134g0;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = b0Var.f450202n;
        float textSize = b3Var.f450134g0.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(this.f450344c, str, textSize));
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) b3Var.f450122a0.getLayoutParams();
        if (b3Var.f450123b.getVisibility() == 0) {
            b3Var.f450124b0.setVisibility(0);
            layoutParams.height = b3Var.f450139k.getHeight() + b3Var.f450123b.getHeight();
        } else {
            b3Var.f450124b0.setVisibility(8);
            layoutParams.height = b3Var.f450139k.getHeight();
        }
        layoutParams.width = b3Var.f450139k.getWidth();
        b3Var.f450122a0.setLayoutParams(layoutParams);
        if (i18 == 2) {
            b3Var.f450132f0.setRoundCorner(true);
            b3Var.f450132f0.setRoundCornerRate(0.1f);
            b3Var.f450132f0.b(b0Var.f450206r, 0, 0, com.tencent.mm.R.drawable.bhm);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(b3Var.f450132f0, b0Var.f450195d, null);
        }
        b3Var.f450136h0.setText(com.tencent.mm.wallet_core.ui.r1.n(b0Var.f450197f, b0Var.f450198g));
        b3Var.f450122a0.setVisibility(0);
        b3Var.f450128d0.setRotation(270.0f);
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
        animationSet.addAnimation(new android.view.animation.ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f));
        int i27 = 0;
        for (int i28 = 0; i28 < ((java.util.LinkedList) this.f450345d.f450113w).size(); i28++) {
            if (((ww1.b0) ((java.util.LinkedList) this.f450345d.f450113w).get(i28)).f450196e.equals(b0Var.f450196e)) {
                i27 = i28;
            }
        }
        animationSet.addAnimation(new android.view.animation.TranslateAnimation(0.0f, this.f450349h, 0.0f, (b3Var.f450123b.getVisibility() == 0 ? (b3Var.f450139k.getHeight() + this.f450350i) / 2 : b3Var.f450139k.getHeight() / 2) + 0 + this.f450353l + (i27 * this.f450351j) + this.f450352k));
        animationSet.setDuration(300L);
        animationSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animationSet.setAnimationListener(new ww1.v2(this, b0Var, i19));
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        scaleAnimation.setAnimationListener(new ww1.w2(this, animationSet));
        b3Var.f450122a0.startAnimation(scaleAnimation);
    }
}
