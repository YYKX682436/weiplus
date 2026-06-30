package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes5.dex */
public final class rf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        super(0);
        this.f129778d = finderSelectCoverUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.SeekBar seekBar = this.f129778d.F;
        if (seekBar != null) {
            seekBar.setEnabled(false);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("seekBar");
        throw null;
    }
}
