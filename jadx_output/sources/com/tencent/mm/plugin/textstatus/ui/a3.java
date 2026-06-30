package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class a3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI f173712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f173713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f173714f;

    public a3(com.tencent.mm.plugin.textstatus.ui.StatusAlbumUI statusAlbumUI, android.app.Activity activity, java.lang.String str) {
        this.f173712d = statusAlbumUI;
        this.f173713e = activity;
        this.f173714f = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        if (menuItem.getItemId() == com.tencent.mm.R.id.jgi) {
            android.app.Activity activity = this.f173713e;
            java.lang.String string = (activity == null || (resources2 = activity.getResources()) == null) ? null : resources2.getString(com.tencent.mm.R.string.f493362jv5);
            android.app.Activity activity2 = this.f173713e;
            this.f173712d.f173469m = db5.e1.Q(activity, string, (activity2 == null || (resources = activity2.getResources()) == null) ? null : resources.getString(com.tencent.mm.R.string.f493362jv5), false, false, null);
            gm0.j1.d().g(new ej4.a(this.f173714f, 2));
            qj4.s.m(qj4.s.f363958a, this.f173713e, 43L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        }
    }
}
