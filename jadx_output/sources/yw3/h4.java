package yw3;

/* loaded from: classes4.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI f466761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmListDemoUI repairerMvvmListDemoUI) {
        super(1);
        this.f466761d = repairerMvvmListDemoUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) ((java.util.List) ((jz5.n) this.f466761d.e).getValue()).get(((java.lang.Number) obj).intValue())).intValue();
        return new yw3.g(intValue, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE + intValue);
    }
}
