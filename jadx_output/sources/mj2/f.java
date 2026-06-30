package mj2;

/* loaded from: classes10.dex */
public class f extends mj2.j {

    /* renamed from: y, reason: collision with root package name */
    public final nj2.h f327028y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.content.Context r11, nj2.h r12, gk2.e r13, android.view.View r14, zh2.c r15, zh2.e r16, zh2.d r17, int r18, kotlin.jvm.internal.i r19) {
        /*
            r10 = this;
            r7 = r10
            r8 = r12
            r0 = r18 & 64
            if (r0 == 0) goto L9
            r0 = 0
            r6 = r0
            goto Lb
        L9:
            r6 = r17
        Lb:
            java.lang.String r0 = "context"
            r1 = r11
            kotlin.jvm.internal.o.g(r11, r0)
            java.lang.String r0 = "parentPanel"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "liveData"
            r2 = r13
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "root"
            r3 = r14
            kotlin.jvm.internal.o.g(r14, r0)
            java.lang.String r0 = "pluginAbility"
            r4 = r15
            kotlin.jvm.internal.o.g(r15, r0)
            java.lang.String r0 = "micUserInterface"
            r5 = r16
            kotlin.jvm.internal.o.g(r5, r0)
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f327028y = r8
            android.view.View r0 = r7.f327020n
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f473285a
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            java.util.Collections.reverse(r1)
            java.lang.Object[] r2 = r1.toArray()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicPayMicAcceptPanelWidget"
            java.lang.String r4 = "<init>"
            java.lang.String r5 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicLinkPluginAbility;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicUserInterface;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicSettingChangeListener;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r11 = r0
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r8
            r18 = r9
            yj0.a.d(r11, r12, r13, r14, r15, r16, r17, r18)
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/mic/widget/acceptpanel/FinderLiveMicPayMicAcceptPanelWidget"
            java.lang.String r2 = "<init>"
            java.lang.String r3 = "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveAnchorPayLinkPanel;Lcom/tencent/mm/plugin/finder/live/model/context/LiveBuContext;Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicLinkPluginAbility;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicUserInterface;Lcom/tencent/mm/plugin/finder/live/mic/api/IMicSettingChangeListener;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            yj0.a.f(r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mj2.f.<init>(android.content.Context, nj2.h, gk2.e, android.view.View, zh2.c, zh2.e, zh2.d, int, kotlin.jvm.internal.i):void");
    }

    @Override // mj2.e
    public void k(java.lang.String source) {
        java.util.ArrayList<km2.q> arrayList;
        java.lang.String str;
        kotlin.jvm.internal.o.g(source, "source");
        this.f327025s.clear();
        java.util.ArrayList arrayList2 = this.f327025s;
        java.util.List list = ((mm2.o4) this.f327014e.a(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!kotlin.jvm.internal.o.b(((km2.q) obj).f309189t, java.lang.Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (km2.q qVar : arrayList) {
            km2.b0 b0Var = qVar.f309169J;
            if (b0Var == null || (str = b0Var.f309075b) == null) {
                str = "";
            }
            arrayList3.add(new vi2.a(qVar, str, b0Var != null ? b0Var.f309074a : 0));
        }
        arrayList2.addAll(arrayList3);
        com.tencent.mars.xlog.Log.i(this.f327019m, "fillApplyLinkUserList source: " + source + " applyRealSize: " + this.f327025s.size() + " audienceLinkMicUserList: " + ((mm2.o4) this.f327014e.a(mm2.o4.class)).f329327v);
        this.f327024r.clear();
        this.f327024r.addAll(this.f327025s);
    }

    @Override // mj2.e
    public void m() {
        com.tencent.mm.plugin.finder.live.widget.e0.t(this.f327028y, false, 1, null);
    }

    @Override // mj2.j
    public boolean s() {
        return false;
    }
}
