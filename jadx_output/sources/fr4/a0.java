package fr4;

/* loaded from: classes10.dex */
public final class a0 implements le0.r {

    /* renamed from: a, reason: collision with root package name */
    public static final fr4.a0 f265801a = new fr4.a0();

    @Override // le0.r
    public final void a(android.content.Context context, le0.t tVar) {
        if (context instanceof android.app.Activity) {
            java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("Chat_User");
            com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
            if (stringExtra != null && stringExtra.endsWith("@zhugemsg")) {
                ((com.tencent.mm.pluginsdk.ui.span.j1) tVar).f191244w = kz5.p1.d(Integer.MAX_VALUE);
            }
        }
    }
}
