package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public class m0 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.n0 f206894a;

    public m0(com.tencent.mm.ui.contact.item.n0 n0Var) {
        this.f206894a = n0Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck9, viewGroup, false);
        com.tencent.mm.ui.contact.item.n0 n0Var = this.f206894a;
        com.tencent.mm.ui.contact.item.l0 l0Var = n0Var.A;
        l0Var.f206891a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gzf);
        inflate.setTag(l0Var);
        if (n0Var.f206834c) {
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.gzg);
            if (findViewById != null) {
                findViewById.setBackgroundResource(com.tencent.mm.R.color.f478512u);
            }
            android.widget.TextView textView = l0Var.f206891a;
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b bVar, com.tencent.mm.ui.contact.item.d dVar, boolean z17, boolean z18) {
        java.lang.String str = ((com.tencent.mm.ui.contact.item.n0) dVar).f206903y;
        android.widget.TextView textView = ((com.tencent.mm.ui.contact.item.l0) bVar).f206891a;
        if (textView == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView.getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str, textSize));
        textView.setVisibility(0);
    }
}
