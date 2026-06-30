package fi2;

/* loaded from: classes3.dex */
public abstract class a implements fi2.m {

    /* renamed from: a, reason: collision with root package name */
    public final zi2.w f262801a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f262802b;

    public a(zi2.w plugin) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f262801a = plugin;
        this.f262802b = z();
    }

    public final void A(int i17) {
        com.tencent.mars.xlog.Log.i(this.f262802b, "setVisible " + i17);
        android.view.View a17 = a();
        if (a17 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/core/BaseLiveCoverLogicCore", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/plugin/finder/live/mic/core/BaseLiveCoverLogicCore", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public lj2.u0 d(java.lang.String str) {
        java.lang.Object obj;
        java.util.Iterator it = t().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            km2.q curBindLinkMicUser = ((wj2.w) ((lj2.u0) next)).getCurBindLinkMicUser();
            if (kotlin.jvm.internal.o.b(curBindLinkMicUser != null ? curBindLinkMicUser.f309170a : null, str)) {
                obj = next;
                break;
            }
        }
        return (lj2.u0) obj;
    }

    @Override // fi2.m
    public void g(java.lang.String str, boolean z17, int i17, int i18) {
    }

    @Override // fi2.m
    public void q(int i17, java.lang.String str) {
    }

    @Override // fi2.m
    public java.util.ArrayList t() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.ViewGroup p17 = p();
        if (p17 != null) {
            int childCount = p17.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = p17.getChildAt(i17);
                if (childAt instanceof wj2.w) {
                    arrayList.add(childAt);
                }
            }
        }
        return arrayList;
    }

    public lj2.u0 y(java.lang.String str) {
        android.view.ViewGroup p17 = p();
        if (p17 != null) {
            int childCount = p17.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.KeyEvent.Callback childAt = p17.getChildAt(i17);
                if (childAt instanceof wj2.w) {
                    km2.q curBindLinkMicUser = ((wj2.w) childAt).getCurBindLinkMicUser();
                    if (kotlin.jvm.internal.o.b(curBindLinkMicUser != null ? curBindLinkMicUser.f309172c : null, str)) {
                        return (lj2.u0) childAt;
                    }
                }
            }
        }
        return null;
    }

    public abstract java.lang.String z();
}
