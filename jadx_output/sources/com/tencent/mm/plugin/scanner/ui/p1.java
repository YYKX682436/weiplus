package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes11.dex */
public final class p1 implements com.tencent.mm.plugin.scanner.view.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanPassportUI f159609a;

    public p1(com.tencent.mm.plugin.scanner.ui.ScanPassportUI scanPassportUI) {
        this.f159609a = scanPassportUI;
    }

    public void a(long j17, android.os.Bundle bundle) {
        if (bundle != null && bundle.containsKey("param_card_bitmap")) {
            java.io.Serializable serializable = bundle.getSerializable("param_card_bitmap");
            java.util.ArrayList arrayList = serializable instanceof java.util.ArrayList ? (java.util.ArrayList) serializable : null;
            if (arrayList != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(com.tencent.mm.sdk.platformtools.x.G((byte[]) it.next()));
                }
                com.tencent.mm.autogen.events.ScanPassportResultEvent scanPassportResultEvent = new com.tencent.mm.autogen.events.ScanPassportResultEvent();
                am.ws wsVar = scanPassportResultEvent.f54733g;
                wsVar.f8319a = 1;
                wsVar.f8321c = arrayList2;
                scanPassportResultEvent.e();
                this.f159609a.finish();
            }
        }
    }
}
