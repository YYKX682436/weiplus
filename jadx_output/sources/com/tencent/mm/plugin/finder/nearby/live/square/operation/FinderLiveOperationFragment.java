package com.tencent.mm.plugin.finder.nearby.live.square.operation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/operation/FinderLiveOperationFragment;", "Lcom/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLiveOperationFragment extends com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment {

    /* renamed from: u, reason: collision with root package name */
    public long f121517u;

    /* renamed from: s, reason: collision with root package name */
    public int f121515s = 9500001;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f121516t = "9001";

    /* renamed from: v, reason: collision with root package name */
    public boolean f121518v = true;

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.f121515s = arguments != null ? arguments.getInt("key_from_comment_scene", this.f121515s) : this.f121515s;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string = arguments2 != null ? arguments2.getString("key_click_tab_id") : null;
        if (string == null) {
            string = this.f121516t;
        }
        this.f121516t = string;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_ENTER_FINDER_LIVE_SQUARE_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) {
            androidx.fragment.app.FragmentActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            android.view.View findViewById = ((com.tencent.mm.plugin.finder.ui.MMFinderUI) activity).findViewById(com.tencent.mm.R.id.f_h);
            if (findViewById != null) {
                findViewById.setOnClickListener(new np2.a(this));
            }
            androidx.fragment.app.FragmentActivity activity2 = getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            android.widget.TextView textView = (android.widget.TextView) ((com.tencent.mm.plugin.finder.ui.MMFinderUI) activity2).findViewById(com.tencent.mm.R.id.k6f);
            if (textView != null) {
                textView.setTextSize(1, 15.0f);
            }
            androidx.fragment.app.FragmentActivity activity3 = getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            android.widget.TextView textView2 = (android.widget.TextView) ((com.tencent.mm.plugin.finder.ui.MMFinderUI) activity3).findViewById(com.tencent.mm.R.id.fnn);
            if (textView2 != null) {
                textView2.setOnClickListener(new np2.b(this));
            }
        }
        return onCreateView;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_FINDER_LIVE_SQUARE_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getActivity() != null) {
            ip2.a.f293612a.c(((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) j0(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).P6());
        }
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareFragment", "onResume() isFirstOnResume:" + this.f121518v);
        rq2.x xVar = rq2.x.f398914a;
        rq2.x.f398917d = c01.id.c();
        if (!this.f121518v && getActivity() != null) {
            ip2.a.f293612a.b(((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) j0(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).P6());
        }
        this.f121518v = false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        o0();
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0, reason: from getter */
    public int getF121515s() {
        return this.f121515s;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    /* renamed from: u0, reason: from getter */
    public java.lang.String getF121516t() {
        return this.f121516t;
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    public int x0() {
        return 3;
    }
}
