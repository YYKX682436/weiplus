package wf2;

/* loaded from: classes10.dex */
public final class n extends if2.b implements if2.e, mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f445599m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView f445600n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f445601o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f445602p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        int size = micInfoData.f454523b.size();
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShotShareCardController", "#onMicInfoChanged size=" + size);
        this.f445601o = size > 1;
    }

    public final void Z6(boolean z17) {
        com.tencent.mm.plugin.finder.live.view.ub ubVar;
        a7();
        android.widget.RelativeLayout relativeLayout = this.f445599m;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        if (z17 && this.f445602p && (ubVar = this.f291099e) != null) {
            ubVar.onScreenClear(false);
        }
    }

    public final void a7() {
        com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView = this.f445600n;
        if (shellView != null) {
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView screenShotView = shellView.f111618d;
            if (screenShotView == null) {
                kotlin.jvm.internal.o.o("screenShotView");
                throw null;
            }
            screenShotView.a();
            android.view.ViewParent parent = shellView.getParent();
            if (parent != null && (parent instanceof android.view.ViewGroup)) {
                ((android.view.ViewGroup) parent).removeView(shellView);
            }
            this.f445600n = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|(4:(1:(9:10|11|12|13|14|15|(1:17)(1:22)|(1:19)|20)(2:37|38))(4:39|40|41|42)|31|24|(2:26|27)(1:28))(9:60|61|62|63|64|65|66|67|(1:69)(1:70))|43|44|(1:46)(1:52)|47|(1:49)(6:50|14|15|(0)(0)|(0)|20)))|86|6|(0)(0)|43|44|(0)(0)|47|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0103, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0104, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6 A[Catch: all -> 0x003a, Exception -> 0x0101, TryCatch #8 {all -> 0x003a, blocks: (B:12:0x0034, B:15:0x00d2, B:17:0x00d6, B:22:0x00dc, B:24:0x011d), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc A[Catch: all -> 0x003a, Exception -> 0x0101, TRY_LEAVE, TryCatch #8 {all -> 0x003a, blocks: (B:12:0x0034, B:15:0x00d2, B:17:0x00d6, B:22:0x00dc, B:24:0x011d), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa A[Catch: all -> 0x0051, Exception -> 0x0103, TryCatch #1 {all -> 0x0051, blocks: (B:41:0x004c, B:44:0x00a4, B:46:0x00aa, B:47:0x00ae), top: B:40:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b7(android.graphics.Bitmap r18, android.graphics.Bitmap r19, android.graphics.Bitmap r20, r45.du1 r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.n.b7(android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.Bitmap, r45.du1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // if2.e
    public boolean onBackPress() {
        android.widget.RelativeLayout relativeLayout = this.f445599m;
        if (!(relativeLayout != null && relativeLayout.getVisibility() == 0)) {
            return false;
        }
        Z6(true);
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) T6(com.tencent.mm.R.id.fkq, com.tencent.mm.R.id.fkp);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            relativeLayout.setOnClickListener(new wf2.k(this));
        } else {
            relativeLayout = null;
        }
        this.f445599m = relativeLayout;
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        Z6(false);
        this.f445599m = null;
    }
}
