package com.tencent.mm.ui.contact.item;

/* loaded from: classes11.dex */
public final class r0 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.u0 f206922a;

    public r0(com.tencent.mm.ui.contact.item.u0 u0Var) {
        this.f206922a = u0Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489444ck5, viewGroup, false);
        com.tencent.mm.ui.contact.item.o0 o0Var = (com.tencent.mm.ui.contact.item.o0) ((jz5.n) this.f206922a.N).getValue();
        kotlin.jvm.internal.o.e(o0Var, "null cannot be cast to non-null type com.tencent.mm.ui.contact.item.HeaderViewDataItem.HeaderViewHolder");
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.gzk);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
        o0Var.f206909a = (android.widget.RelativeLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.gze);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        o0Var.f206910b = (android.widget.TextView) findViewById2;
        float f17 = i65.a.f(context, com.tencent.mm.R.dimen.f479925j4) * i65.a.m(context);
        android.widget.TextView textView = o0Var.f206910b;
        if (textView != null) {
            textView.setTextSize(0, f17);
        }
        android.widget.TextView textView2 = o0Var.f206910b;
        com.tencent.mm.ui.bk.s0(textView2 != null ? textView2.getPaint() : null);
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.chj);
        kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.LinearLayout");
        o0Var.f206911c = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.h6y);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        o0Var.f206912d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.f483931ci2);
        kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById5;
        o0Var.f206913e = textView3;
        textView3.setTextSize(0, f17);
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.omr);
        kotlin.jvm.internal.o.e(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView4 = (android.widget.TextView) findViewById6;
        o0Var.f206914f = textView4;
        textView4.setTextSize(0, f17);
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.d0v);
        kotlin.jvm.internal.o.e(findViewById7, "null cannot be cast to non-null type android.view.View");
        o0Var.f206915g = findViewById7;
        inflate.setTag(o0Var);
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View view, com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.contact.item.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.content.Context r11, com.tencent.mm.ui.contact.item.b r12, com.tencent.mm.ui.contact.item.d r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.item.r0.c(android.content.Context, com.tencent.mm.ui.contact.item.b, com.tencent.mm.ui.contact.item.d, boolean, boolean):void");
    }
}
