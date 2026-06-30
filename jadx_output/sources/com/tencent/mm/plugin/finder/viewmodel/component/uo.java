package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes7.dex */
public final class uo extends com.tencent.mm.ui.component.UIComponent implements xp0.e {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f136148d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f136149e;

    /* renamed from: f, reason: collision with root package name */
    public int f136150f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f136151g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f136152h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f136153i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView f136154m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136148d = new java.util.concurrent.ConcurrentHashMap();
        this.f136149e = new java.util.ArrayList();
    }

    public final void O6() {
        if (this.f136151g) {
            return;
        }
        com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView mEHolderView = (com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView) getActivity().findViewById(com.tencent.mm.R.id.qyf);
        this.f136154m = mEHolderView;
        if (mEHolderView == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderMagicEmojiUIC", "no holder:".concat(getActivity().getClass().getSimpleName()));
            return;
        }
        s12.f fVar = (s12.f) ((xp0.f) i95.n0.c(xp0.f.class));
        synchronized (fVar) {
            rk0.c.c("MagicFinderEmojiService", "createBiz", new java.lang.Object[0]);
            if (fVar.f402129d != null) {
                rk0.c.b("MagicFinderEmojiService", "has created", new java.lang.Object[0]);
            } else {
                s12.e eVar = new s12.e(this);
                fVar.f402129d = eVar;
                eVar.V0();
            }
        }
        this.f136151g = true;
    }

    public final void P6() {
        if (this.f136151g) {
            s12.f fVar = (s12.f) ((xp0.f) i95.n0.c(xp0.f.class));
            synchronized (fVar) {
                rk0.c.c("MagicFinderEmojiService", "destroyBiz", new java.lang.Object[0]);
                s12.e eVar = fVar.f402129d;
                if (eVar != null) {
                    jc3.j0 j0Var = eVar.f448375f;
                    if (j0Var != null) {
                        ((rc3.w0) j0Var).destroy();
                    }
                    bf3.p pVar = eVar.f448376g;
                    if (pVar != null) {
                        pVar.b();
                    }
                    eVar.f448375f = null;
                    eVar.f448376g = null;
                }
                fVar.f402129d = null;
            }
            this.f136149e.clear();
            this.f136151g = false;
        }
    }

    public final java.lang.String Q6(long j17) {
        return getActivity().getClass().getSimpleName() + '-' + j17;
    }

    public final void R6(android.view.View view, java.lang.String emojiKey, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(emojiKey, "emojiKey");
        if (!this.f136151g) {
            com.tencent.mars.xlog.Log.i("Finder.FinderMagicEmojiUIC", "not create:".concat(getActivity().getClass().getSimpleName()));
            return;
        }
        java.lang.String Q6 = Q6(j17);
        if (this.f136148d.containsKey(Q6) && z17) {
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.ro(Q6, this, view, emojiKey, z17));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f136150f = com.tencent.mm.ui.bl.i(getActivity(), -1);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f136148d.clear();
        P6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (this.f136152h) {
            P6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f136152h) {
            O6();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f136148d = new java.util.concurrent.ConcurrentHashMap();
        this.f136149e = new java.util.ArrayList();
    }
}
