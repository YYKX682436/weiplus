package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w60 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.x60 f136308d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(com.tencent.mm.plugin.finder.viewmodel.component.x60 x60Var) {
        super(0);
        this.f136308d = x60Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f136308d.f136405b).inflate(com.tencent.mm.R.layout.air, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nep);
        if (textView != null) {
            textView.setTag(java.lang.Float.valueOf(0.5f));
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.neq);
        if (textView2 != null) {
            textView2.setTag(java.lang.Float.valueOf(1.0f));
        }
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ner);
        if (textView3 != null) {
            textView3.setTag(java.lang.Float.valueOf(1.25f));
        }
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nes);
        if (textView4 != null) {
            textView4.setTag(java.lang.Float.valueOf(1.5f));
        }
        android.widget.TextView textView5 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.net);
        if (textView5 != null) {
            textView5.setTag(java.lang.Float.valueOf(2.0f));
        }
        android.widget.TextView textView6 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.rb9);
        if (textView6 != null) {
            textView6.setTag(java.lang.Float.valueOf(3.0f));
        }
        return inflate;
    }
}
