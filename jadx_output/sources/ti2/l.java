package ti2;

/* loaded from: classes10.dex */
public class l extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f419564e;

    /* renamed from: f, reason: collision with root package name */
    public final si2.c f419565f;

    public l(gk2.e buContext, si2.c callback) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f419564e = buContext;
        this.f419565f = callback;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dkk;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        java.lang.String nickname;
        java.lang.String username;
        vi2.h item = (vi2.h) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f6y);
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f6s);
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.f6z);
        android.widget.TextView textView3 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f6u);
        android.widget.TextView textView4 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f484701f71);
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.qwa);
        android.view.View findViewById3 = holder.itemView.findViewById(com.tencent.mm.R.id.qwb);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView2.setVisibility(0);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView3.setVisibility(8);
        int ordinal = item.f437550d.ordinal();
        if (ordinal == 1) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i19 = 4;
            textView2.setVisibility(4);
        } else if (ordinal != 2) {
            i19 = 4;
        } else {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById2, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById3, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/mic/pk/convert/MicVisitorInviteUserConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicVisitorInviteUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i19 = 4;
        }
        r45.xn1 xn1Var = item.f437551e;
        if (xn1Var != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
            java.lang.String str = (finderContact == null || (username = finderContact.getUsername()) == null) ? "" : username;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
            textView.setText(zl2.r4.D0(r4Var, str, (finderContact2 == null || (nickname = finderContact2.getNickname()) == null) ? "" : nickname, false, 4, null));
            gm2.c1 c1Var = gm2.c1.f273320a;
            android.content.Context context = textView4.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            textView4.setText((java.lang.CharSequence) gm2.c1.d(c1Var, textView4, context, " ", xn1Var.getList(11), new int[]{2, i19, 12, 9}, gm2.c2.f273350i, null, 0, null, null, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, null).f302833d);
            if (r4Var.s(this.f419564e)) {
                java.lang.String S = zl2.r4.S(r4Var, xn1Var.getLong(15), 0, 2, null);
                textView3.setVisibility(0);
                textView3.setText(holder.f293121e.getResources().getString(com.tencent.mm.R.string.ln6, S));
            } else {
                textView3.setVisibility(8);
            }
            textView2.setOnClickListener(new ti2.k(this, textView2, item, i17, xn1Var));
        }
    }
}
