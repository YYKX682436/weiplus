package e62;

/* loaded from: classes15.dex */
public class k implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e62.m f249772a;

    public k(e62.m mVar) {
        this.f249772a = mVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        e62.f fVar;
        l52.j jVar;
        l52.j jVar2;
        boolean equals = "onScrollStateChanged".equals(str2);
        e62.m mVar = this.f249772a;
        if (equals && "(Landroid/widget/AbsListView;I)V".equals(str3)) {
            mVar.getClass();
            if (java.lang.Boolean.valueOf(str.contains("com/tencent/mm/plugin/sns/ui/SnsUIAction$") || str.contains("com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$")).booleanValue()) {
                if (objArr.length < 2 || (jVar2 = mVar.f249774a) == null) {
                    return;
                }
                android.view.ViewGroup listView = (android.view.ViewGroup) objArr[0];
                int intValue = ((java.lang.Integer) objArr[1]).intValue();
                e62.q qVar = ((e62.o) jVar2).f249803a;
                qVar.getClass();
                int i17 = intValue != 0 ? intValue != 1 ? intValue != 2 ? -1 : 2 : 1 : 0;
                qVar.f249811i = i17;
                if (i17 == 1) {
                    try {
                        qVar.f249815p = ((java.lang.Integer) qVar.f249814o.get(listView)).intValue();
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.SnsMonitor", e17, "beginScrollState", new java.lang.Object[0]);
                    }
                } else if (i17 == 2) {
                    qVar.e(listView);
                } else if (i17 == 0) {
                    qVar.f249816q = 0;
                }
                e62.j b17 = qVar.b(qVar.f249806d);
                if (b17 != null) {
                    kotlin.jvm.internal.o.g(listView, "listView");
                    l52.f fVar2 = b17.f249768d;
                    if (fVar2 != null) {
                        fVar2.p(listView, i17);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if ("onScroll".equals(str2) && "(Landroid/widget/AbsListView;III)V".equals(str3)) {
            mVar.getClass();
            if (java.lang.Boolean.valueOf(str.contains("com/tencent/mm/plugin/sns/ui/SnsUIAction$") || str.contains("com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$")).booleanValue()) {
                if (objArr.length < 4 || (jVar = mVar.f249774a) == null) {
                    return;
                }
                android.view.ViewGroup listView2 = (android.view.ViewGroup) objArr[0];
                int intValue2 = ((java.lang.Integer) objArr[1]).intValue();
                int intValue3 = ((java.lang.Integer) objArr[2]).intValue();
                ((java.lang.Integer) objArr[3]).intValue();
                e62.q qVar2 = ((e62.o) jVar).f249803a;
                java.lang.ref.WeakReference weakReference = qVar2.f249808f;
                if (weakReference == null) {
                    return;
                }
                android.app.Activity activity = (android.app.Activity) weakReference.get();
                if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                    com.tencent.mm.sdk.platformtools.Log.c("HABBYGE-MALI.SnsMonitor", "SnsMonitor onScroll is NULL or finishing", new java.lang.Object[0]);
                    return;
                }
                if (qVar2.f249811i == 1) {
                    qVar2.e(listView2);
                }
                e62.j b18 = qVar2.b(qVar2.f249806d);
                if (b18 != null) {
                    int i18 = qVar2.f249816q;
                    kotlin.jvm.internal.o.g(listView2, "listView");
                    l52.f fVar3 = b18.f249768d;
                    if (fVar3 != null) {
                        fVar3.o(activity, listView2, intValue2, intValue3, i18);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if ("resetStoryHeader".equals(str2) && "()V".equals(str3) && (fVar = mVar.f249776c) != null) {
            e62.q qVar3 = ((e62.p) fVar).f249804a;
            e62.j b19 = qVar3.b(qVar3.f249806d);
            if (b19 != null) {
                b19.b(false);
            }
        }
    }
}
