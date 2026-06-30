package f93;

/* loaded from: classes11.dex */
public final class q4 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f93.s4 f260440a;

    public q4(f93.s4 s4Var) {
        this.f260440a = s4Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a2h, viewGroup, false);
        f93.s4 s4Var = this.f260440a;
        f93.o4 o4Var = s4Var.E;
        kotlin.jvm.internal.o.e(o4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.HeaderAddDataItem.HeaderAddViewHolder");
        kotlin.jvm.internal.o.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f485468hs1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById).setOnClickListener(new f93.p4(s4Var));
        inflate.setTag(o4Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
    }
}
