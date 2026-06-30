package sj4;

/* loaded from: classes10.dex */
public final class w0 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sj4.x0 f408901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.String str, sj4.x0 x0Var) {
        super(str);
        this.f408901c = x0Var;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        pj4.j0 j0Var = this.f21074b;
        boolean z17 = false;
        if (j0Var == null || !kotlin.jvm.internal.o.b(j0Var.f355139d, "11")) {
            return false;
        }
        com.tencent.mm.storage.z3 g07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0("WeRun-WeChat");
        if (g07 != null && g07.r2()) {
            z17 = true;
        }
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(dm.i4.COL_USERNAME, c01.z1.r());
            intent.putExtra("key_is_latest", true);
            intent.putExtra("rank_id", "#");
            intent.putExtra("key_only_show_latest_rank", true);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            intent.putExtra("app_username", c01.a2.e("gh_43f2581f6fd6"));
            intent.putExtra("device_type", 1);
            j45.l.j(context, "exdevice", ".ui.ExdeviceRankInfoUI", intent, null);
        } else if (context != null) {
            this.f408901c.getClass();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Contact_User", "gh_43f2581f6fd6");
            j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
        }
        return true;
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void n() {
    }
}
