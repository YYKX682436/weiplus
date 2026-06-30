package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ld extends com.tencent.mm.plugin.finder.viewmodel.component.mb0 implements zy2.d7 {

    /* renamed from: f, reason: collision with root package name */
    public final so2.c f135051f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f135052g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f135053h;

    /* renamed from: i, reason: collision with root package name */
    public da2.g f135054i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135051f = so2.c.f410280g;
        this.f135052g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.gd(this));
        this.f135053h = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.hd.f134620d);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void O6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        da2.g gVar = this.f135054i;
        if (gVar != null) {
            gVar.j();
        }
        this.f135054i = null;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void P6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        java.util.List list;
        boolean z17;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        U6(holder);
        java.lang.Object obj = holder.f293125i;
        java.lang.Object obj2 = null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null || (list = (java.util.List) ((xc2.k0) ((jz5.n) this.f135053h).getValue()).U6(baseFinderFeed.getItemId()).getValue()) == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.LinkedList<r45.wf6> style = ((com.tencent.mm.protocal.protobuf.FinderJumpInfo) next).getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            if (!style.isEmpty()) {
                for (r45.wf6 wf6Var : style) {
                    kotlin.jvm.internal.o.d(wf6Var);
                    if (f7(wf6Var)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                obj2 = next;
                break;
            }
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj2;
        if (finderJumpInfo == null) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.r1.f102493a.d(finderJumpInfo.getBusiness_type(), baseFinderFeed.getItemId());
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public android.view.View R6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.fte);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.tencent.mm.R.id.ftf);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        if (inflate != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMusicFollowPatUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMusicFollowPatUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return inflate;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public so2.c S6() {
        return this.f135051f;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void W6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder.p(com.tencent.mm.R.id.fte) != null) {
            super.W6(holder);
        }
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return d7(holder) && R6(holder) != null;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void c7(in5.s0 holder) {
        xc2.p0 e76;
        r45.d60 d60Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.c7(holder);
        U6(holder);
        java.lang.Object obj = holder.f293125i;
        java.lang.Object obj2 = null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null || (e76 = e7(baseFinderFeed)) == null) {
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = e76.f453234a;
        java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            r45.wf6 wf6Var = (r45.wf6) next;
            kotlin.jvm.internal.o.d(wf6Var);
            if (f7(wf6Var)) {
                obj2 = next;
                break;
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj2;
        if (wf6Var2 == null || (d60Var = (r45.d60) wf6Var2.getCustom(31)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify: show, biz_type=");
        sb6.append(finderJumpInfo.getBusiness_type());
        sb6.append(", wording=");
        boolean z17 = true;
        sb6.append(d60Var.getString(1));
        sb6.append(", desc=");
        sb6.append(d60Var.getString(2));
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(baseFinderFeed.getItemId()));
        com.tencent.mars.xlog.Log.i("FinderFeedMusicFollowPatUIC", sb6.toString());
        android.view.View R6 = R6(holder);
        if (R6 == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) R6.findViewById(com.tencent.mm.R.id.k0v);
        if (textView != null) {
            textView.setText(d60Var.getString(1));
        }
        android.widget.TextView textView2 = (android.widget.TextView) R6.findViewById(com.tencent.mm.R.id.jzt);
        if (textView2 != null) {
            java.lang.String string = d60Var.getString(2);
            if (string != null && string.length() != 0) {
                z17 = false;
            }
            if (z17) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(d60Var.getString(2));
            }
        }
        android.widget.TextView textView3 = (android.widget.TextView) R6.findViewById(com.tencent.mm.R.id.b1l);
        if (textView3 != null) {
            textView3.setText(d60Var.getString(4));
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        java.lang.String string2 = d60Var.getString(0);
        com.tencent.mm.plugin.finder.storage.y90 y90Var = com.tencent.mm.plugin.finder.storage.y90.f128356f;
        mn2.q3 q3Var = new mn2.q3(string2, y90Var);
        mn2.f1 f1Var = mn2.f1.f329964r;
        wo0.c b17 = e17.b(q3Var, g1Var.h(f1Var));
        android.view.View findViewById = R6.findViewById(com.tencent.mm.R.id.f486040jz2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        b17.c((android.widget.ImageView) findViewById);
        wo0.c b18 = g1Var.e().b(new mn2.q3(d60Var.getString(3), y90Var), g1Var.h(f1Var));
        android.view.View findViewById2 = R6.findViewById(com.tencent.mm.R.id.b0o);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        b18.c((android.widget.ImageView) findViewById2);
    }

    public final boolean d7(in5.s0 s0Var) {
        java.util.List list;
        java.lang.Object obj = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null || (list = (java.util.List) ((xc2.k0) ((jz5.n) this.f135053h).getValue()).U6(baseFinderFeed.getItemId()).getValue()) == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.LinkedList<r45.wf6> style = ((com.tencent.mm.protocal.protobuf.FinderJumpInfo) next).getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            if (!style.isEmpty()) {
                for (r45.wf6 wf6Var : style) {
                    kotlin.jvm.internal.o.d(wf6Var);
                    if (f7(wf6Var)) {
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(next);
            }
        }
        return (arrayList.isEmpty() ^ true) && com.tencent.mm.plugin.finder.assist.r1.f102493a.a(((com.tencent.mm.protocal.protobuf.FinderJumpInfo) kz5.n0.X(arrayList)).getBusiness_type(), null);
    }

    public final xc2.p0 e7(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        boolean z17;
        java.util.List list = (java.util.List) ((xc2.k0) ((jz5.n) this.f135053h).getValue()).U6(baseFinderFeed.getItemId()).getValue();
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.util.LinkedList<r45.wf6> style = ((com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj).getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            if (!style.isEmpty()) {
                for (r45.wf6 wf6Var : style) {
                    kotlin.jvm.internal.o.d(wf6Var);
                    if (f7(wf6Var)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(obj);
            }
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) kz5.n0.Z(arrayList);
        if (finderJumpInfo == null) {
            return null;
        }
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453244f = baseFinderFeed;
        p0Var.f453257s = 23;
        p0Var.f453256r = 16;
        return p0Var;
    }

    public final boolean f7(r45.wf6 wf6Var) {
        if (wf6Var.getInteger(2) != 23 || wf6Var.getInteger(1) != 16) {
            return false;
        }
        r45.d60 d60Var = (r45.d60) wf6Var.getCustom(31);
        if (!(d60Var != null && d60Var.getInteger(5) == 1)) {
            r45.d60 d60Var2 = (r45.d60) wf6Var.getCustom(31);
            if (!(d60Var2 != null && d60Var2.getInteger(5) == 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        da2.g gVar = this.f135054i;
        if (gVar != null) {
            gVar.j();
        }
        this.f135054i = null;
    }
}
