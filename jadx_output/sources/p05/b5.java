package p05;

/* loaded from: classes5.dex */
public final class b5 implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f350466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView f350467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f350468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f350469g;

    public b5(android.widget.TextView textView, com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView xLabEffectSettingView, int i17, yz5.l lVar) {
        this.f350466d = textView;
        this.f350467e = xLabEffectSettingView;
        this.f350468f = i17;
        this.f350469g = lVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
        this.f350466d.setText(this.f350467e.getResources().getString(this.f350468f, java.lang.Integer.valueOf(i17)));
        this.f350469g.invoke(java.lang.Integer.valueOf(i17));
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
