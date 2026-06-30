package uc5;

/* loaded from: classes10.dex */
public final class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc5.d f426489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc5.n f426490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f426492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f426493h;

    public h(uc5.d dVar, uc5.n nVar, android.content.Context context, android.view.View view, in5.s0 s0Var) {
        this.f426489d = dVar;
        this.f426490e = nVar;
        this.f426491f = context;
        this.f426492g = view;
        this.f426493h = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        xm3.t0 b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        uc5.d dVar = this.f426489d;
        uc5.c cVar = dVar.f426476d;
        boolean b18 = kotlin.jvm.internal.o.b(cVar, uc5.a.f426469a);
        uc5.n nVar = this.f426490e;
        boolean z17 = false;
        if (b18) {
            nVar.getClass();
            android.content.Context context = this.f426491f;
            android.view.View view2 = this.f426492g;
            rl5.r rVar = new rl5.r(context, view2);
            rVar.C = true;
            rVar.f397355y = new uc5.k(nVar, context);
            rVar.f397354x = new uc5.m(dVar, nVar, context, rVar);
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            rVar.n(iArr[0] + (view2.getWidth() / 2), iArr[1]);
        } else {
            if (!(cVar instanceof uc5.b)) {
                throw new jz5.j();
            }
            int adapterPosition = this.f426493h.getAdapterPosition();
            if (adapterPosition == -1) {
                yj0.a.i(false, this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
            uc5.r rVar2 = nVar.f426531g;
            if (rVar2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryBaseItemConvert", "buildItemBodyLongClickListener, controller is null, skip drag select");
                yj0.a.i(false, this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
            wc5.k1 o76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) rVar2).o7();
            if (((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) o76.V6()).r7() && (b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) o76.V6()).m7())) != null) {
                java.lang.Object a07 = kz5.n0.a0(b17.getData(), adapterPosition);
                uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
                if (h0Var != null) {
                    uc5.c cVar2 = h0Var.f426494d.f426476d;
                    if ((cVar2 instanceof uc5.b) && ((uc5.b) cVar2).f426471a) {
                        z17 = true;
                    }
                    o76.f444594g = z17;
                    kn5.e eVar = o76.f444593f;
                    if (eVar != null) {
                        eVar.f(true, adapterPosition);
                    }
                }
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryBaseItemConvert$buildItemBodyLongClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
