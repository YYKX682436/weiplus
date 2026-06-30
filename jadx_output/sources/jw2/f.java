package jw2;

/* loaded from: classes9.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView f302315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView recordTypeSelectView) {
        super(1);
        this.f302315d = recordTypeSelectView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView recordTypeSelectView = this.f302315d;
        recordTypeSelectView.f130793f = intValue;
        yz5.l lVar = recordTypeSelectView.f130796i;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(intValue));
        }
        recordTypeSelectView.f130794g.notifyDataSetChanged();
        com.tencent.mm.plugin.finder.video.plugin.view.FinderFilterLayoutManager finderFilterLayoutManager = recordTypeSelectView.f130795h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(finderFilterLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$itemClickListener$1", "invoke", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        finderFilterLayoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(finderFilterLayoutManager, "com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$itemClickListener$1", "invoke", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        return jz5.f0.f302826a;
    }
}
