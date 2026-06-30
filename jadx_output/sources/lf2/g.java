package lf2;

/* loaded from: classes10.dex */
public final class g implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf2.s f318285d;

    public g(lf2.s sVar) {
        this.f318285d = sVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        lf2.s sVar = this.f318285d;
        kotlinx.coroutines.flow.j2 j2Var = ((om2.e) sVar.H.a(om2.e.class)).f346291g;
        sVar.getClass();
        ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Integer.valueOf(i17));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    }
}
