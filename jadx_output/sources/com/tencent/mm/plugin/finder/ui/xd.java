package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class xd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f130019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f130020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f130021f;

    public xd(int i17, com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, android.graphics.Bitmap bitmap) {
        this.f130019d = i17;
        this.f130020e = finderSelectCoverUI;
        this.f130021f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f130020e;
        if (this.f130019d != finderSelectCoverUI.W1) {
            return;
        }
        android.widget.SeekBar seekBar = finderSelectCoverUI.F;
        if (seekBar == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        seekBar.setVisibility(0);
        boolean z17 = finderSelectCoverUI.Q1;
        android.graphics.Bitmap bitmap = this.f130021f;
        if (!z17) {
            android.widget.SeekBar seekBar2 = finderSelectCoverUI.F;
            if (seekBar2 != null) {
                seekBar2.setProgressDrawable(new android.graphics.drawable.BitmapDrawable(finderSelectCoverUI.getResources(), bitmap));
                return;
            } else {
                kotlin.jvm.internal.o.o("seekBar");
                throw null;
            }
        }
        android.widget.SeekBar seekBar3 = finderSelectCoverUI.F;
        if (seekBar3 == null) {
            kotlin.jvm.internal.o.o("seekBar");
            throw null;
        }
        seekBar3.setProgressDrawable(new android.graphics.drawable.BitmapDrawable(finderSelectCoverUI.getResources(), bitmap));
        finderSelectCoverUI.Q1 = false;
    }
}
