package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes8.dex */
public final class v5 implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f117475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f117476b;

    public v5(yz5.l lVar, kotlin.jvm.internal.c0 c0Var) {
        this.f117475a = lVar;
        this.f117476b = c0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        this.f117475a.invoke(java.lang.Boolean.valueOf(this.f117476b.f310112d));
    }
}
