package we5;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(yb5.d dVar) {
        super(1);
        this.f445357d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao holder = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = holder.f203393p;
        yb5.d dVar = this.f445357d;
        textView.setText(dVar.s().getString(com.tencent.mm.R.string.fsw));
        holder.f203393p.setVisibility(0);
        holder.f203393p.setOnClickListener(new we5.l0(holder, dVar));
        we5.q0.f445378a.a(dVar, holder);
        return jz5.f0.f302826a;
    }
}
