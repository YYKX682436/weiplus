package yw3;

/* loaded from: classes4.dex */
public final class j4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI f466778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
        super(0);
        this.f466778d = repairerMvvmListDemoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI = this.f466778d;
        java.util.List list = (java.util.List) ((jz5.n) repairerMvvmListDemoUI.e).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            arrayList.add(new yw3.g(intValue, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE + intValue));
        }
        return new xm3.t0(new ym3.h(arrayList), repairerMvvmListDemoUI, new com.tencent.mm.plugin.mvvmlist.SingleItemConvertFactory(yw3.h.class), false);
    }
}
