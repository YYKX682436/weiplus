package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class pd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView f119378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f119379e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        super(0);
        this.f119378d = finderLiveDescEditView;
        this.f119379e = mMEditText;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f119378d.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f119379e;
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(mMEditText, 0);
        return java.lang.Boolean.valueOf(mMEditText.requestFocus());
    }
}
