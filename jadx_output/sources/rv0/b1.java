package rv0;

/* loaded from: classes5.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f399931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399932e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(rv0.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399932e = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.b1(this.f399932e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f399931d;
        rv0.n1 n1Var = this.f399932e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf p76 = n1Var.p7();
            this.f399931d = 1;
            if (gx0.bf.t7(p76, false, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yy0.m7 m7Var = (yy0.m7) n1Var.R6().O6();
        kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.b3(m7Var, null), 3, null);
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(n1Var.getContext(), "com.tencent.mm.plugin.finder.ui.FinderAlbumUI");
        intent.putExtra("key_can_select_video_and_pic", false);
        intent.putExtra("is_hide_album_footer", true);
        intent.putExtra("show_header_view", false);
        intent.putExtra("max_select_count", 99);
        intent.putExtra("query_source_type", 38);
        intent.putExtra("query_media_type", 3);
        intent.putExtra("album_video_max_duration", 300);
        intent.putExtra("album_video_min_duration", 1);
        intent.putExtra("key_max_video_duration", ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).bj() - 1);
        android.app.Activity context = n1Var.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(2222);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/ClipPanelUIC$onAppendAssetsButtonClicked$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return jz5.f0.f302826a;
    }
}
