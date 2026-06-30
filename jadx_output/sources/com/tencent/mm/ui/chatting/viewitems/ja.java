package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class ja {
    public static void a(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.q9 q9Var) {
        sb5.e eVar = (sb5.e) dVar.f460708c.a(sb5.e.class);
        android.widget.TextView textView = q9Var.f205330c;
        if (textView == null) {
            return;
        }
        textView.setBackgroundResource(((com.tencent.mm.ui.chatting.component.v2) eVar).n0());
        com.tencent.mm.ui.bk.s0(q9Var.f205330c.getPaint());
        q9Var.f205330c.setTextColor(i65.a.d(dVar.g(), com.tencent.mm.R.color.Link_100));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) q9Var.f205330c.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = ((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) dVar.f460708c.a(sb5.e.class))).o0(i65.a.f(dVar.g(), com.tencent.mm.R.dimen.f479556yd));
            q9Var.f205330c.setLayoutParams(marginLayoutParams);
        }
    }

    public static boolean b(android.view.View view) {
        if (view != null && view.getTag(com.tencent.mm.R.id.bqt) != null) {
            try {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - ((java.lang.Long) view.getTag(com.tencent.mm.R.id.bqt)).longValue();
                if (currentTimeMillis > 0 && currentTimeMillis < 500) {
                    return true;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgGroupSolitatire", "checkSolitaireFoldDoubleClick Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        return false;
    }

    public static java.lang.String c(android.content.Context context, yb5.d dVar, java.lang.String str, java.lang.CharSequence charSequence, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, com.tencent.mm.storage.f9 f9Var, int i17) {
        java.lang.CharSequence charSequence2;
        java.lang.Boolean bool;
        if (((com.tencent.mm.ui.chatting.component.pc) ((sb5.v0) dVar.f460708c.a(sb5.v0.class))).m0(f9Var)) {
            f9Var.getClass();
            r45.ad4 ad4Var = tg3.p1.f419206a.a(f9Var).f195029g;
            if (ad4Var == null) {
                ad4Var = f9Var.L0();
            }
            r45.ad4 ad4Var2 = ad4Var;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.LinkedList linkedList = ad4Var2.f369942d;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.bd4 bd4Var = (r45.bd4) it.next();
                    java.lang.String str2 = bd4Var.f370676d;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb6.append(str2);
                    sb6.append(str.substring(bd4Var.f370677e, bd4Var.f370678f));
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(sb6.toString())) {
                sb6.append("\n");
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(sb6.toString()) && ad4Var2.f369945g == 1) {
                sb6.append("\n");
            }
            yd5.h.f461099a.a(mMNeat7extView, f9Var, dVar.D(), dVar.t());
            android.os.Bundle c17 = com.tencent.mm.ui.chatting.viewitems.bo.c(f9Var, dVar, dVar.t());
            com.tencent.mm.pluginsdk.ui.span.l1.f191253g.b(c17, k01.d.a(f9Var.Q0()));
            android.text.SpannableString fj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).fj(context, sb6, (int) mMNeat7extView.getTextSize(), i17, c17, le0.x.P0);
            java.lang.String string = context.getString(com.tencent.mm.R.string.fsp);
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(new com.tencent.mm.ui.chatting.viewitems.p9(i17, null, dVar, f9Var, mMNeat7extView, charSequence, ad4Var2), 0, string.length(), 33);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("\n");
            java.util.LinkedList linkedList2 = ad4Var2.f369943e;
            if (linkedList2 != null) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    r45.bd4 bd4Var2 = (r45.bd4) it6.next();
                    java.lang.String str3 = bd4Var2.f370676d;
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb7.append(str3);
                    sb7.append(str.substring(bd4Var2.f370677e, bd4Var2.f370678f));
                    sb7.append("\n");
                }
            }
            if (ad4Var2.f369944f != null) {
                sb7.append("\n");
                java.lang.String str4 = ad4Var2.f369944f.f370676d;
                if (str4 == null) {
                    str4 = "";
                }
                sb7.append(str4);
                r45.bd4 bd4Var3 = ad4Var2.f369944f;
                sb7.append(str.substring(bd4Var3.f370677e, bd4Var3.f370678f));
            }
            charSequence2 = android.text.TextUtils.concat(android.text.TextUtils.concat(fj6, spannableString), ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).fj(context, sb7, (int) mMNeat7extView.getTextSize(), i17, c17, le0.x.P0));
        } else {
            charSequence2 = charSequence;
        }
        if (f9Var != null) {
            com.tencent.mm.storage.a9 a9Var = f9Var.f193927g2;
            if (a9Var instanceof com.tencent.mm.ui.chatting.viewitems.un) {
                bool = ((com.tencent.mm.ui.chatting.viewitems.un) a9Var).f205715d;
                mMNeat7extView.c(charSequence2, android.widget.TextView.BufferType.SPANNABLE, bool);
                return charSequence2.toString();
            }
        }
        bool = null;
        mMNeat7extView.c(charSequence2, android.widget.TextView.BufferType.SPANNABLE, bool);
        return charSequence2.toString();
    }
}
