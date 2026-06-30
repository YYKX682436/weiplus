package com.tencent.mm.ui;

/* loaded from: classes10.dex */
public class bd implements androidx.activity.result.b, com.tencent.mm.ui.vc {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.zc f197877a = null;

    /* renamed from: b, reason: collision with root package name */
    public androidx.activity.result.c f197878b = null;

    @Override // androidx.activity.result.b
    public void a(java.lang.Object obj) {
        androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
        androidx.activity.result.c cVar = this.f197878b;
        if (cVar != null) {
            cVar.b();
        }
        com.tencent.mm.ui.zc zcVar = this.f197877a;
        if (zcVar != null) {
            zcVar.a(activityResult.f9042d, activityResult.f9043e);
        }
    }
}
