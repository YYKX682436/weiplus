package ss2;

/* loaded from: classes10.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f411994d;

    public z(ss2.a0 a0Var) {
        this.f411994d = a0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18;
        int i19;
        int itemId = menuItem.getItemId();
        ss2.a0 a0Var = this.f411994d;
        if (itemId == 4387) {
            com.tencent.mm.ui.MMActivity mMActivity = a0Var.f411905d;
            if (iq.b.v(mMActivity) || iq.b.e(mMActivity)) {
                return;
            }
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(mMActivity, "android.permission.CAMERA", 18, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("PostMediaWidget", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), mMActivity);
            if (a17) {
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new ss2.p(a0Var, null), 3, null);
                return;
            }
            return;
        }
        if (itemId != 4388) {
            return;
        }
        java.util.ArrayList arrayList = a0Var.f411916r;
        int size = arrayList != null ? arrayList.size() : 0;
        java.util.ArrayList arrayList2 = a0Var.f411911m;
        int size2 = arrayList2 != null ? arrayList2.size() : 0;
        if (size2 < 9 || size < 9) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("album_from_finder_add_media", true);
            if (size2 != 0 || size >= 9) {
                return;
            }
            if (size == 0) {
                i19 = 3;
                i18 = 9;
            } else {
                i18 = 9 - size;
                i19 = 1;
            }
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).ok(a0Var.f411905d, intent, i19, i18, 4388);
        }
    }
}
