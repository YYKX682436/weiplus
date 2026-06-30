package g22;

/* loaded from: classes15.dex */
public final class l0 implements i22.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI f267846a;

    public l0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI) {
        this.f267846a = emojiStoreV3SingleProductAlbumUI;
    }

    @Override // i22.o0
    public void a(i22.m holder, int i17, i22.n0 n0Var) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (n0Var != null && n0Var.getType() == 4) {
            i22.c1 c1Var = n0Var instanceof i22.c1 ? (i22.c1) n0Var : null;
            r45.ri0 ri0Var = c1Var != null ? c1Var.f287952a : null;
            if (ri0Var != null) {
                com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3SingleProductAlbumUI emojiStoreV3SingleProductAlbumUI = this.f267846a;
                emojiStoreV3SingleProductAlbumUI.f98467x = true;
                com.tencent.mm.storage.emotion.EmojiInfo i18 = n22.m.i(ri0Var);
                n22.f fVar = n22.f.f334290a;
                androidx.appcompat.app.AppCompatActivity context = emojiStoreV3SingleProductAlbumUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                k22.g d17 = n22.f.d(fVar, context, i18, true, null, null, null, 0, 0L, 0, 0, 0L, null, null, null, null, 32760, null);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(ri0Var.f384901v)) {
                    java.lang.String StoreMeaning = ri0Var.f384901v;
                    kotlin.jvm.internal.o.f(StoreMeaning, "StoreMeaning");
                    d17.d(StoreMeaning);
                }
            }
            j22.a.e(ri0Var, 0, 3, 0L, 29);
        }
    }
}
