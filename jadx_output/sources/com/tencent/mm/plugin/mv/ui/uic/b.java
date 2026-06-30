package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class b extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f151038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151038d = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.a(activity));
    }

    public final j75.r O6() {
        return (j75.r) ((jz5.n) this.f151038d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.content.Intent intent = getActivity().getIntent();
        r45.oc5 oc5Var = com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI.f150859d;
        r45.oc5 oc5Var2 = com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI.f150859d;
        if (oc5Var2 != null) {
            O6().B3(new pm3.b(oc5Var2));
            com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI.f150859d = null;
            return;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("PreviewItemObj");
        if (byteArrayExtra != null) {
            r45.oc5 oc5Var3 = new r45.oc5();
            oc5Var3.parseFrom(byteArrayExtra);
            O6().B3(new pm3.b(oc5Var3));
        }
    }
}
