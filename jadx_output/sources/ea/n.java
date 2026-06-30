package ea;

/* loaded from: classes15.dex */
public class n extends ea.l {
    @Override // ea.l
    public float e() {
        return this.f250498s.getElevation();
    }

    @Override // ea.l
    public void f(android.graphics.Rect rect) {
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = ((ea.b) this.f250499t).f250465a;
        if (!floatingActionButton.f44500q) {
            rect.set(0, 0, 0, 0);
            return;
        }
        floatingActionButton.getSizeDimension();
        float e17 = e() + this.f250493n;
        int i17 = ka.a.f305964f;
        int ceil = (int) java.lang.Math.ceil(e17);
        int ceil2 = (int) java.lang.Math.ceil(e17 * 1.5f);
        rect.set(ceil, ceil2, ceil, ceil2);
    }

    @Override // ea.l
    public void g() {
    }

    @Override // ea.l
    public fa.d h() {
        return new fa.e();
    }

    @Override // ea.l
    public void i() {
        o();
    }

    @Override // ea.l
    public void j(int[] iArr) {
    }

    @Override // ea.l
    public void k(float f17, float f18, float f19) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        android.animation.StateListAnimator stateListAnimator = new android.animation.StateListAnimator();
        stateListAnimator.addState(ea.l.A, p(f17, f19));
        stateListAnimator.addState(ea.l.B, p(f17, f18));
        stateListAnimator.addState(ea.l.C, p(f17, f18));
        stateListAnimator.addState(ea.l.D, p(f17, f18));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float[] fArr = {f17};
        com.google.android.material.internal.VisibilityAwareImageButton visibilityAwareImageButton = this.f250498s;
        arrayList.add(android.animation.ObjectAnimator.ofFloat(visibilityAwareImageButton, "elevation", fArr).setDuration(0L));
        if (i17 <= 24) {
            arrayList.add(android.animation.ObjectAnimator.ofFloat(visibilityAwareImageButton, (android.util.Property<com.google.android.material.internal.VisibilityAwareImageButton, java.lang.Float>) android.view.View.TRANSLATION_Z, visibilityAwareImageButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(android.animation.ObjectAnimator.ofFloat(visibilityAwareImageButton, (android.util.Property<com.google.android.material.internal.VisibilityAwareImageButton, java.lang.Float>) android.view.View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((android.animation.Animator[]) arrayList.toArray(new android.animation.Animator[0]));
        animatorSet.setInterpolator(ea.l.f250479z);
        stateListAnimator.addState(ea.l.E, animatorSet);
        stateListAnimator.addState(ea.l.F, p(0.0f, 0.0f));
        visibilityAwareImageButton.setStateListAnimator(stateListAnimator);
        if (((ea.b) this.f250499t).f250465a.f44500q) {
            o();
        }
    }

    @Override // ea.l
    public void l(android.graphics.Rect rect) {
        ea.b bVar = (ea.b) this.f250499t;
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = bVar.f250465a;
        if (!floatingActionButton.f44500q) {
            super/*android.view.View*/.setBackgroundDrawable(this.f250488i);
        } else {
            super/*android.view.View*/.setBackgroundDrawable(new android.graphics.drawable.InsetDrawable(this.f250488i, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    @Override // ea.l
    public void m(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode, android.content.res.ColorStateList colorStateList2, int i17) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.GradientDrawable q17 = q();
        q17.setShape(1);
        q17.setColor(-1);
        this.f250487h = q17;
        f3.b.h(q17, colorStateList);
        if (mode != null) {
            f3.b.i(this.f250487h, mode);
        }
        if (i17 > 0) {
            this.f250489j = c(i17, colorStateList);
            drawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{this.f250489j, this.f250487h});
        } else {
            this.f250489j = null;
            drawable = this.f250487h;
        }
        android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(ja.a.a(colorStateList2), drawable, null);
        this.f250488i = rippleDrawable;
        this.f250490k = rippleDrawable;
        super/*android.view.View*/.setBackgroundDrawable(rippleDrawable);
    }

    @Override // ea.l
    public void n(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.f250488i;
        if (drawable instanceof android.graphics.drawable.RippleDrawable) {
            ((android.graphics.drawable.RippleDrawable) drawable).setColor(ja.a.a(colorStateList));
        } else {
            super.n(colorStateList);
        }
    }

    public final android.animation.Animator p(float f17, float f18) {
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        float[] fArr = {f17};
        com.google.android.material.internal.VisibilityAwareImageButton visibilityAwareImageButton = this.f250498s;
        animatorSet.play(android.animation.ObjectAnimator.ofFloat(visibilityAwareImageButton, "elevation", fArr).setDuration(0L)).with(android.animation.ObjectAnimator.ofFloat(visibilityAwareImageButton, (android.util.Property<com.google.android.material.internal.VisibilityAwareImageButton, java.lang.Float>) android.view.View.TRANSLATION_Z, f18).setDuration(100L));
        animatorSet.setInterpolator(ea.l.f250479z);
        return animatorSet;
    }

    public android.graphics.drawable.GradientDrawable q() {
        return new ea.m();
    }
}
