package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class jf extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f132438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMileStoneView f132439e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(int i17, com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView) {
        super(1);
        this.f132438d = i17;
        this.f132439e = finderMileStoneView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int floatValue = (int) (255 * ((java.lang.Number) obj).floatValue());
        int i17 = this.f132438d;
        this.f132439e.getMileStoneRoot().setBackgroundColor(android.graphics.Color.argb(floatValue, android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17)));
        return jz5.f0.f302826a;
    }
}
