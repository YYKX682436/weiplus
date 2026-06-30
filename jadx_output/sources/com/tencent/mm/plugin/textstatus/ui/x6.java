package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class x6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        super(0);
        this.f174423d = textStatusDoWhatActivityV2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174423d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = textStatusDoWhatActivityV2.f173537e;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAlpha(0.1f);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText = textStatusDoWhatActivityV2.C;
        com.tencent.mm.plugin.textstatus.ui.i6 i6Var = textStatusDoWhatActivityV2.A1;
        if (mMEditText != null) {
            mMEditText.removeTextChangedListener(i6Var);
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = textStatusDoWhatActivityV2.C;
        if (mMEditText2 != null) {
            mMEditText2.addTextChangedListener(i6Var);
        }
        return jz5.f0.f302826a;
    }
}
