package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class v1 implements com.tencent.mm.ui.tools.s5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155498a;

    public v1(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI) {
        this.f155498a = recordMsgImageUI;
    }

    @Override // com.tencent.mm.ui.tools.s5
    public void a() {
        com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI = this.f155498a;
        com.tencent.mm.plugin.fav.ui.gallery.r item = recordMsgImageUI.f155315i.getItem(recordMsgImageUI.f155314h.getSelectedItemPosition());
        if (item != null && item.l() == 0 && item.k() != 2 && com.tencent.mm.vfs.w6.j(item.j())) {
            java.util.List<android.view.View> list = (java.util.List) recordMsgImageUI.f155312f.get(item.j());
            if (list != null && list.size() > 0) {
                for (android.view.View view : list) {
                    if (view instanceof com.tencent.mm.plugin.fav.ui.widget.FavVideoView) {
                        ((com.tencent.mm.plugin.fav.ui.widget.FavVideoView) view).a();
                    }
                }
                return;
            }
        }
        if (recordMsgImageUI.f155325v.f101302d != 1) {
            recordMsgImageUI.U6();
        }
    }
}
