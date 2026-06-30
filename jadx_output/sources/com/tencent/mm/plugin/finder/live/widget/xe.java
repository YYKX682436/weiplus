package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.cf f120315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe(com.tencent.mm.plugin.finder.live.widget.cf cfVar) {
        super(0);
        this.f120315d = cfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        android.text.Editable text;
        com.tencent.mm.plugin.finder.live.widget.cf cfVar = this.f120315d;
        android.widget.EditText editText = cfVar.Q;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        cfVar.U = str;
        cfVar.g0(!(str.length() == 0));
        return jz5.f0.f302826a;
    }
}
