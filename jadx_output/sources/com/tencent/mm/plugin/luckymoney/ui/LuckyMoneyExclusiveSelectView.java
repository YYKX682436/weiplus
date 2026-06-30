package com.tencent.mm.plugin.luckymoney.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyExclusiveSelectView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/plugin/luckymoney/ui/d6;", "", "getInputViewId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LuckyMoneyExclusiveSelectView extends android.widget.LinearLayout implements com.tencent.mm.plugin.luckymoney.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f146117d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f146118e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f146119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuckyMoneyExclusiveSelectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attributeSet, "attributeSet");
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.bud, this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.j1i);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f146117d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.j1h);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f146118e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.j1e);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f146119f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public void a() {
        android.widget.TextView textView = this.f146118e;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        textView.setTextColor(com.tencent.mm.plugin.luckymoney.model.m5.i(getContext()));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f146119f;
        if (weImageView != null) {
            weImageView.setIconColor(com.tencent.mm.plugin.luckymoney.model.m5.i(getContext()));
        } else {
            kotlin.jvm.internal.o.o("arrowIv");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public void b() {
        android.widget.TextView textView = this.f146118e;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f146119f;
        if (weImageView != null) {
            weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        } else {
            kotlin.jvm.internal.o.o("arrowIv");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public java.lang.String d(int i17) {
        if (i17 != 3 && i17 != 4) {
            return "";
        }
        android.content.Context context = getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.widget.TextView textView = this.f146118e;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        objArr[0] = textView.getText();
        java.lang.String string = context.getString(com.tencent.mm.R.string.f492436gn3, objArr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.d6
    public int e() {
        android.widget.TextView textView = this.f146117d;
        if (textView != null) {
            return !com.tencent.mm.sdk.platformtools.t8.J0(textView.getText()) ? 0 : 4;
        }
        kotlin.jvm.internal.o.o("usernameTv");
        throw null;
    }

    public int getInputViewId() {
        return 0;
    }
}
