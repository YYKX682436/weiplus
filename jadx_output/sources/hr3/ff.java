package hr3;

/* loaded from: classes5.dex */
public final class ff extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(hr3.pf pfVar) {
        super(0);
        this.f283554d = pfVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hr3.pf pfVar = this.f283554d;
        com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto mMLimitedClearEditTextWithPhoto = (com.tencent.mm.ui.base.MMLimitedClearEditTextWithPhoto) pfVar.findViewById(com.tencent.mm.R.id.m9y);
        android.view.View addPhotoLayout = mMLimitedClearEditTextWithPhoto.getAddPhotoLayout();
        kotlin.jvm.internal.o.f(addPhotoLayout, "<get-addPhotoLayout>(...)");
        if ((pfVar.getActivity() instanceof com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI) || (pfVar.getActivity() instanceof com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3)) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(addPhotoLayout, "friend_request_add_img_btn");
            aVar.ik(addPhotoLayout, 40, 33926);
            aVar.gk(addPhotoLayout, kz5.c1.l(new jz5.l("friend_request_id", (java.lang.String) ((jz5.n) pfVar.f283895n).getValue()), new jz5.l("add_username", pfVar.getUsername())));
        }
        return mMLimitedClearEditTextWithPhoto;
    }
}
