package f43;

/* loaded from: classes13.dex */
public class e extends android.database.DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.flow.FlowView f259541a;

    public e(com.tencent.mm.plugin.game.chatroom.view.flow.FlowView flowView, f43.c cVar) {
        this.f259541a = flowView;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        super.onChanged();
        com.tencent.mm.plugin.game.chatroom.view.flow.FlowView flowView = this.f259541a;
        f43.a aVar = flowView.f139120o;
        if (aVar == null) {
            return;
        }
        java.util.List list = ((f43.h) aVar).f259544d;
        int size = list != null ? list.size() : 0;
        if (size == 0) {
            if (flowView.f139119n == 0) {
                return;
            }
            flowView.removeAllViews();
            return;
        }
        if (flowView.f139119n != 0) {
            for (int i17 = 0; i17 < size; i17++) {
                if (flowView.f139119n > i17) {
                    android.view.View childAt = flowView.getChildAt(i17);
                    f43.b bVar = (f43.b) childAt.getTag();
                    if (bVar != null) {
                        flowView.f139120o.getClass();
                        if (bVar.f259538b == 0) {
                            flowView.f139120o.a(i17, childAt, flowView);
                        }
                    }
                    flowView.removeViewAt(i17);
                    flowView.addView(flowView.a(i17), i17);
                } else {
                    flowView.addView(flowView.a(i17));
                }
            }
            int i18 = flowView.f139119n - size;
            for (int i19 = 0; i19 < i18; i19++) {
                flowView.removeViewAt(size + i19);
            }
            return;
        }
        int i27 = 0;
        while (true) {
            java.util.List list2 = ((f43.h) flowView.f139120o).f259544d;
            if (i27 >= (list2 != null ? list2.size() : 0)) {
                return;
            }
            flowView.addView(flowView.a(i27));
            i27++;
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        super.onInvalidated();
    }
}
