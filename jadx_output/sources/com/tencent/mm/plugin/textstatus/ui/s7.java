package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class s7 implements com.tencent.mm.plugin.textstatus.convert.dowhat.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f174284a;

    public s7(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f174284a = textStatusDoWhatActivityV2;
    }

    @Override // com.tencent.mm.plugin.textstatus.convert.dowhat.u
    public void a(android.view.View v17, java.lang.String iconId) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(iconId, "iconId");
        com.tencent.mm.plugin.textstatus.ui.h6 h6Var = com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.C1;
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f174284a;
        if (!textStatusDoWhatActivityV2.c7().x() || !kotlin.jvm.internal.o.b(iconId, "userdefine")) {
            if (textStatusDoWhatActivityV2.b7().isExpand) {
                return;
            }
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.X6(this.f174284a, iconId, false, false, 6, null);
        } else {
            bi4.d1 d1Var = textStatusDoWhatActivityV2.f173544n;
            if (d1Var != null) {
                d1Var.f354946p++;
            }
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.U6(textStatusDoWhatActivityV2, iconId);
        }
    }
}
