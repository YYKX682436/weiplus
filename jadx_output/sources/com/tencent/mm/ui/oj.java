package com.tencent.mm.ui;

/* loaded from: classes.dex */
public final class oj implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.TipUseDuplicateGroupUI f209479d;

    public oj(com.tencent.mm.ui.TipUseDuplicateGroupUI tipUseDuplicateGroupUI) {
        this.f209479d = tipUseDuplicateGroupUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f209479d.finish();
        return false;
    }
}
