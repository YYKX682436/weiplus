package l94;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: e, reason: collision with root package name */
    public static final l94.b f317340e = new l94.b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f317341f;

    /* renamed from: g, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.n2 f317342g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f317343a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f317344b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f317345c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f317346d;

    static {
        kotlinx.coroutines.flow.i2 a17 = kotlinx.coroutines.flow.r2.a(0, 3, u26.u.DROP_OLDEST);
        f317341f = a17;
        f317342g = a17;
    }

    public e(java.lang.String componentName, android.content.Context context) {
        kotlin.jvm.internal.o.g(componentName, "componentName");
        kotlin.jvm.internal.o.g(context, "context");
        this.f317343a = context;
        this.f317344b = componentName;
        this.f317346d = new java.util.ArrayList();
    }

    public final void b(l94.e component, android.view.ViewGroup viewGroup) {
        jz5.f0 f0Var;
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addChild", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        kotlin.jvm.internal.o.g(component, "component");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f317346d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            f0Var = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((l94.a) obj).a(), component)) {
                    break;
                }
            }
        }
        l94.a aVar = (l94.a) obj;
        java.lang.String str = this.f317344b;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i(str, "there is already an same component");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addChild", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            return;
        }
        l94.a aVar2 = new l94.a(component, null, 2, null);
        arrayList.add(aVar2);
        if (viewGroup == null) {
            viewGroup = m();
        }
        if (viewGroup != null) {
            a84.y0.b(viewGroup, component.i(), -1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
            aVar2.f317320b = viewGroup;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "the parent is null, when add child component");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addChild", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
    }

    public final void c(h94.a foldAdInfo) {
        kotlinx.coroutines.y0 b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        kotlin.jvm.internal.o.g(foldAdInfo, "foldAdInfo");
        android.view.View view = this.f317345c;
        java.lang.String str = this.f317344b;
        if (view == null) {
            com.tencent.mars.xlog.Log.e(str, "the associateView is not initialized!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            return;
        }
        j(foldAdInfo);
        java.util.Iterator it = this.f317346d.iterator();
        while (it.hasNext()) {
            ((l94.a) it.next()).a().c(foldAdInfo);
        }
        if (g()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMainScope", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            android.content.Context context = this.f317343a;
            if (context instanceof androidx.appcompat.app.AppCompatActivity) {
                b17 = v65.m.b((androidx.appcompat.app.AppCompatActivity) context);
            } else {
                com.tencent.mars.xlog.Log.w(str, "the context is not AppCompatActivity");
                b17 = kotlinx.coroutines.z0.b();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMainScope", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            kotlinx.coroutines.l.d(b17, null, null, new l94.d(this, foldAdInfo, null), 3, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
    }

    public final android.view.View d() {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        this.f317345c = k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBuildChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f317346d;
        boolean isEmpty = arrayList.isEmpty();
        java.lang.String str = this.f317344b;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.i(str, "there is no child");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBuildChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        } else {
            android.view.ViewGroup m17 = m();
            if (m17 != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    l94.a aVar = (l94.a) it.next();
                    aVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
                    android.view.ViewGroup viewGroup = aVar.f317320b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
                    if (viewGroup == null && !a84.y0.f(aVar.a().i())) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
                        aVar.f317320b = m17;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setParentView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
                        m17.addView(aVar.a().i());
                    }
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w(str, "the component can't be have child!!");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBuildChildren", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        }
        android.view.View e17 = e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return e17;
    }

    public final android.view.View e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAssociateView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        android.view.View view = this.f317345c;
        if (view != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAssociateView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
            return view;
        }
        kotlin.jvm.internal.o.o("associateView");
        throw null;
    }

    public final android.content.Context f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return this.f317343a;
    }

    public boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShouldRegisterEventHandler", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShouldRegisterEventHandler", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return false;
    }

    public final java.lang.String h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return this.f317344b;
    }

    public final android.view.View i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        if (this.f317345c == null) {
            this.f317345c = d();
        }
        android.view.View e17 = e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return e17;
    }

    public void j(h94.a adInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
    }

    public abstract android.view.View k();

    public void l(h94.a adInfo, l94.l eventData) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHandleViewEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        kotlin.jvm.internal.o.g(eventData, "eventData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHandleViewEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
    }

    public final android.view.ViewGroup m() {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toViewGroup", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        if (this.f317345c == null || !(e() instanceof android.view.ViewGroup)) {
            com.tencent.mars.xlog.Log.i(this.f317344b, "the component view is not view group");
            viewGroup = null;
        } else {
            viewGroup = (android.view.ViewGroup) e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toViewGroup", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent");
        return viewGroup;
    }
}
