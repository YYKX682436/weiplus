package qx1;

/* loaded from: classes10.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx1.a f367280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f367281e;

    public c(qx1.q qVar, mx1.a aVar) {
        this.f367281e = qVar;
        this.f367280d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nx1.d.q().z(-1, false, true);
        boolean b17 = fp.i.b();
        qx1.q qVar = this.f367281e;
        if (!b17) {
            db5.t7.k(qVar.f367308b.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_title", qVar.f367308b.getContext().getString(com.tencent.mm.R.string.cbw));
        intent.putExtra("key_media_type", 2);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ni(d85.g0.STORAGE, new qx1.b(this, intent))) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        j45.l.v(qVar.f367308b.getContext(), "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent, 4099);
        this.f367280d.q0(65536L);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
