package com.tencent.mm.plugin.record.ui;

/* loaded from: classes4.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgBaseUI f155429d;

    public k0(com.tencent.mm.plugin.record.ui.RecordMsgBaseUI recordMsgBaseUI) {
        this.f155429d = recordMsgBaseUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        int b17;
        com.tencent.mm.plugin.record.ui.RecordMsgBaseUI recordMsgBaseUI = this.f155429d;
        android.widget.ListView listView = recordMsgBaseUI.f155266m;
        android.view.View childAt = listView.getChildAt(listView.getLastVisiblePosition());
        if (childAt == null || (view = recordMsgBaseUI.f155271r) == null || view.getVisibility() != 0) {
            return;
        }
        int bottom = childAt.getBottom();
        int bottom2 = recordMsgBaseUI.f155266m.getBottom();
        int b18 = i65.a.b(recordMsgBaseUI.getContext(), 64);
        int i17 = bottom2 - bottom;
        if (i17 <= 0 || (b17 = i17 + i65.a.b(recordMsgBaseUI.getContext(), 15)) <= b18) {
            return;
        }
        recordMsgBaseUI.f155271r.setPadding(0, b17, 0, 0);
    }
}
