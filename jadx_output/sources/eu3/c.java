package eu3;

/* loaded from: classes3.dex */
public final class c extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f256821d;

    /* renamed from: e, reason: collision with root package name */
    public int f256822e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f256823f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f256824g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f256825h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f256826i;

    public c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f256821d = arrayList;
        this.f256822e = 2;
        this.f256824g = true;
        arrayList.add(-1);
        arrayList.add(-16777216);
        arrayList.add(-707825);
        arrayList.add(-352965);
        arrayList.add(-17592);
        arrayList.add(-7220480);
        arrayList.add(-16535286);
        arrayList.add(-15683841);
        arrayList.add(-15172610);
        arrayList.add(-7054596);
        arrayList.add(-8421505);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f256821d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        eu3.a holder = (eu3.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z17 = this.f256824g;
        android.view.View view = holder.f256817d;
        if (z17 && i17 == this.f256822e) {
            this.f256824g = false;
            view.setScaleX(1.4f);
            view.setScaleY(1.4f);
            this.f256823f = view;
        }
        if (i17 == 2) {
            this.f256826i = view;
        }
        android.view.View view2 = holder.f256818e;
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) (view2 != null ? view2.getBackground() : null);
        if (gradientDrawable != null) {
            gradientDrawable.setShape(1);
        }
        if (gradientDrawable != null) {
            java.lang.Object obj = this.f256821d.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            gradientDrawable.setColor(((java.lang.Number) obj).intValue());
        }
        view.setOnClickListener(new eu3.b(this, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.dco, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new eu3.a(inflate);
    }

    public final void x(android.view.View view, float f17) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", f17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", f17);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(100L);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
