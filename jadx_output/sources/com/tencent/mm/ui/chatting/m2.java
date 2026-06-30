package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class m2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.n2 f201941d;

    public m2(com.tencent.mm.ui.chatting.n2 n2Var, com.tencent.mm.ui.chatting.k2 k2Var) {
        this.f201941d = n2Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f201941d.f202008u;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r01.g0) this.f201941d.f202007t.f368079g.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        int i18;
        com.tencent.mm.ui.chatting.n2 n2Var = this.f201941d;
        android.view.ViewGroup viewGroup2 = view == null ? (android.view.ViewGroup) n2Var.f202001n.inflate(com.tencent.mm.R.layout.dlj, viewGroup, false) : (android.view.ViewGroup) view;
        android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.rfj);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup2.findViewById(com.tencent.mm.R.id.rfi);
        imageView.setVisibility(8);
        r01.g0 g0Var = (r01.g0) n2Var.f202007t.f368079g.get(i17);
        viewGroup2.setTag(g0Var);
        boolean z17 = n2Var.f201995e.booleanValue() && n2Var.f201996f.equals(g0Var.f368076d) && n2Var.f201997g;
        android.content.Context context = n2Var.f202000m;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooterCustomSubmenu", "showRedDotTextView：%s", g0Var.f368076d);
            textView.setEllipsize(null);
            android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.R.drawable.b8i);
            drawable.setBounds(0, 0, com.tencent.mm.ui.zk.a(context, 8), com.tencent.mm.ui.zk.a(context, 8));
            al5.w wVar = new al5.w(drawable, 1);
            android.text.SpannableString spannableString = new android.text.SpannableString("@");
            spannableString.setSpan(wVar, 0, 1, 33);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = g0Var.f368075c;
            ((ke0.e) xVar).getClass();
            sb6.append((java.lang.Object) com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
            sb6.append(" ");
            textView.setText(android.text.TextUtils.concat(sb6.toString(), spannableString));
        } else if (g0Var.f368083k != 0) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = g0Var.f368075c;
            ((ke0.e) xVar2).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
            int i19 = g0Var.f368083k;
            switch (i19) {
                case 1:
                    i18 = com.tencent.mm.R.raw.biz_link_regular;
                    break;
                case 2:
                    i18 = com.tencent.mm.R.raw.biz_mini_program_circle_regular;
                    break;
                case 3:
                    i18 = com.tencent.mm.R.raw.biz_subscriptions_regular;
                    break;
                case 4:
                    i18 = com.tencent.mm.R.raw.biz_bubble_circle_regular;
                    break;
                case 5:
                    i18 = com.tencent.mm.R.raw.biz_scan_regular;
                    break;
                case 6:
                case 7:
                    i18 = com.tencent.mm.R.raw.ecs_regular;
                    break;
                case 8:
                default:
                    i18 = 0;
                    break;
                case 9:
                    i18 = com.tencent.mm.R.raw.actionbar_particular_icon;
                    break;
            }
            if (i18 != 0) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, i18, context.getResources().getColor(com.tencent.mm.R.color.FG_2)));
                imageView.setVisibility(0);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooterCustomSubmenu", "get empty res id, username: %s, icon show type: %d", g0Var.f368075c, java.lang.Integer.valueOf(i19));
            }
        } else {
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = g0Var.f368075c;
            ((ke0.e) xVar3).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3));
        }
        return viewGroup2;
    }
}
