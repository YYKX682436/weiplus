package se2;

/* loaded from: classes3.dex */
public final class a0 implements lm2.o {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.tb f406832a;

    /* renamed from: b, reason: collision with root package name */
    public long f406833b;

    public a0(android.content.Context context, int i17, com.tencent.mm.plugin.finder.live.plugin.tb plugin) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f406832a = plugin;
    }

    public final void a(boolean z17, long j17) {
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = this.f406832a;
        if (tbVar.u1() > 0) {
            if (z17) {
                tbVar.t1().post(new se2.x(this));
            } else if (j17 > 0) {
                ((se2.e0) ((jz5.n) tbVar.f114378z).getValue()).b(j17);
            }
        }
    }

    public final androidx.lifecycle.c1 b(java.lang.Class bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        return this.f406832a.S0().a(bu6);
    }

    public final void c(java.lang.Boolean bool) {
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = this.f406832a;
        d(tbVar.u1() - 1, bool);
        this.f406833b = tbVar.u1();
        ((mm2.e0) b(mm2.e0.class)).V6(0);
    }

    public final void d(int i17, java.lang.Boolean bool) {
        int i18 = i17;
        boolean b17 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = this.f406832a;
        if (b17) {
            com.tencent.mm.view.recyclerview.WxRecyclerView t17 = tbVar.t1();
            int u17 = tbVar.u1() - 1;
            if (i18 > u17) {
                i18 = u17;
            }
            if (i18 < 0) {
                i18 = 0;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            t17.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            return;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView t18 = tbVar.t1();
        int u18 = tbVar.u1() - 1;
        if (i18 > u18) {
            i18 = u18;
        }
        if (i18 < 0) {
            i18 = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(t18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
        t18.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(t18, "com/tencent/mm/plugin/finder/live/comment/BoxCommentListPresenter", "commentScrollToPos", "(ILjava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
    }

    public void e(lm2.t notifyMsg) {
        kotlin.jvm.internal.o.g(notifyMsg, "notifyMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyRemove commentListVisible:");
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = this.f406832a;
        sb6.append(tbVar.f114371s);
        sb6.append(" size:");
        sb6.append(tbVar.u1());
        sb6.append(' ');
        sb6.append(notifyMsg);
        com.tencent.mars.xlog.Log.i("BoxCommentListPresenter", sb6.toString());
        tbVar.x1("notifyRemoveInfo", notifyMsg);
        if (tbVar.f114371s) {
            boolean g17 = g();
            if (!g17) {
                h(notifyMsg, true);
            }
            long u17 = tbVar.u1() - this.f406833b;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = tbVar.f114375w;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemRangeRemoved(notifyMsg.f319449a, notifyMsg.f319450b);
            }
            a(g17, u17);
        }
    }

    public void f(lm2.t notifyMsg) {
        kotlin.jvm.internal.o.g(notifyMsg, "notifyMsg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("boxCommentLikeTrack notifyUpdate commentListVisible:");
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = this.f406832a;
        sb6.append(tbVar.f114371s);
        sb6.append(" notifyUpdate size:");
        sb6.append(tbVar.u1());
        sb6.append(' ');
        sb6.append(notifyMsg);
        com.tencent.mars.xlog.Log.i("BoxCommentListPresenter", sb6.toString());
        tbVar.x1("notifyUpdateInfo", notifyMsg);
        if (tbVar.f114371s) {
            zl2.r4.f473950a.M2("BoxCommentListPresenter", "boxCommentLikeTrack notifyUpdate size:" + tbVar.u1() + ' ' + notifyMsg);
            boolean g17 = g();
            long u17 = ((long) tbVar.u1()) - this.f406833b;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = tbVar.f114375w;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemRangeChanged(notifyMsg.f319449a, notifyMsg.f319450b, notifyMsg.f319451c);
            }
            a(g17, u17);
        }
    }

    public final boolean g() {
        return ((mm2.e0) b(mm2.e0.class)).f328973p && !com.tencent.mm.plugin.finder.view.oc.f132781a.b();
    }

    public final void h(lm2.t tVar, boolean z17) {
        java.util.List data;
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = this.f406832a;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = tbVar.f114375w;
        if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) {
            return;
        }
        try {
            int i17 = tVar.f319449a;
            int i18 = tVar.f319450b + i17;
            if (z17) {
                int i19 = ((mm2.e0) b(mm2.e0.class)).f328975r;
                if (i17 <= i19 && i19 < i18) {
                    ((mm2.e0) b(mm2.e0.class)).V6(0);
                }
            } else if (((mm2.e0) b(mm2.e0.class)).f328975r <= 0) {
                int u17 = tbVar.u1();
                if (i18 > u17) {
                    i18 = u17;
                }
                for (int i27 = tVar.f319449a; i27 < i18; i27++) {
                    if (zl2.r4.f473950a.y((lm2.c) data.get(i27))) {
                        ((mm2.e0) b(mm2.e0.class)).V6(i27);
                        break;
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "updateAtMeMsg");
        }
    }
}
