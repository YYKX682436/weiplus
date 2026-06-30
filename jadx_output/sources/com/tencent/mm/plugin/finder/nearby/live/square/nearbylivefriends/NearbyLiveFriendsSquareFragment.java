package com.tencent.mm.plugin.finder.nearby.live.square.nearbylivefriends;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/nearbylivefriends/NearbyLiveFriendsSquareFragment;", "Lcom/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class NearbyLiveFriendsSquareFragment extends com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment {
    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_use_dark_style", 0);
        if (getArguments() == null) {
            setArguments(bundle);
        } else {
            android.os.Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.putAll(bundle);
            }
        }
        super.onAttach(context);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.NearbyLiveFriendsSquareFragment);
        aVar.Rj(this, iy1.a.PeopleNearby);
        aVar.ck(this, true);
        aVar.ik(this, 40, 24184);
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getActivity() != null) {
            ip2.a.f293612a.c(((com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) j0(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class)).P6());
        }
    }

    @Override // com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareFragment, com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment
    /* renamed from: u0 */
    public java.lang.String getF121516t() {
        return "1001";
    }
}
