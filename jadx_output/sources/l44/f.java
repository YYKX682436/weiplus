package l44;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final l44.f f316125d = new l44.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
        com.tencent.mm.plugin.sns.storage.v0 item = (com.tencent.mm.plugin.sns.storage.v0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.sns.storage.w0 Ui = com.tencent.mm.plugin.sns.model.l4.Ui();
        Ui.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteByItem", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
        java.lang.String str = "DELETE FROM AdPullRecordsInfo  where rowid = " + item.systemRowid + "  and snsid = '" + item.field_snsid + "' ";
        l75.k0 k0Var = Ui.f166154d;
        com.tencent.mars.xlog.Log.i("AdPullRecordsInfoStorage", "deleteByItem " + (k0Var != null ? k0Var.A("AdPullRecordsInfo", str) : false) + ' ' + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteByItem", "com.tencent.mm.plugin.sns.storage.AdPullRecordsInfoStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCleanStorageManager$cleanPullAdRecords$2");
        return f0Var;
    }
}
