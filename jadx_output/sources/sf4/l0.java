package sf4;

/* loaded from: classes4.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ if4.f f407526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView, if4.f fVar) {
        super(0);
        this.f407525d = storyGalleryView;
        this.f407526e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if4.h hVar = this.f407526e.f291247e;
        int i17 = com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView.f172085l1;
        this.f407525d.getClass();
        if (!hVar.a()) {
            ef4.v vVar = ef4.w.f252468t;
            nf4.j J0 = vVar.i().J0(hVar.f291253a);
            if (J0 != null) {
                J0.field_localFlag &= -5;
                r45.ye6 v07 = J0.v0();
                v07.f391018e = 0;
                v07.f391019f = c01.id.e();
                v07.f391021h = "";
                v07.f391022i = 3;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(vVar.e());
                sb6.append("");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(android.os.SystemClock.elapsedRealtime());
                sb6.append(c01.id.c());
                byte[] bytes = sb6.toString().getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                v07.f391017d = kk.k.g(bytes);
                J0.field_createTime = c01.id.e();
                byte[] byteArray = v07.toByteArray();
                kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                J0.field_postBuf = byteArray;
                vVar.i().i1((int) J0.systemRowid, J0);
            }
        }
        return jz5.f0.f302826a;
    }
}
