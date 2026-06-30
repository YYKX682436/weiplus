package com.tencent.mm.wallet_core.ui;

/* loaded from: classes11.dex */
public class x1 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.y1 f214269a;

    public x1(com.tencent.mm.wallet_core.ui.y1 y1Var) {
        this.f214269a = y1Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d8b, viewGroup, false);
        com.tencent.mm.wallet_core.ui.y1 y1Var = this.f214269a;
        com.tencent.mm.wallet_core.ui.w1 w1Var = y1Var.B;
        w1Var.f214261a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gzf);
        w1Var.f214262b = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.gyt);
        inflate.setTag(w1Var);
        if (y1Var.f206834c) {
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.gzg);
            if (findViewById != null) {
                findViewById.setBackgroundResource(com.tencent.mm.R.color.f478512u);
            }
            android.widget.TextView textView = w1Var.f214261a;
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
        com.tencent.mm.wallet_core.ui.w1 w1Var = (com.tencent.mm.wallet_core.ui.w1) bVar;
        java.lang.String str = ((com.tencent.mm.wallet_core.ui.y1) dVar).f214271y;
        android.widget.TextView textView = w1Var.f214261a;
        if (textView != null) {
            if (str == null || str.length() == 0) {
                textView.setVisibility(8);
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context context2 = textView.getContext();
                float textSize = textView.getTextSize();
                ((ke0.e) xVar).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str, textSize));
                textView.setVisibility(0);
            }
        }
        if (this.f214269a.f214272z) {
            w1Var.f214262b.setVisibility(0);
        } else {
            w1Var.f214262b.setVisibility(8);
        }
    }
}
