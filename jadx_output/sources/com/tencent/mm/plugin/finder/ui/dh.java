package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class dh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f129074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingInteractiveInfoUI f129075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.IconPreference f129076f;

    public dh(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.ui.FinderSettingInteractiveInfoUI finderSettingInteractiveInfoUI, com.tencent.mm.ui.base.preference.IconPreference iconPreference) {
        this.f129074d = bitmap;
        this.f129075e = finderSettingInteractiveInfoUI;
        this.f129076f = iconPreference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f129074d;
        if (bitmap != null) {
            com.tencent.mm.plugin.finder.ui.FinderSettingInteractiveInfoUI finderSettingInteractiveInfoUI = this.f129075e;
            int dimension = (int) finderSettingInteractiveInfoUI.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
            com.tencent.mm.ui.base.preference.IconPreference iconPreference = this.f129076f;
            if (iconPreference == null) {
                return;
            }
            java.lang.String string = finderSettingInteractiveInfoUI.getContext().getString(com.tencent.mm.R.string.cuo);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            androidx.appcompat.app.AppCompatActivity context = finderSettingInteractiveInfoUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            iconPreference.L(hc2.x0.l(string, context, '#', new android.graphics.drawable.BitmapDrawable(bitmap), com.tencent.mm.R.color.a0c, dimension, 0, 0, 0, 224, null));
        }
    }
}
