package com.tencent.mm.plugin.ringtone.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtoneHistoryUI;", "Lcom/tencent/mm/plugin/ringtone/uic/BaseRingtoneUI;", "<init>", "()V", "plugin-ringtone_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class RingtoneHistoryUI extends com.tencent.mm.plugin.ringtone.uic.BaseRingtoneUI {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f158332d = 0;

    public static final void U6(com.tencent.mm.plugin.ringtone.ui.RingtoneHistoryUI ringtoneHistoryUI) {
        java.util.List data;
        ringtoneHistoryUI.getClass();
        pf5.z zVar = pf5.z.f353948a;
        sx3.q qVar = (sx3.q) zVar.a(ringtoneHistoryUI).a(sx3.q.class);
        androidx.appcompat.app.AppCompatActivity activity = qVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.z1) zVar.a(activity).a(com.tencent.mm.plugin.ringtone.uic.z1.class)).O6();
        kotlinx.coroutines.l.d(qVar.getLifecycleScope(), null, null, new sx3.n(null), 3, null);
        sx3.m mVar = (sx3.m) zVar.a(ringtoneHistoryUI).a(sx3.m.class);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = mVar.f413568g;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f213717v.clear();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = mVar.f413568g;
        if (wxRecyclerAdapter2 != null && (data = wxRecyclerAdapter2.getData()) != null) {
            data.clear();
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = mVar.f413568g;
        if (wxRecyclerAdapter3 != null) {
            wxRecyclerAdapter3.notifyDataSetChanged();
        }
        wx3.a.a(2L, "", 0L);
        mVar.Q6();
        ((sx3.b) zVar.a(ringtoneHistoryUI).a(sx3.b.class)).clear();
        db5.t7.h(ringtoneHistoryUI, ringtoneHistoryUI.getResources().getText(com.tencent.mm.R.string.f490355sn).toString());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489417ch0;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set<java.lang.Class<? extends com.tencent.mm.ui.component.UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents != null) {
            return kz5.q1.i(importUIComponents, kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.ringtone.uic.v.class, sx3.b.class, sx3.q.class, sx3.m.class, com.tencent.mm.plugin.ringtone.uic.z1.class, com.tencent.mm.plugin.ringtone.uic.c3.class, com.tencent.mm.plugin.ringtone.uic.f.class}));
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.ringtone.uic.BaseRingtoneUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.fwf);
        setBackBtn(new ay3.a(this));
        if (c01.e2.a0()) {
            addTextOptionMenu(0, getString(com.tencent.mm.R.string.fwd), new ay3.b(this));
        } else {
            addIconOptionMenu(0, com.tencent.mm.R.raw.actionbar_icon_dark_more, new ay3.e(this));
        }
    }
}
