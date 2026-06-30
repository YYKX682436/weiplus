package tj3;

/* loaded from: classes14.dex */
public final class e implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.h f419732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f419733e;

    public e(tj3.h hVar, android.content.Context context) {
        this.f419732d = hVar;
        this.f419733e = context;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout virtualBackgroundSwitcher;
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout virtualBackgroundSwitcher2;
        com.tencent.mm.plugin.multitalk.ui.widget.projector.MultiTalkSmallControlIconLayout virtualBackgroundSwitcher3;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        tj3.h hVar = this.f419732d;
        virtualBackgroundSwitcher = hVar.getVirtualBackgroundSwitcher();
        kotlin.jvm.internal.o.d(bool);
        virtualBackgroundSwitcher.setChecked(bool.booleanValue());
        boolean booleanValue = bool.booleanValue();
        android.content.Context context = this.f419733e;
        if (booleanValue) {
            virtualBackgroundSwitcher3 = hVar.getVirtualBackgroundSwitcher();
            virtualBackgroundSwitcher3.setContentDescription(context.getString(com.tencent.mm.R.string.h3c));
        } else {
            virtualBackgroundSwitcher2 = hVar.getVirtualBackgroundSwitcher();
            virtualBackgroundSwitcher2.setContentDescription(context.getString(com.tencent.mm.R.string.h3b));
        }
    }
}
