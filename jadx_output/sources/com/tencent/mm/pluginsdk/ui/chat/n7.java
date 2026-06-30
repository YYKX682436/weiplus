package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class n7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.c8 f190510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(com.tencent.mm.pluginsdk.ui.chat.c8 c8Var) {
        super(0);
        this.f190510d = c8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f190510d.f190220b.getContext().getSystemService("input_method");
        if (systemService instanceof android.view.inputmethod.InputMethodManager) {
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
        return null;
    }
}
