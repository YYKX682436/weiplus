package w45;

/* loaded from: classes11.dex */
public final class j implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w45.p f442910d;

    public j(w45.p pVar) {
        this.f442910d = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
        kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.feature.simplecgi.api.INetSceneLogout");
        ((is.f) r0Var).fj((de0.f) m1Var, "last_logout_no_pwd_ticket_for_one_click", true);
        com.tencent.mm.sdk.platformtools.u3.h(new w45.i(this.f442910d));
    }
}
