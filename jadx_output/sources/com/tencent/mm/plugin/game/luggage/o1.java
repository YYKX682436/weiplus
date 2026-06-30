package com.tencent.mm.plugin.game.luggage;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes8.dex */
public class o1 implements com.tencent.mm.ipcinvoker.j {
    private o1() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("action_id");
        java.lang.String string = bundle.getString("preload_url");
        if (i17 == 1) {
            java.lang.Class cls = (java.lang.Class) bundle.getSerializable("webcore_impl_class");
            if (android.text.TextUtils.isEmpty(string) || cls == null) {
                return;
            }
            com.tencent.mm.plugin.game.luggage.p1.e(cls, string, new com.tencent.mm.plugin.game.luggage.n1(this, rVar));
            return;
        }
        if (i17 == 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mm.plugin.game.luggage.p1.b();
                return;
            } else {
                com.tencent.mm.plugin.game.luggage.p1.f(string);
                return;
            }
        }
        if (i17 != 3) {
            return;
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("preload_success", com.tencent.mm.plugin.game.luggage.p1.d(string));
        bundle2.putBoolean("has_preload", com.tencent.mm.plugin.game.luggage.p1.c(string) != null);
        rVar.a(bundle2);
    }
}
