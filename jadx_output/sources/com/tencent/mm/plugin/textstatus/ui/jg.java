package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class jg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity f174021d;

    public jg(com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity textStatusSquareActivity) {
        this.f174021d = textStatusSquareActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f174021d.onBackPressed();
        return true;
    }
}
