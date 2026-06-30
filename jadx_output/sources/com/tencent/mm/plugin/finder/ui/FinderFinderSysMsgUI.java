package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderFinderSysMsgUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderMsgContract$MsgViewCallback$UICallbackListener;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderFinderSysMsgUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI implements com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.UICallbackListener {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f128579t = "Finder.FinderFinderSysMsgUI";

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f128580u = jz5.h.b(new com.tencent.mm.plugin.finder.ui.g6(this));

    public FinderFinderSysMsgUI() {
        new java.util.HashMap();
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback.UICallbackListener
    public void F(dm.pd mention) {
        kotlin.jvm.internal.o.g(mention, "mention");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 118;
    }

    public final com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter c7() {
        return (com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter) ((jz5.n) this.f128580u).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b3w;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(getString(com.tencent.mm.R.string.cqn));
        setBackBtn(new com.tencent.mm.plugin.finder.ui.f6(this));
        android.view.View contentView = getContentView();
        kotlin.jvm.internal.o.f(contentView, "getContentView(...)");
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback(this, contentView, c7(), this);
        c7().g(msgViewCallback);
        msgViewCallback.b();
        g92.b bVar = g92.b.f269769e;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        if (e17 == null) {
            e17 = "";
        }
        m92.c cVar = new m92.c(e17);
        cVar.field_systemMsgCount = 0;
        bVar.C(cVar, m92.j.f325008z);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_MSG_SYSTEM_INT_SYNC, 0);
        zy2.z8 S = ((c61.l7) i95.n0.c(c61.l7.class)).nk().S();
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((com.tencent.mm.plugin.finder.extension.reddot.e1) S).h(xy2.c.e(context2), zy2.y8.f477621q);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
        com.tencent.mm.plugin.finder.assist.v1.f102614d = new java.lang.ref.WeakReference(this);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderFinderSysMsgUI)).Rj(this, iy1.a.Finder);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c7().onDetach();
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.finder.assist.v1.f102614d;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null || !kotlin.jvm.internal.o.b(activity, this)) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.v1.f102614d = null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter c76 = c7();
        c76.getClass();
        c76.f122831o = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter c76 = c7();
        c76.getClass();
        c76.f122832p.f57440q = java.lang.System.currentTimeMillis() - c76.f122831o;
        com.tencent.mars.xlog.Log.i(this.f128579t, "onStop");
    }
}
