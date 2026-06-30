package ys2;

/* loaded from: classes10.dex */
public final class l implements android.widget.SeekBar.OnSeekBarChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ys2.o f465169d;

    public l(ys2.o oVar) {
        this.f465169d = oVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(android.widget.SeekBar seekBar, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
        ys2.o oVar = this.f465169d;
        ys2.o.b7(oVar, seekBar);
        oVar.f7(ys2.o.Z6(oVar, seekBar), ys2.o.a7(oVar, seekBar));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
        ys2.o oVar = this.f465169d;
        float Z6 = ys2.o.Z6(oVar, seekBar);
        float a76 = ys2.o.a7(oVar, seekBar);
        oVar.e7(false);
        oVar.f7(Z6, a76);
        ys2.o.b7(oVar, seekBar);
        oVar.f7(ys2.o.Z6(oVar, seekBar), ys2.o.a7(oVar, seekBar));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
        kotlin.jvm.internal.o.g(seekBar, "seekBar");
        ys2.o oVar = this.f465169d;
        android.widget.ImageView imageView = oVar.f465175o;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        oVar.c7();
    }
}
