package gl4;

/* loaded from: classes11.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.TingMemberShipSubscribeRequest f272870d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl4.z f272871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f272872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f272873g;

    public o(com.tencent.mm.api.TingMemberShipSubscribeRequest tingMemberShipSubscribeRequest, gl4.z zVar, androidx.fragment.app.FragmentActivity fragmentActivity, qk.y8 y8Var) {
        this.f272870d = tingMemberShipSubscribeRequest;
        this.f272871e = zVar;
        this.f272872f = fragmentActivity;
        this.f272873g = y8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTingBindQQMusicDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.api.TingMemberShipSubscribeRequest request = this.f272870d;
        kotlin.jvm.internal.o.g(request, "request");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "tyt_vip_qmusic_authent_free");
        hashMap.put("buy_vip_session", request.f53214g);
        hashMap.put("currscene", java.lang.Integer.valueOf(request.f53215h));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
        gl4.z zVar = this.f272871e;
        zVar.getClass();
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new gl4.i(zVar, this.f272872f, this.f272873g, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTingBindQQMusicDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
