package ei4;

/* loaded from: classes11.dex */
public final class i implements wn.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hi4.a f253219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.j f253220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f253221f;

    public i(hi4.a aVar, ei4.j jVar, android.view.View view) {
        this.f253219d = aVar;
        this.f253220e = jVar;
        this.f253221f = view;
    }

    @Override // wn.q
    public void G4() {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusConversationClickListener", "onChattingUIEnter");
        ki4.x xVar = (ki4.x) i95.n0.c(ki4.x.class);
        hi4.a aVar = this.f253219d;
        java.lang.String str2 = aVar.field_sessionId;
        xVar.getClass();
        if (!(str2 == null || r26.n0.N(str2))) {
            mj4.w Ai = xVar.Ai(str2);
            if (Ai != null && ((str = Ai.field_nickname) == null || str.length() == 0)) {
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkContactExpired] isNeedGetContact=true sessionId=");
            sb6.append(str2);
            sb6.append(" nickname=");
            sb6.append(Ai != null ? Ai.field_nickname : null);
            sb6.append(" avatar=");
            sb6.append(Ai != null ? Ai.field_smallHeadImgUrl : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusContactService", sb6.toString());
            java.lang.String str3 = ni4.x.f337776d.m().y0(str2).field_talker;
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusContactService", "[checkContactExpired] talker=".concat(str3));
            ki4.x.wi(xVar, new jz5.l(str2, str3), null, null, false, 14, null);
        }
        li4.a h17 = ni4.x.f337776d.h();
        java.lang.String field_sessionId = aVar.field_sessionId;
        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
        h17.y0(field_sessionId);
        if (this.f253220e.f253222d.getActivity() != null) {
            hi4.k kVar = hi4.m.f281555f;
            java.lang.String field_sessionId2 = aVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId2, "field_sessionId");
            kVar.d(field_sessionId2, 53);
        }
    }

    @Override // wn.q
    public boolean c3() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusConversationClickListener", "onChattingUIExit");
        ra5.c cVar = new ra5.c(this.f253221f);
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        com.tencent.mm.sdk.platformtools.u3.i(cVar, 0L);
        ni4.x xVar = ni4.x.f337776d;
        li4.a h17 = xVar.h();
        java.lang.String field_sessionId = this.f253219d.field_sessionId;
        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
        h17.y0(field_sessionId);
        androidx.fragment.app.FragmentActivity activity = this.f253220e.f253222d.getActivity();
        if (activity == null) {
            return false;
        }
        xVar.o();
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.textstatus.ui.tf) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.textstatus.ui.tf.class)).U6(1);
        return false;
    }
}
