package hi5;

/* loaded from: classes8.dex */
public final class a implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmec.NewCardPackageTipPreference f281559a;

    public a(com.tencent.mm.ui.mmec.NewCardPackageTipPreference newCardPackageTipPreference) {
        this.f281559a = newCardPackageTipPreference;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("Card.Entrance.Left");
        com.tencent.mm.plugin.finder.extension.reddot.jb L02 = nk6.L0("Card.Entrance.Right");
        com.tencent.mm.ui.mmec.NewCardPackageTipPreference newCardPackageTipPreference = this.f281559a;
        java.lang.String str2 = L0 != null ? L0.field_tips_uuid : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = L02 != null ? L02.field_tips_uuid : null;
        java.lang.String str4 = str3 != null ? str3 : "";
        newCardPackageTipPreference.f209150n3 = str2;
        newCardPackageTipPreference.f209151o3 = str4;
        return com.tencent.mm.ui.mmec.NewCardPackageTipPreference.h1(newCardPackageTipPreference, L0, L02, null, 0, true, 12, null);
    }
}
