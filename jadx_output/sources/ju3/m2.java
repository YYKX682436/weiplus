package ju3;

/* loaded from: classes2.dex */
public final class m2 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f301975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.VendorEffectSettingView f301976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f301977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f301978g;

    public m2(android.widget.TextView textView, com.tencent.mm.plugin.recordvideo.plugin.parent.VendorEffectSettingView vendorEffectSettingView, int i17, yz5.l lVar) {
        this.f301975d = textView;
        this.f301976e = vendorEffectSettingView;
        this.f301977f = i17;
        this.f301978g = lVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
        this.f301975d.setText(this.f301976e.getResources().getString(this.f301977f, java.lang.Integer.valueOf(i17)));
        this.f301978g.invoke(java.lang.Integer.valueOf(i17));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
    }
}
