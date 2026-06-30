package mm3;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f329609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI f329610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI) {
        super(0);
        this.f329609d = u3Var;
        this.f329610e = musicMvFreeMakerPreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f329609d.dismiss();
        com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI = this.f329610e;
        android.content.Intent intent = new android.content.Intent(musicMvFreeMakerPreviewUI, (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvPostUI.class);
        intent.putExtra("key_track_data", musicMvFreeMakerPreviewUI.f150894e.toByteArray());
        pm0.v.g(intent, musicMvFreeMakerPreviewUI.getIntent(), "key_mv_from_scene", 0);
        musicMvFreeMakerPreviewUI.f150895f = true;
        musicMvFreeMakerPreviewUI.startActivityForResult(intent, 7);
        com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c17 = fm3.g0.f264070a.c();
        c17.f59482k = 7L;
        c17.G = 0;
        c17.k();
        c17.o();
        return jz5.f0.f302826a;
    }
}
