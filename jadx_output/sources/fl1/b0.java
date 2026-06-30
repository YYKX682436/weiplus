package fl1;

/* loaded from: classes14.dex */
public class b0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f263698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.b2 f263699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fl1.c0 f263700f;

    public b0(fl1.c0 c0Var, android.view.View view, fl1.b2 b2Var) {
        this.f263700f = c0Var;
        this.f263698d = view;
        this.f263699e = b2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        onAnimationEnd(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDialogContainerLayout", "on dialogView exit animation end");
        fl1.c0 c0Var = this.f263700f;
        java.util.LinkedList linkedList = c0Var.f263716h;
        int size = linkedList.size();
        if (1 == size) {
            c0Var.f263728w = false;
            z17 = true;
        } else {
            z17 = false;
        }
        if (size >= 1) {
        }
        fl1.b2 b2Var = size >= 2 ? (fl1.b2) linkedList.get(size - 2) : null;
        fl1.h2 h2Var = c0Var.f263727v;
        if (h2Var != null) {
            fl1.t tVar = (fl1.t) h2Var;
            fl1.u uVar = tVar.f263867a;
            uVar.getClass();
            fl1.c0 dialogContainer = tVar.f263868b;
            kotlin.jvm.internal.o.g(dialogContainer, "dialogContainer");
            java.util.HashMap hashMap = uVar.f263872b;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                if (kotlin.jvm.internal.o.b(dialogContainer, entry.getKey()) ? false : ((fl1.t) entry.getValue()).f263869c) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.Set keySet = linkedHashMap.keySet();
            boolean isEmpty = keySet.isEmpty();
            java.lang.String str = uVar.f263871a;
            if (isEmpty) {
                com.tencent.mars.xlog.Log.i(str, "onDialogDismissed, othersShownContainer is empty");
                uVar.b(dialogContainer, z17, b2Var, null);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(keySet, 10));
                java.util.Iterator it = keySet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.util.List a17 = uVar.a((fl1.c0) it.next());
                        if (a17.contains(dialogContainer)) {
                            com.tencent.mars.xlog.Log.i(str, "onDialogDismissed, otherShownContainer cover me");
                            break;
                        }
                        arrayList.add(a17);
                    } else {
                        java.util.HashSet hashSet = new java.util.HashSet();
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            hashSet.addAll((java.util.List) it6.next());
                        }
                        java.util.List a18 = uVar.a(dialogContainer);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj : a18) {
                            if (!hashSet.contains((android.view.View) obj)) {
                                arrayList2.add(obj);
                            }
                        }
                        uVar.b(dialogContainer, z17, b2Var, arrayList2);
                    }
                }
            }
            if (z17) {
                tVar.f263869c = false;
            }
        }
        android.view.View view = this.f263698d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandDialogContainerLayout$6", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c0Var.f263716h.remove(this.f263699e);
        c0Var.f263719n = null;
        c0Var.post(new fl1.a0(this, b2Var));
    }
}
