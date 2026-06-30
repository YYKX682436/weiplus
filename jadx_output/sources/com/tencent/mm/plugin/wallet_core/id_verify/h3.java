package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes8.dex */
public class h3 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f179388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.i3 f179389b;

    public h3(com.tencent.mm.plugin.wallet_core.id_verify.i3 i3Var, com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f179389b = i3Var;
        this.f179388a = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        if (z17) {
            this.f179389b.f179393d.A.f179460e.setValue((java.lang.String) obj);
        }
        this.f179388a.d();
    }
}
