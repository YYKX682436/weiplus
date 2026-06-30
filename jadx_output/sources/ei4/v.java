package ei4;

/* loaded from: classes9.dex */
public final class v implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f253246d;

    public v(yz5.a aVar, int i17, kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.view.View view = (android.view.View) obj;
        ((java.lang.Number) obj2).intValue();
        hi4.e item = (hi4.e) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String Di = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Di(item.field_hash_username, 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusGreetingClickListener", "openTextStateChatting hashUserName:%s changeUserName:%s", item.field_hash_username, Di);
        if (Di == null || r26.n0.N(Di)) {
            mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(item.field_session_id);
            if (Ai != null && Ai.field_canTalk == 1) {
                ki4.x xVar = (ki4.x) i95.n0.c(ki4.x.class);
                java.lang.String str = item.field_session_id;
                java.lang.String str2 = item.field_encUsername;
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                xVar.Di(str, str2, context);
                hi4.k kVar = hi4.m.f281555f;
                java.lang.String field_session_id = item.field_session_id;
                kotlin.jvm.internal.o.f(field_session_id, "field_session_id");
                kVar.d(field_session_id, 102);
            } else {
                android.content.Context context2 = view.getContext();
                i95.m c17 = i95.n0.c(ki4.x.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ei4.u uVar = new ei4.u(this, context2, item);
                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                fi4.a aVar = new fi4.a(kz5.b0.c(new jz5.l(item.field_session_id, item.field_encUsername)), false);
                com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
                kotlin.jvm.internal.o.f(d17, "getNetSceneQueue(...)");
                ii4.a.a(d17, aVar, (androidx.lifecycle.y) context2, new ki4.t(aVar, uVar));
                this.f253246d = db5.e1.P(context2, context2.getString(com.tencent.mm.R.string.f490468vx), 3, context2.getString(com.tencent.mm.R.string.f490468vx), false, true, new ei4.t(aVar));
            }
        } else {
            ki4.x xVar2 = (ki4.x) i95.n0.c(ki4.x.class);
            android.content.Context context3 = view.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            kotlin.jvm.internal.o.d(Di);
            xVar2.Ni(context3, Di);
        }
        return jz5.f0.f302826a;
    }
}
