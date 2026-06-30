package mx0;

/* loaded from: classes5.dex */
public final class g3 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.RelativeLayout f331990d;

    /* renamed from: e, reason: collision with root package name */
    public final mx0.z f331991e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f331992f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton f331993g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f331994h;

    /* renamed from: i, reason: collision with root package name */
    public int f331995i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f331996m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f331997n;

    /* renamed from: o, reason: collision with root package name */
    public final int f331998o;

    /* renamed from: p, reason: collision with root package name */
    public long f331999p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f332000q;

    public g3(android.widget.RelativeLayout layout, mx0.z controller, yz5.a aVar) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f331990d = layout;
        this.f331991e = controller;
        this.f331992f = aVar;
        android.view.View findViewById = layout.findViewById(com.tencent.mm.R.id.lok);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f331993g = (com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton) findViewById;
        this.f331994h = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f331995i = 9999000;
        this.f331997n = true;
        this.f331998o = 1000;
        this.f331999p = -1L;
    }

    public final void a() {
        this.f331990d.setEnabled(false);
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton = this.f331993g;
        recordButton.setTouchEnable(false);
        recordButton.setAlpha(0.7f);
    }

    public final void b(boolean z17) {
        this.f331993g.setEnableCallback(z17);
    }

    public final void c(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordButtonPlugin", "updateMaxRecordDuration >> " + i17);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f332000q;
        kotlin.jvm.internal.o.d(recordConfigProvider);
        int i18 = recordConfigProvider.f155685w + 500;
        if (i17 <= i18) {
            i18 = i17;
        }
        this.f331995i = i18;
        this.f331993g.setRecordMaxDuration(i17);
    }

    @Override // yt3.r2
    public void onAttach() {
        this.f331990d.setVisibility(0);
    }

    @Override // yt3.r2
    public void onDetach() {
        this.f331990d.setVisibility(4);
    }

    @Override // yt3.r2
    public void reset() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton = this.f331993g;
        recordButton.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "hideLoadingProgressBar");
        android.view.View view = recordButton.f69503f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/RecordButton", "hideLoadingProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/RecordButton", "hideLoadingProgressBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        recordButton.setTouchEnable(true);
        recordButton.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButton", "reset");
        recordButton.c();
        recordButton.b();
        recordButton.e();
        int visibility = recordButton.getVisibility();
        recordButton.f();
        recordButton.setVisibility(visibility);
        this.f331994h.removeCallbacksAndMessages(null);
        if (this.f331996m) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            j35.u.h(recordButton.getContext(), "android.permission.RECORD_AUDIO");
        }
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f331993g.setVisibility(i17);
        if (this.f331997n) {
            this.f331990d.bringToFront();
        }
    }
}
