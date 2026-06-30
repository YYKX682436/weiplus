package k22;

/* loaded from: classes12.dex */
public final class b implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k22.g f303476a;

    public b(k22.g gVar) {
        this.f303476a = gVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        k22.g gVar = this.f303476a;
        gVar.getClass();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        z85.l c17 = com.tencent.mm.storage.n5.f().c();
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = gVar.f303484e;
        if (c17.u1(emojiInfo.field_md5) == null) {
            com.tencent.mars.xlog.Log.i(gVar.D, "doAddAction: db info is null");
            l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
            emojiInfo.field_catalog = 65;
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().c().J0(emojiInfo);
        }
        int i17 = emojiInfo.field_catalog;
        l75.e0 e0Var2 = com.tencent.mm.storage.emotion.EmojiInfo.L2;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = gVar.f303488i;
        if (i17 == 17) {
            z2Var.B();
        } else {
            android.content.Context context = gVar.f303483d;
            if (i17 == 81) {
                z2Var.B();
                db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490006i8));
            } else {
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().U(context, emojiInfo, gVar.B, c01.z1.r());
                z2Var.B();
            }
        }
        gVar.c();
        yz5.a aVar = gVar.f303500x;
        if (aVar != null) {
            aVar.invoke();
        }
        j22.a.d(gVar.f303484e, 1, gVar.f303502z, gVar.A, gVar.f303487h);
        k22.g.a(gVar, "addClick");
    }
}
