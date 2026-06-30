package p52;

/* loaded from: classes15.dex */
public final class a implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p52.b f351993a;

    public a(p52.b bVar) {
        this.f351993a = bVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (str == null || !r26.i0.y(str, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$", false)) {
            return;
        }
        boolean b17 = kotlin.jvm.internal.o.b("onUserVisibleFragmentChange", str2);
        p52.b bVar = this.f351993a;
        if (b17 && kotlin.jvm.internal.o.b("(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V", str3)) {
            if (objArr == null || objArr.length < 3) {
                return;
            }
            java.lang.Object obj2 = objArr[0];
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
            java.lang.Object obj3 = objArr[1];
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) obj3).intValue();
            java.lang.Object obj4 = objArr[2];
            kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentFragment");
            com.tencent.mm.ui.component.UIComponentFragment uIComponentFragment = (com.tencent.mm.ui.component.UIComponentFragment) obj4;
            if (booleanValue) {
                if (intValue == bVar.f352001h) {
                    bVar.f352000g = new java.lang.ref.WeakReference(uIComponentFragment);
                    return;
                }
                return;
            } else {
                if (intValue == bVar.f352002i) {
                    new java.lang.ref.WeakReference(uIComponentFragment);
                    bVar.getClass();
                    return;
                }
                return;
            }
        }
        if (!kotlin.jvm.internal.o.b("onFragmentChange", str2) || !kotlin.jvm.internal.o.b("(IIII)V", str3) || objArr == null || objArr.length < 4) {
            return;
        }
        java.lang.Object obj5 = objArr[0];
        kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
        bVar.f352002i = ((java.lang.Integer) obj5).intValue();
        java.lang.Object obj6 = objArr[1];
        kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type kotlin.Int");
        bVar.f352001h = ((java.lang.Integer) obj6).intValue();
        if (obj != null) {
            com.tencent.mm.ui.component.UIComponentFragment b18 = bVar.b(obj, bVar.f352001h);
            com.tencent.mm.ui.component.UIComponentFragment c17 = bVar.c(obj, bVar.f352002i);
            com.tencent.mm.ui.component.UIComponentActivity a17 = p52.b.a(bVar, obj);
            kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) a17;
            java.lang.ref.WeakReference weakReference = bVar.f351999f;
            if ((weakReference != null ? (com.tencent.mm.ui.component.UIComponentActivity) weakReference.get() : null) == null) {
                bVar.f351999f = new java.lang.ref.WeakReference(mMActivity);
            }
            o52.e eVar = bVar.f351998e;
            if (eVar != null) {
                java.lang.String name = b18 != null ? b18.getClass().getName() : null;
                if (!kotlin.jvm.internal.o.b(name, c17 != null ? c17.getClass().getName() : null) || name == null) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchFragment, cur=");
                    sb6.append(b18 != null ? b18.getClass().getName() : null);
                    sb6.append(", last=");
                    sb6.append(c17 != null ? c17.getClass().getName() : null);
                    com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FinderHomeMonitor", sb6.toString());
                    if (c17 != null) {
                        eVar.a(mMActivity, c17, currentTimeMillis, 1);
                    }
                    if (b18 != null) {
                        eVar.b(mMActivity, b18, currentTimeMillis, 0);
                    }
                }
            }
        }
    }
}
