package uy2;

/* loaded from: classes5.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f431917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f431918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.widget.record.MarqueeTextView f431919f;

    public a(com.tencent.mm.plugin.finder.widget.record.MarqueeTextView marqueeTextView, int i17, int i18) {
        this.f431919f = marqueeTextView;
        this.f431917d = i17;
        this.f431918e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.finder.widget.record.MarqueeTextView marqueeTextView = this.f431919f;
        marqueeTextView.f136968d.startScroll(marqueeTextView.f136970f, 0, this.f431917d, 0, this.f431918e);
        marqueeTextView.invalidate();
        marqueeTextView.f136971g = false;
    }
}
