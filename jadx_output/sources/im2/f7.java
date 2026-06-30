package im2;

/* loaded from: classes2.dex */
public final class f7 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: m, reason: collision with root package name */
    public static long f292325m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f292326n;

    /* renamed from: o, reason: collision with root package name */
    public static boolean f292327o;

    /* renamed from: d, reason: collision with root package name */
    public dk2.x4 f292328d;

    /* renamed from: e, reason: collision with root package name */
    public int f292329e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f292330f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f292331g;

    /* renamed from: h, reason: collision with root package name */
    public int f292332h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f292333i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f292329e = -1;
        this.f292333i = new im2.e7(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r0 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.f7.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        if (this.f292330f) {
            com.tencent.mm.autogen.events.FinderLiveSquareStatusEvent finderLiveSquareStatusEvent = new com.tencent.mm.autogen.events.FinderLiveSquareStatusEvent();
            finderLiveSquareStatusEvent.f54294g.f8449a = 2L;
            finderLiveSquareStatusEvent.e();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPreDestroyed() {
        super.onPreDestroyed();
        pm0.v.C(this.f292333i);
        if (this.f292331g) {
            ((sq2.g) ((ys5.f) i95.n0.c(ys5.f.class))).Di();
        }
        if (this.f292330f) {
            com.tencent.mm.autogen.events.FinderLiveSquareStatusEvent finderLiveSquareStatusEvent = new com.tencent.mm.autogen.events.FinderLiveSquareStatusEvent();
            finderLiveSquareStatusEvent.f54294g.f8449a = 1L;
            finderLiveSquareStatusEvent.e();
        }
        com.tencent.mars.xlog.Log.i("FinderLiveWatchCountDownUIC", "onDestroy isEnableRecom: " + this.f292331g + " isFromRed: 4isFromRed");
    }
}
