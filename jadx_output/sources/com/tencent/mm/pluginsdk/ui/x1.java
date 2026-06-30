package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes5.dex */
public class x1 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.z1 f192090d;

    public x1(com.tencent.mm.pluginsdk.ui.z1 z1Var, com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView) {
        this.f192090d = z1Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.pluginsdk.ui.c2 c2Var = this.f192090d.f192104e.f189790m;
        if (c2Var != null) {
            c2Var.J3(z17);
        }
    }
}
