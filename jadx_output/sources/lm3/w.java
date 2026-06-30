package lm3;

/* loaded from: classes10.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.e f319518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.e1 f319519e;

    public w(lm3.e eVar, com.tencent.mm.plugin.mv.ui.uic.e1 e1Var) {
        this.f319518d = eVar;
        this.f319519e = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String username;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f319518d.f319482d.f264130j;
        if (finderContact != null && (username = finderContact.getUsername()) != null) {
            this.f319519e.O6(username, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$5$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
