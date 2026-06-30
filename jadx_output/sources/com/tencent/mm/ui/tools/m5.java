package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class m5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f210568d = true;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MMGestureGallery f210569e;

    public m5(com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery) {
        this.f210569e = mMGestureGallery;
    }

    public final void a() {
        b();
        com.tencent.mm.ui.tools.j6 j6Var = this.f210569e.f210061m;
        j6Var.f210513b = 0L;
        j6Var.sendEmptyMessageDelayed(2, 500L);
    }

    public final void b() {
        this.f210569e.f210061m.removeMessages(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0507  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 1449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.m5.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
