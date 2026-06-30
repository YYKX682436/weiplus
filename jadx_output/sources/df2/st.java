package df2;

/* loaded from: classes3.dex */
public final class st implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wt f231372d;

    public st(df2.wt wtVar) {
        this.f231372d = wtVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.e32 e32Var = (r45.e32) obj;
        jz5.f0 f0Var = null;
        if (e32Var != null) {
            com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
            df2.wt wtVar = this.f231372d;
            java.lang.String str4 = ((mm2.c1) wtVar.business(mm2.c1.class)).f328852o;
            r45.h32 h32Var = (r45.h32) e32Var.getCustom(1);
            if (h32Var == null || (str = h32Var.getString(4)) == null) {
                str = "";
            }
            r45.h32 e17 = i1Var.e(str4, str);
            if (e17 == null) {
                e17 = (r45.h32) e32Var.getCustom(1);
            }
            if (e17 == null) {
                com.tencent.mars.xlog.Log.e("LiveReserveNoticeGuideController", "observe: error, noticeInfo is null");
                return;
            }
            if (e17.getInteger(1) == 0) {
                com.tencent.mars.xlog.Log.w("LiveReserveNoticeGuideController", "observe: notice has been reserved");
                return;
            }
            if (wtVar.f231714t) {
                com.tencent.mars.xlog.Log.i("LiveReserveNoticeGuideController", "observe: bubble has shown once, noticeId=" + e17.getString(4));
                return;
            }
            java.lang.String str5 = ((mm2.c1) wtVar.business(mm2.c1.class)).f328852o;
            r45.h32 h32Var2 = (r45.h32) e32Var.getCustom(1);
            if (h32Var2 == null || (str2 = h32Var2.getString(4)) == null) {
                str2 = "";
            }
            r45.h32 e18 = i1Var.e(str5, str2);
            if (e18 != null) {
                e18.set(1, java.lang.Integer.valueOf(e17.getInteger(1)));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showBubble: noticeId=");
            r45.h32 h32Var3 = (r45.h32) e32Var.getCustom(1);
            sb6.append(h32Var3 != null ? h32Var3.getString(4) : null);
            sb6.append(", notice_starttime_type=");
            r45.h32 h32Var4 = (r45.h32) e32Var.getCustom(1);
            sb6.append(h32Var4 != null ? java.lang.Integer.valueOf(h32Var4.getInteger(20)) : null);
            com.tencent.mars.xlog.Log.i("LiveReserveNoticeGuideController", sb6.toString());
            if (zl2.r4.F1(wtVar.getStore().getLiveRoomData())) {
                com.tencent.mars.xlog.Log.i("LiveReserveNoticeGuideController", "showBubble: skip in co-live");
            } else {
                r45.h32 h32Var5 = (r45.h32) e32Var.getCustom(1);
                if (h32Var5 == null) {
                    com.tencent.mars.xlog.Log.w("LiveReserveNoticeGuideController", "showBubble: notice info is null");
                } else {
                    wtVar.k7(wtVar);
                    java.lang.String string = h32Var5.getString(4);
                    wtVar.o7(1, string != null ? string : "");
                    wtVar.p7(false);
                    zl2.q4 q4Var = zl2.q4.f473933a;
                    long integer = h32Var5.getInteger(0) * 1000;
                    int i17 = new java.util.GregorianCalendar().get(6);
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    calendar.setTime(new java.util.Date(integer));
                    int i18 = calendar.get(6);
                    java.lang.CharSequence p17 = com.tencent.mm.plugin.finder.assist.w2.p(com.tencent.mm.sdk.platformtools.x2.f193071a, integer);
                    int i19 = i17 - i18;
                    if (i19 == -2) {
                        str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492140fd1) + ((java.lang.Object) p17);
                    } else if (i19 == -1) {
                        str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fda) + ((java.lang.Object) p17);
                    } else if (i19 != 0) {
                        str3 = android.text.format.DateFormat.format(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492135fc2), integer).toString();
                    } else {
                        str3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fd_) + ((java.lang.Object) p17);
                    }
                    android.view.View view = wtVar.f229970m;
                    android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ruf) : null;
                    if (textView != null) {
                        textView.setText(h32Var5.getInteger(20) == 1 ? wtVar.O6().getResources().getString(com.tencent.mm.R.string.mo9) : wtVar.O6().getResources().getString(com.tencent.mm.R.string.mo7, str3));
                    }
                    wtVar.h7(new df2.tt(wtVar, h32Var5));
                    wtVar.g7(new df2.ut(wtVar, h32Var5, e32Var));
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(e32Var.getInteger(2));
                    if (!(valueOf.intValue() > 0)) {
                        valueOf = null;
                    }
                    long intValue = valueOf != null ? valueOf.intValue() : 30000;
                    kotlinx.coroutines.r2 r2Var = wtVar.f231712r;
                    if (r2Var != null) {
                        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    }
                    wtVar.f231712r = com.tencent.mm.plugin.finder.live.util.y.o(wtVar, null, null, new df2.vt(intValue, wtVar, null), 3, null);
                }
            }
            wtVar.f231714t = true;
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("LiveReserveNoticeGuideController", "observe: post null");
        }
    }
}
