package e23;

/* loaded from: classes12.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f246879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.k1 f246880e;

    public j1(e23.k1 k1Var, android.content.Context context) {
        this.f246880e = k1Var;
        this.f246879d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifySenderHeaderDataItem$FTSServiceNotifySenderHeaderViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Search_Scene", 4);
        intent.putExtra("Search_Str", this.f246880e.f246886b.f423762e.f351129a);
        o13.n.q(this.f246879d, ".ui.FTSServiceNotifyUI", intent);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23903, 5, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), null, 0, com.tencent.mm.plugin.fts.ui.e3.f138046a);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifySenderHeaderDataItem$FTSServiceNotifySenderHeaderViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
