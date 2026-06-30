package rk4;

/* loaded from: classes.dex */
public final class s2 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396963d;

    public s2(yz5.l lVar) {
        this.f396963d = lVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.modelavatar.s0 Ni;
        com.tencent.mm.modelavatar.r0 n07;
        android.os.Bundle extras;
        java.lang.String str = null;
        java.lang.String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("Select_Conv_User");
        yz5.l lVar = this.f396963d;
        if (i18 == -1) {
            if (!(string == null || string.length() == 0)) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String e17 = c01.a2.e(string);
                if (((kv.a0) i95.n0.c(kv.a0.class)) != null && (Ni = com.tencent.mm.modelavatar.d1.Ni()) != null && (n07 = Ni.n0(string)) != null) {
                    str = n07.d();
                }
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.ContactInfoWrap(e17, str, string))));
                return;
            }
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.ContactInfoWrap(null, null, null, 7, null))));
    }
}
