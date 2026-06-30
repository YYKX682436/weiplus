package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes8.dex */
public final class yd extends com.tencent.mm.ui.component.UIComponent implements qi4.b {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f174459d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f174460e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f174461f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f174459d = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.vd(this));
        this.f174460e = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.ud(this));
        this.f174461f = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.xd(this));
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
    }

    @Override // qi4.b
    public void L3(java.lang.String event, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusNotifyItemUIC", "onNotifyChange");
        O6();
    }

    public final void O6() {
        java.lang.String string;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.textstatus.ui.ac.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.util.ArrayList arrayList = ((com.tencent.mm.plugin.textstatus.ui.ac) a17).f173727e;
        ai4.m0 m0Var = ai4.m0.f5173a;
        hj4.b i17 = m0Var.i();
        int a18 = i17.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusNotifyItemUIC", "checkNotifyItem: dataList:" + arrayList.size() + " showTipsType:" + a18 + ' ');
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(P6(), kz5.c1.k(new jz5.l("status_scenesessionid", ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ai()), new jz5.l("status_notif_new_msg_cnt_comment", java.lang.Integer.valueOf(m0Var.h(-1))), new jz5.l("status_notif_new_msg_cnt_like", java.lang.Integer.valueOf(m0Var.j())), new jz5.l("status_notif_new_msg_cnt", java.lang.Integer.valueOf(i17.f281661b))));
        if (a18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusNotifyItemUIC", "hideNotifyView: ");
            android.view.ViewGroup P6 = P6();
            if (P6 == null) {
                return;
            }
            P6.setVisibility(8);
            return;
        }
        android.view.ViewGroup P62 = P6();
        if (P62 != null) {
            P62.setVisibility(0);
        }
        ni4.x xVar = ni4.x.f337776d;
        android.app.Activity context = getContext();
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.f174460e).getValue();
        kotlin.jvm.internal.o.g(context, "context");
        java.util.HashMap avatarSizeMap = ni4.x.f337778f;
        kotlin.jvm.internal.o.g(avatarSizeMap, "avatarSizeMap");
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        java.util.List K = m0Var.K();
        if (K.size() != 0) {
            java.lang.String str = (java.lang.String) K.get(0);
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            if (linearLayout != null) {
                linearLayout.addView(imageView);
            }
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            int i18 = ni4.x.f337777e;
            if (layoutParams2 != null) {
                layoutParams2.width = i18;
            }
            if (layoutParams2 != null) {
                layoutParams2.height = i18;
            }
            int b17 = i65.a.b(context, 1);
            imageView.setPadding(b17, b17, b17, b17);
            imageView.setImageResource(com.tencent.mm.R.raw.default_avatar);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
        }
        hj4.b i19 = m0Var.i();
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f174461f).getValue();
        com.tencent.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        if (textView != null) {
            int a19 = i19.a();
            if (a19 != 1) {
                string = a19 != 2 ? "" : getString(com.tencent.mm.R.string.jw_);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusNotifyItemUIC", "showNotifyView: num:%" + i19.f281661b);
                string = getContext().getString(com.tencent.mm.R.string.jwa, java.lang.Integer.valueOf(i19.f281661b));
            }
            textView.setText(string);
        }
        android.view.ViewGroup P63 = P6();
        if (P63 != null) {
            P63.setOnClickListener(new com.tencent.mm.plugin.textstatus.ui.wd(this));
        }
    }

    public final android.view.ViewGroup P6() {
        return (android.view.ViewGroup) ((jz5.n) this.f174459d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.util.Objects.toString(bundle);
        ai4.m0.f5173a.J(this, this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(P6(), "status_notification_bar");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(P6(), 24, 28809);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ai4.m0.f5173a.p(this, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        O6();
    }
}
