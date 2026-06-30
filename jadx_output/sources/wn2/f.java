package wn2;

@j95.b
/* loaded from: classes8.dex */
public final class f extends i95.w implements zy2.sb {

    /* renamed from: d, reason: collision with root package name */
    public int f447520d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sd4 f447521e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 f447522f;

    public f() {
        new r45.sd4();
        this.f447521e = new r45.sd4();
    }

    public void Ai(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = this.f447522f;
        if (i0Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "enterFinderLongVideoShareUI");
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.j jVar = i0Var.f120939h;
            if (jVar != null) {
                jVar.a(com.tencent.mm.plugin.finder.megavideo.topstory.flow.i.f120930f);
            }
        }
    }

    public int Bi() {
        if (wi()) {
            return Di();
        }
        return 0;
    }

    public final int Di() {
        boolean z17;
        int i17 = ((ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class)).f257377f;
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("Finder.MegaVideo.TopStoryMegaVideoService", "get longVideoSwitchInProcess=" + i17 + ", longVideoSwitchInTabLifecycle=" + this.f447520d);
        }
        return i17;
    }

    public void Ni(android.os.Bundle bundle) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = this.f447522f;
        if (i0Var != null) {
            i0Var.b(true);
            vn2.u0.f438387a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "onCreate");
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.j jVar = i0Var.f120939h;
            if (jVar != null) {
                jVar.onCreate(bundle);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.MegaVideo.TopStoryMegaVideoService", "setup but megaVideoUIC=" + this.f447522f);
        }
    }

    public final void Ri(r45.sd4 sd4Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modify longVideoInfoInTabLifecycle from ");
        r45.td4 td4Var = (r45.td4) this.f447521e.getCustom(0);
        sb6.append(td4Var != null ? td4Var.getString(0) : null);
        sb6.append(" to ");
        r45.td4 td4Var2 = (r45.td4) sd4Var.getCustom(0);
        sb6.append(td4Var2 != null ? td4Var2.getString(0) : null);
        com.tencent.mars.xlog.Log.i("Finder.MegaVideo.TopStoryMegaVideoService", sb6.toString());
        this.f447521e = sd4Var;
    }

    public final void Ui(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.MegaVideo.TopStoryMegaVideoService", "modify longVideoSwitchInTabLifecycle from " + this.f447520d + " to " + i17);
        this.f447520d = i17;
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
        Ui(0);
        Ri(new r45.sd4());
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = this.f447522f;
        if (i0Var != null) {
            i0Var.onDestroy();
        }
        this.f447522f = null;
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
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = this.f447522f;
        if (i0Var != null) {
            i0Var.onNewIntent(intent);
        }
    }

    @Override // pf5.g
    public void onPause() {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = this.f447522f;
        if (i0Var != null) {
            i0Var.onPause();
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
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = this.f447522f;
        if (i0Var != null) {
            i0Var.onResume();
        }
    }

    @Override // pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    @Override // pf5.g
    public void onStart() {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = this.f447522f;
        if (i0Var != null) {
            i0Var.onStart();
        }
    }

    @Override // pf5.g
    public void onStop() {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = this.f447522f;
        if (i0Var != null) {
            i0Var.onStop();
        }
    }

    public boolean wi() {
        int Di = Di();
        return Di == 1 || Di == 2;
    }
}
