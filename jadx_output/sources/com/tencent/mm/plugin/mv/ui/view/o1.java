package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class o1 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView f151913e;

    public o1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView) {
        this.f151913e = musicMvCommentView;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c4q;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        r45.ls4 ls4Var;
        r45.os4 os4Var;
        r45.ls4 ls4Var2;
        com.tencent.mm.plugin.mv.ui.view.m1 item = (com.tencent.mm.plugin.mv.ui.view.m1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.mv.ui.view.p1 p1Var = item.f151898d;
        java.lang.String str2 = p1Var.f151920a.f381643f;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.c6f);
        r45.ns4 ns4Var = p1Var.f151920a;
        boolean z18 = (ns4Var == null || (ls4Var2 = ns4Var.f381641d) == null || 1 != ls4Var2.f379800d) ? false : true;
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView = this.f151913e;
        if (z18) {
            java.lang.String str3 = (ns4Var == null || (ls4Var = ns4Var.f381641d) == null || (os4Var = ls4Var.f379801e) == null) ? null : os4Var.f382496d;
            if (str3 != null) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context = musicMvCommentView.getContext();
                ((ke0.e) xVar).getClass();
                com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3));
                java.lang.String str4 = str2 + (char) 65306;
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                spannableStringBuilder.append((java.lang.CharSequence) str4).append((java.lang.CharSequence) f0Var);
                int length = str4.length();
                if (length < 0) {
                    return;
                }
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(musicMvCommentView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5_MV)), 0, length, 33);
                if (textView != null) {
                    textView.setText(spannableStringBuilder);
                }
            }
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.d19);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.oxf);
        if (textView2 != null) {
            textView2.setOnClickListener(new com.tencent.mm.plugin.mv.ui.view.n1(item, musicMvCommentView));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(ns4Var != null ? ns4Var.f381651q : null)) {
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        if (p17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConverter", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/view/MusicMvCommentView$MusicCommentConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (ns4Var == null || (str = ns4Var.f381651q) == null) {
            str = "";
        }
        kotlin.jvm.internal.o.d(textView2);
        java.lang.String valueOf = java.lang.String.valueOf(musicMvCommentView.getContext().getResources().getString(com.tencent.mm.R.string.h3l));
        java.lang.String concat = str.concat("的音乐视频");
        java.lang.String str5 = valueOf + ' ' + concat;
        int P = r26.n0.P(str5, concat, 0, false, 6, null);
        if (P < 0) {
            return;
        }
        int length2 = concat.length() + P;
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(str5);
        spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(android.graphics.Color.parseColor("#FF7D90A9")), P, length2, 18);
        textView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(musicMvCommentView.getContext()));
        textView2.setClickable(true);
        textView2.setText(spannableStringBuilder2);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
