package vw2;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f440866e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f440867f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f440868g = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final vw2.g f440869a;

    /* renamed from: b, reason: collision with root package name */
    public final vw2.d f440870b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f440871c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f440872d;

    public n(vw2.g playStrategy, vw2.d conflictStrategy, java.util.List interceptors, androidx.lifecycle.o lifecycle, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 1) != 0) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127954te).getValue()).r()).intValue();
            playStrategy = intValue != 0 ? intValue != 1 ? vw2.g.f440842f : vw2.g.f440841e : vw2.g.f440840d;
        }
        if ((i17 & 2) != 0) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            conflictStrategy = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127972ue).getValue()).r()).intValue() == 0 ? vw2.d.f440835d : vw2.d.f440836e;
        }
        interceptors = (i17 & 4) != 0 ? kz5.p0.f313996d : interceptors;
        kotlin.jvm.internal.o.g(playStrategy, "playStrategy");
        kotlin.jvm.internal.o.g(conflictStrategy, "conflictStrategy");
        kotlin.jvm.internal.o.g(interceptors, "interceptors");
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        this.f440869a = playStrategy;
        this.f440870b = conflictStrategy;
        this.f440871c = true;
        this.f440872d = new java.util.ArrayList();
        pm0.v.X(new vw2.a(lifecycle, this, interceptors));
    }

    public static final void a(vw2.n nVar, ww2.b bVar, java.util.List list, in5.s0 s0Var) {
        int i17;
        int i18;
        vw2.n nVar2 = nVar;
        in5.s0 s0Var2 = s0Var;
        nVar.getClass();
        int hashCode = s0Var.hashCode();
        vw2.d dVar = vw2.d.f440836e;
        java.util.Map map = f440868g;
        if (nVar2.f440870b == dVar) {
            android.animation.Animator animator = (android.animation.Animator) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(hashCode));
            if (animator != null) {
                animator.cancel();
            } else {
                com.tencent.mars.xlog.Log.i("ToolbarButtonCarouselAnimationHelper", "startButtonEduAnimation: lastAnimator is null");
            }
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var2.f293125i;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            vw2.c cVar = ((vw2.b) it.next()).f440831c;
            arrayList.add(new jz5.l(cVar, nVar2.b(cVar, s0Var2)));
        }
        kotlin.jvm.internal.o.d(baseFinderFeed);
        bVar.b(arrayList, baseFinderFeed);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (java.util.Iterator it6 = list.iterator(); it6.hasNext(); it6 = it6) {
            vw2.b bVar2 = (vw2.b) it6.next();
            long j17 = bVar2.f440829a;
            vw2.c cVar2 = bVar2.f440831c;
            int ordinal = cVar2.ordinal();
            if (ordinal == 0) {
                i17 = com.tencent.mm.R.id.f487088ng5;
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                i17 = com.tencent.mm.R.id.a_x;
            }
            android.view.View p17 = s0Var2.p(i17);
            kotlin.jvm.internal.o.f(p17, "getView(...)");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) p17;
            int ordinal2 = cVar2.ordinal();
            if (ordinal2 == 0) {
                i18 = com.tencent.mm.R.id.f487086ng3;
            } else {
                if (ordinal2 != 1) {
                    throw new jz5.j();
                }
                i18 = com.tencent.mm.R.id.i1g;
            }
            android.view.View p18 = s0Var2.p(i18);
            kotlin.jvm.internal.o.f(p18, "getView(...)");
            android.widget.TextView b17 = nVar2.b(cVar2, s0Var2);
            int i19 = viewGroup.getLayoutParams().height;
            int height = viewGroup.getHeight();
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = height;
            viewGroup.setLayoutParams(layoutParams);
            int height2 = p18.getHeight();
            b17.setVisibility(0);
            b17.setAlpha(0.0f);
            android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j17);
            duration.addUpdateListener(new vw2.i(p18, height2, b17));
            android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(j17);
            duration2.addUpdateListener(new vw2.j(p18, height2, b17));
            duration2.setStartDelay(bVar2.f440830b);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.playSequentially(duration, duration2);
            vw2.k kVar = new vw2.k(p18, b17, viewGroup, i19);
            animatorSet2.addListener(new vw2.h(kVar, s0Var, bVar2, kVar, s0Var, bVar2));
            arrayList2.add(animatorSet2);
            nVar2 = nVar;
            s0Var2 = s0Var;
            hashCode = hashCode;
        }
        int i27 = hashCode;
        animatorSet.playTogether(arrayList2);
        animatorSet.addListener(new vw2.m(i27, s0Var, i27, s0Var));
        map.put(java.lang.Integer.valueOf(i27), animatorSet);
        animatorSet.start();
    }

    public final android.widget.TextView b(vw2.c cVar, in5.s0 s0Var) {
        int i17;
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            i17 = com.tencent.mm.R.id.s77;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            i17 = com.tencent.mm.R.id.rts;
        }
        android.view.View p17 = s0Var.p(i17);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        return (android.widget.TextView) p17;
    }
}
