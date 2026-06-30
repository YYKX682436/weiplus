package o14;

/* loaded from: classes5.dex */
public final /* synthetic */ class a$$a implements com.tencent.mm.ui.zc {
    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        int i18 = com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI.f160058h;
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("select_chatrooms");
            if (com.tencent.mm.storage.z3.R4(stringExtra)) {
                com.tencent.mm.storage.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(stringExtra);
                W0.W0(0);
                ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().replace(W0);
                ((ku5.t0) ku5.t0.f312615d).B(new o14.a$$b());
            }
        }
    }
}
