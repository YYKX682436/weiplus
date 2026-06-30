package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f118394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h3 f118395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.cw1 f118396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(android.view.View view, com.tencent.mm.plugin.finder.live.widget.h3 h3Var, r45.cw1 cw1Var) {
        super(0);
        this.f118394d = view;
        this.f118395e = h3Var;
        this.f118396f = cw1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.cw1 cw1Var;
        android.view.View view = this.f118394d;
        if (view != null) {
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) view.findViewById(com.tencent.mm.R.id.a_s);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2);
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483299a85);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.cum);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            com.tencent.mm.plugin.finder.live.widget.h3 h3Var = this.f118395e;
            mMRoundCornerImageView.setImageDrawable(h3Var.f118512a.getResources().getDrawable(com.tencent.mm.R.drawable.bhp));
            r45.cw1 cw1Var2 = this.f118396f;
            if (cw1Var2 != null) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.a().c(new mn2.n(cw1Var2.getString(3), null, 2, null), mMRoundCornerImageView, yo0.i.f464094o.a());
                boolean z17 = true;
                textView.setText(cw1Var2.getString(1));
                r45.dr2 dr2Var = (r45.dr2) cw1Var2.getCustom(2);
                textView2.setText(dr2Var != null ? dr2Var.getString(0) : null);
                r45.dr2 dr2Var2 = (r45.dr2) cw1Var2.getCustom(2);
                if (dr2Var2 != null) {
                    int integer = dr2Var2.getInteger(1);
                    kotlin.jvm.internal.o.d(imageView);
                    r45.dr2 dr2Var3 = (r45.dr2) cw1Var2.getCustom(2);
                    java.lang.String string = dr2Var3 != null ? dr2Var3.getString(2) : null;
                    imageView.setVisibility(0);
                    if (integer <= 0) {
                        imageView.setVisibility(8);
                    } else if (integer == 1) {
                        if (string == null || string.length() == 0) {
                            imageView.setImageResource(com.tencent.mm.R.raw.icons_filled_star_identify_sold);
                        } else {
                            g1Var.e().c(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, g1Var.h(mn2.f1.B));
                        }
                    } else if (integer == 2) {
                        if (string == null || string.length() == 0) {
                            imageView.setImageResource(com.tencent.mm.R.raw.icons_filled_star_identify_enterprise_sold);
                        } else {
                            g1Var.e().c(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, g1Var.h(mn2.f1.B));
                        }
                    } else if (integer != 100) {
                        imageView.setVisibility(8);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
                r45.dr2 dr2Var4 = (r45.dr2) cw1Var2.getCustom(2);
                java.lang.String string2 = dr2Var4 != null ? dr2Var4.getString(0) : null;
                if (string2 != null && string2.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    cw1Var = cw1Var2;
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    cw1Var = cw1Var2;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                h3Var.a(view.findViewById(com.tencent.mm.R.id.i_f), cw1Var);
                view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.f3(cw1Var, h3Var));
            }
        }
        return jz5.f0.f302826a;
    }
}
