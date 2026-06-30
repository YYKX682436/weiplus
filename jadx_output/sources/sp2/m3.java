package sp2;

/* loaded from: classes2.dex */
public final class m3 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f411093d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f411094e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f411095f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f411096g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f411097h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f411098i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f411099m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f411100n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f411101o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411093d = new java.util.HashSet();
        this.f411094e = jz5.h.b(sp2.j3.f411060d);
        this.f411095f = jz5.h.b(sp2.k3.f411066d);
        this.f411096g = jz5.h.b(sp2.l3.f411081d);
        this.f411097h = jz5.h.b(sp2.g3.f411041d);
        this.f411098i = jz5.h.b(new sp2.f3(this));
        this.f411101o = new java.util.ArrayList();
    }

    public final void O6() {
        android.content.Intent intent = getIntent();
        ws5.j[] jVarArr = ws5.j.f449218d;
        int intExtra = intent.getIntExtra("nearby_live_enter_source_params_key", 4);
        if (intExtra != 1) {
            com.tencent.mars.xlog.Log.i("LiveSquareFrameworkLoadingUIC", "checkShowFrameworkAnim: only enter from find more page can show anim, enterSource=" + intExtra);
            return;
        }
        if (!((java.lang.Boolean) ((jz5.n) this.f411094e).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("LiveSquareFrameworkLoadingUIC", "checkShowFrameworkAnim: switch is off");
            return;
        }
        if (getActivity().isFinishing()) {
            com.tencent.mars.xlog.Log.e("LiveSquareFrameworkLoadingUIC", "checkShowFrameworkAnim: activity is finish");
            return;
        }
        if (P6().getParent() != null) {
            com.tencent.mars.xlog.Log.i("LiveSquareFrameworkLoadingUIC", "checkShowFrameworkAnim: anim view has added");
            return;
        }
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.T5).getValue()).r()).intValue();
        com.tencent.mars.xlog.Log.i("LiveSquareFrameworkLoadingUIC", "checkShowFrameworkAnim: start, delayMs=" + intValue);
        kotlinx.coroutines.r2 r2Var = this.f411099m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f411099m = kotlinx.coroutines.l.d(getMainScope(), null, null, new sp2.i3(intValue, this, null), 3, null);
    }

    public final com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView P6() {
        return (com.tencent.mm.plugin.finder.nearby.ui.special.view.FrameworkCircleAnimView) ((jz5.n) this.f411098i).getValue();
    }

    public final android.graphics.Bitmap Q6(int i17, int i18) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = this.f411101o;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
            if (bitmap.getWidth() == i17 && bitmap.getHeight() == i18) {
                break;
            }
        }
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) obj;
        if (bitmap2 != null) {
            return bitmap2;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveSquareFrameworkLoadingUIC", "getBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/nearby/newlivesquare/LiveSquareFrameworkLoadingUIC", "getBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        arrayList.add(createBitmap);
        return createBitmap;
    }

    public final int[] R6() {
        return (int[]) ((jz5.n) this.f411095f).getValue();
    }

    public final void S6() {
        if (!this.f411100n || P6().getParent() == null) {
            return;
        }
        P6().invalidate();
    }

    public final void T6(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("LiveSquareFrameworkLoadingUIC", "stopFrameworkAnim: source=" + source + ", isStartAnim=" + this.f411100n);
        kotlinx.coroutines.r2 r2Var = this.f411099m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f411099m = null;
        android.view.ViewParent parent = P6().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(P6());
        }
        P6().f122127r = false;
        this.f411100n = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy: bitmapPoolSize=");
        java.util.ArrayList arrayList = this.f411101o;
        sb6.append(arrayList.size());
        com.tencent.mars.xlog.Log.i("LiveSquareFrameworkLoadingUIC", sb6.toString());
        arrayList.clear();
        T6("onDestroy");
    }
}
