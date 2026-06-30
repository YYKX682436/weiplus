package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class m implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f145890d;

    /* renamed from: e, reason: collision with root package name */
    public float f145891e;

    /* renamed from: f, reason: collision with root package name */
    public long f145892f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f145893g = false;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.w f145894h;

    public m(com.tencent.mm.plugin.luckymoney.story.w wVar) {
        this.f145894h = wVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        com.tencent.mm.plugin.luckymoney.story.w wVar = this.f145894h;
        if (actionMasked == 0) {
            com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = wVar.f145923d;
            int i17 = com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout.f145773f2;
            envelopeAppBarLayout.g();
        }
        if (wVar.f145923d.N1) {
            if (motionEvent.getActionMasked() == 0) {
                android.graphics.Rect rect = new android.graphics.Rect();
                wVar.f145923d.K.getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    this.f145890d = motionEvent.getRawX();
                    this.f145891e = motionEvent.getRawY();
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    this.f145892f = android.os.SystemClock.elapsedRealtime();
                    this.f145893g = true;
                } else {
                    this.f145893g = false;
                }
            } else if (motionEvent.getActionMasked() == 1 && this.f145893g) {
                long j17 = this.f145892f;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (android.os.SystemClock.elapsedRealtime() - j17 < 500) {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    wVar.f145923d.K.getGlobalVisibleRect(rect2);
                    int rawX = (int) motionEvent.getRawX();
                    int rawY = (int) motionEvent.getRawY();
                    if (java.lang.Math.abs(rawX - this.f145890d) <= 20.0f && java.lang.Math.abs(rawY - this.f145891e) <= 20.0f && rect2.contains(rawX, rawY)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "click collapse view");
                        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout2 = wVar.f145923d;
                        envelopeAppBarLayout2.V1 = true;
                        envelopeAppBarLayout2.postDelayed(new com.tencent.mm.plugin.luckymoney.story.l(this), 30L);
                    }
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
