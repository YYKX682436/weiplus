package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes9.dex */
public class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f162326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.TVThumbPreference f162327e;

    public q1(com.tencent.mm.plugin.shake.ui.TVThumbPreference tVThumbPreference, android.graphics.Bitmap bitmap) {
        this.f162327e = tVThumbPreference;
        this.f162326d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.shake.ui.TVThumbPreference tVThumbPreference = this.f162327e;
        tVThumbPreference.N.setImageBitmap(this.f162326d);
        com.tencent.mm.ui.base.preference.r rVar = tVThumbPreference.P;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
    }
}
