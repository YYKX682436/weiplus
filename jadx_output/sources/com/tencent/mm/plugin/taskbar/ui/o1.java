package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class o1 extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172654v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, android.content.Context context) {
        super(context);
        this.f172654v = taskBarView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        int i17 = com.tencent.mm.plugin.taskbar.ui.TaskBarView.f172519c3;
        return !this.f172654v.r1();
    }
}
