package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class u0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f121969e;

    public u0(boolean z17) {
        this.f121969e = z17;
    }

    @Override // in5.r
    public int e() {
        return this.f121969e ? com.tencent.mm.R.layout.f489225dv3 : com.tencent.mm.R.layout.c6p;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jz5.l lVar;
        java.lang.String str;
        jz5.l lVar2;
        java.lang.String nickname;
        r45.h32 h32Var;
        vp2.l item = (vp2.l) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        cl0.g gVar = new cl0.g();
        r45.oa2 oa2Var = item.f438935d;
        gVar.s("Noticeid", (oa2Var == null || (h32Var = (r45.h32) oa2Var.getCustom(0)) == null) ? null : h32Var.getString(4));
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String str2 = "";
        if (activity != null) {
            pf5.z zVar = pf5.z.f353948a;
            boolean z18 = activity instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z18) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) activity;
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            if (!z18) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a(appCompatActivity).a(rq2.w.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mars.xlog.Log.i("Finder.HeadImgNoticeConvert", "optionIconReport: true");
            ((rq2.w) a17).P6("", V6.getString(1), "main_page_notice_card", gVar2);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.hlq);
        boolean z19 = this.f121969e;
        if (textView != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) oa2Var.getCustom(1);
            if (finderContact != null && (nickname = finderContact.getNickname()) != null) {
                str2 = nickname;
            }
            textView.setText(str2);
            if (!z19) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hlp);
        if (imageView != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) oa2Var.getCustom(1);
            java.lang.String headUrl = finderContact2 != null ? finderContact2.getHeadUrl() : null;
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.a().c(new mn2.n(headUrl, null, 2, null), imageView, g1Var.h(mn2.f1.f329958i));
        }
        if (z19) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.rqu);
            if (textView2 == null) {
                return;
            }
            java.lang.String string = item.f438937f.getString(8);
            if (string == null || string.length() == 0) {
                string = context.getResources().getString(com.tencent.mm.R.string.e1t);
            }
            textView2.setText(string);
            return;
        }
        long integer = (((r45.h32) oa2Var.getCustom(0)) != null ? r1.getInteger(0) : 0) * 1000;
        r45.h32 h32Var2 = (r45.h32) oa2Var.getCustom(0);
        if (h32Var2 != null && h32Var2.getInteger(20) == 1) {
            str = context.getResources().getString(com.tencent.mm.R.string.mq_, android.text.format.DateFormat.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492135fc2), integer));
        } else {
            zl2.q4 q4Var = zl2.q4.f473933a;
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492137fc4);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (string2 == null || string2.length() == 0) {
                string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492135fc2);
            }
            java.lang.String str3 = string2;
            kotlin.jvm.internal.o.d(str3);
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = java.util.Calendar.getInstance();
            java.util.Date date = new java.util.Date(integer);
            ((java.util.Calendar) h0Var.f310123d).setTime(date);
            int i19 = ((java.util.Calendar) h0Var.f310123d).get(6);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            java.util.Date date2 = new java.util.Date(c01.id.c());
            calendar.setTime(date2);
            int i27 = i19 - calendar.get(6);
            com.tencent.mars.xlog.Log.i("Finder.FinderUtil2", "[getFinderLiveNoticeTips] dayDiff:" + i27 + ", bookTime:" + date + ", todayTime:" + date2);
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            h0Var2.f310123d = com.tencent.mm.plugin.finder.assist.w2.p(com.tencent.mm.sdk.platformtools.x2.f193071a, integer).toString();
            if (!com.tencent.mm.sdk.platformtools.m2.j()) {
                int i28 = ((java.util.Calendar) h0Var.f310123d).get(1);
                int i29 = ((java.util.Calendar) h0Var.f310123d).get(2) + 1;
                int i37 = ((java.util.Calendar) h0Var.f310123d).get(5);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(i28);
                sb6.append('.');
                sb6.append(i29);
                sb6.append('.');
                sb6.append(i37);
                lVar = new jz5.l(sb6.toString(), h0Var2.f310123d);
            } else if (kotlin.jvm.internal.o.b(bool, bool)) {
                if (i27 == -1) {
                    lVar2 = new jz5.l(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fdi), h0Var2.f310123d);
                } else if (i27 == 0) {
                    lVar2 = new jz5.l(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fd_), h0Var2.f310123d);
                } else if (i27 == 1) {
                    lVar2 = new jz5.l(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fda), h0Var2.f310123d);
                } else if (i27 != 2) {
                    lVar = zl2.q4.u(h0Var, false, str3, integer, h0Var2, bool);
                } else {
                    lVar2 = new jz5.l(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491515dc3), h0Var2.f310123d);
                }
                lVar = lVar2;
            } else {
                lVar = zl2.q4.u(h0Var, false, str3, integer, h0Var2, bool);
            }
            lVar.toString();
            str = ((java.lang.String) lVar.f302833d) + ' ' + ((java.lang.String) lVar.f302834e);
        }
        kotlin.jvm.internal.o.d(str);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.hlo);
        if (textView3 != null) {
            textView3.setText(str);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        android.widget.TextView textView;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!this.f121969e || (textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.rqu)) == null) {
            return;
        }
        com.tencent.mm.ui.fk.a(textView);
    }
}
