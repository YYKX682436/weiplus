package zx;

/* loaded from: classes14.dex */
public final class s implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx.t f476961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zx.u f476962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f476963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zx.r f476964g;

    public s(zx.t tVar, zx.u uVar, boolean z17, zx.r rVar) {
        this.f476961d = tVar;
        this.f476962e = uVar;
        this.f476963f = z17;
        this.f476964g = rVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/chatbot/brand/ui/view/QueryAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        zx.p pVar = this.f476961d.f476968g;
        if (pVar != null) {
            zx.r rVar = this.f476964g;
            rVar.getAdapterPosition();
            android.view.View view2 = rVar.f476960d;
            zx.e eVar = (zx.e) pVar;
            zx.u item = this.f476962e;
            kotlin.jvm.internal.o.g(item, "item");
            kotlin.jvm.internal.o.g(view2, "view");
            boolean z17 = this.f476963f;
            zx.t tVar = eVar.f476947a;
            com.tencent.wechat.aff.chatbot.l lVar = item.f476972d;
            if (!z17) {
                java.lang.String b17 = lVar.b();
                java.lang.String str = tVar.f476967f;
                if (!android.text.TextUtils.equals(str, b17)) {
                    int x17 = str != null ? tVar.x(str) : -1;
                    tVar.f476967f = b17;
                    int x18 = b17 != null ? tVar.x(b17) : -1;
                    if (x17 >= 0) {
                        tVar.notifyItemChanged(x17);
                    }
                    if (x18 >= 0 && x18 != x17) {
                        tVar.notifyItemChanged(x18);
                    }
                }
            }
            rl5.r rVar2 = new rl5.r(view2.getContext(), view2);
            com.tencent.mm.feature.chatbot.brand.ui.view.CBTBrandLiveQueryListView cBTBrandLiveQueryListView = eVar.f476948b;
            rVar2.f397355y = new zx.b(cBTBrandLiveQueryListView);
            rVar2.f397354x = new zx.c(cBTBrandLiveQueryListView, item);
            rVar2.L = new zx.d(z17, tVar, item);
            rVar2.C = true;
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            rVar2.n(iArr[0] + (view2.getWidth() / 2), iArr[1]);
            xx.y brandDataReporter = cBTBrandLiveQueryListView.getBrandDataReporter();
            if (brandDataReporter != null) {
                java.lang.String b18 = lVar.b();
                kotlin.jvm.internal.o.f(b18, "getTraceId(...)");
                long j17 = lVar.f216341d;
                xx.b bVar = lVar.f216347m ? xx.b.f457771f : xx.b.f457770e;
                com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportCommentClk");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_room_comment_clk", brandDataReporter.a(brandDataReporter.f457837j, new xx.n(b18, j17, bVar)), 36708);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/feature/chatbot/brand/ui/view/QueryAdapter$onBindViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
