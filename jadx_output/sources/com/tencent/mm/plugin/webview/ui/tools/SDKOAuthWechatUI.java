package com.tencent.mm.plugin.webview.ui.tools;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/SDKOAuthWechatUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SDKOAuthWechatUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f183740n = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f183741d = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.f3(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f183742e = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.d3(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f183743f = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.e3(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f183744g = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.w2(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f183745h = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.x2(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f183746i = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.y2(this));

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f183747m = jz5.h.b(new com.tencent.mm.plugin.webview.ui.tools.z2(this));

    public static final void V6(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthWechatUI sDKOAuthWechatUI, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams) {
        int b17 = i65.a.b(sDKOAuthWechatUI.getContext(), 6);
        float q17 = i65.a.q(sDKOAuthWechatUI.getContext());
        int i17 = (int) (b17 * q17);
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = i17;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).width = i17;
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (i65.a.b(sDKOAuthWechatUI.getContext(), 11) * q17);
    }

    public final void U6(android.text.Spannable spannable, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        spannable.setSpan(new com.tencent.mm.plugin.webview.ui.tools.v2(getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo), getContext().getResources().getColor(com.tencent.mm.R.color.f479310vq), this, str3), r26.n0.L(str, str2, 0, false, 6, null), r26.n0.L(str, str2, 0, false, 6, null) + str2.length(), 33);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ciq;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new com.tencent.mm.plugin.webview.ui.tools.c3(this), com.tencent.mm.R.raw.icons_filled_close);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
        setBounceEnabled(false);
        java.lang.Object value = ((jz5.n) this.f183741d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) value;
        android.text.TextPaint paint = textView.getPaint();
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint2 = textView.getPaint();
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.h8o));
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String string = context.getString(com.tencent.mm.R.string.h8j);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        arrayList.add(string);
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.h8k);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        arrayList.add(string2);
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.h8m);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        arrayList.add(string3);
        java.lang.String string4 = context.getString(com.tencent.mm.R.string.h8n);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        arrayList.add(string4);
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (kotlin.jvm.internal.o.b("zh_CN", com.tencent.mm.sdk.platformtools.m2.f(context2))) {
            java.lang.String string5 = context2.getResources().getString(com.tencent.mm.R.string.iog);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            arrayList2.add(string5);
            java.lang.String string6 = context2.getResources().getString(com.tencent.mm.R.string.iob);
            kotlin.jvm.internal.o.f(string6, "getString(...)");
            arrayList2.add(string6);
            java.lang.String string7 = context2.getResources().getString(com.tencent.mm.R.string.iod);
            kotlin.jvm.internal.o.f(string7, "getString(...)");
            arrayList2.add(string7);
            java.lang.String string8 = context2.getResources().getString(com.tencent.mm.R.string.io9);
            kotlin.jvm.internal.o.f(string8, "getString(...)");
            arrayList2.add(string8);
        } else {
            java.lang.String string9 = context2.getResources().getString(com.tencent.mm.R.string.iof);
            kotlin.jvm.internal.o.f(string9, "getString(...)");
            arrayList2.add(string9);
            java.lang.String string10 = context2.getResources().getString(com.tencent.mm.R.string.ioa);
            kotlin.jvm.internal.o.f(string10, "getString(...)");
            arrayList2.add(string10);
            java.lang.String string11 = context2.getResources().getString(com.tencent.mm.R.string.ioc);
            kotlin.jvm.internal.o.f(string11, "getString(...)");
            arrayList2.add(string11);
            java.lang.String string12 = context2.getResources().getString(com.tencent.mm.R.string.io8);
            kotlin.jvm.internal.o.f(string12, "getString(...)");
            arrayList2.add(string12);
        }
        java.lang.Object value2 = ((jz5.n) this.f183742e).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) value2;
        java.lang.String str = (java.lang.String) arrayList.get(0);
        java.lang.String str2 = (java.lang.String) arrayList.get(1);
        java.lang.String str3 = (java.lang.String) arrayList2.get(0);
        java.lang.String str4 = (java.lang.String) arrayList2.get(1);
        java.lang.String string13 = mMNeat7extView.getContext().getResources().getString(com.tencent.mm.R.string.h8i, str, str2);
        kotlin.jvm.internal.o.f(string13, "getString(...)");
        android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(string13);
        kotlin.jvm.internal.o.d(newSpannable);
        U6(newSpannable, string13, str, str3);
        U6(newSpannable, string13, str2, str4);
        mMNeat7extView.b(newSpannable);
        mMNeat7extView.setSpacingAdd(i65.a.b(mMNeat7extView.getContext(), 5));
        java.lang.Object value3 = ((jz5.n) this.f183743f).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = (com.tencent.mm.ui.widget.MMNeat7extView) value3;
        java.lang.String str5 = (java.lang.String) arrayList.get(2);
        java.lang.String str6 = (java.lang.String) arrayList.get(3);
        java.lang.String str7 = (java.lang.String) arrayList2.get(2);
        java.lang.String str8 = (java.lang.String) arrayList2.get(3);
        java.lang.String string14 = mMNeat7extView2.getContext().getResources().getString(com.tencent.mm.R.string.h8l, str5, str6);
        kotlin.jvm.internal.o.f(string14, "getString(...)");
        android.text.Spannable newSpannable2 = android.text.Spannable.Factory.getInstance().newSpannable(string14);
        kotlin.jvm.internal.o.d(newSpannable2);
        U6(newSpannable2, string14, str5, str7);
        U6(newSpannable2, string14, str6, str8);
        mMNeat7extView2.b(newSpannable2);
        mMNeat7extView2.setSpacingAdd(i65.a.b(mMNeat7extView2.getContext(), 5));
        java.lang.Object value4 = ((jz5.n) this.f183744g).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        ((android.widget.Button) value4).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.a3(this));
        java.lang.Object value5 = ((jz5.n) this.f183745h).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        ((android.widget.Button) value5).setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.b3(this));
        java.lang.Object value6 = ((jz5.n) this.f183746i).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        android.view.ViewGroup.LayoutParams layoutParams = ((com.tencent.mm.ui.widget.imageview.WeImageView) value6).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        V6(this, (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams);
        java.lang.Object value7 = ((jz5.n) this.f183747m).getValue();
        kotlin.jvm.internal.o.f(value7, "getValue(...)");
        android.view.ViewGroup.LayoutParams layoutParams2 = ((com.tencent.mm.ui.widget.imageview.WeImageView) value7).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        V6(this, (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams2);
    }
}
