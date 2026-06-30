package pk2;

/* loaded from: classes3.dex */
public final class q0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.u0 f356176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f356177e;

    public q0(pk2.u0 u0Var, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f356176d = u0Var;
        this.f356177e = mMActivity;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorDesignedGiftOption$setupDesignedGiftDescClickableText$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mars.xlog.Log.i(this.f356176d.f356275i, "click designed gift guide link");
        com.tencent.mm.plugin.finder.live.viewmodel.y9 y9Var = new com.tencent.mm.plugin.finder.live.viewmodel.y9(this.f356177e, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/dKB5Oj8391RRdAg2", null, 0.0f, 12, null);
        com.tencent.mm.ui.MMActivity mMActivity = this.f356177e;
        if ((mMActivity instanceof android.app.Activity) && !mMActivity.isFinishing() && !mMActivity.isDestroyed()) {
            com.tencent.mm.plugin.finder.live.widget.e0.W(y9Var, null, false, 0, 7, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorDesignedGiftOption$setupDesignedGiftDescClickableText$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f356177e.getResources().getColor(com.tencent.mm.R.color.f479308vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
