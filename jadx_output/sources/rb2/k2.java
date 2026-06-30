package rb2;

/* loaded from: classes10.dex */
public final class k2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f393672d;

    public k2(com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, int i17, int i18) {
        this.f393672d = finderEmojiView;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (this.f393672d.getStatus() == 1) {
            g4Var.a(0, com.tencent.mm.R.string.f491266ni1);
        }
        g4Var.a(1, com.tencent.mm.R.string.f490394tr);
    }
}
