package sf4;

/* loaded from: classes4.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView, android.content.Context context) {
        super(0);
        this.f407532d = storyGalleryView;
        this.f407533e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sf4.d dVar;
        sf4.d dVar2;
        sf4.d dVar3;
        sf4.d dVar4;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407532d;
        if (storyGalleryView.D) {
            java.util.ArrayList arrayList = storyGalleryView.f172109z;
            int size = arrayList.size();
            int i17 = storyGalleryView.f172102u;
            if (i17 >= 0 && i17 < size) {
                int size2 = ((java.util.ArrayList) arrayList.get(i17)).size();
                int i18 = storyGalleryView.f172103v;
                if (i18 >= 0 && i18 < size2) {
                    java.lang.Object obj = ((java.util.ArrayList) arrayList.get(storyGalleryView.f172102u)).get(storyGalleryView.f172103v);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    if4.f fVar = (if4.f) obj;
                    sf4.d dVar5 = storyGalleryView.M;
                    if (dVar5 != null) {
                        dVar5.dismiss();
                    }
                    storyGalleryView.M = new sf4.d(this.f407533e);
                    nf4.j J0 = ef4.w.f252468t.i().J0(fVar.f291247e.f291253a);
                    if (J0 != null) {
                        if (((J0.field_localFlag & 4) != 0 ? J0 : null) != null && (dVar4 = storyGalleryView.M) != null) {
                            dVar4.A = true;
                        }
                    }
                    if (J0 != null) {
                        if (((J0.field_storyID > 0L ? 1 : (J0.field_storyID == 0L ? 0 : -1)) == 0 ? J0 : null) != null && (dVar3 = storyGalleryView.M) != null) {
                            dVar3.E = false;
                        }
                    }
                    if (J0 != null) {
                        if (((J0.field_storyID > 0L ? 1 : (J0.field_storyID == 0L ? 0 : -1)) == 0 || J0.z0() ? J0 : null) != null && (dVar2 = storyGalleryView.M) != null) {
                            dVar2.C = false;
                        }
                    }
                    if (storyGalleryView.getGalleryType() == ze4.k.FavSelfStoryGallery && (dVar = storyGalleryView.M) != null) {
                        dVar.f407445z = false;
                    }
                    sf4.d dVar6 = storyGalleryView.M;
                    if (dVar6 != null) {
                        dVar6.B = (J0 != null && pm0.v.z(J0.field_itemStoryFlag, 4)) && !J0.z0();
                    }
                    sf4.d dVar7 = storyGalleryView.M;
                    if (dVar7 != null) {
                        dVar7.D = J0 != null && J0.u0();
                    }
                    sf4.d dVar8 = storyGalleryView.M;
                    if ((dVar8 != null && dVar8.B) && dVar8 != null) {
                        dVar8.E = false;
                    }
                    if ((dVar8 != null && dVar8.D) && dVar8 != null) {
                        dVar8.C = false;
                    }
                    if (dVar8 != null) {
                        dVar8.f407442w = new sf4.k0(storyGalleryView);
                    }
                    if (dVar8 != null) {
                        dVar8.f407443x = new sf4.l0(storyGalleryView, fVar);
                    }
                    if (dVar8 != null) {
                        dVar8.f407444y = new sf4.m0(storyGalleryView);
                    }
                    if (dVar8 != null) {
                        new sf4.j0(storyGalleryView);
                        dVar8.getClass();
                    }
                    if (dVar8 != null) {
                        dVar8.show();
                    }
                    storyGalleryView.H = true;
                    mf4.d dVar9 = mf4.d.f326160a;
                    com.tencent.mm.autogen.mmdata.rpt.StoryPageExposeStruct storyPageExposeStruct = mf4.d.f326161b;
                    storyPageExposeStruct.f60916d = 7L;
                    storyPageExposeStruct.f60917e = storyPageExposeStruct.b("StoryId", java.lang.String.valueOf(J0 != null ? java.lang.Long.valueOf(J0.field_storyID) : null), true);
                    dVar9.b();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
