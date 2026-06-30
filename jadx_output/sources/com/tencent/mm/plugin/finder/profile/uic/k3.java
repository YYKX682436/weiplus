package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f123885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var) {
        super(0);
        this.f123885d = f4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.f4 f4Var = this.f123885d;
        androidx.appcompat.app.AppCompatActivity activity = f4Var.getActivity();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        java.lang.Integer valueOf = mMFinderUI != null ? java.lang.Integer.valueOf(mMFinderUI.getD()) : null;
        int intExtra = f4Var.getIntent().getIntExtra("key_entrance_type", -1);
        int intExtra2 = f4Var.getIntent().getIntExtra("KEY_REF_COMMENTSCENE", 0);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        return intExtra2 + '-' + intExtra + '-' + valueOf + '-' + uuid;
    }
}
