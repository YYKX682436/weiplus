package cw2;

/* loaded from: classes10.dex */
public final class x4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout f224105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout finderRecordPluginLayout) {
        super(1);
        this.f224105d = finderRecordPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList it = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Float n07 = kz5.n0.n0(it);
        float floatValue = n07 != null ? n07.floatValue() : 0.0f;
        float f17 = 100;
        com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout finderRecordPluginLayout = this.f224105d;
        finderRecordPluginLayout.F = (floatValue / f17) * ((float) finderRecordPluginLayout.E);
        finderRecordPluginLayout.f130635u.getClass();
        java.lang.Float n08 = kz5.n0.n0(it);
        float floatValue2 = n08 != null ? n08.floatValue() : 0.0f;
        finderRecordPluginLayout.f130626i.f465628f.setTag(com.tencent.mm.R.id.e7e, java.lang.Integer.valueOf((int) (((floatValue2 / f17) * r7.f465632m) / 1000)));
        return jz5.f0.f302826a;
    }
}
