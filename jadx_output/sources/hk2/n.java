package hk2;

/* loaded from: classes3.dex */
public final class n extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f281910e;

    public n(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f281910e = buContext;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dh8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String obj;
        java.lang.Object obj2;
        hk2.m item = (hk2.m) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (!(list == null || list.isEmpty())) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (kotlin.jvm.internal.o.b(obj2, 1)) {
                        break;
                    }
                }
            }
            if (obj2 != null) {
                holder.p(com.tencent.mm.R.id.f484803q42).setBackgroundResource(item.f281909e ? com.tencent.mm.R.drawable.cgf : com.tencent.mm.R.drawable.c49);
                return;
            }
        }
        ek2.q0 q0Var = ek2.r0.f253519y;
        r45.o84 o84Var = item.f281908d;
        r45.t12 a17 = q0Var.a("", 1, o84Var.getInteger(0));
        r45.xn1 xn1Var = new r45.xn1();
        gk2.e eVar = this.f281910e;
        xn1Var.set(11, ((mm2.c1) eVar.a(mm2.c1.class)).f328812h);
        zl2.r4 r4Var = zl2.r4.f473950a;
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        xn1Var.set(0, r4Var.m0(eVar));
        a17.set(8, xn1Var);
        int integer = o84Var.getInteger(0);
        android.content.Context context = holder.f293121e;
        java.lang.String string = integer != 2 ? integer != 3 ? context.getResources().getString(com.tencent.mm.R.string.hha) : context.getResources().getString(com.tencent.mm.R.string.j5v) : context.getResources().getString(com.tencent.mm.R.string.i6j);
        kotlin.jvm.internal.o.d(string);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.i8m);
        java.lang.String str = (textView == null || (obj = android.text.TextUtils.ellipsize(string, textView.getPaint(), (float) i65.a.a(context, 51.5f), android.text.TextUtils.TruncateAt.END).toString()) == null) ? string : obj;
        hk2.r rVar = hk2.r.f281914a;
        gk2.e eVar2 = this.f281910e;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        rVar.a(eVar2, itemView, new dk2.mf(a17), str, false);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.c7g);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/danmakuitem/LiveFloatMsgConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/model/danmakuitem/FinderLiveFloatMsg;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/model/danmakuitem/LiveFloatMsgConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/model/danmakuitem/FinderLiveFloatMsg;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.p(com.tencent.mm.R.id.f484803q42).setBackgroundResource(item.f281909e ? com.tencent.mm.R.drawable.cgf : com.tencent.mm.R.drawable.c49);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.pvx);
        int integer2 = o84Var.getInteger(0);
        if (integer2 == 2 || integer2 == 3) {
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            int integer3 = o84Var.getInteger(2);
            textView2.setText(context.getResources().getString(com.tencent.mm.R.string.idn, java.lang.Integer.valueOf(integer3 >= 0 ? integer3 : 0)));
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.ev_);
        if (p18 != null) {
            p18.measure(android.view.View.MeasureSpec.makeMeasureSpec(holder.o().getLayoutParams().width, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(holder.o().getLayoutParams().width, Integer.MIN_VALUE));
            if (p18.getMeasuredWidth() > holder.p(com.tencent.mm.R.id.f484803q42).getLayoutParams().width - (context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv) * 2)) {
                p18.getLayoutParams().width = p18.getMeasuredWidth();
                android.view.ViewGroup.LayoutParams layoutParams = p18.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.gravity = 3;
                }
                p18.setTranslationX(0.0f);
                return;
            }
            p18.getLayoutParams().width = -2;
            android.view.ViewGroup.LayoutParams layoutParams3 = p18.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.gravity = 1;
            }
            if (holder.p(com.tencent.mm.R.id.lti) != null) {
                p18.setTranslationX((r1.getPaddingRight() - r1.getPaddingLeft()) / 2.0f);
            }
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.pvx);
        if (textView != null) {
            d92.f.f227470a.l(textView, 17.0f, false);
        }
    }
}
