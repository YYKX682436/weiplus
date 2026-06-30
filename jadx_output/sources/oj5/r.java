package oj5;

/* loaded from: classes14.dex */
public final class r extends androidx.recyclerview.widget.i3 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f345877h = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f345878a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f345879b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f345880c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f345881d;

    /* renamed from: e, reason: collision with root package name */
    public final oj5.q f345882e;

    /* renamed from: f, reason: collision with root package name */
    public final oj5.b0 f345883f;

    /* renamed from: g, reason: collision with root package name */
    public final oj5.p f345884g;

    public r(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, boolean z17, oj5.b0 viewPool, com.tencent.mm.sdk.platformtools.n3 asyncHandler) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewPool, "viewPool");
        kotlin.jvm.internal.o.g(asyncHandler, "asyncHandler");
        this.f345878a = recyclerView;
        this.f345879b = "DynamicViewCacheEx@" + hashCode();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        this.f345880c = false;
        int[] iArr = new int[3];
        for (int i19 = 0; i19 < 3; i19++) {
            iArr[i19] = 0;
        }
        this.f345881d = iArr;
        oj5.q qVar = new oj5.q(this);
        this.f345882e = qVar;
        this.f345883f = viewPool;
        oj5.o oVar = new oj5.o(this.f345879b, i17, i18, qVar, z17, asyncHandler, iArr);
        this.f345884g = new oj5.p(this);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f345878a;
        kotlin.jvm.internal.o.g(recyclerView2, "recyclerView");
        oVar.f345869h = recyclerView2;
        recyclerView2.i(oVar.f345872k);
        oj5.x.c(recyclerView2, new oj5.i(oVar));
        recyclerView2.post(new oj5.k(oVar, recyclerView2));
        this.f345878a.setRecyclerListener(new oj5.c(this));
        this.f345878a.post(new oj5.f(this));
    }

    public static final void a(oj5.r rVar, android.view.View view) {
        rVar.getClass();
        boolean b17 = kotlin.jvm.internal.o.b(view.getTag(com.tencent.mm.R.id.f482350c5), 1);
        int[] iArr = rVar.f345881d;
        if (b17) {
            iArr[0] = iArr[0] + 1;
        } else {
            iArr[1] = iArr[1] + 1;
        }
    }

    public final int[] b() {
        return (int[]) this.f345881d.clone();
    }

    public final void c(android.view.View view, boolean z17) {
        android.view.View findViewById;
        if (z17) {
            view.setTag(com.tencent.mm.R.id.f482350c5, null);
            if (!this.f345880c || (findViewById = view.findViewById(com.tencent.mm.R.id.f482352c7)) == null) {
                return;
            }
            ((android.view.ViewGroup) view).removeView(findViewById);
            return;
        }
        view.setTag(com.tencent.mm.R.id.f482350c5, 1);
        if (this.f345880c) {
            android.widget.TextView textView = new android.widget.TextView(view.getContext());
            textView.setText("😄");
            textView.setId(com.tencent.mm.R.id.f482352c7);
            textView.setTextSize(1, 40.0f);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            ((android.view.ViewGroup) view).addView(textView, layoutParams);
        }
    }

    public final void d(android.view.View itemView, boolean z17) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        if (!z17) {
            itemView.setTag(com.tencent.mm.R.id.f482351c6, 1);
            return;
        }
        java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mRunQueue");
        declaredField.setAccessible(true);
        declaredField.set(itemView, null);
        itemView.setTag(com.tencent.mm.R.id.f482351c6, null);
    }
}
