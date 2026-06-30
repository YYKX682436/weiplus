package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class va implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderModifyNameUI f129953d;

    public va(com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI) {
        this.f129953d = finderModifyNameUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.FinderModifyNameUI finderModifyNameUI = this.f129953d;
        android.view.View view = finderModifyNameUI.f128633y;
        if (view != null) {
            finderModifyNameUI.L = view.getHeight();
        } else {
            kotlin.jvm.internal.o.o("inputContainer");
            throw null;
        }
    }
}
