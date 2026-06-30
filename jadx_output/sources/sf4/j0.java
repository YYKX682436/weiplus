package sf4;

/* loaded from: classes4.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        super(0);
        this.f407496d = storyGalleryView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407496d;
        sf4.d dVar = storyGalleryView.M;
        if (!(dVar != null ? dVar.D : false)) {
            ef4.v vVar = ef4.w.f252468t;
            nf4.l i17 = vVar.i();
            java.lang.String e17 = vVar.e();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (e17.length() > 0) {
                android.database.Cursor f17 = i17.f336872h.f("select *,rowid from MMStoryInfo  " + i17.y0(e17, true) + " AND " + nf4.l.f336865t + ' ' + nf4.l.f336859n, null, 2);
                if (f17 != null) {
                    while (f17.moveToNext()) {
                        nf4.j jVar = new nf4.j();
                        jVar.convertFrom(f17);
                        arrayList.add(jVar);
                    }
                    f17.close();
                }
            }
            if (arrayList.size() >= 9) {
                db5.e1.s(storyGalleryView.getContext(), "", storyGalleryView.getContext().getResources().getString(com.tencent.mm.R.string.jmi));
            } else {
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_STORY_EDITOR_SHOW_FAV_TIP_BOOLEAN_SYNC;
                if (c17.o(u3Var, true)) {
                    gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
                    db5.e1.t(storyGalleryView.getContext(), "", storyGalleryView.getContext().getResources().getString(com.tencent.mm.R.string.jmk), new sf4.h1(storyGalleryView));
                }
            }
            return jz5.f0.f302826a;
        }
        lf4.l lVar = storyGalleryView.A;
        if (lVar != null) {
            int i18 = storyGalleryView.f172102u;
            int i19 = storyGalleryView.f172103v;
            sf4.d dVar2 = storyGalleryView.M;
            lVar.l(i18, i19, dVar2 != null ? dVar2.D : false, null);
        }
        return jz5.f0.f302826a;
    }
}
