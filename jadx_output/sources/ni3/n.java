package ni3;

/* loaded from: classes10.dex */
public final class n extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: h, reason: collision with root package name */
    public static final ni3.j f337633h = new ni3.j(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f337634d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f337635e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f337636f;

    /* renamed from: g, reason: collision with root package name */
    public ni3.a1 f337637g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f337634d = jz5.h.b(new ni3.m(this));
        this.f337635e = jz5.h.b(new ni3.k(this));
        this.f337636f = jz5.h.b(new ni3.l(this));
    }

    public final java.lang.String O6() {
        if (!isBelongFragment()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("comment:");
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            sb6.append(nyVar != null ? java.lang.Integer.valueOf(nyVar.f135380n) : null);
            sb6.append(" contextId:");
            android.app.Activity context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            sb6.append(nyVar2 != null ? nyVar2.f135382p : null);
            sb6.append(" activity:");
            sb6.append(getActivity());
            sb6.append(" this:");
            sb6.append(this);
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("comment:");
        android.app.Activity context3 = getContext();
        kotlin.jvm.internal.o.g(context3, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        sb7.append(nyVar3 != null ? java.lang.Integer.valueOf(nyVar3.f135380n) : null);
        sb7.append(" tabType:");
        androidx.fragment.app.Fragment fragment = getFragment();
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = fragment instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment ? (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) fragment : null;
        sb7.append(finderHomeTabFragment != null ? java.lang.Integer.valueOf(finderHomeTabFragment.f129265p) : null);
        sb7.append(" contextId:");
        android.app.Activity context4 = getContext();
        kotlin.jvm.internal.o.g(context4, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar4 = context4 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        sb7.append(nyVar4 != null ? nyVar4.f135382p : null);
        sb7.append(" fragment:");
        sb7.append(getFragment());
        return sb7.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P6(com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer data, int i17, cw2.f8 videoCore, fc2.c cVar, int i18) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.report.r0 e76;
        kw2.m0 m0Var;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(videoCore, "videoCore");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAttach ");
        sb6.append(O6());
        sb6.append(" isEnableMonitorView:");
        ni3.j jVar = f337633h;
        sb6.append(jVar.a());
        sb6.append(" isEnableVideoLoadStrategyMonitor:");
        sb6.append(jVar.b());
        sb6.append("  ");
        com.tencent.mars.xlog.Log.i("FinderStreamMonitorUIC", sb6.toString());
        if (jVar.a()) {
            android.view.View view = (android.view.View) ((jz5.n) this.f337634d).getValue();
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) view).addView(com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.afy, this instanceof android.view.ViewGroup ? (android.view.ViewGroup) this : null, false));
            com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = (com.tencent.mm.plugin.monitor.FinderStreamMonitorView) ((jz5.n) this.f337636f).getValue();
            if (finderStreamMonitorView != null) {
                finderStreamMonitorView.f149463o = true;
                finderStreamMonitorView.f149459h = data;
                finderStreamMonitorView.f149464p = i18;
                finderStreamMonitorView.f149460i = videoCore;
                androidx.recyclerview.widget.RecyclerView recyclerView = finderStreamMonitorView.getRecyclerView();
                com.tencent.mm.plugin.monitor.FinderStreamMonitorView$onAttach$1 finderStreamMonitorView$onAttach$1 = new com.tencent.mm.plugin.monitor.FinderStreamMonitorView$onAttach$1(finderStreamMonitorView.getContext());
                finderStreamMonitorView$onAttach$1.setItemPrefetchEnabled(false);
                recyclerView.setLayoutManager(finderStreamMonitorView$onAttach$1);
                ni3.t tVar = new ni3.t(finderStreamMonitorView);
                tVar.setHasStableIds(true);
                finderStreamMonitorView.getRecyclerView().setAdapter(tVar);
                finderStreamMonitorView.getRecyclerView().setHasFixedSize(true);
                if (cVar != null) {
                    cVar.a(finderStreamMonitorView.A);
                }
                finderStreamMonitorView.getRecyclerView().setNestedScrollingEnabled(false);
                finderStreamMonitorView.getRecyclerView().setOnTouchListener(new ni3.l0(finderStreamMonitorView));
                ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().e(finderStreamMonitorView.f149469u);
                com.tencent.mm.plugin.finder.feed.ew ewVar = com.tencent.mm.plugin.finder.feed.pz.M1;
                ni3.w callback = finderStreamMonitorView.f149468t;
                kotlin.jvm.internal.o.g(callback, "callback");
                com.tencent.mm.plugin.finder.feed.pz.O1.add(callback);
            }
            android.view.View view2 = (android.view.View) ((jz5.n) this.f337635e).getValue();
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorUIC", "onAttach", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;ILcom/tencent/mm/plugin/finder/video/FinderVideoCore;Lcom/tencent/mm/plugin/finder/event/base/EventDispatcher;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/monitor/FinderStreamMonitorUIC", "onAttach", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;ILcom/tencent/mm/plugin/finder/video/FinderVideoCore;Lcom/tencent/mm/plugin/finder/event/base/EventDispatcher;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            Q6(com.tencent.mm.ui.bl.h(getContext()));
        }
        if (jVar.b()) {
            ni3.a1 a1Var = new ni3.a1();
            this.f337637g = a1Var;
            android.app.Activity context = getContext();
            android.app.Activity context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar == null || (str = nyVar.f135382p) == null) {
                str = "";
            }
            android.app.Activity context3 = getContext();
            kotlin.jvm.internal.o.g(context3, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            int i19 = nyVar2 != null ? nyVar2.f135380n : 0;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mars.xlog.Log.i("FinderStreamVideoLoadStrategyMonitor", "attach " + i19 + " tabType:" + i18 + ' ' + str + ' ' + a1Var);
            a1Var.f337527c = data;
            a1Var.f337528d = str;
            a1Var.f337529e = i19;
            a1Var.f337530f = i18;
            a1Var.f337526b = cVar;
            if (cVar != null) {
                cVar.a(a1Var.f337538n);
            }
            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().e(a1Var.f337539o);
            com.tencent.mm.plugin.finder.feed.ew ewVar2 = com.tencent.mm.plugin.finder.feed.pz.M1;
            ni3.w0 callback2 = a1Var.f337536l;
            kotlin.jvm.internal.o.g(callback2, "callback");
            com.tencent.mm.plugin.finder.feed.pz.O1.add(callback2);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = a1Var.f337531g;
            a1Var.i("attach", data, concurrentHashMap);
            ni3.o1 o1Var = a1Var.f337525a;
            o1Var.getClass();
            com.tencent.mars.xlog.Log.i("StrategyAsyncMonitor", "attach");
            o1Var.f337657d = context;
            o1Var.f337659f = data;
            o1Var.f337661h = concurrentHashMap;
            o1Var.f337660g = videoCore;
            o1Var.f337658e = ((c61.l7) i95.n0.c(c61.l7.class)).ek();
            o1Var.e();
            a1Var.f337537m.alive();
            android.app.Activity context4 = getContext();
            kotlin.jvm.internal.o.g(context4, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = context4 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar3 == null || (e76 = nyVar3.e7(i18)) == null || (m0Var = e76.f125288o) == null) {
                return;
            }
            m0Var.f313065j = this.f337637g;
        }
    }

    public final void Q6(int i17) {
        jz5.g gVar = this.f337636f;
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView = (com.tencent.mm.plugin.monitor.FinderStreamMonitorView) ((jz5.n) gVar).getValue();
        android.view.ViewGroup.LayoutParams layoutParams = finderStreamMonitorView != null ? finderStreamMonitorView.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = i17;
        }
        com.tencent.mm.plugin.monitor.FinderStreamMonitorView finderStreamMonitorView2 = (com.tencent.mm.plugin.monitor.FinderStreamMonitorView) ((jz5.n) gVar).getValue();
        if (finderStreamMonitorView2 != null) {
            finderStreamMonitorView2.requestLayout();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("FinderStreamMonitorUIC", "onCreate " + O6());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.util.LinkedHashMap linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        ni3.b1 b1Var;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2;
        com.tencent.mars.xlog.Log.i("FinderStreamMonitorUIC", "onDestroy " + O6());
        ni3.a1 a1Var = this.f337637g;
        if (a1Var != null) {
            fc2.c cVar = a1Var.f337526b;
            if (cVar != null) {
                cVar.d(a1Var.f337538n);
            }
            ek4.s Di = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di();
            Di.getClass();
            ni3.x0 callback = a1Var.f337539o;
            kotlin.jvm.internal.o.g(callback, "callback");
            Di.f253689e.remove(callback);
            com.tencent.mm.plugin.finder.feed.ew ewVar = com.tencent.mm.plugin.finder.feed.pz.M1;
            ni3.w0 callback2 = a1Var.f337536l;
            kotlin.jvm.internal.o.g(callback2, "callback");
            com.tencent.mm.plugin.finder.feed.pz.O1.remove(callback2);
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = a1Var.f337527c;
            if (dataBuffer == null) {
                kotlin.jvm.internal.o.o(ya.b.SOURCE);
                throw null;
            }
            int size = dataBuffer.size();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = a1Var.f337531g;
            java.lang.String str = " \n";
            if (size <= 0) {
                concurrentHashMap = concurrentHashMap2;
            } else {
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer2 = a1Var.f337527c;
                if (dataBuffer2 == null) {
                    kotlin.jvm.internal.o.o(ya.b.SOURCE);
                    throw null;
                }
                int size2 = dataBuffer2.size();
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry.getValue()).f337670a.h() == 4) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry2.getValue()).f337670a.h() == 9) {
                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                    }
                }
                int size3 = linkedHashMap4.size();
                java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry3 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry3.getValue()).f337670a.h() == 2) {
                        linkedHashMap5.put(entry3.getKey(), entry3.getValue());
                    }
                }
                int size4 = linkedHashMap5.size();
                java.util.LinkedHashMap linkedHashMap6 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry4 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry4.getValue()).f337674e) {
                        linkedHashMap6.put(entry4.getKey(), entry4.getValue());
                    }
                }
                int size5 = linkedHashMap6.size();
                java.util.LinkedHashMap linkedHashMap7 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry5 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry5.getValue()).f337675f) {
                        linkedHashMap7.put(entry5.getKey(), entry5.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap8 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry6 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry6.getValue()).f337675f && ((ni3.p0) entry6.getValue()).f337676g.f337731a) {
                        linkedHashMap8.put(entry6.getKey(), entry6.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap9 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry7 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry7.getValue()).f337675f && ((ni3.p0) entry7.getValue()).f337677h.f337731a) {
                        linkedHashMap9.put(entry7.getKey(), entry7.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap10 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry8 : concurrentHashMap2.entrySet()) {
                    if (((ni3.p0) entry8.getValue()).f337675f && ((ni3.p0) entry8.getValue()).f337678i.f337731a) {
                        linkedHashMap10.put(entry8.getKey(), entry8.getValue());
                    }
                }
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer3 = a1Var.f337527c;
                if (dataBuffer3 == null) {
                    kotlin.jvm.internal.o.o(ya.b.SOURCE);
                    throw null;
                }
                java.lang.String str2 = "FinderStreamVideoLoadStrategyMonitor";
                if (dataBuffer3.size() != concurrentHashMap2.size()) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("evaluateStreamQos diff:[");
                    com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer4 = a1Var.f337527c;
                    if (dataBuffer4 == null) {
                        kotlin.jvm.internal.o.o(ya.b.SOURCE);
                        throw null;
                    }
                    sb6.append(dataBuffer4.size());
                    sb6.append(" -- ");
                    sb6.append(concurrentHashMap2.size());
                    sb6.append("] \nsource:");
                    com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer5 = a1Var.f337527c;
                    if (dataBuffer5 == null) {
                        kotlin.jvm.internal.o.o(ya.b.SOURCE);
                        throw null;
                    }
                    linkedHashMap = linkedHashMap9;
                    linkedHashMap2 = linkedHashMap10;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(dataBuffer5, 10));
                    java.util.Iterator<T> it = dataBuffer5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(pm0.v.u(((so2.j5) it.next()).getItemId()));
                    }
                    sb6.append(kz5.n0.g0(arrayList, " ", null, null, 0, null, null, 62, null));
                    sb6.append("  \nxxlife:");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(concurrentHashMap2.size());
                    java.util.Iterator it6 = concurrentHashMap2.entrySet().iterator();
                    while (it6.hasNext()) {
                        arrayList2.add(pm0.v.u(((ni3.p0) ((java.util.Map.Entry) it6.next()).getValue()).f337670a.getItemId()));
                    }
                    sb6.append(kz5.n0.g0(arrayList2, " ", null, null, 0, null, null, 62, null));
                    sb6.append(" \n");
                    com.tencent.mars.xlog.Log.w("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
                } else {
                    linkedHashMap = linkedHashMap9;
                    linkedHashMap2 = linkedHashMap10;
                }
                java.lang.String str3 = "evaluateStreamQos: \n场景：" + a1Var.f337529e + " Tab:" + a1Var.f337530f + " \n总拉取:" + size2 + " 视频:" + linkedHashMap3.size() + " 直播:" + size3 + " 图片:" + size4 + " \n曝光：" + size5 + " 视频起播：" + linkedHashMap7.size() + " \n一段预加载命中率：" + a1Var.b(linkedHashMap8.size(), linkedHashMap7.size()) + " \n二段预加载命中率：" + a1Var.b(linkedHashMap.size(), linkedHashMap7.size()) + " \n预渲染命中率：   " + a1Var.b(linkedHashMap2.size(), linkedHashMap7.size()) + " \n";
                java.util.Map c17 = a1Var.c(linkedHashMap7, linkedHashMap8);
                java.util.LinkedHashMap linkedHashMap11 = new java.util.LinkedHashMap();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = (java.util.concurrent.ConcurrentHashMap) c17;
                for (java.util.Map.Entry entry9 : concurrentHashMap3.entrySet()) {
                    if (((ni3.p0) entry9.getValue()).f337676g.f337733c == 1) {
                        linkedHashMap11.put(entry9.getKey(), entry9.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap12 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry10 : concurrentHashMap3.entrySet()) {
                    if (((ni3.p0) entry10.getValue()).f337676g.f337733c == 2) {
                        linkedHashMap12.put(entry10.getKey(), entry10.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap13 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry11 : concurrentHashMap3.entrySet()) {
                    if (((ni3.p0) entry11.getValue()).f337676g.f337733c == 4) {
                        linkedHashMap13.put(entry11.getKey(), entry11.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap14 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry12 : concurrentHashMap3.entrySet()) {
                    if (((ni3.p0) entry12.getValue()).f337676g.f337733c == 5) {
                        linkedHashMap14.put(entry12.getKey(), entry12.getValue());
                    }
                }
                java.lang.String str4 = "stageOne failCount:" + concurrentHashMap3.size() + " \n" + a1Var.h("文件加载完毕", linkedHashMap11, c17) + a1Var.h("预加载未完成", linkedHashMap12, c17) + a1Var.h("落地不足5s", linkedHashMap13, c17) + a1Var.h("冷启动", linkedHashMap14, c17) + a1Var.h("未知原因", a1Var.c(a1Var.c(a1Var.c(a1Var.c(c17, linkedHashMap11), linkedHashMap12), linkedHashMap13), linkedHashMap14), c17) + '\n';
                java.util.Map c18 = a1Var.c(linkedHashMap7, linkedHashMap);
                java.util.LinkedHashMap linkedHashMap15 = new java.util.LinkedHashMap();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap4 = (java.util.concurrent.ConcurrentHashMap) c18;
                for (java.util.Map.Entry entry13 : concurrentHashMap4.entrySet()) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap5 = concurrentHashMap2;
                    if (((ni3.p0) entry13.getValue()).f337677h.f337733c == 1) {
                        linkedHashMap15.put(entry13.getKey(), entry13.getValue());
                    }
                    concurrentHashMap2 = concurrentHashMap5;
                }
                concurrentHashMap = concurrentHashMap2;
                java.util.LinkedHashMap linkedHashMap16 = new java.util.LinkedHashMap();
                java.util.Iterator it7 = concurrentHashMap4.entrySet().iterator();
                while (it7.hasNext()) {
                    java.util.Map.Entry entry14 = (java.util.Map.Entry) it7.next();
                    java.util.Iterator it8 = it7;
                    java.lang.String str5 = str2;
                    if (((ni3.p0) entry14.getValue()).f337677h.f337733c == 2) {
                        linkedHashMap16.put(entry14.getKey(), entry14.getValue());
                    }
                    str2 = str5;
                    it7 = it8;
                }
                java.lang.String str6 = str2;
                java.util.LinkedHashMap linkedHashMap17 = new java.util.LinkedHashMap();
                java.util.Iterator it9 = concurrentHashMap4.entrySet().iterator();
                while (it9.hasNext()) {
                    java.util.Map.Entry entry15 = (java.util.Map.Entry) it9.next();
                    java.util.Iterator it10 = it9;
                    java.lang.String str7 = str4;
                    if (((ni3.p0) entry15.getValue()).f337677h.f337733c == 4) {
                        linkedHashMap17.put(entry15.getKey(), entry15.getValue());
                    }
                    str4 = str7;
                    it9 = it10;
                }
                java.lang.String str8 = str4;
                java.util.LinkedHashMap linkedHashMap18 = new java.util.LinkedHashMap();
                java.util.Iterator it11 = concurrentHashMap4.entrySet().iterator();
                while (it11.hasNext()) {
                    java.util.Map.Entry entry16 = (java.util.Map.Entry) it11.next();
                    java.util.Iterator it12 = it11;
                    java.lang.String str9 = str3;
                    if (((ni3.p0) entry16.getValue()).f337677h.f337733c == 5) {
                        linkedHashMap18.put(entry16.getKey(), entry16.getValue());
                    }
                    str3 = str9;
                    it11 = it12;
                }
                java.lang.String str10 = str3;
                java.lang.String str11 = "stageTwo failCount:" + concurrentHashMap4.size() + " \n" + a1Var.h("文件加载完毕", linkedHashMap15, c18) + a1Var.h("预加载未完成", linkedHashMap16, c18) + a1Var.h("落地不足5s", linkedHashMap17, c18) + a1Var.h("冷启动", linkedHashMap18, c18) + a1Var.h("未知原因", a1Var.c(a1Var.c(a1Var.c(a1Var.c(c18, linkedHashMap15), linkedHashMap16), linkedHashMap17), linkedHashMap18), c18) + '\n';
                java.util.Map c19 = a1Var.c(linkedHashMap7, linkedHashMap2);
                java.util.LinkedHashMap linkedHashMap19 = new java.util.LinkedHashMap();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap6 = (java.util.concurrent.ConcurrentHashMap) c19;
                for (java.util.Map.Entry entry17 : concurrentHashMap6.entrySet()) {
                    if (((ni3.p0) entry17.getValue()).f337678i.f337733c == 3) {
                        linkedHashMap19.put(entry17.getKey(), entry17.getValue());
                    }
                }
                java.util.LinkedHashMap linkedHashMap20 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry18 : concurrentHashMap6.entrySet()) {
                    if (((ni3.p0) entry18.getValue()).f337678i.f337733c == 4) {
                        linkedHashMap20.put(entry18.getKey(), entry18.getValue());
                    }
                }
                java.lang.String str12 = "stagePreRender failCount:" + concurrentHashMap6.size() + " \n" + a1Var.h("无预加载", linkedHashMap19, c19) + a1Var.h("落地不足5s", linkedHashMap20, c19) + a1Var.h("未知原因", a1Var.c(a1Var.c(c19, linkedHashMap19), linkedHashMap20), c19) + '\n';
                java.util.LinkedHashMap linkedHashMap21 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry19 : linkedHashMap7.entrySet()) {
                    if (((ni3.p0) entry19.getValue()).f337673d.f337702b <= 0) {
                        linkedHashMap21.put(entry19.getKey(), entry19.getValue());
                    }
                }
                com.tencent.mars.xlog.Log.e(str6, str10 + ' ' + str8 + ' ' + str11 + ' ' + str12 + ' ' + ("invalidReport failCount:" + linkedHashMap21.size() + " \n" + a1Var.h("上报异常", linkedHashMap21, linkedHashMap7) + '\n'));
            }
            ni3.o1 o1Var = a1Var.f337525a;
            o1Var.f();
            kotlinx.coroutines.z0.e(o1Var.f337654a, null, 1, null);
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList3 = o1Var.f337664k;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList4 = o1Var.f337663j;
            java.util.Iterator it13 = copyOnWriteArrayList3.iterator();
            while (true) {
                boolean hasNext = it13.hasNext();
                b1Var = o1Var.f337665l;
                if (!hasNext) {
                    break;
                }
                ni3.k1 k1Var = (ni3.k1) it13.next();
                ni3.o1 o1Var2 = o1Var;
                ni3.l1 l1Var = k1Var.f337621a;
                java.util.Iterator it14 = it13;
                ni3.l1 l1Var2 = ni3.l1.f337627d;
                ni3.a1 a1Var2 = a1Var;
                java.lang.String str13 = k1Var.f337624d;
                java.lang.String str14 = str;
                ni3.p0 p0Var = k1Var.f337622b;
                if (l1Var == l1Var2) {
                    b1Var.getClass();
                    com.tencent.mm.autogen.mmdata.rpt.FinderVideoLoadMonitorStruct finderVideoLoadMonitorStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderVideoLoadMonitorStruct();
                    copyOnWriteArrayList = copyOnWriteArrayList3;
                    copyOnWriteArrayList2 = copyOnWriteArrayList4;
                    b1Var.a(101L, p0Var, finderVideoLoadMonitorStruct);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("hit", 1);
                    jSONObject.put("reasonType", -1);
                    jSONObject.put("reasonStr", str13);
                    jSONObject.put("count", k1Var.f337623c + 1);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    finderVideoLoadMonitorStruct.f58006p = finderVideoLoadMonitorStruct.b("aSyncStage1PreloadFail", r26.i0.t(jSONObject2, ",", ";", false), true);
                    finderVideoLoadMonitorStruct.l();
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList3;
                    copyOnWriteArrayList2 = copyOnWriteArrayList4;
                    if (l1Var == ni3.l1.f337628e) {
                        b1Var.getClass();
                        com.tencent.mm.autogen.mmdata.rpt.FinderVideoLoadMonitorStruct finderVideoLoadMonitorStruct2 = new com.tencent.mm.autogen.mmdata.rpt.FinderVideoLoadMonitorStruct();
                        b1Var.a(102L, p0Var, finderVideoLoadMonitorStruct2);
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("hit", true);
                        jSONObject3.put("reasonType", -1);
                        jSONObject3.put("reasonStr", str13);
                        jSONObject3.put("count", k1Var.f337623c + 1);
                        java.lang.String jSONObject4 = jSONObject3.toString();
                        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                        finderVideoLoadMonitorStruct2.f58007q = finderVideoLoadMonitorStruct2.b("aSyncStage2PreloadFail", r26.i0.t(jSONObject4, ",", ";", false), true);
                        finderVideoLoadMonitorStruct2.l();
                    }
                }
                copyOnWriteArrayList3 = copyOnWriteArrayList;
                o1Var = o1Var2;
                it13 = it14;
                a1Var = a1Var2;
                str = str14;
                copyOnWriteArrayList4 = copyOnWriteArrayList2;
            }
            ni3.a1 a1Var3 = a1Var;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList5 = copyOnWriteArrayList3;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList6 = copyOnWriteArrayList4;
            java.lang.String str15 = str;
            java.util.Iterator it15 = copyOnWriteArrayList6.iterator();
            while (it15.hasNext()) {
                ni3.j1 j1Var = (ni3.j1) it15.next();
                kotlin.jvm.internal.o.d(j1Var);
                b1Var.getClass();
                com.tencent.mm.autogen.mmdata.rpt.FinderVideoLoadMonitorStruct finderVideoLoadMonitorStruct3 = new com.tencent.mm.autogen.mmdata.rpt.FinderVideoLoadMonitorStruct();
                b1Var.a(104L, j1Var.f337617a, finderVideoLoadMonitorStruct3);
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put("hit", true);
                jSONObject5.put("reasonType", -1);
                jSONObject5.put("reasonStr", "");
                jSONObject5.put("count", j1Var.f337618b + 1);
                java.lang.String jSONObject6 = jSONObject5.toString();
                kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
                finderVideoLoadMonitorStruct3.f58007q = finderVideoLoadMonitorStruct3.b("aSyncStage2PreloadFail", r26.i0.t(jSONObject6, ",", ";", false), true);
                finderVideoLoadMonitorStruct3.l();
                copyOnWriteArrayList5 = copyOnWriteArrayList5;
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList7 = copyOnWriteArrayList5;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("evaluate \n预加载异常feed:");
            sb7.append(copyOnWriteArrayList7.size());
            sb7.append(" Count:");
            sb7.append(copyOnWriteArrayList7.size());
            sb7.append(" list:");
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList7, 10));
            java.util.Iterator it16 = copyOnWriteArrayList7.iterator();
            while (it16.hasNext()) {
                ni3.k1 k1Var2 = (ni3.k1) it16.next();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(k1Var2.f337622b.f337671b);
                sb8.append('.');
                sb8.append(k1Var2.f337621a);
                arrayList3.add(sb8.toString());
            }
            sb7.append(kz5.n0.g0(arrayList3, " ", null, null, 0, null, null, 62, null));
            sb7.append(" \n播放异常feed:");
            sb7.append(copyOnWriteArrayList6.size());
            sb7.append(" Count:");
            sb7.append(copyOnWriteArrayList6.size());
            sb7.append(" list:");
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList6, 10));
            java.util.Iterator it17 = copyOnWriteArrayList6.iterator();
            while (it17.hasNext()) {
                arrayList4.add(java.lang.String.valueOf(((ni3.j1) it17.next()).f337617a.f337671b));
            }
            sb7.append(kz5.n0.g0(arrayList4, " ", null, null, 0, null, null, 62, null));
            sb7.append(str15);
            com.tencent.mars.xlog.Log.e("StrategyAsyncMonitor", java.lang.String.valueOf(sb7.toString()));
            copyOnWriteArrayList7.clear();
            copyOnWriteArrayList6.clear();
            a1Var3.f337537m.dead();
            concurrentHashMap.clear();
            a1Var3.f337532h.clear();
            a1Var3.f337533i.clear();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        ni3.a1 a1Var = this.f337637g;
        if (a1Var != null) {
            a1Var.f337525a.f();
        }
        com.tencent.mars.xlog.Log.i("FinderStreamMonitorUIC", "onPause " + O6());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        ni3.a1 a1Var = this.f337637g;
        if (a1Var != null) {
            a1Var.f337525a.e();
        }
        com.tencent.mars.xlog.Log.i("FinderStreamMonitorUIC", "onResume " + O6());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        ni3.a1 a1Var = this.f337637g;
        if (a1Var != null) {
            a1Var.f337525a.e();
        }
        com.tencent.mars.xlog.Log.i("FinderStreamMonitorUIC", "onUserVisibleFocused " + O6());
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        ni3.a1 a1Var = this.f337637g;
        if (a1Var != null) {
            a1Var.f337525a.f();
        }
        com.tencent.mars.xlog.Log.i("FinderStreamMonitorUIC", "onUserVisibleUnFocused " + O6());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f337634d = jz5.h.b(new ni3.m(this));
        this.f337635e = jz5.h.b(new ni3.k(this));
        this.f337636f = jz5.h.b(new ni3.l(this));
    }
}
