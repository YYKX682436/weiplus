package wu;

/* loaded from: classes9.dex */
public final class h0 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        z01.q qVar = new z01.q();
        qVar.f469140e = new wu.f0(item, this);
        qVar.f469141f = new wu.g0(this, item);
        mvvmView.setViewModel(qVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        android.content.Intent intent;
        android.os.Bundle bundleExtra;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = view.getContext();
        java.text.SimpleDateFormat simpleDateFormat = vu.a.f440046a;
        hu.f fVar = this.f449610e;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        long n17 = fVar.n();
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(n17, fVar.q());
        com.tencent.mm.storage.f9 m17 = pt0.f0.f358209b1.m(msgIdTalker);
        le5.e eVar = (le5.e) i95.n0.c(le5.e.class);
        java.lang.String str = m17.G;
        s15.h hVar = item.f284997e;
        if (((fo.e) eVar).bj(context, str, hVar.getString(hVar.f303422d + 10))) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClassName(context, "com.tencent.mm.ui.media.MediaGalleryContainerUI");
        pf5.j0.a(intent2, gi5.h.class);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        intent2.putExtra("img_gallery_left", iArr[0]);
        intent2.putExtra("img_gallery_top", iArr[1]);
        intent2.putExtra("img_gallery_width", width);
        intent2.putExtra("img_gallery_height", height);
        intent2.putExtra("message_id", n17);
        intent2.putExtra("message_talker", msgIdTalker.a());
        intent2.putExtra("record_data_id", hVar.getString(hVar.f303422d + 3));
        intent2.putExtra("params", fVar.toJson().toString());
        intent2.putExtra("from_scene", 0);
        intent2.putExtra("chatTypeForAppbrand", k01.d.a(msgIdTalker.a()));
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null && (bundleExtra = intent.getBundleExtra("_stat_obj")) != null) {
            intent2.putExtra("_stat_obj", bundleExtra);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/appmsg/ui/item/RecordDetailImgItemConvert", "goToImage", "(Landroid/view/View;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailUIParams;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailImgItemConvert", "goToImage", "(Landroid/view/View;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailUIParams;Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        r31.n Ai = ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.mvvm.MvvmView t17 = ((bf5.a) Ai).t(context);
        t17.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(t17, -2, -2);
    }
}
