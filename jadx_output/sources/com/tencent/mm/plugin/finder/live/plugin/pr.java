package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class pr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.pr f113928d = new com.tencent.mm.plugin.finder.live.plugin.pr();

    public pr() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_filled_channel, android.graphics.Color.parseColor("#FA9D3B"));
        kotlin.jvm.internal.o.f(e17, "getColorDrawable(...)");
        int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        e17.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        return new al5.w(e17, 1);
    }
}
