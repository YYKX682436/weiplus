package dl1;

/* loaded from: classes8.dex */
public class e implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f235173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f235174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f235175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl1.f f235176g;

    public e(dl1.f fVar, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 k3Var, java.lang.Runnable runnable) {
        this.f235176g = fVar;
        this.f235173d = recyclerView;
        this.f235174e = k3Var;
        this.f235175f = runnable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        if (((cl1.h) r12.f235180d).d() > 8) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007d, code lost:
    
        if ((r1 == null ? false : r1.o()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0093, code lost:
    
        r1 = r12.f235178b;
        ((cl1.g) r12.f235182f).getClass();
        r0.setImageDrawable(((android.widget.ImageView) r1.findViewById(com.tencent.mm.R.id.h5n)).getDrawable());
        ((rh4.f0) ((cl1.h) r12.f235180d).f42871a.I).f395722a.f172715j2.i();
     */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAnimationEnd(android.animation.Animator r12) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl1.e.onAnimationEnd(android.animation.Animator):void");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
