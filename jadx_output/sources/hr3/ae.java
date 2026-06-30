package hr3;

/* loaded from: classes5.dex */
public final class ae extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f283399d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f283400e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f283401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283402g;

    public ae(hr3.pf pfVar, java.lang.String str, java.lang.String picPath, yz5.a onSpanClickCallback) {
        kotlin.jvm.internal.o.g(picPath, "picPath");
        kotlin.jvm.internal.o.g(onSpanClickCallback, "onSpanClickCallback");
        this.f283402g = pfVar;
        this.f283399d = str;
        this.f283400e = picPath;
        this.f283401f = onSpanClickCallback;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$WriteSayHiSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f283399d;
        objArr[0] = str != null ? java.lang.Integer.valueOf(str.length()) : "";
        java.lang.String str2 = this.f283400e;
        objArr[1] = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.SayHiPictureUIC", "WriteSayHiSpan onClick() called hiContent:%s picPath:%s", objArr);
        hr3.pf pfVar = this.f283402g;
        hr3.pf.P6(pfVar, 2, 0);
        this.f283401f.invoke();
        java.lang.String e17 = ck5.f.e(str, 100);
        java.lang.String str3 = e17 != null ? e17 : "";
        com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto S6 = pfVar.S6();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity activity = pfVar.getActivity();
        float textSize = pfVar.S6().getTextSize();
        ((ke0.e) xVar).getClass();
        S6.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(activity, str3, textSize));
        if (!android.text.TextUtils.isEmpty(str2)) {
            pfVar.Z6(str2);
        }
        pfVar.S6().setSelection(str3.length());
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) pfVar.f283897p).getValue();
        if (textView != null) {
            textView.setVisibility(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiPictureUIC$WriteSayHiSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f283402g.getActivity().getResources().getColor(com.tencent.mm.R.color.f478724ff));
        ds6.setUnderlineText(false);
    }
}
