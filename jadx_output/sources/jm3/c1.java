package jm3;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f300302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvRouterUI f300303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvRouterUI f300304f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.mv.ui.MusicMvRouterUI musicMvRouterUI, com.tencent.mm.plugin.mv.ui.MusicMvRouterUI musicMvRouterUI2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300303e = musicMvRouterUI;
        this.f300304f = musicMvRouterUI2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jm3.c1(this.f300303e, this.f300304f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jm3.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f300302d;
        com.tencent.mm.plugin.mv.ui.MusicMvRouterUI musicMvRouterUI = this.f300303e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f300302d = 1;
            int i18 = com.tencent.mm.plugin.mv.ui.MusicMvRouterUI.f150889g;
            musicMvRouterUI.getClass();
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new jm3.d1(musicMvRouterUI, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                musicMvRouterUI.finish();
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.mv.ui.MusicMvRouterUI musicMvRouterUI2 = this.f300304f;
        android.content.Intent intent = booleanValue ? new android.content.Intent(musicMvRouterUI2, (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI.class) : new android.content.Intent(musicMvRouterUI2, (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvMakerPreviewUI.class);
        byte[] byteArrayExtra = musicMvRouterUI.getIntent().getByteArrayExtra("key_track_data");
        if (byteArrayExtra != null) {
            intent.putExtra("key_track_data", byteArrayExtra);
        }
        pm0.v.g(intent, musicMvRouterUI.getIntent(), "key_mv_music_duration", 0);
        pm0.v.g(intent, musicMvRouterUI.getIntent(), "key_mv_from_scene", 0);
        pm0.v.g(intent, musicMvRouterUI.getIntent(), "key_mv_enter_maker_ui_from_scene", 0);
        com.tencent.mm.plugin.mv.ui.MusicMvRouterUI musicMvRouterUI3 = this.f300303e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(musicMvRouterUI3, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI$createPreviewMv$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        musicMvRouterUI3.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(musicMvRouterUI3, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI$createPreviewMv$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f300302d = 2;
        if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
            return aVar;
        }
        musicMvRouterUI.finish();
        return jz5.f0.f302826a;
    }
}
