package uv3;

/* loaded from: classes5.dex */
public final class b extends com.tencent.mm.plugin.recordvideo.ui.editor.music.component.p1 {
    public final r45.yv0 F;
    public final boolean G;
    public final jz5.g H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j0 status, r45.yv0 finderCgiType, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        super(parent, status);
        finderCgiType = (i17 & 4) != 0 ? r45.yv0.kFinderBgmListTypeSprSearch : finderCgiType;
        z17 = (i17 & 8) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(finderCgiType, "finderCgiType");
        this.F = finderCgiType;
        this.G = z17;
        this.H = jz5.h.b(new uv3.a(this));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public void u(boolean z17, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c1 searchType) {
        pq5.g l17;
        java.lang.String str;
        kotlin.jvm.internal.o.g(searchType, "searchType");
        if (!z17 && (str = this.f156181v) != null) {
            wv3.d dVar = this.f156167f instanceof com.tencent.mm.plugin.recordvideo.ui.editor.music.drawer.SingleVideoEditMusicPickerComponentLayout ? wv3.d.f450054e : wv3.d.f450055f;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sns_publish_search_music", kz5.c1.k(new jz5.l("query_word", str), new jz5.l("musiceditsource", java.lang.Integer.valueOf(dVar.f450057d)), new jz5.l("sns_publish_sessionid", ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Bi()), new jz5.l("queryid", c01.z1.r() + '_' + (java.lang.System.currentTimeMillis() / 1000.0d))), 36244);
        }
        vv3.b bVar = (vv3.b) ((jz5.n) this.H).getValue();
        java.lang.String str2 = this.f156181v;
        bVar.getClass();
        com.tencent.mars.xlog.Log.i("SnsSearchBgmListHelper", "doSearch " + str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.d dVar2 = bVar.f440433a;
        if (!z17) {
            bVar.f440438f = null;
            dVar2.F();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_string_1", str2);
            dVar2.j(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.i0.f156247g, bundle);
        }
        java.lang.String str3 = str2 == null ? "" : str2;
        dVar2.getActivity();
        jv3.a aVar = bVar.f440437e;
        if (aVar != null) {
            aVar.j();
        }
        bVar.f440437e = new jv3.a(bVar.f440434b.f391399d, 30, bVar.f440438f, bVar.f440436d, null, null, null, null, str3, null, 0, 0, 0, null, 15984, null);
        long c17 = c01.id.c();
        jv3.a aVar2 = bVar.f440437e;
        if (aVar2 == null || (l17 = aVar2.l()) == null) {
            return;
        }
        l17.f(bVar.f440435c);
        l17.h(new vv3.a(c17, str3, str2, bVar, z17, searchType));
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public int x() {
        return !this.G ? 15 : 16;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.music.component.b1
    public void z() {
        super.z();
        vv3.b bVar = (vv3.b) ((jz5.n) this.H).getValue();
        jv3.a aVar = bVar.f440437e;
        if (aVar != null) {
            aVar.j();
        }
        bVar.f440437e = null;
    }
}
