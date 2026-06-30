package k33;

/* loaded from: classes4.dex */
public abstract class b extends db5.d5 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f303856j = 0;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f303857b;

    /* renamed from: c, reason: collision with root package name */
    public long f303858c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f303859d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f303860e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f303861f;

    /* renamed from: g, reason: collision with root package name */
    public int f303862g;

    /* renamed from: h, reason: collision with root package name */
    public long f303863h;

    /* renamed from: i, reason: collision with root package name */
    public long f303864i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, boolean z17, long j17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f303857b = context;
        this.f303858c = j17;
        this.f303860e = new android.graphics.Rect();
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", "init: ");
        setOutsideTouchable(z17);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        r23.m mVar = (r23.m) this;
        if (mVar.f368841l == 0) {
            mVar.f368841l = com.tencent.mm.R.layout.dm7;
        }
        setContentView(from.inflate(mVar.f368841l, (android.view.ViewGroup) null));
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.gallery.view.AbsAutoDismissTipsPopup$startObserveLifecycle$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    k33.b bVar = k33.b.this;
                    bVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", "life onDestroy: ");
                    bVar.dismiss();
                    ((com.tencent.mm.ui.MMActivity) bVar.f303857b).mo133getLifecycle().c(this);
                }

                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
                public final void onResume() {
                    k33.b bVar = k33.b.this;
                    bVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", "life onResume: ");
                    bVar.b();
                }

                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_START)
                public final void onStart() {
                    k33.b.this.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", "life onStart: ");
                }

                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
                public final void onStop() {
                    k33.b bVar = k33.b.this;
                    bVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", "life onStop: ");
                    bVar.a();
                }
            });
        }
    }

    public final void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeDismissTask: ");
        java.lang.Runnable runnable = this.f303859d;
        sb6.append(runnable != null ? java.lang.Integer.valueOf(runnable.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", sb6.toString());
        if (this.f303859d != null) {
            this.f303858c -= java.lang.System.currentTimeMillis() - this.f303863h;
            android.view.View contentView = getContentView();
            if (contentView != null) {
                contentView.removeCallbacks(this.f303859d);
            }
            this.f303859d = null;
        }
    }

    public final void b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startDismissTask: ");
        java.lang.Runnable runnable = this.f303859d;
        sb6.append(runnable != null ? java.lang.Integer.valueOf(runnable.hashCode()) : null);
        sb6.append(", ");
        sb6.append(this.f303858c);
        sb6.append(", ");
        sb6.append(isShowing());
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", sb6.toString());
        if (isShowing() && this.f303859d == null && this.f303858c > 0) {
            this.f303859d = new k33.a(this);
            android.view.View contentView = getContentView();
            if (contentView != null) {
                contentView.postDelayed(this.f303859d, this.f303858c);
            }
            this.f303863h = java.lang.System.currentTimeMillis();
        }
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaasAlbumTipPopup", "dismiss: ");
        super.dismiss();
        a();
    }
}
