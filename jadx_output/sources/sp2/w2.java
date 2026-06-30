package sp2;

/* loaded from: classes3.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f411256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f411257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl2.y f411258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f411259g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f411260h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(sp2.d3 d3Var, com.tencent.mm.ui.MMActivity mMActivity, yl2.y yVar, dk2.x4 x4Var, int i17) {
        super(2);
        this.f411256d = d3Var;
        this.f411257e = mMActivity;
        this.f411258f = yVar;
        this.f411259g = x4Var;
        this.f411260h = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            r45.j01 j01Var = this.f411258f.f463083a;
            sp2.d3 d3Var = this.f411256d;
            d3Var.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PARAMS_LIVE_FROM_NEARBY_CHAT", true);
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", d3Var.f411012f);
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", d3Var.f411011e);
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_PULL_SOURCE", this.f411260h);
            dk2.x4.C.c(intent, this.f411259g);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("KEY_PARAMS_LIVE_FROM_NEARBY_CHAT_INNER_INTENT", intent);
            android.os.Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new android.os.Bundle();
            }
            bundle.putAll(extras);
            com.tencent.mm.ui.MMActivity mMActivity = this.f411257e;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) mMActivity.findViewById(com.tencent.mm.R.id.sp9);
            if (frameLayout != null) {
                if (d3Var.f411014h != null) {
                    androidx.fragment.app.i2 beginTransaction = mMActivity.getSupportFragmentManager().beginTransaction();
                    com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment finderLiveChatFragment = d3Var.f411014h;
                    kotlin.jvm.internal.o.d(finderLiveChatFragment);
                    beginTransaction.j(finderLiveChatFragment);
                    beginTransaction.e();
                }
                com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment finderLiveChatFragment2 = new com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment();
                d3Var.f411014h = finderLiveChatFragment2;
                finderLiveChatFragment2.setArguments(bundle);
                com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment finderLiveChatFragment3 = d3Var.f411014h;
                if (finderLiveChatFragment3 != null) {
                    finderLiveChatFragment3.f111652n = new sp2.u2(d3Var, mMActivity, intent, j01Var);
                }
                androidx.fragment.app.i2 beginTransaction2 = mMActivity.getSupportFragmentManager().beginTransaction();
                int id6 = frameLayout.getId();
                com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment finderLiveChatFragment4 = d3Var.f411014h;
                kotlin.jvm.internal.o.d(finderLiveChatFragment4);
                beginTransaction2.h(id6, finderLiveChatFragment4, "chat_fragment", 1);
                com.tencent.mm.plugin.finder.live.fragment.FinderLiveChatFragment finderLiveChatFragment5 = d3Var.f411014h;
                kotlin.jvm.internal.o.d(finderLiveChatFragment5);
                beginTransaction2.n(finderLiveChatFragment5);
                beginTransaction2.e();
            }
        }
        return jz5.f0.f302826a;
    }
}
