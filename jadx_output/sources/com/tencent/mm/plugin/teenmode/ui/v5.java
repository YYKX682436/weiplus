package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI f173165d;

    public v5(com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI) {
        this.f173165d = teenModeGuardianInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        byte[] bArr;
        byte[] bArr2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI.f172897g;
        com.tencent.mm.plugin.teenmode.ui.TeenModeGuardianInfoUI teenModeGuardianInfoUI = this.f173165d;
        teenModeGuardianInfoUI.getClass();
        r45.v26 v26Var = new r45.v26();
        v26Var.f387830g = 1;
        java.lang.String stringExtra = teenModeGuardianInfoUI.getIntent().getStringExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.ActionValue.STAGE_PASS);
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.nio.charset.Charset charset = r26.c.f368865a;
        byte[] bytes = stringExtra.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String j17 = gm0.j1.b().j();
        kotlin.jvm.internal.o.f(j17, "getUinString(...)");
        byte[] bytes2 = j17.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
            mac.init(new javax.crypto.spec.SecretKeySpec(bytes, "HmacSHA256"));
            bArr = mac.doFinal(bytes2);
            kotlin.jvm.internal.o.f(bArr, "doFinal(...)");
        } catch (java.lang.Throwable unused) {
            bArr = new byte[0];
        }
        java.lang.String j18 = gm0.j1.b().j();
        kotlin.jvm.internal.o.f(j18, "getUinString(...)");
        byte[] bytes3 = j18.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes3, "getBytes(...)");
        try {
            javax.crypto.Mac mac2 = javax.crypto.Mac.getInstance("HmacSHA256");
            mac2.init(new javax.crypto.spec.SecretKeySpec(bArr, "HmacSHA256"));
            bArr2 = mac2.doFinal(bytes3);
            kotlin.jvm.internal.o.f(bArr2, "doFinal(...)");
        } catch (java.lang.Throwable unused2) {
            bArr2 = new byte[0];
        }
        v26Var.f387827d = new com.tencent.mm.protobuf.g(bArr2, 0, bArr2.length);
        v26Var.f387828e = ((com.tencent.mm.ui.widget.MMClearEditText) ((jz5.n) teenModeGuardianInfoUI.f172898e).getValue()).getText().toString();
        v26Var.f387829f = ((com.tencent.mm.ui.widget.MMClearEditText) ((jz5.n) teenModeGuardianInfoUI.f172899f).getValue()).getText().toString();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4277;
        lVar.f70666c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
        lVar.f70664a = v26Var;
        lVar.f70665b = new r45.w26();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(teenModeGuardianInfoUI.getContext(), "", teenModeGuardianInfoUI.getString(com.tencent.mm.R.string.f490552yb), true, false, null);
        kotlinx.coroutines.flow.j a18 = o01.d.f341891a.a(a17);
        androidx.lifecycle.c1 a19 = pf5.z.f353948a.a(teenModeGuardianInfoUI).a(um3.b.class);
        kotlin.jvm.internal.o.f(a19, "get(...)");
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = ((um3.b) a19).O6();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.c(O6, kotlinx.coroutines.internal.b0.f310484a, kotlinx.coroutines.a1.DEFAULT, new com.tencent.mm.plugin.teenmode.ui.s5(a18, Q, teenModeGuardianInfoUI, null));
        teenModeGuardianInfoUI.hideVKB();
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/TeenModeGuardianInfoUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
