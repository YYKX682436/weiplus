package y93;

/* loaded from: classes.dex */
public class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mf0.y f460335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y93.c f460336e;

    public b(y93.c cVar, mf0.y yVar) {
        this.f460336e = cVar;
        this.f460335d = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        this.f460335d.getClass();
        d17.q(2830, this);
        y93.c cVar = this.f460336e;
        if (i17 != 0 || i18 != 0) {
            cVar.f143443f.a("goUserProfile failed");
            com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenProfileWithOpenId", "goUserProfile failed, NetSceneTopStoryGetUsername errType:%s, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        java.lang.String str2 = ((r45.xq3) ((sm4.d) ((mf0.y) m1Var)).f409934e.f70711b.f70700a).f390332d;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str2);
        intent.putExtra("Contact_Scene", 3);
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        cVar.f143443f.d(false);
    }
}
