package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class b2 implements rf5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.j2 f173744d;

    public b2(com.tencent.mm.plugin.textstatus.ui.j2 j2Var) {
        this.f173744d = j2Var;
    }

    @Override // bm5.s0
    public java.lang.String getTag() {
        return "MultipleTextStatusCardDialog";
    }

    @Override // pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // pf5.g
    public boolean onBackPressed() {
        return false;
    }

    @Override // pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
    }

    @Override // pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
    }

    @Override // pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onDestroy() {
    }

    @Override // pf5.g
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // pf5.g
    public void onNewIntent(android.content.Intent intent) {
    }

    @Override // pf5.g
    public void onPause() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPause: ");
        com.tencent.mm.plugin.textstatus.ui.j2 j2Var = this.f173744d;
        bi4.n0 f17 = j2Var.f();
        sb6.append(f17 != null ? java.lang.Integer.valueOf(f17.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", sb6.toString());
        bi4.n0 f18 = j2Var.f();
        if (f18 != null) {
            ((com.tencent.mm.plugin.textstatus.ui.q3) f18).d();
        }
    }

    @Override // pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
    }

    @Override // pf5.g
    public void onRestoreInstanceState(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onResume() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume: ");
        com.tencent.mm.plugin.textstatus.ui.j2 j2Var = this.f173744d;
        bi4.n0 f17 = j2Var.f();
        sb6.append(f17 != null ? java.lang.Integer.valueOf(f17.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", sb6.toString());
        bi4.n0 f18 = j2Var.f();
        if (f18 != null) {
            ((com.tencent.mm.plugin.textstatus.ui.q3) f18).a();
        }
    }

    @Override // pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onStart() {
    }

    @Override // pf5.g
    public void onStop() {
    }
}
