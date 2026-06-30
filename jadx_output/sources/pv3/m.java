package pv3;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.model.i0 f358614a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f358615b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f358616c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f358617d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f358618e;

    public m(com.tencent.mm.plugin.vlog.model.i0 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        this.f358614a = scene;
        this.f358615b = "MusicPickerFinderFeedPlayManager";
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f358616c = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        this.f358618e = jz5.h.b(new pv3.h(this));
    }

    public final void a(android.view.View view) {
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/manager/MusicPickerFinderFeedPlayManager", "dismissLoading", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/manager/MusicPickerFinderFeedPlayManager", "dismissLoading", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b(in5.s0 s0Var, boolean z17) {
        android.widget.ImageView imageView = s0Var != null ? (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.uio) : null;
        android.widget.FrameLayout frameLayout = s0Var != null ? (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.uiv) : null;
        if (z17) {
            if (frameLayout != null) {
                frameLayout.setAlpha(1.0f);
            }
            if (imageView == null) {
                return;
            }
            imageView.setVisibility(8);
            return;
        }
        if (frameLayout != null) {
            frameLayout.setAlpha(0.0f);
        }
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [zy2.g5] */
    public final void c(in5.s0 s0Var) {
        java.lang.String str = this.f358615b;
        com.tencent.mars.xlog.Log.i(str, "[stopPlay]");
        b(s0Var, false);
        android.widget.FrameLayout frameLayout = s0Var != null ? (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.uiv) : null;
        android.view.KeyEvent.Callback findViewWithTag = frameLayout != null ? frameLayout.findViewWithTag("music_picker_video_view_tag") : null;
        java.lang.Object obj = findViewWithTag instanceof zy2.g5 ? (zy2.g5) findViewWithTag : 0;
        boolean z17 = obj instanceof zy2.p7;
        java.lang.Object obj2 = z17 ? (zy2.p7) obj : null;
        if (obj2 != null) {
            ((com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy) obj2).p0("errorToStop");
        }
        android.view.View view = obj instanceof android.view.View ? obj : null;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            if (frameLayout != null) {
                frameLayout.removeView(view);
            }
            if (kotlin.jvm.internal.o.b(parent, frameLayout) || parent == null) {
                pm0.v.O(str, new pv3.g(obj));
            }
        }
        zy2.p7 p7Var = z17 ? (zy2.p7) obj : null;
        if (p7Var != null) {
            ((com.tencent.mm.plugin.finder.video.FinderFluentVideoView) p7Var).q0();
        }
        a(s0Var != null ? s0Var.p(com.tencent.mm.R.id.rp8) : null);
    }
}
