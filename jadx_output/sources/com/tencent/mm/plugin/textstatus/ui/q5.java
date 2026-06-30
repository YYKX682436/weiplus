package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class q5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity f174222d;

    public q5(com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity textStatusDetailActivity) {
        this.f174222d = textStatusDetailActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f174222d.finish();
        return false;
    }
}
