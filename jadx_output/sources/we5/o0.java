package we5;

/* loaded from: classes5.dex */
public final class o0 {
    public o0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(yb5.d ui6, com.tencent.mm.ui.chatting.viewitems.ao holder) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.ui.chatting.manager.c cVar = ui6.f460708c;
        sb5.e eVar = (sb5.e) cVar.a(sb5.e.class);
        android.widget.TextView textView = holder.f203393p;
        if (textView == null) {
            return;
        }
        textView.setBackgroundResource(((com.tencent.mm.ui.chatting.component.v2) eVar).n0());
        com.tencent.mm.ui.bk.s0(holder.f203393p.getPaint());
        holder.f203393p.setTextColor(i65.a.d(ui6.g(), com.tencent.mm.R.color.Link_100));
        android.view.ViewGroup.LayoutParams layoutParams = holder.f203393p.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = ((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) cVar.a(sb5.e.class))).o0(i65.a.f(ui6.g(), com.tencent.mm.R.dimen.f479556yd));
            holder.f203393p.setLayoutParams(marginLayoutParams);
        }
    }
}
