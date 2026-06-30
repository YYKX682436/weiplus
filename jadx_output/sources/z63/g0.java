package z63;

/* loaded from: classes5.dex */
public class g0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f470413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI f470414e;

    public g0(com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI, com.tencent.mm.ui.widget.MMEditText mMEditText) {
        this.f470414e = groupSolitatireEditUI;
        this.f470413d = mMEditText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.groupsolitaire.ui.GroupSolitatireEditUI groupSolitatireEditUI;
        android.view.View view2;
        if (!z17 || (view2 = (groupSolitatireEditUI = this.f470414e).f142233v) == null || !groupSolitatireEditUI.G) {
            this.f470413d.setSelection(0);
        } else {
            view2.postDelayed(new z63.e0(this), 200L);
            groupSolitatireEditUI.f142233v.postDelayed(new z63.f0(this), 200L);
        }
    }
}
