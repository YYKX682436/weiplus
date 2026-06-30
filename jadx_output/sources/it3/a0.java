package it3;

/* loaded from: classes10.dex */
public final class a0 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.MMRecordUI f294550d;

    public a0(com.tencent.mm.plugin.recordvideo.activity.MMRecordUI mMRecordUI) {
        this.f294550d = mMRecordUI;
    }

    @Override // f25.f
    public void c(boolean z17) {
        jt3.h hVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IAudioFocusService onPause lose audio focus & gain result:");
        com.tencent.mm.plugin.recordvideo.activity.MMRecordUI mMRecordUI = this.f294550d;
        f25.m0 m0Var = mMRecordUI.f155631n;
        sb6.append(m0Var != null ? java.lang.Boolean.valueOf(((g25.e) m0Var).f267980c) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", sb6.toString());
        f25.m0 m0Var2 = mMRecordUI.f155631n;
        boolean z18 = false;
        if (m0Var2 != null && ((g25.e) m0Var2).f267980c) {
            z18 = true;
        }
        if (z18 || (hVar = mMRecordUI.f155629i) == null) {
            return;
        }
        hVar.d();
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "IAudioFocusService onResume gain audio focus");
        jt3.h hVar = this.f294550d.f155629i;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // f25.f
    public void onStop() {
    }
}
