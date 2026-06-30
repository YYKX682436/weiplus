package df2;

/* loaded from: classes3.dex */
public final class m00 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230740m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f230741n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f230742o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230740m = "ShopVIPController";
        this.f230741n = kz5.p0.f313996d;
        this.f230742o = ae2.in.f3688a.a(ym5.f6.H1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(df2.m00 r9, int r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.m00.Z6(df2.m00, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(df2.m00 r11, int r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.m00.a7(df2.m00, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b7(df2.m00 m00Var) {
        android.view.ViewGroup targetLayout;
        android.widget.ImageView imageView;
        com.tencent.mm.view.MMPAGView c76 = m00Var.c7();
        android.graphics.Bitmap bitmap = c76 != null ? c76.getBitmap() : null;
        android.widget.ImageView imageView2 = (android.widget.ImageView) m00Var.findViewById(com.tencent.mm.R.id.odl);
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmap);
        }
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout d76 = m00Var.d7();
        if (d76 == null || (targetLayout = d76.getTargetLayout()) == null || (imageView = (android.widget.ImageView) targetLayout.findViewById(com.tencent.mm.R.id.odl)) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public final com.tencent.mm.view.MMPAGView c7() {
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.f483053vc);
        if (mMPAGView == null) {
            return null;
        }
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(ae2.in.f3688a.a(ym5.f6.G1));
        return mMPAGView;
    }

    public final com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout d7() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) S6(com.tencent.mm.R.id.g2w);
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        if (parent instanceof com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) {
            return (com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout) parent;
        }
        return null;
    }

    public final android.view.View findViewById(int i17) {
        android.view.View d76 = d7();
        if (d76 == null) {
            d76 = (android.view.ViewGroup) S6(com.tencent.mm.R.id.g2w);
        }
        if (d76 != null) {
            return d76.findViewById(i17);
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout d76 = d7();
        if (d76 != null) {
            d76.setSceneStateListener(new df2.g00(this));
        }
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout d77 = d7();
        if (d77 != null) {
            d77.b();
        }
        if ((pluginLayout instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) pluginLayout : null) != null) {
            pm0.v.y(((mm2.f6) business(mm2.f6.class)).f329042p1, (androidx.lifecycle.y) pluginLayout, new df2.k00(this));
            return;
        }
        com.tencent.mars.xlog.Log.e(this.f230740m, pluginLayout + " is not owner");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f230741n = kz5.p0.f313996d;
        com.tencent.mm.view.MMPAGView c76 = c7();
        if (c76 != null) {
            c76.n();
        }
    }
}
