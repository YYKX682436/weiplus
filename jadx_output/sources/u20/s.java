package u20;

/* loaded from: classes9.dex */
public final class s implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u20.y f423936d;

    public s(u20.y yVar) {
        this.f423936d = yVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        u20.y yVar = this.f423936d;
        if (i17 != 101 || i18 != -1 || intent == null) {
            yVar.b("Failed to get username after selection,requestCode fail");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        if (P1 == null || P1.isEmpty()) {
            yVar.b("Failed to get username after selection");
            return;
        }
        java.util.List list = yVar.f423955f;
        kotlin.jvm.internal.o.d(P1);
        ((java.util.ArrayList) list).addAll(P1);
        kotlinx.coroutines.l.d(yVar.f423859c, null, null, new u20.u(yVar, stringExtra2, null), 3, null);
    }
}
