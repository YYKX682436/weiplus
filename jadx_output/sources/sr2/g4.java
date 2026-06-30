package sr2;

/* loaded from: classes10.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411571d;

    public g4(com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411571d = postMainUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411571d;
        sr2.w0 F7 = postMainUIC.F7();
        F7.getIntent().putExtra("saveDesc", F7.V6().getText().toString());
        android.content.Intent intent = F7.getIntent();
        rx2.d b17 = F7.d7().b();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = b17.f400965a.entrySet().iterator();
        while (true) {
            byte[] bArr = null;
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            r45.gb4 gb4Var = (r45.gb4) entry.getValue();
            com.tencent.mm.plugin.finder.assist.LocalFinderAtContactParcel localFinderAtContactParcel = new com.tencent.mm.plugin.finder.assist.LocalFinderAtContactParcel();
            localFinderAtContactParcel.f101985d = gb4Var.getString(0);
            localFinderAtContactParcel.f101986e = gb4Var.getString(1);
            localFinderAtContactParcel.f101987f = gb4Var.getString(2);
            com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = (com.tencent.mm.protocal.protobuf.FinderAuthInfo) gb4Var.getCustom(3);
            if (finderAuthInfo != null) {
                bArr = finderAuthInfo.toByteArray();
            }
            localFinderAtContactParcel.f101988g = bArr;
            localFinderAtContactParcel.f101989h = gb4Var.getLong(4);
            localFinderAtContactParcel.f101990i = gb4Var.getInteger(5);
            localFinderAtContactParcel.f101991m = gb4Var.getInteger(7);
            arrayList2.add(localFinderAtContactParcel);
        }
        intent.putExtra("saveDescAt", arrayList2);
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtras(postMainUIC.getIntent());
        intent2.putExtra("album_from_finder_add_media", true);
        zv2.r0 r0Var = postMainUIC.C7().f411681f;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = r0Var != null ? ((zv2.b) r0Var).f476397f : null;
        intent2.putExtra("KEY_POST_SET_MEMBER_LINK", finderJumpInfo != null && finderJumpInfo.getBusiness_type() == 52);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).nl(intent2, postMainUIC.getIntent());
        androidx.appcompat.app.AppCompatActivity activity = postMainUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        intent2.putExtra("key_post_has_show_safe_dialog", ((dv2.e1) pf5.z.f353948a.a(activity).a(dv2.e1.class)).f243917d > 0);
        if (postMainUIC.k7().p()) {
            intent2.putExtra("KEY_POST_WARM_GOODS_SELECT_MEDIA", true);
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity context = postMainUIC.getActivity();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlin.jvm.internal.o.g(context, "context");
        ((com.tencent.mm.plugin.finder.assist.i0) c17).fk(context, intent2, 3, 9, bool, -1);
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.B(1);
        p2Var.G("andr_Post_Page_New_Select", null);
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPostingPageThumbnail", postMainUIC.getIntent().getIntExtra("key_ref_enter_scene", 0), 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initDelMediaBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
