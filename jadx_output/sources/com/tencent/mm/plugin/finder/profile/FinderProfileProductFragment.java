package com.tencent.mm.plugin.finder.profile;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfileProductFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileProductFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f123294t;

    public FinderProfileProductFragment() {
        super(110);
        this.f123294t = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.o1.c(com.tencent.mm.plugin.finder.profile.uic.jd.class);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        android.content.Intent intent;
        super.onCreate(bundle);
        dy1.r ak6 = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderProfileProductPage);
        androidx.fragment.app.FragmentActivity activity = getActivity();
        java.lang.String stringExtra = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        cy1.a aVar = (cy1.a) ak6;
        aVar.fk(this, "finderuin", stringExtra);
        aVar.fk(this, "report_session_id", this.f123294t);
        aVar.Tj(this, 4, 12, false);
    }
}
