package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class aq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.gq f131679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f131680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f131681f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(com.tencent.mm.plugin.finder.view.gq gqVar, android.widget.EditText editText, android.view.View view) {
        super(0);
        this.f131679d = gqVar;
        this.f131680e = editText;
        this.f131681f = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean i17 = com.tencent.mm.plugin.finder.view.gq.i(this.f131679d, this.f131680e.getText().toString());
        android.view.View view = this.f131681f;
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.b2z)).setEnabled(i17);
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.b2z);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        r4Var.Y2((android.widget.TextView) findViewById, i17, false);
        return jz5.f0.f302826a;
    }
}
