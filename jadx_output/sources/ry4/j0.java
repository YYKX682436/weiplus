package ry4;

/* loaded from: classes3.dex */
public final class j0 extends androidx.recyclerview.widget.z {

    /* renamed from: u, reason: collision with root package name */
    public static final android.view.animation.Interpolator f401652u = new android.view.animation.PathInterpolator(0.32f, 0.72f, 0.0f, 1.0f);

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Map f401653t = new java.util.LinkedHashMap();

    public j0(int i17) {
    }

    public static final void I(ry4.j0 j0Var, android.view.View view, int i17) {
        j0Var.getClass();
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || layoutParams2.width == i17) {
            return;
        }
        layoutParams2.width = i17;
        view.setLayoutParams(layoutParams2);
    }

    public static final int J(ry4.j0 j0Var, int i17, int i18, float f17) {
        j0Var.getClass();
        return (int) (i17 + ((i18 - i17) * f17));
    }

    @Override // androidx.recyclerview.widget.o3, androidx.recyclerview.widget.n2
    public boolean f(androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        return true;
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.n2
    public boolean g(androidx.recyclerview.widget.k3 viewHolder, java.util.List payloads) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        return true;
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.n2
    public void j(androidx.recyclerview.widget.k3 item) {
        kotlin.jvm.internal.o.g(item, "item");
        android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) this.f401653t.remove(item);
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        super.j(item);
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.n2
    public void k() {
        java.util.Map map = this.f401653t;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            ((android.animation.AnimatorSet) it.next()).cancel();
        }
        ((java.util.LinkedHashMap) map).clear();
        super.k();
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.n2
    public boolean o() {
        return (this.f401653t.isEmpty() ^ true) || super.o();
    }

    @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.o3
    public boolean u(androidx.recyclerview.widget.k3 oldHolder, androidx.recyclerview.widget.k3 newHolder, int i17, int i18, int i19, int i27) {
        android.view.animation.Interpolator interpolator;
        int i28;
        float f17;
        kotlin.jvm.internal.o.g(oldHolder, "oldHolder");
        kotlin.jvm.internal.o.g(newHolder, "newHolder");
        ry4.a aVar = newHolder instanceof ry4.a ? (ry4.a) newHolder : null;
        if (aVar == null) {
            return super.u(oldHolder, newHolder, i17, i18, i19, i27);
        }
        boolean b17 = kotlin.jvm.internal.o.b(aVar.itemView.getTag(com.tencent.mm.R.id.v59), "PAYLOAD_ENTER_EDIT");
        boolean b18 = kotlin.jvm.internal.o.b(aVar.itemView.getTag(com.tencent.mm.R.id.v59), "PAYLOAD_EXIT_EDIT");
        if (!b17 && !b18) {
            h(newHolder);
            return false;
        }
        int dimensionPixelSize = aVar.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        int dimensionPixelSize2 = aVar.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        int dimensionPixelSize3 = aVar.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        int dimensionPixelSize4 = aVar.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
        int dimensionPixelSize5 = aVar.itemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        float f18 = dimensionPixelSize;
        float f19 = f18 * 3;
        float f27 = f18 + dimensionPixelSize5;
        int i29 = b17 ? 0 : dimensionPixelSize;
        int i37 = b17 ? dimensionPixelSize : 0;
        int i38 = b17 ? 0 : dimensionPixelSize2;
        int i39 = b17 ? dimensionPixelSize2 : 0;
        int i47 = b17 ? 0 : dimensionPixelSize3;
        int i48 = b17 ? dimensionPixelSize3 : 0;
        int i49 = b17 ? 0 : dimensionPixelSize4;
        int i57 = b17 ? dimensionPixelSize4 : 0;
        int i58 = b17 ? 0 : dimensionPixelSize5;
        int i59 = b17 ? dimensionPixelSize5 : 0;
        android.view.animation.Interpolator interpolator2 = f401652u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(230L);
        ofFloat.setInterpolator(interpolator2);
        ofFloat.addUpdateListener(new ry4.i0(this, aVar, i29, i37, i49, i57, i38, i39, i47, i48, i58, i59));
        arrayList.add(ofFloat);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = aVar.f401570h;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = aVar.f401569g;
        android.widget.CheckBox checkBox = aVar.f401568f;
        if (b17) {
            if (checkBox != null) {
                i28 = 0;
                checkBox.setVisibility(0);
                float f28 = -f27;
                checkBox.setTranslationX(f28);
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(checkBox, (android.util.Property<android.widget.CheckBox, java.lang.Float>) android.view.View.TRANSLATION_X, f28, 0.0f);
                ofFloat2.setDuration(230L);
                interpolator = interpolator2;
                ofFloat2.setInterpolator(interpolator);
                arrayList.add(ofFloat2);
            } else {
                interpolator = interpolator2;
                i28 = 0;
            }
            if (weImageView2 != null) {
                weImageView2.setVisibility(i28);
                f17 = f19;
                weImageView2.setTranslationX(f17);
                android.util.Property property = android.view.View.TRANSLATION_X;
                float[] fArr = new float[2];
                fArr[i28] = f17;
                fArr[1] = 0.0f;
                android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(weImageView2, (android.util.Property<com.tencent.mm.ui.widget.imageview.WeImageView, java.lang.Float>) property, fArr);
                ofFloat3.setDuration(230L);
                ofFloat3.setInterpolator(interpolator);
                arrayList.add(ofFloat3);
            } else {
                f17 = f19;
            }
            if (weImageView != null) {
                weImageView.setVisibility(i28);
                weImageView.setTranslationX(f17);
                android.util.Property property2 = android.view.View.TRANSLATION_X;
                float[] fArr2 = new float[2];
                fArr2[i28] = f17;
                fArr2[1] = 0.0f;
                android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(weImageView, (android.util.Property<com.tencent.mm.ui.widget.imageview.WeImageView, java.lang.Float>) property2, fArr2);
                ofFloat4.setDuration(230L);
                ofFloat4.setInterpolator(interpolator);
                arrayList.add(ofFloat4);
            }
        } else {
            if (checkBox != null) {
                android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(checkBox, (android.util.Property<android.widget.CheckBox, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f, -f27);
                ofFloat5.setDuration(230L);
                ofFloat5.setInterpolator(interpolator2);
                ofFloat5.addListener(new ry4.e0(checkBox));
                arrayList.add(ofFloat5);
            }
            if (weImageView2 != null) {
                android.animation.ObjectAnimator ofFloat6 = android.animation.ObjectAnimator.ofFloat(weImageView2, (android.util.Property<com.tencent.mm.ui.widget.imageview.WeImageView, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f, f19);
                ofFloat6.setDuration(230L);
                ofFloat6.setInterpolator(interpolator2);
                ofFloat6.addListener(new ry4.f0(weImageView2));
                arrayList.add(ofFloat6);
            }
            if (weImageView != null) {
                android.animation.ObjectAnimator ofFloat7 = android.animation.ObjectAnimator.ofFloat(weImageView, (android.util.Property<com.tencent.mm.ui.widget.imageview.WeImageView, java.lang.Float>) android.view.View.TRANSLATION_X, 0.0f, f19);
                ofFloat7.setDuration(230L);
                ofFloat7.setInterpolator(interpolator2);
                ofFloat7.addListener(new ry4.g0(weImageView));
                arrayList.add(ofFloat7);
            }
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new ry4.h0(this, newHolder, aVar));
        this.f401653t.put(newHolder, animatorSet);
        animatorSet.start();
        return true;
    }
}
