package ud2;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f426634a;

    /* renamed from: b, reason: collision with root package name */
    public final ud2.a f426635b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f426636c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f426637d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f426638e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f426639f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f426640g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f426641h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f426642i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.p f426643j;

    /* renamed from: k, reason: collision with root package name */
    public final yz5.l f426644k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.liteapp.ShowWindowPreviewManagerForLiteApp$lifeObserver$1 f426645l;

    /* JADX WARN: Type inference failed for: r8v12, types: [com.tencent.mm.plugin.finder.liteapp.ShowWindowPreviewManagerForLiteApp$lifeObserver$1] */
    public o(android.view.View parentView, ud2.a previewView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        kotlin.jvm.internal.o.g(previewView, "previewView");
        this.f426634a = parentView;
        this.f426635b = previewView;
        this.f426636c = "ShowWindowPreviewController";
        android.view.View findViewById = previewView.getView().findViewById(com.tencent.mm.R.id.cl6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f426638e = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = previewView.getView().findViewById(com.tencent.mm.R.id.icq);
        ((com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) findViewById2).setTag("nearby-live-preview-view-tag");
        kotlin.jvm.internal.o.f(findViewById2, "apply(...)");
        this.f426639f = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) findViewById2;
        androidx.lifecycle.y d17 = d(previewView.getView());
        this.f426640g = new com.tencent.mm.sdk.coroutines.LifecycleScope("ShowWindowPreviewController", d17 instanceof androidx.lifecycle.y ? d17 : null, 0, 4, null);
        this.f426641h = new ud2.m(this);
        this.f426642i = new ud2.k(this);
        this.f426643j = new ud2.l(this);
        this.f426644k = new ud2.j(this);
        this.f426645l = new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.liteapp.ShowWindowPreviewManagerForLiteApp$lifeObserver$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_STOP)
            public final void onStop() {
                com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = ud2.o.this.f426639f;
                if (nearbyLivePreviewView.isPlaying()) {
                    nearbyLivePreviewView.pause();
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ud2.o r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ud2.o.a(ud2.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(ud2.o oVar) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = oVar.f426637d;
        if (finderItem == null) {
            com.tencent.mars.xlog.Log.e(oVar.f426636c, "FinderObject is null, can not play");
            return;
        }
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.X(finderItem.getLiveMediaList());
        java.lang.String string = mb4Var.getString(16);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = mb4Var.getString(20);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String concat = string.concat(string2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.getString(1));
            java.lang.String string3 = mb4Var.getString(19);
            sb6.append(string3 != null ? string3 : "");
            concat = sb6.toString();
        }
        java.lang.String str = concat;
        r45.nw1 liveInfo = finderItem.getLiveInfo();
        if (liveInfo != null && liveInfo.getInteger(2) == 1) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), oVar.f426638e, g1Var.h(mn2.f1.f329953d));
        } else {
            i95.m c17 = i95.n0.c(c61.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.zb.g7((c61.zb) c17, oVar.f426638e, str, 0, 4, null);
        }
    }

    public static final void c(ud2.o oVar) {
        r45.nw1 liveInfo;
        java.lang.String string;
        androidx.lifecycle.o mo133getLifecycle;
        androidx.lifecycle.n b17;
        androidx.lifecycle.y d17 = oVar.d(oVar.f426635b.getView());
        boolean a17 = (d17 == null || (mo133getLifecycle = d17.mo133getLifecycle()) == null || (b17 = mo133getLifecycle.b()) == null) ? false : b17.a(androidx.lifecycle.n.RESUMED);
        java.lang.String str = oVar.f426636c;
        if (!a17) {
            com.tencent.mars.xlog.Log.e(str, "try start play when inactive!");
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = oVar.f426637d;
        if (finderItem == null || (liveInfo = finderItem.getFeedObject().getLiveInfo()) == null || (string = liveInfo.getString(3)) == null) {
            return;
        }
        if (string.length() == 0) {
            com.tencent.mars.xlog.Log.e(str, "liveUrl is empty");
            return;
        }
        gp2.a aVar = new gp2.a(string, new so2.h1(finderItem), false);
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = oVar.f426639f;
        nearbyLivePreviewView.setMediaSource(aVar);
        nearbyLivePreviewView.setMute(true);
        ws5.f.j(oVar.f426639f, oVar.f426641h, oVar.f426642i, oVar.f426643j, oVar.f426644k, null, null, 48, null);
    }

    public final androidx.lifecycle.y d(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (!(view.getContext() instanceof androidx.lifecycle.y)) {
            android.view.ViewParent parent = view.getParent();
            return d(parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null);
        }
        java.lang.Object context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        return (androidx.lifecycle.y) context;
    }

    public final void e(java.lang.String str, java.util.HashMap hashMap) {
        com.tencent.mars.xlog.Log.i(this.f426636c, "notify event " + str + ", params = " + hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        hashMap.put("event", str);
        hashMap2.put("event", "playEvent");
        hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, hashMap);
        io.flutter.plugin.common.MethodChannel methodChannel = this.f426635b.f426577e;
        if (methodChannel != null) {
            methodChannel.invokeMethod("platformViewEvent", hashMap2);
        }
    }
}
