package fk2;

/* loaded from: classes3.dex */
public class i2 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.regex.Pattern f263407m = java.util.regex.Pattern.compile("<_wc_custom_link_.+?(.*?)>(.*?)</_wc_custom_link_>");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public yz5.l c(dk2.zf msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new fk2.h2(msg, this);
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.d(context, holder, msg, i17);
        java.lang.Object D = msg.D();
        r45.ph1 ph1Var = D instanceof r45.ph1 ? (r45.ph1) D : null;
        if (ph1Var != null) {
            java.lang.String string = ph1Var.getString(6);
            java.lang.String string2 = ph1Var.getString(7);
            if (string != null && string2 != null) {
                java.lang.String str = "<_wc_custom_link_ color=\"#80FFFFFF\" backgroundenabled=\"0\">" + string + "</_wc_custom_link_>" + string2;
                i95.m c17 = i95.n0.c(zy2.s6.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.s6 s6Var = (zy2.s6) c17;
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
                java.lang.CharSequence l66 = zy2.s6.l6(s6Var, str, (int) mMNeat7extView.getTextSize(), false, f263407m, 0, false, null, 116, null);
                if (!ph1Var.getBoolean(3)) {
                    l66 = android.text.TextUtils.concat(l66, " ", context.getString(com.tencent.mm.R.string.lkv));
                }
                mMNeat7extView.b(l66);
            }
            if (ph1Var.getBoolean(3)) {
                android.view.View view = holder.f21930h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemProduct", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemProduct", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = holder.f21930h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemProduct", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemProduct", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (zl2.r4.f473950a.w1()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                ml2.t2[] t2VarArr = ml2.t2.f328014d;
                jSONObject.put("type", 33);
                jSONObject.put("commentid", msg.f());
                java.lang.String string3 = ph1Var.getString(0);
                jSONObject.put("productid", string3 != null ? string3 : "");
                jSONObject.put("comment_type", ph1Var.getInteger(5));
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb.y6((zy2.zb) c18, ml2.z4.f328366o, jSONObject.toString(), null, 4, null);
                return;
            }
            i95.m c19 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c19;
            ml2.f4 f4Var = ml2.f4.R;
            java.lang.String string4 = ph1Var.getString(0);
            java.lang.String str2 = string4 == null ? "" : string4;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("commentid", msg.f());
            jSONObject2.put("comment_type", ph1Var.getInteger(5));
            ml2.r0.Dj(r0Var, f4Var, null, str2, null, null, null, 0, 0L, jSONObject2, null, null, null, false, null, 16120, null);
        }
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.ub(msg);
    }

    @Override // we2.o
    public int n() {
        return 20113;
    }
}
