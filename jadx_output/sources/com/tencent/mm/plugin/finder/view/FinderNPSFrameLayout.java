package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0004\u001a\u00020\u0003R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderNPSFrameLayout;", "Landroid/widget/FrameLayout;", "Lkr2/k;", "", "getCurPos", "Lkotlinx/coroutines/y0;", "p", "Lkotlinx/coroutines/y0;", "getMainScope", "()Lkotlinx/coroutines/y0;", "mainScope", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderNPSFrameLayout extends android.widget.FrameLayout implements kr2.k {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f131330q = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f131331d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f131332e;

    /* renamed from: f, reason: collision with root package name */
    public in5.s0 f131333f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f131334g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f131335h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.pq f131336i;

    /* renamed from: m, reason: collision with root package name */
    public r45.yk2 f131337m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f131338n;

    /* renamed from: o, reason: collision with root package name */
    public kr2.j f131339o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.y0 mainScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNPSFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.mainScope = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout r19, r45.zk2 r20, boolean r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout.a(com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout, r45.zk2, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kr2.k
    public void T(r45.zk2 question, r45.xk2 answer, java.lang.String inputText, java.util.List mutliAnswerIDs) {
        r45.zk2 zk2Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(question, "question");
        kotlin.jvm.internal.o.g(answer, "answer");
        kotlin.jvm.internal.o.g(inputText, "inputText");
        kotlin.jvm.internal.o.g(mutliAnswerIDs, "mutliAnswerIDs");
        com.tencent.mm.plugin.finder.viewmodel.component.pq pqVar = this.f131336i;
        if (pqVar != null) {
            pqVar.f135588h = inputText;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = mutliAnswerIDs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String obj2 = next != null ? next.toString() : null;
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            pqVar.f135587g = kz5.z.C0(arrayList.toArray(new java.lang.String[0]));
            com.tencent.mm.plugin.finder.viewmodel.component.pq pqVar2 = this.f131336i;
            if (pqVar2 != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(answer.getLong(0));
                java.util.List list2 = pqVar2.f135586f;
                if (!list2.contains(valueOf)) {
                    list2.add(java.lang.Long.valueOf(answer.getLong(0)));
                }
            }
            d(question, com.tencent.mm.plugin.finder.viewmodel.component.qq.f135730e);
            int integer = answer.getInteger(5);
            if (integer == 1) {
                b();
                return;
            }
            if (integer != 2) {
                return;
            }
            r45.yk2 yk2Var = this.f131337m;
            if (yk2Var == null || (list = yk2Var.getList(1)) == null) {
                zk2Var = null;
            } else {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (((r45.zk2) obj).getLong(0) == answer.getLong(6)) {
                            break;
                        }
                    }
                }
                zk2Var = (r45.zk2) obj;
            }
            if (zk2Var != null) {
                kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.finder.view.tf(this, zk2Var, null), 3, null);
            } else {
                b();
            }
        }
    }

    public final void b() {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.plugin.finder.feed.k8 k8Var;
        android.content.Context context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = getContext().getString(com.tencent.mm.R.string.f491954mr1);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f131335h;
        if (baseFinderFeed == null || (weakReference = this.f131332e) == null || (k8Var = (com.tencent.mm.plugin.finder.feed.k8) weakReference.get()) == null) {
            return;
        }
        c(com.tencent.mm.plugin.finder.viewmodel.component.qq.f135731f);
        com.tencent.mm.plugin.finder.viewmodel.component.pq pqVar = this.f131336i;
        if (pqVar != null) {
            pqVar.f135581a = com.tencent.mm.plugin.finder.viewmodel.component.rq.f135829m;
        }
        k8Var.s0(baseFinderFeed);
    }

    public final void c(com.tencent.mm.plugin.finder.viewmodel.component.qq reportType) {
        r45.zk2 zk2Var;
        kotlin.jvm.internal.o.g(reportType, "reportType");
        com.tencent.mm.plugin.finder.viewmodel.component.pq pqVar = this.f131336i;
        if (pqVar == null || (zk2Var = pqVar.f135590j) == null) {
            return;
        }
        d(zk2Var, reportType);
    }

    public final void d(r45.zk2 zk2Var, com.tencent.mm.plugin.finder.viewmodel.component.qq qqVar) {
        int i17;
        com.tencent.mm.plugin.finder.viewmodel.component.pq pqVar = this.f131336i;
        if (pqVar == null || pqVar.f135581a == com.tencent.mm.plugin.finder.viewmodel.component.rq.f135829m) {
            return;
        }
        long j17 = pqVar.f135582b;
        java.lang.Long l17 = (java.lang.Long) pqVar.f135589i.get(java.lang.Long.valueOf(zk2Var.getLong(0)));
        long longValue = l17 != null ? l17.longValue() : 0L;
        long currentTimeMillis = qqVar == com.tencent.mm.plugin.finder.viewmodel.component.qq.f135730e ? java.lang.System.currentTimeMillis() : 0L;
        long currentTimeMillis2 = qqVar == com.tencent.mm.plugin.finder.viewmodel.component.qq.f135731f ? java.lang.System.currentTimeMillis() : 0L;
        r45.rt2 rt2Var = new r45.rt2();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f131335h;
        if (baseFinderFeed != null) {
            long itemId = baseFinderFeed.getItemId();
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            rt2Var.set(0, b52.b.q(itemId));
        }
        rt2Var.set(1, java.lang.Integer.valueOf(pqVar.f135584d + 1));
        r45.yk2 yk2Var = this.f131337m;
        if (yk2Var != null) {
            n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
            long j18 = yk2Var.getLong(0);
            ((m30.m) rVar).getClass();
            rt2Var.set(3, b52.b.q(j18));
            n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
            long j19 = yk2Var.getLong(3);
            ((m30.m) rVar2).getClass();
            rt2Var.set(2, b52.b.q(j19));
        }
        rt2Var.set(4, java.lang.Integer.valueOf(pqVar.f135583c));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = pqVar.f135585e.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                rt2Var.set(5, linkedList);
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                rt2Var.set(7, b52.b.q(longValue));
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                rt2Var.set(8, b52.b.q(currentTimeMillis));
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                rt2Var.set(9, b52.b.q(j17));
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                rt2Var.set(10, b52.b.q(currentTimeMillis2));
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                rt2Var.set(11, b52.b.b());
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                rt2Var.set(12, b52.b.c());
                java.lang.String jSONObject = rt2Var.toJSON().toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                int ordinal = qqVar.ordinal();
                if (ordinal == 0) {
                    i17 = 47;
                } else if (ordinal == 1) {
                    i17 = 48;
                } else {
                    if (ordinal != 2) {
                        throw new jz5.j();
                    }
                    i17 = 118;
                }
                com.tencent.mm.plugin.finder.report.l0.f(com.tencent.mm.plugin.finder.report.l0.f125109a, V6, this.f131335h, i17, jSONObject, null, null, 48, null);
                com.tencent.mars.xlog.Log.i("FinderNPSFrameLayout", "report NPS: ".concat(jSONObject));
                return;
            }
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            long longValue2 = ((java.lang.Number) next).longValue();
            java.lang.Long l18 = (java.lang.Long) kz5.n0.a0(pqVar.f135586f, i18);
            long longValue3 = l18 != null ? l18.longValue() : 0L;
            r45.st2 st2Var = new r45.st2();
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            st2Var.set(0, b52.b.q(longValue2));
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            st2Var.set(1, b52.b.q(longValue3));
            byte[] bytes = pqVar.f135588h.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            st2Var.set(2, android.util.Base64.encodeToString(bytes, 0));
            st2Var.getList(3).addAll(pqVar.f135587g);
            linkedList.add(st2Var);
            i18 = i19;
        }
    }

    /* renamed from: getCurPos, reason: from getter */
    public final int getF131331d() {
        return this.f131331d;
    }

    public kotlinx.coroutines.y0 getMainScope() {
        return this.mainScope;
    }

    @Override // kr2.k
    public void onCloseNPS() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }
}
