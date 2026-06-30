package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class a7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f173718d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        super(2);
        this.f173718d = textStatusDoWhatActivityV2;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String customIconId = (java.lang.String) obj;
        java.lang.String customStatusWord = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(customIconId, "customIconId");
        kotlin.jvm.internal.o.g(customStatusWord, "customStatusWord");
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f173718d;
        textStatusDoWhatActivityV2.getClass();
        textStatusDoWhatActivityV2.f173541i = customStatusWord;
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.X6(this.f173718d, customIconId, false, false, 6, null);
        return jz5.f0.f302826a;
    }
}
