package com.tencent.mm.plugin.luckymoney.f2f.ui;

/* loaded from: classes3.dex */
public class LuckyAvatarParticleView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f145064d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f145065e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f145066f;

    /* renamed from: g, reason: collision with root package name */
    public long f145067g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f145068h;

    public LuckyAvatarParticleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f145064d = new java.util.ArrayList();
        this.f145065e = new java.util.ArrayList();
        this.f145066f = new java.util.ArrayList();
        this.f145068h = new android.graphics.Paint();
    }

    public static void a(com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyAvatarParticleView luckyAvatarParticleView, int i17) {
        luckyAvatarParticleView.getClass();
        int i18 = i17 / 2;
        for (int i19 = 0; i19 < i18; i19++) {
            int random = (int) (java.lang.Math.random() * luckyAvatarParticleView.getHeight());
            int randomRectWidth = luckyAvatarParticleView.getRandomRectWidth();
            ((java.util.ArrayList) luckyAvatarParticleView.f145064d).add(new android.graphics.Rect(0, random, randomRectWidth, random + randomRectWidth));
            ((java.util.ArrayList) luckyAvatarParticleView.f145065e).add(java.lang.Integer.valueOf(luckyAvatarParticleView.getRandomVelocity()));
            int abs = (int) ((((r4 * 1.0f) * java.lang.Math.abs(random - 0)) / java.lang.Math.abs(0)) + 0.5d);
            if (abs == 0) {
                abs = 1;
            }
            ((java.util.ArrayList) luckyAvatarParticleView.f145066f).add(java.lang.Integer.valueOf(abs));
        }
        if (i18 >= i17) {
            return;
        }
        java.lang.Math.random();
        luckyAvatarParticleView.getHeight();
        luckyAvatarParticleView.getRandomRectWidth();
        throw null;
    }

    private int getRandomRectWidth() {
        return 0 + ((int) (java.lang.Math.random() * 0));
    }

    private int getRandomVelocity() {
        return 0 + ((int) (java.lang.Math.random() * 0));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int i17 = 0;
        while (true) {
            java.util.List list = this.f145064d;
            if (i17 >= ((java.util.ArrayList) list).size()) {
                return;
            }
            canvas.drawRect((android.graphics.Rect) ((java.util.ArrayList) list).get(i17), this.f145068h);
            i17++;
        }
    }

    public void setColor(int i17) {
        android.graphics.Paint paint = this.f145068h;
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    public void setDuration(long j17) {
        this.f145067g = j17;
        android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.f145067g).addUpdateListener(new ub3.a(this));
    }
}
