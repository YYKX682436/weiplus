package com.tencent.mm.sns_compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sns_compose/SnsWithTaUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "sns-compose_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class SnsWithTaUI extends com.tencent.mm.ui.MMComposeActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f193421g = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f193422d;

    /* renamed from: e, reason: collision with root package name */
    public final long f193423e = java.lang.System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f193424f = jz5.h.b(new m85.f(this));

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View getLayoutView() {
        com.tencent.mm.mm_compose.MMComposeView mMComposeView = new com.tencent.mm.mm_compose.MMComposeView(this, null, 2, null);
        mMComposeView.setContent(u0.j.c(880148175, true, new m85.d(this)));
        return mMComposeView;
    }

    @Override // com.tencent.mm.ui.MMComposeActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.sns_compose.page.p1 p1Var = (com.tencent.mm.sns_compose.page.p1) ((jz5.n) this.f193424f).getValue();
        p1Var.getClass();
        p1Var.f193568d = new com.tencent.mm.sdk.coroutines.LifecycleScope("compose_playVideo", this, 0, 4, null);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!q85.d.f360796a) {
            q85.d.f360796a = true;
            r5.i iVar = new r5.i(context);
            android.graphics.Bitmap.Config bitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
            kotlin.jvm.internal.o.g(bitmapConfig, "bitmapConfig");
            c6.c a17 = c6.c.a(iVar.f392526b, null, null, null, bitmapConfig, false, false, null, null, null, null, null, null, 4087, null);
            iVar.f392526b = a17;
            iVar.f392526b = c6.c.a(a17, null, null, null, null, false, false, null, null, null, c6.b.ENABLED, null, null, 3583, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList3.add(new jz5.l(new q85.u(), android.net.Uri.class));
            arrayList4.add(new o85.c(context));
            iVar.f392527c = new r5.c(kz5.n0.S0(arrayList), kz5.n0.S0(arrayList2), kz5.n0.S0(arrayList3), kz5.n0.S0(arrayList4));
            r5.j a18 = iVar.a();
            synchronized (r5.a.class) {
                r5.a.f392512b = a18;
            }
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        this.f193422d = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 0);
        dx1.f fVar = dx1.g.f244489a;
        java.lang.String d17 = kotlin.jvm.internal.i0.a(com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherHistoryBrowsingStruct.class).d();
        kotlin.jvm.internal.o.d(d17);
        fVar.g("MomentsTogetherHistoryBrowsing", d17);
        fVar.i("MomentsTogetherHistoryBrowsing", "ifRedDot", java.lang.Integer.valueOf(getIntent().getIntExtra("has_dot", 0)));
        fVar.i("MomentsTogetherHistoryBrowsing", ya.b.SOURCE, java.lang.Integer.valueOf(this.f193422d));
        fVar.i("MomentsTogetherHistoryBrowsing", "withFriendFeedTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        fVar.i("MomentsTogetherHistoryBrowsing", "pageOwnerUsername", "");
        setBackBtn(new m85.e(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f193423e;
        dx1.f fVar = dx1.g.f244489a;
        fVar.i("MomentsTogetherHistoryBrowsing", "withFriendFeedTime", java.lang.Long.valueOf(currentTimeMillis));
        fVar.i("MomentsTogetherHistoryBrowsing", "ownerSetting", 0);
        fVar.i("SnsUserBehaviourInfo", "withFriendsStayTime", java.lang.Long.valueOf(currentTimeMillis));
        dx1.f.b(fVar, "MomentsTogetherHistoryBrowsing", false, false, 6, null);
    }
}
