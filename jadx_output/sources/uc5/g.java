package uc5;

/* loaded from: classes10.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc5.d f426484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc5.n f426485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f426487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f426488h;

    public g(uc5.d dVar, uc5.n nVar, android.content.Context context, java.lang.Object obj, android.widget.CheckBox checkBox) {
        this.f426484d = dVar;
        this.f426485e = nVar;
        this.f426486f = context;
        this.f426487g = obj;
        this.f426488h = checkBox;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uc5.d dVar = this.f426484d;
        uc5.c cVar = dVar.f426476d;
        boolean b17 = kotlin.jvm.internal.o.b(cVar, uc5.a.f426469a);
        uc5.n nVar = this.f426485e;
        if (b17) {
            nVar.u(this.f426486f, this.f426487g, dVar.f426477e);
        } else if (cVar instanceof uc5.b) {
            uc5.r rVar = nVar.f426531g;
            if (rVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryBaseItemConvert", "buildItemBodyClickListener, controller is null, skip");
                yj0.a.h(this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            boolean z17 = !((uc5.b) cVar).f426471a;
            uc5.b bVar = new uc5.b(z17);
            this.f426488h.setChecked(z17);
            java.lang.String uniqueId = dVar.v();
            kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
            ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) rVar).o7().W6(uniqueId, bVar);
            dVar.getClass();
            dVar.f426476d = bVar;
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
