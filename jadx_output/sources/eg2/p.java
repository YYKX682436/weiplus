package eg2;

/* loaded from: classes3.dex */
public final class p extends eg2.c0 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f252606g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f252607h;

    /* renamed from: i, reason: collision with root package name */
    public int f252608i;

    /* renamed from: m, reason: collision with root package name */
    public eg2.b1 f252609m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f252610n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f252611o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f252612p;

    /* renamed from: q, reason: collision with root package name */
    public long f252613q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ju3.d0 status, android.view.ViewGroup parent, qc0.a editContext) {
        super(status, parent, editContext);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(editContext, "editContext");
        this.f252608i = 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r1.a() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r3 = this;
            eg2.b1 r0 = r3.f252609m
            if (r0 == 0) goto L1d
            kotlinx.coroutines.r2 r1 = r0.f252578c
            if (r1 == 0) goto L10
            boolean r1 = r1.a()
            r2 = 1
            if (r1 != r2) goto L10
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L1d
            r0.a()
            java.lang.String r0 = "MicroMsg.FinderCoverHDTaskPlugin"
            java.lang.String r1 = "cancelled running HD task"
            com.tencent.mars.xlog.Log.i(r0, r1)
        L1d:
            r0 = 0
            r3.f252609m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eg2.p.a():void");
    }

    @Override // yt3.r2
    public void onAttach() {
        android.view.ViewGroup viewGroup = this.f252545e;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f252607h = xy2.c.e(context);
        qc0.a aVar = this.f252546f;
        android.os.Bundle bundle = aVar.f361348c.M;
        this.f252606g = bundle != null ? bundle.getString("original_image_path") : null;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = aVar.f361348c;
        android.os.Bundle bundle2 = recordConfigProvider.M;
        this.f252612p = bundle2 != null ? bundle2.getString("original_cdn_url") : null;
        android.os.Bundle bundle3 = recordConfigProvider.M;
        boolean z17 = true;
        this.f252608i = bundle3 != null ? bundle3.getInt("hd_scene", 1) : 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "onAttach, coverUrl=" + this.f252606g + ", existingCdnUrl=" + this.f252612p + ", scene=" + this.f252608i);
        android.os.Bundle bundle4 = recordConfigProvider.M;
        if (!(bundle4 != null ? bundle4.getBoolean("enable_cover_enhance", false) : false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "cover enhance disabled by switch, skip HD task");
            return;
        }
        java.lang.String str = this.f252606g;
        java.lang.String str2 = this.f252607h;
        if (!(str == null || str.length() == 0)) {
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                a();
                ju3.d0 d0Var = this.f252544d;
                kotlinx.coroutines.y0 y0Var = d0Var instanceof kotlinx.coroutines.y0 ? (kotlinx.coroutines.y0) d0Var : null;
                if (y0Var == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FinderCoverHDTaskPlugin", "status is not CoroutineScope, skip HD task");
                    return;
                }
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                eg2.b1 b1Var = new eg2.b1(y0Var, str2, str, context2, this.f252608i, this.f252612p, new eg2.o(this));
                if (b1Var.f252577b.get()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FinderLiveHDTaskProcessor", "start: already cancelled, skip");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveHDTaskProcessor", "start: finderUsername=" + b1Var.f252538f + ", localImagePath=" + b1Var.f252539g + ", scene=" + b1Var.f252541i);
                    eg2.o oVar = (eg2.o) b1Var.f252543k;
                    oVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "HD task started");
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    eg2.p pVar = oVar.f252604a;
                    pVar.f252613q = currentTimeMillis;
                    com.tencent.mm.ui.widget.dialog.u3 f17 = com.tencent.mm.ui.widget.dialog.u3.f(pVar.f252545e.getContext(), null, false, 3, null);
                    pVar.f252610n = f17;
                    android.widget.TextView textView = f17.f212004d;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    b1Var.f252578c = kotlinx.coroutines.l.d(b1Var.f252537e, null, null, new eg2.a1(b1Var, null), 3, null);
                }
                this.f252609m = b1Var;
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "no coverUrl or finderUsername, skip HD task");
    }

    @Override // yt3.r2
    public void onDetach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDTaskPlugin", "onDetach");
        a();
    }

    @Override // yt3.r2
    public void release() {
        a();
    }
}
