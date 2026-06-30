package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public class up implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI f161623d;

    public up(com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI) {
        this.f161623d = unfamiliarContactDetailUI;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI unfamiliarContactDetailUI = this.f161623d;
        java.util.HashMap hashMap = unfamiliarContactDetailUI.f160777r;
        int intValue = (hashMap == null || !hashMap.containsKey(str)) ? -1 : ((java.lang.Integer) hashMap.get(str)).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactUI", "[onScollBarTouch] showHead:%s pos:%s", str, java.lang.Integer.valueOf(intValue));
        if (intValue != -1) {
            androidx.recyclerview.widget.RecyclerView recyclerView = unfamiliarContactDetailUI.f160769g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$7", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/setting/ui/setting/UnfamiliarContactDetailUI$7", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
