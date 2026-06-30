package wi2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f446156a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f446157b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f446158c;

    /* renamed from: d, reason: collision with root package name */
    public vi2.b f446159d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f446160e;

    /* renamed from: f, reason: collision with root package name */
    public vi2.b f446161f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f446162g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f446163h;

    /* renamed from: i, reason: collision with root package name */
    public final wi2.a f446164i;

    public c(android.content.Context context, androidx.recyclerview.widget.RecyclerView recyclerView, java.util.ArrayList dataList) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f446156a = recyclerView;
        this.f446157b = dataList;
        this.f446158c = new com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView(context);
        this.f446160e = new com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView(context);
        this.f446162g = true;
        this.f446164i = new wi2.a(this);
    }

    public static final void a(wi2.c cVar) {
        in5.c cVar2;
        int i17;
        in5.c cVar3;
        int i18;
        if (!cVar.f446162g || !cVar.f446163h) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "skip checkAutoPlay: shouldAutoPlay:" + cVar.f446162g + ", isBind:" + cVar.f446163h);
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "stopAllPreviewView");
            cVar.e(cVar.f446158c, true);
            cVar.e(cVar.f446160e, true);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "checkAutoPlay start");
        androidx.recyclerview.widget.RecyclerView recyclerView = cVar.f446156a;
        int height = recyclerView.getHeight() / 2;
        int width = recyclerView.getWidth() / 4;
        int width2 = (recyclerView.getWidth() / 4) * 3;
        float f17 = height;
        android.view.View k07 = recyclerView.k0(width, f17);
        java.lang.Integer valueOf = k07 != null ? java.lang.Integer.valueOf(recyclerView.u0(k07)) : null;
        java.util.ArrayList arrayList = cVar.f446157b;
        if (valueOf != null && (valueOf.intValue() < 0 || valueOf.intValue() >= arrayList.size())) {
            com.tencent.mars.xlog.Log.w("FinderLiveMicAnchorAutoPlayManager", "Checking play left position: " + valueOf + " in " + arrayList.size() + " items");
            return;
        }
        if (valueOf != null) {
            valueOf.intValue();
            cVar2 = (in5.c) arrayList.get(valueOf.intValue());
        } else {
            cVar2 = null;
        }
        vi2.b bVar = cVar2 instanceof vi2.b ? (vi2.b) cVar2 : null;
        if (!(k07 == null)) {
            if (!(valueOf == null)) {
                if (!(bVar == null) && ((i17 = bVar.f437535e) == 6 || i17 == 9)) {
                    vi2.b bVar2 = cVar.f446161f;
                    if (kotlin.jvm.internal.o.b(bVar.f437544d, bVar2 != null ? bVar2.f437544d : null)) {
                        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "swapping left and right views due to curConvertDataLeft.finderLiveContact == curPlayConvertDataRight?.finderLiveContact");
                        vi2.b bVar3 = cVar.f446161f;
                        cVar.f446161f = cVar.f446159d;
                        cVar.f446159d = bVar3;
                        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = cVar.f446160e;
                        cVar.f446160e = cVar.f446158c;
                        cVar.f446158c = nearbyLivePreviewView;
                    }
                    android.view.View k08 = recyclerView.k0(width2, f17);
                    java.lang.Integer valueOf2 = k08 != null ? java.lang.Integer.valueOf(recyclerView.u0(k08)) : null;
                    if (valueOf2 != null && (valueOf2.intValue() < 0 || valueOf2.intValue() >= arrayList.size())) {
                        com.tencent.mars.xlog.Log.w("FinderLiveMicAnchorAutoPlayManager", "Checking play right position: " + valueOf2 + " in " + arrayList.size() + " items");
                        return;
                    }
                    if (valueOf2 != null) {
                        valueOf2.intValue();
                        cVar3 = (in5.c) arrayList.get(valueOf2.intValue());
                    } else {
                        cVar3 = null;
                    }
                    vi2.b bVar4 = cVar3 instanceof vi2.b ? (vi2.b) cVar3 : null;
                    if (!(k08 == null)) {
                        if (!(valueOf2 == null)) {
                            if (!(bVar4 == null) && ((i18 = bVar4.f437535e) == 6 || i18 == 9)) {
                                vi2.b bVar5 = cVar.f446159d;
                                if (kotlin.jvm.internal.o.b(bVar4.f437544d, bVar5 != null ? bVar5.f437544d : null)) {
                                    com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "swapping left and right views due to curConvertDataRight.finderLiveContact == curPlayConvertDataLeft?.finderLiveContact");
                                    vi2.b bVar6 = cVar.f446161f;
                                    cVar.f446161f = cVar.f446159d;
                                    cVar.f446159d = bVar6;
                                    com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView2 = cVar.f446160e;
                                    cVar.f446160e = cVar.f446158c;
                                    cVar.f446158c = nearbyLivePreviewView2;
                                }
                                com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "starting play for both left and right views");
                                cVar.d(k07, cVar.f446158c, bVar, true);
                                cVar.d(k08, cVar.f446160e, bVar4, false);
                                return;
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "stop right  data:" + bVar4 + ' ');
                    cVar.e(cVar.f446160e, true);
                    cVar.d(k07, cVar.f446158c, bVar, true);
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "both stop data:" + bVar + " return for view:" + k07);
        cVar.e(cVar.f446158c, true);
        cVar.e(cVar.f446160e, true);
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "bind manager，isBind:" + this.f446163h);
        if (this.f446163h) {
            return;
        }
        this.f446156a.i(this.f446164i);
        this.f446163h = true;
    }

    public final void c(boolean z17) {
        if (this.f446162g != z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "Auto play state changed from " + this.f446162g + " to " + z17);
        }
        this.f446162g = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r14, com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView r15, vi2.b r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi2.c.d(android.view.View, com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView, vi2.b, boolean):void");
    }

    public final void e(com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView, boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "stopPlayWithPreviewView for view:" + nearbyLivePreviewView + ", removeFromParent:" + z17);
        nearbyLivePreviewView.stop();
        nearbyLivePreviewView.release();
        nearbyLivePreviewView.f121529m = null;
        if (z17) {
            android.view.ViewParent parent = nearbyLivePreviewView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(nearbyLivePreviewView);
            }
        }
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "unBind manager，isBind:" + this.f446163h);
        if (this.f446163h) {
            this.f446156a.V0(this.f446164i);
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorAutoPlayManager", "stopAllPreviewView");
            e(this.f446158c, true);
            e(this.f446160e, true);
            this.f446163h = false;
        }
    }
}
