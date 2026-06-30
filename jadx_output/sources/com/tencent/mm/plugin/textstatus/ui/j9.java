package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class j9 implements com.tencent.mm.plugin.textstatus.ui.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174009a;

    public j9(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174009a = textStatusEditActivity;
    }

    public void a(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174009a;
        com.tencent.mm.plugin.textstatus.ui.g8 d76 = textStatusEditActivity.d7();
        bi4.d1 d1Var = textStatusEditActivity.f173613x1;
        androidx.appcompat.app.AppCompatActivity context = textStatusEditActivity.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d76.c(d1Var, path, context);
        ym5.a1.f(new com.tencent.mm.plugin.textstatus.ui.i9(textStatusEditActivity));
    }
}
