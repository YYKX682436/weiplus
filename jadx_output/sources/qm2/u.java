package qm2;

/* loaded from: classes3.dex */
public final class u extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f364752d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f364753e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f364754f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f364755g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveColiveAnchorListAvatars f364756h;

    /* renamed from: i, reason: collision with root package name */
    public gk2.e f364757i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f364758m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f364758m = jz5.h.b(new qm2.n(activity, this));
    }

    public final void O6(boolean z17) {
        gk2.e eVar;
        r45.h32 h32Var;
        gk2.e eVar2 = this.f364757i;
        if (eVar2 != null && ((mm2.c1) eVar2.a(mm2.c1.class)).a8()) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "setLiveNoticeInfo: has started live");
            return;
        }
        gk2.e eVar3 = this.f364757i;
        r45.c32 c32Var = eVar3 != null ? ((mm2.c1) eVar3.a(mm2.c1.class)).f328877r6 : null;
        gk2.e eVar4 = this.f364757i;
        r45.h32 z76 = eVar4 != null ? ((mm2.c1) eVar4.a(mm2.c1.class)).z7() : null;
        if (z17 && (eVar = this.f364757i) != null && (h32Var = ((mm2.c1) eVar.a(mm2.c1.class)).f328816h5) != null) {
            r45.q65 q65Var = (r45.q65) h32Var.getCustom(10);
            if (q65Var != null && q65Var.getBoolean(0)) {
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "setLiveNoticeInfo: is pay notice");
                z76 = h32Var;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setLiveNoticeInfo: canChangeWhiteList=");
        sb6.append(z17);
        sb6.append(", noticeId=");
        sb6.append(z76 != null ? z76.getString(4) : null);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
        if (z76 == null) {
            android.view.View view = this.f364752d;
            if (!(view != null && view.getVisibility() == 0)) {
                if ((c32Var != null ? c32Var.getInteger(0) : 0) != 0) {
                    android.view.View view2 = this.f364752d;
                    if (view2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view3 = this.f364754f;
                    if (view3 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView textView = this.f364753e;
                    if (textView == null) {
                        return;
                    }
                    android.content.res.Resources resources = getContext().getResources();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = c32Var != null ? java.lang.Integer.valueOf(c32Var.getInteger(0)) : null;
                    textView.setText(resources.getString(com.tencent.mm.R.string.noi, objArr));
                    return;
                }
            }
            android.view.View view4 = this.f364752d;
            if (view4 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.String string = z76.getString(4);
        if ((string == null || string.length() == 0) || (z76.getInteger(6) & 1) != 1) {
            gk2.e eVar5 = this.f364757i;
            mm2.c1 c1Var = eVar5 != null ? (mm2.c1) eVar5.a(mm2.c1.class) : null;
            if (c1Var != null) {
                c1Var.f328816h5 = null;
                c1Var.f328810g5 = null;
            }
            android.view.View view5 = this.f364752d;
            if (view5 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        kotlinx.coroutines.l.d(getMainScope(), null, null, new qm2.s(z76, this, z17, null), 3, null);
        android.view.View view6 = this.f364752d;
        if (view6 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var2 = ml2.c1.f327325e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", "1");
        jSONObject.put("notice_id", java.lang.String.valueOf(z76.getString(4)));
        zy2.zb.j5(zbVar, 51L, jSONObject.toString(), null, 4, null);
        android.view.View view7 = this.f364752d;
        if (view7 != null) {
            view7.setOnClickListener(new qm2.t(this, z76, c32Var));
        }
    }
}
