package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public class c0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.BioHelperUI f189910d;

    public c0(com.tencent.mm.pluginsdk.ui.BioHelperUI bioHelperUI) {
        this.f189910d = bioHelperUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f189910d.finish();
        return true;
    }
}
