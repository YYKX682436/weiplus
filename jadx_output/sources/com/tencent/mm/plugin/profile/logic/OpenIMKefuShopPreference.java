package com.tencent.mm.plugin.profile.logic;

/* loaded from: classes3.dex */
public final class OpenIMKefuShopPreference extends com.tencent.mm.ui.base.preference.Preference {
    public java.lang.String L;
    public final java.util.List M;
    public final java.util.List N;
    public android.view.View P;
    public final com.tencent.mm.ui.MMActivity Q;
    public r45.z46 R;
    public android.view.View S;

    public OpenIMKefuShopPreference(android.content.Context context) {
        this(context, null);
        this.Q = (com.tencent.mm.ui.MMActivity) context;
    }

    public void M() {
        java.util.List list = this.M;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((android.widget.ImageView) it.next()).setVisibility(8);
        }
        java.util.List list2 = this.N;
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            ((android.widget.ImageView) it6.next()).setVisibility(8);
        }
        r45.z46 z46Var = this.R;
        for (int i17 = 0; i17 < z46Var.getList(2).size() && i17 < ((java.util.LinkedList) list).size(); i17++) {
            android.widget.ImageView imageView = (android.widget.ImageView) ((java.util.LinkedList) list).get(i17);
            imageView.setVisibility(0);
            android.widget.ImageView imageView2 = (android.widget.ImageView) ((java.util.LinkedList) list2).get(i17);
            int integer = ((r45.ow6) z46Var.getList(2).get(i17)).getInteger(1);
            int i18 = integer == 1 ? com.tencent.mm.R.raw.picture : integer == 2 ? com.tencent.mm.R.raw.play : (integer == 4 || integer == 5) ? com.tencent.mm.R.raw.eighth_note : integer == 6 ? com.tencent.mm.R.raw.audio : 0;
            if (i18 != 0) {
                imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(imageView2.getContext(), i18, imageView2.getContext().getColor(com.tencent.mm.R.color.UN_BW_100_Alpha_0_8)));
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            java.lang.String url = ((r45.ow6) z46Var.getList(2).get(i17)).getString(2);
            kotlin.jvm.internal.o.g(url, "url");
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(url, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.B));
        }
        android.view.View view = this.P;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/OpenIMKefuShopPreference", "updateAlbum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/logic/OpenIMKefuShopPreference", "updateAlbum", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        com.tencent.mm.ui.MMActivity mMActivity;
        super.t(view);
        java.util.LinkedList linkedList = (java.util.LinkedList) this.M;
        linkedList.clear();
        linkedList.add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9p));
        linkedList.add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9q));
        linkedList.add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9r));
        linkedList.add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9s));
        java.util.LinkedList linkedList2 = (java.util.LinkedList) this.N;
        linkedList2.clear();
        linkedList2.add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.r_g));
        linkedList2.add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.r_h));
        linkedList2.add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.r_i));
        linkedList2.add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.r_j));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482920rt);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            textView.setText(this.L);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i65.a.h(this.f197770d, com.tencent.mm.R.dimen.f479786f7);
            textView.setLayoutParams(layoutParams);
            com.tencent.mm.ui.bk.s0(textView.getPaint());
            textView.setTextSize(0, i65.a.h(r5, com.tencent.mm.R.dimen.f479850gz));
        }
        this.P = view.findViewById(com.tencent.mm.R.id.f482890qy);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.fuv);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m38);
        int i17 = 0;
        while (true) {
            int size = linkedList.size();
            mMActivity = this.Q;
            if (i17 >= size) {
                break;
            }
            ((android.widget.ImageView) linkedList.get(i17)).getLayoutParams().height = i65.a.b(mMActivity, 48);
            i17++;
        }
        for (int i18 = 0; i18 < linkedList2.size(); i18++) {
            ((android.widget.ImageView) linkedList2.get(i18)).getLayoutParams().height = i65.a.b(mMActivity, 12);
        }
        textView2.setText(this.R.getString(0));
        textView2.setVisibility(0);
        M();
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
        android.view.ViewGroup.LayoutParams layoutParams4 = view.findViewById(com.tencent.mm.R.id.k3k).getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams5 = layoutParams4 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams4 : null;
        android.view.ViewGroup.LayoutParams layoutParams6 = textView.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams7 = layoutParams6 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams6 : null;
        if (!this.R.getList(2).isEmpty()) {
            if (layoutParams3 != null) {
                layoutParams3.topMargin = i65.a.b(mMActivity, 19);
                return;
            }
            return;
        }
        if (layoutParams3 != null) {
            layoutParams3.gravity = 16;
        }
        if (layoutParams5 != null) {
            layoutParams5.gravity = 16;
        }
        if (layoutParams7 != null) {
            layoutParams7.topMargin = 0;
            layoutParams7.gravity = 16;
        }
        android.view.View view2 = this.P;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/OpenIMKefuShopPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/logic/OpenIMKefuShopPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.S == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            layoutInflater.inflate(com.tencent.mm.R.layout.bze, viewGroup2);
            this.S = u17;
        }
        return this.S;
    }

    public OpenIMKefuShopPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.Q = (com.tencent.mm.ui.MMActivity) context;
    }

    public OpenIMKefuShopPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = new java.util.LinkedList();
        this.N = new java.util.LinkedList();
        this.R = null;
        this.Q = (com.tencent.mm.ui.MMActivity) context;
        this.L = context.getString(com.tencent.mm.R.string.cfj);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
