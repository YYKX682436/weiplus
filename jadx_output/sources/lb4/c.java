package lb4;

/* loaded from: classes11.dex */
public final class c implements kb4.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f317774a;

    /* renamed from: b, reason: collision with root package name */
    public final kb4.a f317775b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.LinearLayout f317776c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f317777d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f317778e;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fe, code lost:
    
        if ((r13 != null && r13.size() == r5.size()) != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r26, kb4.a r27) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb4.c.<init>(android.content.Context, kb4.a):void");
    }

    public java.util.List a() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectedItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f317777d).iterator();
        while (it.hasNext()) {
            lb4.h hVar = (lb4.h) it.next();
            hVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPickItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
            kb4.c cVar = (kb4.c) hVar.b().getValue();
            java.lang.String str2 = "";
            if (cVar == null || (str = cVar.b()) == null) {
                str = "";
            }
            kb4.c cVar2 = (kb4.c) hVar.b().getValue();
            if (cVar2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickDataNode");
                java.lang.String str3 = cVar2.f306241b;
                if (str3 != null) {
                    str2 = str3;
                }
            }
            kb4.d dVar = new kb4.d(str, str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPickItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.PickerWheelViewController");
            arrayList.add(dVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.view.MultiPickerWheelViewController");
        return arrayList;
    }
}
