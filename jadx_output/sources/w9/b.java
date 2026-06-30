package w9;

/* loaded from: classes13.dex */
public abstract class b {
    public static void a(android.animation.AnimatorSet animatorSet, java.util.List list) {
        int size = list.size();
        long j17 = 0;
        for (int i17 = 0; i17 < size; i17++) {
            android.animation.Animator animator = (android.animation.Animator) list.get(i17);
            j17 = java.lang.Math.max(j17, animator.getStartDelay() + animator.getDuration());
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j17);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
