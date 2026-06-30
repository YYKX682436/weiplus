package id2;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f290576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.l f290577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f290578f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f290579g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f290580h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f290581i;

    public g(android.content.Intent intent, id2.l lVar, android.app.Activity activity, int i17, android.content.DialogInterface.OnClickListener onClickListener, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f290576d = intent;
        this.f290577e = lVar;
        this.f290578f = activity;
        this.f290579g = i17;
        this.f290580h = onClickListener;
        this.f290581i = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$initOnCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        id2.m.f290662a.b("room_live_start_create_finder", "154");
        android.content.Intent intent = this.f290576d;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("key_create_scene", this.f290577e.P6().f290902e);
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).rj(this.f290578f, intent, this.f290579g);
        android.content.DialogInterface.OnClickListener onClickListener = this.f290580h;
        if (onClickListener != null) {
            onClickListener.onClick(null, -1);
        }
        this.f290581i.B();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/ChatRoomCustomUIC$initOnCreate$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
