package mi5;

/* loaded from: classes9.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec5.a f326835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f326837f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326838g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mi5.h f326839h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f326840i;

    public g(ec5.a aVar, android.content.Context context, com.tencent.mm.storage.f9 f9Var, java.lang.String str, mi5.h hVar, kotlin.jvm.internal.h0 h0Var) {
        this.f326835d = aVar;
        this.f326836e = context;
        this.f326837f = f9Var;
        this.f326838g = str;
        this.f326839h = hVar;
        this.f326840i = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingFileView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ec5.a aVar = this.f326835d;
        long j17 = aVar.getLong(aVar.f43702d + 0);
        android.content.Context context = this.f326836e;
        if (j17 > 0) {
            sc5.g gVar = sc5.g.f406572a;
            kotlin.jvm.internal.o.f(context, "$context");
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            gVar.f(context, this.f326837f, new sc5.h(uuid));
        } else if (com.tencent.mm.vfs.w6.j(aVar.getFilePath())) {
            java.lang.String str = this.f326838g;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
                if (com.tencent.mm.pluginsdk.model.t3.l(str)) {
                    ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Bi(aVar.getFilePath(), str, 16);
                } else {
                    aVar.getFilePath();
                    mi5.h hVar = this.f326839h;
                    hVar.getClass();
                    if (com.tencent.mm.sdk.platformtools.t8.F0(str)) {
                        kotlin.jvm.internal.o.f(context, "$context");
                        java.lang.String filePath = aVar.getFilePath();
                        java.lang.String g17 = ez.v0.f257777a.g((v05.b) this.f326840i.f310123d);
                        hVar.getClass();
                        re5.f0.a(filePath);
                        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.media.MediaGalleryContainerUI.class);
                        pf5.j0.a(intent, re5.g0.class);
                        intent.putExtra("KEY_PATH", filePath);
                        intent.putExtra("KEY_VIDEO_FILE_NAME", g17);
                        intent.putExtra(com.tencent.mm.ui.vas.VASActivity.KEY_DISABLE_COMMON_AREA_CONTROL, true);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/ui/msgviewfactory/view/ChattingFileView", "openByVideoPlayer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(context, "com/tencent/mm/ui/msgviewfactory/view/ChattingFileView", "openByVideoPlayer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingFileView", "unsupport ext: " + str);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingFileView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
