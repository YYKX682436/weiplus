package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class MainUIView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f207384d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f207385e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f207386f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f207387g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f207388h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f207389i;

    public MainUIView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f207384d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.myLooper());
        this.f207385e = false;
        this.f207386f = 0L;
        this.f207387g = false;
        this.f207388h = 800L;
        this.f207389i = new com.tencent.mm.ui.conversation.k7(this);
    }

    public final void a() {
        synchronized (this) {
            boolean z17 = this.f207387g;
            this.f207387g = false;
            this.f207385e = false;
            this.f207386f = 0L;
            this.f207384d.removeCallbacks(this.f207389i);
            if (z17) {
                this.f207384d.postAtFrontOfQueue(new com.tencent.mm.ui.conversation.l7(this));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUIView", "Resume requestLayout() suspend.");
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        boolean z17 = false;
        if (this.f207385e) {
            synchronized (this) {
                if (this.f207385e) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f207386f;
                    if (currentTimeMillis > 0 && currentTimeMillis <= this.f207388h) {
                        z17 = true;
                    }
                }
            }
        }
        if (!z17) {
            super.requestLayout();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MainUIView", "Suspend a layout request.");
        synchronized (this) {
            this.f207387g = true;
        }
    }

    public MainUIView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f207384d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.myLooper());
        this.f207385e = false;
        this.f207386f = 0L;
        this.f207387g = false;
        this.f207388h = 800L;
        this.f207389i = new com.tencent.mm.ui.conversation.k7(this);
    }
}
