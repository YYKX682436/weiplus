package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class a0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.h0 f155344a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.record.ui.h0 h0Var, android.os.Looper looper) {
        super(looper);
        this.f155344a = h0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            this.f155344a.notifyDataSetChanged();
        }
    }
}
