package com.tencent.mm.vending.app;

/* loaded from: classes9.dex */
public abstract class PresenterActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity implements im5.b {

    /* renamed from: d, reason: collision with root package name */
    public final em5.i f212643d = new em5.i();

    @Override // im5.b
    public void keep(im5.a aVar) {
        this.f212643d.keep(aVar);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f212643d.c(getIntent(), this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        em5.i iVar = this.f212643d;
        iVar.f255232g.dead();
        iVar.e(4);
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        this.f212643d.e(3);
        super.onPause();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f212643d.e(2);
    }
}
