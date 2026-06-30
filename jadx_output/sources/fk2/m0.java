package fk2;

/* loaded from: classes3.dex */
public final class m0 extends we2.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.Object[] objArr;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object D = msg.D();
        r45.tq1 tq1Var = D instanceof r45.tq1 ? (r45.tq1) D : null;
        if (tq1Var == null) {
            com.tencent.mars.xlog.Log.e("CommentItemGameChallengeArena", "payload is not FinderLiveGameChallengeArenaSuccessInfo");
            return;
        }
        java.lang.String string = tq1Var.getString(0);
        java.lang.String string2 = tq1Var.getString(1);
        if (string != null) {
            if (!(string2 == null || string2.length() == 0)) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                spannableStringBuilder.append((java.lang.CharSequence) g());
                int i18 = gm2.i1.f273411f;
                gm2.e1 e1Var = new gm2.e1();
                int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3);
                gm2.h1 h1Var = e1Var.f273358a;
                h1Var.f273382m = color;
                h1Var.f273372c = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478553an);
                e1Var.f((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479591a1));
                e1Var.c((int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479648bn));
                e1Var.e(g());
                spannableStringBuilder.setSpan(e1Var.a(), 0, g().length(), 33);
                spannableStringBuilder.append((java.lang.CharSequence) string.concat(" "));
                spannableStringBuilder.setSpan(this.f445245f, g().length(), g().length() + string.length(), 33);
                i95.m c17 = i95.n0.c(zy2.s6.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                float f17 = this.f445247h;
                android.text.SpannableString l66 = zy2.s6.l6((zy2.s6) c17, string2, (int) f17, false, null, 0, false, null, 124, null);
                spannableStringBuilder.append((java.lang.CharSequence) l66);
                java.lang.Object[] spans = l66.getSpans(0, l66.length(), java.lang.Object.class);
                int length = g().length() + string.length() + 1;
                if (spans != null) {
                    int length2 = spans.length;
                    int i19 = 0;
                    while (i19 < length2) {
                        java.lang.Object obj = spans[i19];
                        int spanStart = l66.getSpanStart(obj);
                        int spanEnd = l66.getSpanEnd(obj);
                        int spanFlags = l66.getSpanFlags(obj);
                        if (spanStart >= 0 && spanStart <= spanEnd) {
                            objArr = spans;
                            if (spanEnd <= l66.length()) {
                                spannableStringBuilder.setSpan(obj, spanStart + length, spanEnd + length, spanFlags);
                                i19++;
                                spans = objArr;
                            }
                        } else {
                            objArr = spans;
                        }
                        com.tencent.mars.xlog.Log.w("CommentItemGameChallengeArena", "Invalid span range: start=" + spanStart + ", end=" + spanEnd + ", spanMsgContent.length=" + l66.length());
                        i19++;
                        spans = objArr;
                    }
                }
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
                mMNeat7extView.b(spannableStringBuilder);
                mMNeat7extView.setTextSize(f17);
                mMNeat7extView.setOnClickListener(new fk2.k0(tq1Var, this, context));
                holder.f21929g.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
                android.view.ViewParent parent = mMNeat7extView.getParent();
                android.widget.RelativeLayout relativeLayout = parent instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) parent : null;
                if (relativeLayout != null) {
                    relativeLayout.setPadding(0, relativeLayout.getPaddingTop(), relativeLayout.getPaddingRight(), relativeLayout.getPaddingBottom());
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("CommentItemGameChallengeArena", "onBindGameChallengeArenaMsg fail, nickName is " + string + ", msgContent is " + string2);
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.v6(msg);
    }

    @Override // we2.o
    public int n() {
        return 20134;
    }

    public final void q(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.lang.String str) {
        android.content.Intent intent;
        java.lang.String stringExtra;
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("CommentItemGameChallengeArena", "Game challenge arena message preInjectData is empty or null");
        } else {
            jSONObject.put("backendExtData", str);
        }
        jSONObject.put("uxInfo", zl2.r4.f473950a.j0(context));
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str2 = a52.a.f1584l;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("commentScene", str2);
        jSONObject.put("enterImmerseType", dk2.q4.f233938a.f(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "enter_immerse_type"));
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null && (intent = mMActivity.getIntent()) != null && (stringExtra = intent.getStringExtra("KEY_GAMECENTER_PARAMS_ID")) != null) {
            str3 = stringExtra;
        }
        jSONObject.put("gameClientParams", str3);
        com.tencent.mars.xlog.Log.i("CommentItemGameChallengeArena", "onclick-tag, json = " + jSONObject);
        sVar.d(kz5.b1.e(new jz5.l("preInjectData", jSONObject.toString())));
        ((c61.p2) ybVar).Oj(context, finderJumpInfo, sVar);
    }
}
