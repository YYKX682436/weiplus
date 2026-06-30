package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class g extends com.tencent.mm.ui.component.UIComponent implements ed0.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final ox3.l f158407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158407d = new ox3.l();
    }

    public final void O6() {
        ox3.l lVar = this.f158407d;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataViewModel", "noMoreDataLoad");
        ((kotlinx.coroutines.flow.q2) lVar.f349764d).e(new ed0.s0(null, 4));
    }

    public final void P6(java.util.List data) {
        kotlin.jvm.internal.o.g(data, "data");
        ox3.l lVar = this.f158407d;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataViewModel", "bindDataSource " + data.size());
        ((kotlinx.coroutines.flow.q2) lVar.f349764d).e(new ed0.s0(data, 3));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ox3.l lVar = this.f158407d;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataViewModel", "clearDataSource");
        ((kotlinx.coroutines.flow.q2) lVar.f349764d).e(new ed0.s0(null, 1));
    }
}
