package p10;

/* loaded from: classes8.dex */
public final class n implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f350971a;

    public n(com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        this.f350971a = magicDebugPanelView;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        kotlin.jvm.internal.o.g(compoundButton, "<anonymous parameter 0>");
        this.f350971a.f65829v = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicDebugPanelView", "Upload profile enabled: " + z17);
    }
}
