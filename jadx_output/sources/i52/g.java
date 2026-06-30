package i52;

/* loaded from: classes15.dex */
public final class g implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i52.h f288479a;

    public g(i52.h hVar) {
        this.f288479a = hVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity;
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                boolean b17 = kotlin.jvm.internal.o.b(str2, "onPageSelected");
                i52.h hVar = this.f288479a;
                if (!b17) {
                    if (kotlin.jvm.internal.o.b(str2, "onPageScrollStateChanged")) {
                        java.lang.Object obj2 = objArr[0];
                        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                        if (((java.lang.Integer) obj2).intValue() == 1) {
                            hVar.f288487h = true;
                            return;
                        } else {
                            hVar.getClass();
                            return;
                        }
                    }
                    return;
                }
                java.lang.Object obj3 = objArr[0];
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((java.lang.Integer) obj3).intValue();
                java.lang.ref.WeakReference weakReference = hVar.f288485f;
                if (weakReference == null || (mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) weakReference.get()) == null) {
                    return;
                }
                int i17 = hVar.f288483d;
                androidx.fragment.app.FragmentManager supportFragmentManager = mMFragmentActivity.getSupportFragmentManager();
                java.util.List<androidx.fragment.app.Fragment> fragments = supportFragmentManager == null ? null : supportFragmentManager.getFragments();
                androidx.fragment.app.Fragment a17 = (fragments == null || fragments.isEmpty() || i17 < 0 || i17 >= fragments.size()) ? null : i52.l.a(i17, fragments, mMFragmentActivity);
                androidx.fragment.app.FragmentManager supportFragmentManager2 = mMFragmentActivity.getSupportFragmentManager();
                java.util.List<androidx.fragment.app.Fragment> fragments2 = supportFragmentManager2 == null ? null : supportFragmentManager2.getFragments();
                androidx.fragment.app.Fragment a18 = (fragments2 == null || fragments2.isEmpty() || intValue < 0 || intValue >= fragments2.size()) ? null : i52.l.a(intValue, fragments2, mMFragmentActivity);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fragment, onPageSelected: runOnEnter: lastPos=");
                sb6.append(hVar.f288483d);
                sb6.append(", curPos=");
                sb6.append(intValue);
                sb6.append(", activity=");
                sb6.append(mMFragmentActivity.getClass().getCanonicalName());
                sb6.append(", lastFrag=");
                sb6.append(a17 != null ? a17.getClass().getCanonicalName() : null);
                sb6.append(", curFrag=");
                sb6.append(a18 != null ? a18.getClass().getCanonicalName() : null);
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentLauncherUIMonitor", sb6.toString());
                if (hVar.f288487h) {
                    int i18 = hVar.f288483d;
                    java.lang.String str4 = i18 != 0 ? i18 != 1 ? i18 != 2 ? i18 != 3 ? "-1" : "ff000004" : "ff000003" : "ff000002" : "ff000001";
                    r45.a07 a07Var = new r45.a07();
                    a07Var.f369601d = str4;
                    a07Var.f369609o = java.lang.System.currentTimeMillis();
                    a07Var.f369602e = str4;
                    a07Var.f369604g = a17 == null ? "null" : b52.b.g(a17.getClass().getName());
                    a07Var.f369608n = a17 != null ? a17.hashCode() : -1;
                    java.lang.String str5 = a07Var.f369604g;
                    a07Var.f369603f = str5;
                    a07Var.f369605h = str5;
                    k52.g gVar = k52.g.f304304r;
                    a07Var.f369606i = 10;
                    a07Var.f369615u = 0;
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentLauncherUIMonitor", "FragmentMonitor, onSwipEvent: pos=" + hVar.f288483d + "\n, page.name=" + a07Var.f369604g + "\n, page.hashCode=" + a07Var.f369608n + "\n, EventId=" + gVar + "\n, resId=" + str4);
                    java.util.Map map = k52.l.f304310a;
                    k52.l.f304314e.a(null, a07Var);
                    hVar.f288487h = false;
                }
                hVar.f288483d = intValue;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                b52.d dVar = hVar.f288480a;
                if (a17 != null && dVar != null) {
                    ((i52.k) dVar).b(mMFragmentActivity, a17.getClass().getCanonicalName(), a17.hashCode(), currentTimeMillis, true);
                }
                if (a18 == null || dVar == null) {
                    return;
                }
                ((i52.k) dVar).c(mMFragmentActivity, a18, a18.getClass().getCanonicalName(), a18.hashCode(), currentTimeMillis, true);
            }
        }
    }
}
