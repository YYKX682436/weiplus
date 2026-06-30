package ub5;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bc5.e f426202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f426203e;

    public a(bc5.e eVar, android.app.Activity activity) {
        this.f426202d = eVar;
        this.f426203e = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/sheet/ForwardBottomSheetHelper$shareToYuanBao$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List e17 = bc5.e.e(this.f426202d, true, false, 0, false, false, 28, null);
        i95.m c17 = i95.n0.c(jt.x.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jt.x.X5((jt.x) c17, this.f426203e, e17, 8, null, false, 24, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/sheet/ForwardBottomSheetHelper$shareToYuanBao$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
