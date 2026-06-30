package yt3;

/* loaded from: classes10.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.d0 f465376d;

    public c0(yt3.d0 d0Var) {
        this.f465376d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditJumpThirdPlugin$showFinderBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yt3.d0 d0Var = this.f465376d;
        d0Var.getClass();
        nu3.m mVar = nu3.m.f340229a;
        mVar.l(3);
        mVar.i(3, 1L);
        android.content.Intent intent = new android.content.Intent();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 5, 44, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = d0Var.f465397d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        intent.putExtra("key_finder_sns_post_type", 3);
        intent.putExtra("key_finder_sns_post_within_30s", true);
        intent.putExtra("key_finder_post_video_source", d0Var.a());
        intent.putExtra("key_finder_post_router", 6);
        intent.putExtra("key_finder_post_from", 6);
        intent.putExtra("key_form_sns", true);
        intent.putExtra("KEY_POST_DIRECTLY_FROM_SNS", true);
        ct0.b bVar = d0Var.f465399f;
        if (bVar == null || (str = bVar.f222204a) == null) {
            str = bVar != null ? bVar.f222209f : null;
        }
        intent.putExtra("key_finder_post_sns_video_path", str);
        ct0.b bVar2 = d0Var.f465399f;
        intent.putExtra("key_finder_post_sns_video_duration_ms", bVar2 != null ? bVar2.f222208e : 0);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditJumpThirdPlugin$showFinderBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
