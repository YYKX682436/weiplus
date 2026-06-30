package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class hi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderProgressBar f132244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(com.tencent.mm.plugin.finder.view.FinderProgressBar finderProgressBar) {
        super(0);
        this.f132244d = finderProgressBar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderProgressBar finderProgressBar = this.f132244d;
        android.widget.SeekBar seekBar = (android.widget.SeekBar) finderProgressBar.findViewById(com.tencent.mm.R.id.mhc);
        seekBar.setOnSeekBarChangeListener(finderProgressBar);
        return seekBar;
    }
}
