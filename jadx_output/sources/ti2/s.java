package ti2;

/* loaded from: classes3.dex */
public final class s extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ds6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vi2.l item = (vi2.l) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.kb_);
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.rtq);
        android.widget.TextView textView3 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.s0x);
        kotlin.jvm.internal.o.d(textView3);
        hc2.o.a(textView3, false);
        ((android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.hc6)).setText(java.lang.String.valueOf(i17 + 1));
        r45.if5 if5Var = item.f437553d;
        r45.xn1 xn1Var = (r45.xn1) if5Var.getCustom(1);
        if (xn1Var != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
            if (finderContact != null) {
                c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                android.content.Context context = textView.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                android.text.TextPaint paint = textView.getPaint();
                kotlin.jvm.internal.o.f(paint, "getPaint(...)");
                zl2.q4 q4Var = zl2.q4.f473933a;
                java.lang.String username = finderContact.getUsername();
                if (username == null) {
                    username = "";
                }
                java.lang.String nickname = finderContact.getNickname();
                textView.setText(new android.text.SpannableString(((c61.p2) ybVar).cj(context, paint, q4Var.p(username, nickname != null ? nickname : "", false), 20)));
            }
            gm2.c1 c1Var = gm2.c1.f273320a;
            android.content.Context context2 = textView2.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            textView2.setText((java.lang.CharSequence) gm2.c1.d(c1Var, textView2, context2, " ", xn1Var.getList(11), new int[]{2, 4, 18, 12}, gm2.c2.f273350i, null, 0, null, null, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, null).f302833d);
        }
        textView3.setText(java.lang.String.valueOf(if5Var.getInteger(2)));
    }
}
