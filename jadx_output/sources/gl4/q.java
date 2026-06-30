package gl4;

/* loaded from: classes11.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.TingMemberShipSubscribeRequest f272875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl4.z f272876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f272877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.w80 f272878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f272879h;

    public q(com.tencent.mm.api.TingMemberShipSubscribeRequest tingMemberShipSubscribeRequest, gl4.z zVar, androidx.fragment.app.FragmentActivity fragmentActivity, bw5.w80 w80Var, qk.y8 y8Var) {
        this.f272875d = tingMemberShipSubscribeRequest;
        this.f272876e = zVar;
        this.f272877f = fragmentActivity;
        this.f272878g = w80Var;
        this.f272879h = y8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTingBindQQMusicDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.api.TingMemberShipSubscribeRequest request = this.f272875d;
        kotlin.jvm.internal.o.g(request, "request");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "tyt_vip_qmusic_authent_wxbean");
        hashMap.put("buy_vip_session", request.f53214g);
        hashMap.put("currscene", java.lang.Integer.valueOf(request.f53215h));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
        this.f272876e.d(this.f272877f, request, this.f272878g, this.f272879h);
        yj0.a.h(this, "com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTingBindQQMusicDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
