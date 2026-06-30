package v92;

/* loaded from: classes15.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v92.g f434152d;

    public a(v92.g gVar) {
        this.f434152d = gVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        boolean z17;
        if (g4Var.z()) {
            v92.g gVar = this.f434152d;
            if (gVar.a()) {
                java.lang.String string = gVar.f434158a.getString(com.tencent.mm.R.string.f490559yh);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = gVar.f434158a.getString(com.tencent.mm.R.string.f492075f54);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                java.lang.String string3 = gVar.f434158a.getString(com.tencent.mm.R.string.c__);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                if (gVar.p()) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f3u);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f3v);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.o1g);
                    kotlin.jvm.internal.o.f(string3, "getString(...)");
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z18 = z17;
                java.lang.String str = string3;
                g4Var.j(20002, string, com.tencent.mm.R.raw.finder_icons_filled_share, gVar.f434158a.getResources().getColor(com.tencent.mm.R.color.f478502m), z18);
                g4Var.j(20003, string2, com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, z18);
                if (gVar.x()) {
                    g4Var.j(20010, str, com.tencent.mm.R.raw.bottomsheet_icon_fav, 0, z18);
                }
            }
        }
    }
}
