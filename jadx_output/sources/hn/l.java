package hn;

/* loaded from: classes4.dex */
public final class l implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg3.i3 f282348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn.s f282349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f282350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vg3.h3 f282351g;

    public l(vg3.i3 i3Var, hn.s sVar, android.content.Context context, vg3.h3 h3Var) {
        this.f282348d = i3Var;
        this.f282349e = sVar;
        this.f282350f = context;
        this.f282351g = h3Var;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 15001 && i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomOpenService", "on select contact return:" + stringExtra);
            vg3.i3 i3Var = this.f282348d;
            i3Var.f436718m = stringExtra;
            i3Var.f436719n = intent != null ? intent.getIntExtra("key_has_create_new_group", 0) : 0;
            this.f282349e.getClass();
            android.content.Context context = this.f282350f;
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
            if (mMFragmentActivity == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChatRoomOpenService", "context is not MMActivity");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClassName(mMFragmentActivity, "com.tencent.mm.chatroom.ui.ChatRoomBindAppUI");
            intent2.putExtra("key_bind_param", i3Var);
            mMFragmentActivity.setMMOnFragmentActivityResult(new hn.r(this.f282351g));
            mMFragmentActivity.startActivityForResult(intent2, 15002);
        }
    }
}
