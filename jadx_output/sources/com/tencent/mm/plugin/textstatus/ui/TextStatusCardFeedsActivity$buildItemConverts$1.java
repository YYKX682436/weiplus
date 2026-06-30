package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$buildItemConverts$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusCardFeedsActivity$buildItemConverts$1 implements in5.s {
    final /* synthetic */ java.lang.String $scene;
    final /* synthetic */ boolean $shouldMultipleStatusCardViewListenDB;
    final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity this$0;

    public TextStatusCardFeedsActivity$buildItemConverts$1(com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity, java.lang.String str, boolean z17) {
        this.this$0 = textStatusCardFeedsActivity;
        this.$scene = str;
        this.$shouldMultipleStatusCardViewListenDB = z17;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        if (type == 1) {
            return new ij4.c();
        }
        com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity = this.this$0;
        return new jj4.c(textStatusCardFeedsActivity.f173489n, this.$scene, textStatusCardFeedsActivity.f173484f, textStatusCardFeedsActivity, this.$shouldMultipleStatusCardViewListenDB);
    }
}
