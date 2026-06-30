package fk2;

/* loaded from: classes3.dex */
public class k extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public static final fk2.h f263413m = new fk2.h(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.String sb6;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(msg, "msg");
        android.view.View view = holder.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemAnnoucement", "onBindWelcomeMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemAnnoucement", "onBindWelcomeMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
        kotlin.jvm.internal.o.e(mMNeat7extView, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView");
        com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView = (com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView) mMNeat7extView;
        if (msg.x().length() > 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(context.getString(com.tencent.mm.R.string.d4h));
            sb7.append(' ');
            java.lang.String j17 = msg.j();
            sb7.append(r26.n0.u0(j17 != null ? j17 : "").toString());
            sb7.append('\n');
            sb7.append(r26.n0.u0(msg.x()).toString());
            sb6 = sb7.toString();
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(context.getString(com.tencent.mm.R.string.d4h));
            sb8.append(' ');
            java.lang.String j18 = msg.j();
            sb8.append(j18 != null ? j18 : "");
            sb6 = sb8.toString();
        }
        java.lang.String str = sb6;
        fk2.h hVar = f263413m;
        we2.a aVar = this.f445240a;
        hVar.a(str, finderLiveFoldTextView, aVar.f(), this.f445247h, aVar.h(i17), holder);
        holder.f21929g.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        mMNeat7extView.setTag(com.tencent.mm.R.id.e68, hVar.b());
        finderLiveFoldTextView.setUnFoldListener(new fk2.i(this, i17, str));
        finderLiveFoldTextView.setFoldListener(new fk2.j(this, i17));
        if (finderLiveFoldTextView.isFolding) {
            java.util.Set m17 = aVar.m();
            if ((m17 == null || m17.contains(java.lang.Integer.valueOf(i17))) ? false : true) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                ml2.g4[] g4VarArr = ml2.g4.f327479d;
                ml2.h4[] h4VarArr = ml2.h4.f327523d;
                jSONObject.put("type", 2);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                jSONObject.put("doc", fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                r0Var.getClass();
                ml2.r0.hj(r0Var, ml2.b4.R, jSONObject2, 0L, null, null, null, null, null, 252, null);
                java.util.Set m18 = aVar.m();
                if (m18 != null) {
                    m18.add(java.lang.Integer.valueOf(i17));
                }
            }
        }
    }

    @Override // we2.o
    public dk2.zf f(r45.t12 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.mf(msg);
    }

    @Override // we2.o
    public int n() {
        return 100000;
    }
}
