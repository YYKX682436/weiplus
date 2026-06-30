package wm4;

/* loaded from: classes.dex */
public class w implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm4.d f447314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f447315e;

    public w(sm4.d dVar, android.content.Context context) {
        this.f447314d = dVar;
        this.f447315e = context;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        this.f447314d.getClass();
        d17.q(2830, this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TopStory.TopStoryUILogic", "goUserProfile failed, NetSceneTopStoryGetUsername errType:%s, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        java.lang.String str2 = ((r45.xq3) ((sm4.d) m1Var).f409934e.f70711b.f70700a).f390332d;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str2);
        intent.putExtra("Contact_Scene", 3);
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        j45.l.j(this.f447315e, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }
}
