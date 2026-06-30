package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class rd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI f174250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI textStatusNewLabelUI) {
        super(0);
        this.f174250d = textStatusNewLabelUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI textStatusNewLabelUI = this.f174250d;
        androidx.appcompat.app.AppCompatActivity context = textStatusNewLabelUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        int i17 = com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI.f173655J;
        zd4.o oVar = textStatusNewLabelUI.f170684r;
        kotlin.jvm.internal.o.f(oVar, "access$getSelectVisibleR…lector$p$s1446649799(...)");
        return new com.tencent.mm.plugin.textstatus.ui.oc(context, oVar);
    }
}
