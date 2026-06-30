package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes9.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f162321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.TVThumbPreference f162322e;

    public p1(com.tencent.mm.plugin.shake.ui.TVThumbPreference tVThumbPreference, android.graphics.Bitmap bitmap) {
        this.f162322e = tVThumbPreference;
        this.f162321d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.shake.ui.TVThumbPreference tVThumbPreference = this.f162322e;
        tVThumbPreference.M.setImageBitmap(this.f162321d);
        com.tencent.mm.ui.base.preference.r rVar = tVThumbPreference.P;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
    }
}
