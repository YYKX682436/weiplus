package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes5.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f191682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191684f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191685g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.tencent.mm.ui.widget.dialog.f4 f4Var, com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f191682d = f4Var;
        this.f191683e = fileSelectorUI;
        this.f191684f = str;
        this.f191685g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f191682d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI = this.f191683e;
        androidx.appcompat.app.AppCompatActivity context = fileSelectorUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.chatting.pc pcVar = new com.tencent.mm.ui.chatting.pc(context, this.f191684f, this.f191685g, 4);
        fileSelectorUI.F = pcVar;
        pcVar.d();
        android.view.View contentView = fileSelectorUI.getContentView();
        kotlin.jvm.internal.o.e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) contentView).addView(fileSelectorUI.F);
        return jz5.f0.f302826a;
    }
}
