package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class xk0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.yk0 f115101d;

    public xk0(com.tencent.mm.plugin.finder.live.plugin.yk0 yk0Var) {
        this.f115101d = yk0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.finder.live.plugin.yk0 yk0Var = this.f115101d;
        if (!yk0Var.w1()) {
            com.tencent.mars.xlog.Log.i(yk0Var.v1(), "singSongGiftSelect.observe - Plugin not available, skip");
            return;
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            int i17 = ((mm2.m6) yk0Var.S0().a(mm2.m6.class)).f329248p ? com.tencent.mm.R.string.efb : com.tencent.mm.R.string.p1r;
            android.view.ViewGroup viewGroup = yk0Var.f365323d;
            android.content.Context context = viewGroup.getContext();
            java.lang.String string = viewGroup.getContext().getResources().getString(i17);
            java.lang.Boolean bool2 = db5.t7.f228518a;
            android.widget.Toast makeText = android.widget.Toast.makeText(context, "", 0);
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488379rq, null);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f487356oe2)).setImageResource(com.tencent.mm.R.raw.icon_song_filled);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487357oe3);
            textView.setText(string);
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new db5.o7(textView, context));
            makeText.setGravity(17, 0, 0);
            makeText.setView(inflate);
            makeText.show();
        }
    }
}
