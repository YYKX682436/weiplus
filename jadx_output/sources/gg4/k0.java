package gg4;

/* loaded from: classes3.dex */
public final class k0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.pluginapp.QRCodeFooterPreference f271759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f271760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f271761f;

    public k0(com.tencent.mm.plugin.subapp.ui.pluginapp.QRCodeFooterPreference qRCodeFooterPreference, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f271759d = qRCodeFooterPreference;
        this.f271760e = h0Var;
        this.f271761f = h0Var2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/pluginapp/QRCodeFooterPreference$setUpViewsAppear$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        try {
            com.tencent.mm.plugin.subapp.ui.pluginapp.QRCodeFooterPreference qRCodeFooterPreference = this.f271759d;
            android.widget.TextView textView = qRCodeFooterPreference.M;
            if (textView != null) {
                kotlin.jvm.internal.h0 h0Var = this.f271760e;
                kotlin.jvm.internal.h0 h0Var2 = this.f271761f;
                float M = com.tencent.mm.plugin.subapp.ui.pluginapp.QRCodeFooterPreference.M(qRCodeFooterPreference);
                android.content.Context context = qRCodeFooterPreference.f197770d;
                int i17 = (int) M;
                int width = (textView.getWidth() / 2) - (i17 / 2);
                com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeFooterPreference", "lenOfNickname = %d, xOffset = %d ", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(width));
                android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488690e41, (android.view.ViewGroup) null);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.t0d)).setText(context.getString(com.tencent.mm.R.string.f490359sr));
                new com.tencent.mm.ui.widget.BasePopupWindow(inflate).a(textView, al5.f.f5886d, al5.g.f5909d, width, 0, new gg4.i0(h0Var), new gg4.j0(qRCodeFooterPreference, h0Var2));
            }
            z17 = true;
        } catch (java.lang.Throwable unused) {
            z17 = false;
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/subapp/ui/pluginapp/QRCodeFooterPreference$setUpViewsAppear$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return z17;
    }
}
