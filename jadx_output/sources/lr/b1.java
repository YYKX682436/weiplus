package lr;

/* loaded from: classes12.dex */
public final class b1 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f320499f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.f483272a50);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f320499f = (android.widget.ImageView) findViewById;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        super.i(item);
        ir.a1 a1Var = (ir.a1) this.f320581e;
        if (a1Var != null) {
            com.tencent.mm.smiley.e1 b17 = com.tencent.mm.smiley.e1.b();
            gr.c0 c0Var = a1Var.f293814b;
            android.graphics.drawable.Drawable c17 = b17.c(c0Var.f274663a);
            android.widget.ImageView imageView = this.f320499f;
            imageView.setImageDrawable(c17);
            com.tencent.mm.smiley.e1 b18 = com.tencent.mm.smiley.e1.b();
            java.lang.String key = c0Var.f274663a;
            java.lang.String d17 = b18.d(key);
            if (a1Var.f293815c) {
                if (c17 != null) {
                    com.tencent.mars.xlog.Log.i("smiley", "smiley_log d " + key + ", d " + d17 + ", d " + c17.getConstantState());
                } else {
                    com.tencent.mars.xlog.Log.i("smiley", "smiley_log d " + key + ", d " + d17 + ", d is null");
                    if (!android.text.TextUtils.isEmpty(key)) {
                        com.tencent.mm.smiley.n1 n1Var = com.tencent.mm.smiley.t1.f193375m;
                        com.tencent.mm.smiley.t1 a17 = n1Var.a();
                        kotlin.jvm.internal.o.f(key, "key");
                        com.tencent.mm.storage.emotion.SmileyInfo f17 = a17.f(key);
                        if (f17 != null) {
                            com.tencent.mm.smiley.t1 a18 = n1Var.a();
                            int i17 = f17.field_position;
                            if (i17 >= 0) {
                                a18.c(i17);
                            } else {
                                a18.b(f17.field_fileName);
                            }
                            com.tencent.mars.xlog.Log.i("smiley", "smiley_log si is null false");
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("smiley_log si is null ");
                            com.tencent.mm.smiley.g b19 = com.tencent.mm.smiley.g.b();
                            com.tencent.mm.smiley.b2 c18 = com.tencent.mm.smiley.g.b().c(key);
                            b19.getClass();
                            boolean z17 = com.tencent.mm.smiley.q0.f193336d;
                            com.tencent.mm.smiley.l0.f193307a.getClass();
                            int i18 = com.tencent.mm.smiley.e.f193236b;
                            sb6.append(com.tencent.mm.smiley.d.f193233a.a(c18, true) == null);
                            com.tencent.mars.xlog.Log.i("smiley", sb6.toString());
                        }
                    }
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                d17 = this.itemView.getContext().getString(com.tencent.mm.R.string.bzu);
            }
            imageView.setContentDescription(d17);
        }
    }
}
