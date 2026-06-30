package eg2;

/* loaded from: classes3.dex */
public final class j0 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView f252581a;

    public j0(com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView) {
        this.f252581a = finderLiveHDCheckboxView;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        yz5.l onCheckedChangeListener;
        kotlin.jvm.internal.o.g(compoundButton, "<anonymous parameter 0>");
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView = this.f252581a;
        if (finderLiveHDCheckboxView.f111649f || (onCheckedChangeListener = finderLiveHDCheckboxView.getOnCheckedChangeListener()) == null) {
            return;
        }
        onCheckedChangeListener.invoke(java.lang.Boolean.valueOf(z17));
    }
}
