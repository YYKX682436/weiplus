package wa2;

@j95.b
/* loaded from: classes3.dex */
public final class u extends i95.w implements xa2.e {

    /* renamed from: d, reason: collision with root package name */
    public static final wa2.u f444181d = new wa2.u();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f444182e = new java.util.concurrent.ConcurrentHashMap();

    static {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) context).registerActivityLifecycleCallbacks(new wa2.a(wa2.b.f444104d));
    }

    public static /* synthetic */ yz5.p Ui(wa2.u uVar, androidx.recyclerview.widget.RecyclerView recyclerView, long j17, java.util.List list, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            lVar = wa2.n.f444151d;
        }
        return uVar.Ri(recyclerView, j17, list, lVar);
    }

    public final com.google.android.material.appbar.AppBarLayout Ai(android.view.ViewGroup vg6) {
        kotlin.jvm.internal.o.g(vg6, "vg");
        int childCount = vg6.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = vg6.getChildAt(i17);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            if ((childAt instanceof android.view.ViewGroup) && !(childAt instanceof com.google.android.material.appbar.AppBarLayout)) {
                com.google.android.material.appbar.AppBarLayout Ai = f444181d.Ai((android.view.ViewGroup) childAt);
                if (Ai != null) {
                    return Ai;
                }
            } else if (childAt instanceof com.google.android.material.appbar.AppBarLayout) {
                return (com.google.android.material.appbar.AppBarLayout) childAt;
            }
        }
        return null;
    }

    public final long Bi(android.view.ViewGroup viewGroup) {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView Di = Di(viewGroup);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = Di != null ? Di.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        int w17 = linearLayoutManager != null ? linearLayoutManager.w() : -1;
        if (w17 < 0 || Di == null || (adapter = Di.getAdapter()) == null) {
            return -1L;
        }
        return adapter.getItemId(w17);
    }

    public final androidx.recyclerview.widget.RecyclerView Di(android.view.ViewGroup vg6) {
        kotlin.jvm.internal.o.g(vg6, "vg");
        int childCount = vg6.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = vg6.getChildAt(i17);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            if ((childAt instanceof android.view.ViewGroup) && !(childAt instanceof androidx.recyclerview.widget.RecyclerView)) {
                androidx.recyclerview.widget.RecyclerView Di = f444181d.Di((android.view.ViewGroup) childAt);
                if (Di != null) {
                    return Di;
                }
            } else if (childAt instanceof androidx.recyclerview.widget.RecyclerView) {
                return (androidx.recyclerview.widget.RecyclerView) childAt;
            }
        }
        return null;
    }

    public final void Ni(android.view.View view, android.content.Intent intent) {
        int intExtra = intent.getIntExtra("key_intent_content_view_height", 0);
        if (intExtra > 0) {
            int height = intExtra - view.getHeight();
            android.graphics.Rect rect = (android.graphics.Rect) intent.getParcelableExtra("key_intent_source_rect");
            if (rect == null) {
                rect = new android.graphics.Rect();
            }
            rect.offset(0, -height);
            com.tencent.mars.xlog.Log.i("ActivityToggleAnimator", "[fixAnimSourceRectRect] offset=" + height + " sourceHeight=" + intExtra + " currentHeight=" + view.getHeight() + " rect=" + rect);
            intent.putExtra("key_intent_source_rect", rect);
        }
    }

    public final yz5.p Ri(androidx.recyclerview.widget.RecyclerView recyclerView, long j17, java.util.List dataList, yz5.l callback) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(callback, "callback");
        return new wa2.t(callback, dataList, recyclerView, j17);
    }

    public final android.graphics.Rect Vi(android.content.Intent intent) {
        android.graphics.Rect rect = (android.graphics.Rect) intent.getParcelableExtra("key_intent_source_rect");
        return rect == null ? new android.graphics.Rect() : rect;
    }

    public final float Zi(android.graphics.Rect rect, android.graphics.Rect rect2, boolean z17) {
        float width = (rect2.width() * 1.0f) / rect.width();
        float height = (rect2.height() * 1.0f) / rect.height();
        if (z17) {
            if (width >= height) {
                return width;
            }
        } else if (width <= height) {
            return width;
        }
        return height;
    }

    public final android.view.View aj(android.content.Intent intent) {
        java.lang.ref.WeakReference weakReference;
        wa2.p0 p0Var = (wa2.p0) f444182e.get(intent.getStringExtra("key_anim_intent_id"));
        if (p0Var == null || (weakReference = p0Var.f444168b) == null) {
            return null;
        }
        return (android.view.View) weakReference.get();
    }

    public final float[] bj(android.graphics.Rect rect, android.graphics.Rect rect2) {
        return new float[]{rect2.exactCenterX() - rect.exactCenterX(), rect2.exactCenterY() - rect.exactCenterY()};
    }

    public final wa2.n0 cj(android.content.Context context, android.content.Intent intent, android.view.ViewGroup viewGroup) {
        android.view.View childAt = viewGroup.getChildAt(0);
        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View view = (android.view.ViewGroup) childAt;
        android.content.Context context2 = view.getContext();
        com.tencent.mars.xlog.Log.i("ActivityToggleAnimator", "insertGestureLayout: rawView=" + view.getClass().getSimpleName() + ", rawView.context=" + context2.getClass().getSimpleName() + ", rawViewContext is AppCompatActivity=" + (context2 instanceof androidx.appcompat.app.AppCompatActivity));
        view.setTag(java.lang.Integer.valueOf(com.tencent.mm.R.id.rl8));
        wa2.n0 n0Var = new wa2.n0(context);
        viewGroup.removeView(view);
        n0Var.setContentView(view);
        n0Var.setSourceView(aj(intent));
        n0Var.addView(view);
        viewGroup.addView(n0Var, new android.widget.FrameLayout.LayoutParams(-1, -1));
        return n0Var;
    }

    public void fj(android.content.Intent intent, android.view.View view, long j17) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(view, "view");
        wa2.x.e(intent, view, j17, false, false, null, 28, null);
        intent.putExtra("key_intent_enable_enter_anim", false);
        intent.removeExtra("key_intent_animating_flag");
    }

    public void hj(android.content.Intent intent, android.view.View view, long j17) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(view, "view");
        wa2.x.e(intent, view, j17, false, false, null, 28, null);
    }

    public final android.view.View wi(android.content.Context context, android.content.Intent intent) {
        android.graphics.drawable.Drawable colorDrawable;
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setTag("key_anim_source_tag");
        java.io.Serializable serializableExtra = intent.getSerializableExtra("key_intent_source_scale_type");
        kotlin.jvm.internal.o.e(serializableExtra, "null cannot be cast to non-null type android.widget.ImageView.ScaleType");
        imageView.setScaleType((android.widget.ImageView.ScaleType) serializableExtra);
        wa2.u uVar = f444181d;
        uVar.getClass();
        wa2.p0 p0Var = (wa2.p0) f444182e.get(intent.getStringExtra("key_anim_intent_id"));
        if (p0Var == null || (colorDrawable = p0Var.f444167a) == null) {
            colorDrawable = new android.graphics.drawable.ColorDrawable(-1);
        }
        imageView.setImageDrawable(colorDrawable);
        android.graphics.Rect Vi = uVar.Vi(intent);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(Vi.width(), Vi.height());
        layoutParams.topMargin = Vi.top;
        layoutParams.leftMargin = Vi.left;
        imageView.setLayoutParams(layoutParams);
        imageView.setAlpha(0.0f);
        return imageView;
    }
}
