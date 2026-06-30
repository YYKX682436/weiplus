package ez;

/* loaded from: classes4.dex */
public final class e1 implements en1.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ez.f1 f257723d;

    public e1(ez.f1 f1Var) {
        this.f257723d = f1Var;
    }

    @Override // en1.j
    public void onAuthResponse(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        int i17 = z17 ? 1 : 7;
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_BYP_INFO_KEY_LONG_SYNC, 0L);
        com.tencent.mars.xlog.Log.i("MMTypingFeatureService", "onAuthResponse autoAuth=" + z17 + " docgi syncKey=" + t17);
        ez.f1.wi(this.f257723d, t17, i17);
    }

    @Override // en1.j
    public void onRegResponse(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
    }
}
