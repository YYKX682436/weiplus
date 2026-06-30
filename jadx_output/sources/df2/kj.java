package df2;

/* loaded from: classes3.dex */
public final class kj implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.oj f230584d;

    public kj(df2.oj ojVar) {
        this.f230584d = ojVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        mm2.y0 y0Var = (mm2.y0) obj;
        int i17 = y0Var.f329550c.getInt("PARAM_FINDER_LIVE_GAME_TEAM_UP_GIFT_MODE", 0);
        android.os.Bundle bundle = y0Var.f329550c;
        boolean z17 = bundle.getBoolean("PARAM_FINDER_LIVE_IS_GAME_TEAM_UP_GIFT", false);
        java.lang.String string = bundle.getString("PARAM_FINDER_LIVE_GIFT_ID", "");
        java.lang.String str = string != null ? string : "";
        df2.oj ojVar = this.f230584d;
        java.lang.String str2 = ojVar.f230971m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onGiftSendInstantClick] result = ");
        qs5.m mVar = y0Var.f329548a;
        sb6.append(mVar);
        sb6.append(", mode = ");
        sb6.append(i17);
        sb6.append(", isFromGameTeamUp = ");
        sb6.append(z17);
        sb6.append(", giftId = ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        if (mVar != qs5.m.f366438d && i17 == 9 && z17) {
            ojVar.i7(false, str);
        }
    }
}
