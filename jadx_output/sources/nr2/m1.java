package nr2;

/* loaded from: classes2.dex */
public class m1 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.di7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        nr2.m item = (nr2.m) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.qey);
        boolean z18 = item.c().length() == 0;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (z18) {
            imageView.setImageResource(com.tencent.mm.R.color.BW_0_Alpha_0_1);
        } else {
            vo0.d e17 = g1Var.e();
            mn2.q3 q3Var = new mn2.q3(item.c(), com.tencent.mm.plugin.finder.storage.y90.f128356f);
            kotlin.jvm.internal.o.d(imageView);
            e17.c(q3Var, imageView, g1Var.h(mn2.f1.f329963q));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f484454qf1);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String k17 = item.k();
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f293121e;
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, k17));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (item.p()) {
            sb6.append(context.getString(com.tencent.mm.R.string.f491318lq0));
            if (item.f() != 0) {
                sb6.append(" ");
                sb6.append(context.getString(com.tencent.mm.R.string.f491319lq1, java.lang.String.valueOf(item.f())));
            }
        } else {
            sb6.append(context.getString(com.tencent.mm.R.string.mgv));
            if (item.f() != 0) {
                sb6.append(" ");
                sb6.append(context.getString(com.tencent.mm.R.string.mgw, java.lang.String.valueOf(item.f())));
            }
        }
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f484453qf0)).setText(sb6);
        vo0.d a17 = g1Var.a();
        com.tencent.mm.protocal.protobuf.FinderContact b17 = item.b();
        java.lang.String headUrl = b17 != null ? b17.getHeadUrl() : null;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (headUrl == null) {
            headUrl = "";
        }
        mn2.n nVar = new mn2.n(headUrl, com.tencent.mm.plugin.finder.storage.y90.X);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.qew);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329957h));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        android.view.View p18 = holder.p(com.tencent.mm.R.id.qev);
        kotlin.jvm.internal.o.f(p18, "getView(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) p18;
        com.tencent.mm.protocal.protobuf.FinderContact b18 = item.b();
        zy2.tb.a(m1Var, imageView2, b18 != null ? b18.getAuthInfo() : null, 0, 4, null);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.qex);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        com.tencent.mm.protocal.protobuf.FinderContact b19 = item.b();
        java.lang.String nickname = b19 != null ? b19.getNickname() : null;
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, nickname));
    }
}
