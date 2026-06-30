package w9;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final x.n f444046a = new x.n();

    public static w9.h a(android.content.Context context, android.content.res.TypedArray typedArray, int i17) {
        int resourceId;
        if (!typedArray.hasValue(i17) || (resourceId = typedArray.getResourceId(i17, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static w9.h b(android.content.Context context, int i17) {
        try {
            android.animation.Animator loadAnimator = android.animation.AnimatorInflater.loadAnimator(context, i17);
            if (loadAnimator instanceof android.animation.AnimatorSet) {
                return c(((android.animation.AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (java.lang.Exception unused) {
            java.lang.Integer.toHexString(i17);
            return null;
        }
    }

    public static w9.h c(java.util.List list) {
        w9.h hVar = new w9.h();
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            android.animation.Animator animator = (android.animation.Animator) list.get(i17);
            if (!(animator instanceof android.animation.ObjectAnimator)) {
                throw new java.lang.IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) animator;
            java.lang.String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            android.animation.TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof android.view.animation.AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = w9.a.f444035b;
            } else if (interpolator instanceof android.view.animation.AccelerateInterpolator) {
                interpolator = w9.a.f444036c;
            } else if (interpolator instanceof android.view.animation.DecelerateInterpolator) {
                interpolator = w9.a.f444037d;
            }
            w9.i iVar = new w9.i(startDelay, duration, interpolator);
            iVar.f444050d = objectAnimator.getRepeatCount();
            iVar.f444051e = objectAnimator.getRepeatMode();
            hVar.f444046a.put(propertyName, iVar);
        }
        return hVar;
    }

    public w9.i d(java.lang.String str) {
        x.n nVar = this.f444046a;
        if (nVar.getOrDefault(str, null) != null) {
            return (w9.i) nVar.getOrDefault(str, null);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w9.h.class != obj.getClass()) {
            return false;
        }
        return this.f444046a.equals(((w9.h) obj).f444046a);
    }

    public int hashCode() {
        return this.f444046a.hashCode();
    }

    public java.lang.String toString() {
        return "\n" + w9.h.class.getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " timings: " + this.f444046a + "}\n";
    }
}
