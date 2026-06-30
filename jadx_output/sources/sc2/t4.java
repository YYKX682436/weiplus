package sc2;

/* loaded from: classes2.dex */
public class t4 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f406261w = "Finder.FeedJumperLivingStatusObserver";

    @Override // ad2.h
    public gs2.a j(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        return info.getBusiness_type() == 2 ? gs2.a.f275052h : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f406261w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return true;
    }

    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.util.LinkedList<r45.wf6> style;
        java.lang.Object obj;
        r45.z84 z84Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        if (finderJumpInfo == null || (style = finderJumpInfo.getStyle()) == null) {
            return;
        }
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.wf6) obj).getInteger(2) == 16) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (z84Var = (r45.z84) wf6Var.getCustom(23)) == null) {
            return;
        }
        if (!o(holder, finderJumpInfo)) {
            D(8);
            com.tencent.mars.xlog.Log.i(this.f406261w, "[onBindView] priority not ok");
            return;
        }
        if (infoEx.f453244f == null) {
            return;
        }
        android.view.View findViewById = jumpView.findViewById(com.tencent.mm.R.id.i_q);
        android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.ihp);
        android.widget.TextView textView2 = (android.widget.TextView) jumpView.findViewById(com.tencent.mm.R.id.ihn);
        android.content.Context context = holder.f293121e;
        textView.setMaxWidth((int) (context.getResources().getDisplayMetrics().widthPixels * 0.5d));
        textView2.setMaxWidth((int) (context.getResources().getDisplayMetrics().widthPixels * 0.5d));
        textView2.setTextSize(0, context.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
        java.lang.String string = z84Var.getString(0);
        if (string == null || string.length() == 0) {
            textView2.setVisibility(8);
        } else {
            java.lang.String string2 = z84Var.getString(0);
            if (string2 == null) {
                string2 = "";
            }
            textView2.setText(hc2.l.d(string2));
            textView2.setVisibility(0);
        }
        java.lang.String string3 = z84Var.getString(1);
        if (string3 == null || string3.length() == 0) {
            textView.setText(context.getString(com.tencent.mm.R.string.cvy));
        } else {
            java.lang.String string4 = z84Var.getString(1);
            textView.setText(hc2.l.d(string4 != null ? string4 : ""));
        }
        if (textView2.getVisibility() == 0) {
            if (kotlin.jvm.internal.o.b(source, "timeline")) {
                textView.setTextSize(0, context.getResources().getDimension(com.tencent.mm.R.dimen.f479788f9) * i65.a.q(context));
            } else {
                textView.setTextSize(0, context.getResources().getDimension(com.tencent.mm.R.dimen.f479788f9));
            }
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479252u4));
            com.tencent.mm.ui.fk.c(textView);
        } else {
            if (kotlin.jvm.internal.o.b(source, "timeline")) {
                textView.setTextSize(0, context.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3) * i65.a.q(context));
            } else {
                textView.setTextSize(0, context.getResources().getDimension(com.tencent.mm.R.dimen.f479628b3));
            }
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479254u6));
            com.tencent.mm.ui.fk.a(textView);
        }
        if (kotlin.jvm.internal.o.b(source, "timeline")) {
            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = i65.a.b(findViewById.getContext(), 16);
            layoutParams.height = i65.a.b(findViewById.getContext(), 16);
        }
        if (this.f3150n == 39) {
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            so2.o2.f410517f.a().g(this.f3145f, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n, so2.h2.f410386f);
        }
        gs2.c.f275072a.e(holder, jumpView, j(finderJumpInfo), false);
    }
}
