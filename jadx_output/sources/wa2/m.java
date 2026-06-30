package wa2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f444140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f444141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f444143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444144h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f444145i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f444146m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f444147n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.p f444148o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.app.Activity activity, long j17, yz5.a aVar, android.content.Intent intent, android.view.View view, wa2.n0 n0Var, long j18, android.widget.ImageView imageView, yz5.p pVar) {
        super(1);
        this.f444140d = activity;
        this.f444141e = j17;
        this.f444142f = aVar;
        this.f444143g = intent;
        this.f444144h = view;
        this.f444145i = n0Var;
        this.f444146m = j18;
        this.f444147n = imageView;
        this.f444148o = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        long j17 = this.f444141e;
        android.widget.ImageView imageView = this.f444147n;
        android.content.Intent intent = this.f444143g;
        android.view.View view2 = this.f444144h;
        if (view != null) {
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                com.tencent.mars.xlog.Log.w("ActivityToggleAnimator", "invalid view size: " + view.getWidth() + 'X' + view.getHeight());
            } else {
                android.graphics.Bitmap a17 = wa2.x.a(view);
                if (a17 == null) {
                    com.tencent.mars.xlog.Log.w("ActivityToggleAnimator", "cannot create bitmap from view");
                } else {
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(view.getResources(), a17);
                    java.lang.String stringExtra = intent.getStringExtra("key_anim_intent_id");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    view.setTag(com.tencent.mm.R.id.ehp, this.f444148o);
                    wa2.u uVar = wa2.u.f444181d;
                    uVar.getClass();
                    wa2.u.f444182e.put(stringExtra, new wa2.p0(bitmapDrawable, new java.lang.ref.WeakReference(view)));
                    intent.putExtra("key_intent_source_rect", wa2.x.d(view));
                    uVar.Ni(view2, intent);
                    android.graphics.Rect rect = (android.graphics.Rect) intent.getParcelableExtra("key_intent_source_rect");
                    if (rect == null) {
                        rect = new android.graphics.Rect();
                    }
                    intent.putExtra("KEY_INTENT_ENTER_ITEM_ID", j17);
                    imageView.setImageDrawable(bitmapDrawable);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(rect.width(), rect.height());
                    layoutParams.topMargin = rect.top;
                    layoutParams.leftMargin = rect.left;
                    imageView.setLayoutParams(layoutParams);
                }
            }
        }
        android.app.Activity activity = this.f444140d;
        if (j17 != activity.getIntent().getLongExtra("KEY_INTENT_ENTER_ITEM_ID", -1L)) {
            this.f444142f.invoke();
            activity.overridePendingTransition(com.tencent.mm.R.anim.f477783bc, com.tencent.mm.R.anim.f477784bd);
        } else {
            intent.putExtra("key_intent_animating_flag", 2);
            wa2.u uVar2 = wa2.u.f444181d;
            android.view.View aj6 = uVar2.aj(intent);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            view2.getDrawingRect(rect2);
            android.graphics.Rect Vi = uVar2.Vi(intent);
            float Zi = uVar2.Zi(rect2, Vi, true);
            float[] bj6 = uVar2.bj(rect2, Vi);
            android.view.View view3 = this.f444144h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1", "invoke", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator$exitAnimation$1", "invoke", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wa2.n0 n0Var = this.f444145i;
            float alpha = n0Var.getBgView().getAlpha();
            android.view.ViewPropertyAnimator animate = view2.animate();
            if (animate != null) {
                animate.cancel();
            }
            android.view.ViewPropertyAnimator scaleY = view2.animate().translationX(bj6[0]).translationY(bj6[1]).scaleX(Zi).scaleY(Zi);
            android.view.ViewPropertyAnimator animate2 = view2.animate();
            kotlin.jvm.internal.o.f(animate2, "animate(...)");
            android.view.ViewPropertyAnimator updateListener = scaleY.setListener(new wa2.a0(animate2, wa2.h.f444124d)).setUpdateListener(new wa2.i(n0Var, alpha));
            long j18 = this.f444146m;
            updateListener.setDuration(j18).start();
            android.graphics.Rect d17 = wa2.x.d(view2);
            float Zi2 = uVar2.Zi(Vi, d17, false);
            float[] bj7 = uVar2.bj(d17, Vi);
            imageView.setVisibility(0);
            imageView.setTranslationX(-bj7[0]);
            imageView.setTranslationY(-bj7[1]);
            imageView.setScaleX(Zi2);
            imageView.setScaleY(Zi2);
            imageView.setAlpha(1.0f);
            android.view.ViewPropertyAnimator animate3 = imageView.animate();
            if (animate3 != null) {
                animate3.cancel();
            }
            android.view.ViewPropertyAnimator updateListener2 = imageView.animate().scaleX(1.0f).scaleY(1.0f).translationY(1.0f).translationX(1.0f).setUpdateListener(wa2.j.f444129d);
            android.view.ViewPropertyAnimator animate4 = view2.animate();
            kotlin.jvm.internal.o.f(animate4, "animate(...)");
            updateListener2.setListener(new wa2.a0(animate4, new wa2.l(aj6, this.f444147n, this.f444142f, this.f444140d, this.f444143g))).setDuration(j18).start();
        }
        return jz5.f0.f302826a;
    }
}
