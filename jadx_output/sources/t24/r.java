package t24;

/* loaded from: classes.dex */
public final class r extends a24.g {
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.view.ViewGroup viewGroup;
        c24.f item = (c24.f) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        p(holder, item, i17, i18, z17, list);
        a24.i iVar = item.f38077e;
        if (iVar instanceof s24.f) {
            if (!((s24.f) iVar).z7() && (viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.f486681m43)) != null) {
                int i19 = 0;
                while (true) {
                    if (!(i19 < viewGroup.getChildCount())) {
                        break;
                    }
                    int i27 = i19 + 1;
                    android.view.View childAt = viewGroup.getChildAt(i19);
                    if (childAt == null) {
                        throw new java.lang.IndexOutOfBoundsException();
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingJumpConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/setting/ui/setting_new/model/SettingMvvmListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingJumpConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/setting/ui/setting_new/model/SettingMvvmListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i19 = i27;
                }
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(android.R.id.title);
            if (textView != null) {
                textView.setText(iVar.c7());
            }
            q(holder, iVar.W6(), com.tencent.mm.R.id.f484050cu2, t24.j.f415323d);
            q(holder, iVar.getF161878p(), android.R.id.summary, t24.k.f415324d);
            if (iVar.getF161879q() != null) {
                q(holder, iVar.getF161879q(), android.R.id.summary, t24.l.f415325d);
            }
            q(holder, iVar.getF161880r(), com.tencent.mm.R.id.rrl, t24.m.f415326d);
            q(holder, java.lang.Integer.valueOf(iVar.getF161881s()), com.tencent.mm.R.id.rrl, t24.n.f415327d);
            s24.f fVar = (s24.f) iVar;
            java.lang.Integer f161896t = fVar.getF161896t();
            q(holder, f161896t != null ? fVar.getContext().getDrawable(f161896t.intValue()) : null, com.tencent.mm.R.id.o4r, t24.o.f415328d);
            java.lang.Integer f161894r = fVar.getF161894r();
            q(holder, f161894r != null ? fVar.getContext().getString(f161894r.intValue()) : null, com.tencent.mm.R.id.o58, t24.p.f415329d);
            java.lang.Integer f161895s = fVar.getF161895s();
            q(holder, f161895s != null ? fVar.getContext().getResources().getDrawable(f161895s.intValue()) : null, com.tencent.mm.R.id.o58, t24.q.f415330d);
            q(holder, null, com.tencent.mm.R.id.o5_, t24.e.f415318d);
            java.lang.Integer y76 = fVar.y7();
            q(holder, y76 != null ? fVar.getContext().getDrawable(y76.intValue()) : null, com.tencent.mm.R.id.h9o, t24.f.f415319d);
            q(holder, iVar.getF161878p(), com.tencent.mm.R.id.o57, t24.g.f415320d);
            if (kotlin.jvm.internal.o.b(fVar.C7(), "")) {
                return;
            }
            q(holder, fVar.C7(), com.tencent.mm.R.id.h9o, new t24.h(iVar));
            q(holder, holder.f293121e.getDrawable(com.tencent.mm.R.drawable.bfj), com.tencent.mm.R.id.oct, t24.i.f415322d);
        }
    }

    @Override // a24.g
    public java.lang.Integer n(in5.s0 holder, a24.i baseItem, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(baseItem, "baseItem");
        if (baseItem instanceof s24.f) {
            s24.f fVar = (s24.f) baseItem;
            if (!fVar.z7()) {
                return java.lang.Integer.valueOf(com.tencent.mm.R.layout.f489293ek5);
            }
            if (!kotlin.jvm.internal.o.b(fVar.C7(), "")) {
                return java.lang.Integer.valueOf(com.tencent.mm.R.layout.bzs);
            }
            java.lang.Integer f161896t = fVar.getF161896t();
            if ((f161896t != null ? fVar.getContext().getDrawable(f161896t.intValue()) : null) == null && baseItem.W6() == null) {
                java.lang.Integer f161894r = fVar.getF161894r();
                if ((f161894r != null ? fVar.getContext().getString(f161894r.intValue()) : null) == null && baseItem.getF161880r() == null) {
                    if (kotlin.jvm.internal.o.b(baseItem.c7(), "")) {
                        return java.lang.Integer.valueOf(com.tencent.mm.R.layout.c0r);
                    }
                }
            }
            return java.lang.Integer.valueOf(com.tencent.mm.R.layout.bzh);
        }
        return null;
    }
}
