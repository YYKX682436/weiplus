package vv4;

/* loaded from: classes11.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI) {
        super(2);
        this.f440481d = mMFTSImageRecognitionUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        dv4.n nVar;
        java.lang.String status = (java.lang.String) obj;
        java.lang.String str = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(status, "status");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMFTSImageRecognitionUI", "yptest statusListener " + status + ' ' + str);
        if (kotlin.jvm.internal.o.b(status, "STATE_WILL_CHANGE_HEIGHT") ? true : kotlin.jvm.internal.o.b(status, "STATE_DID_CHANGE_HEIGHT")) {
            com.tencent.mm.autogen.events.CircleToSearchClient2WebEvent circleToSearchClient2WebEvent = new com.tencent.mm.autogen.events.CircleToSearchClient2WebEvent();
            float parseFloat = str != null ? java.lang.Float.parseFloat(str) : 0.0f;
            dv4.n.f244017e.getClass();
            if (parseFloat == 0.2f) {
                nVar = dv4.n.f244019g;
            } else {
                if (parseFloat == 0.65f) {
                    nVar = dv4.n.f244020h;
                } else {
                    nVar = parseFloat == 1.0f ? dv4.n.f244021i : dv4.n.f244018f;
                }
            }
            com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI = this.f440481d;
            int i17 = mMFTSImageRecognitionUI.f181632d;
            am.w2 w2Var = circleToSearchClient2WebEvent.f54058g;
            w2Var.f8254a = i17;
            w2Var.f8255b = (java.lang.String) kz5.c1.k(new jz5.l("STATE_WILL_CHANGE_HEIGHT", "heightWillChange"), new jz5.l("STATE_DID_CHANGE_HEIGHT", "heightDidChange")).get(status);
            w2Var.f8256c = java.lang.String.valueOf(ri.l0.a(kz5.c1.k(new jz5.l("screenType", nVar.f244023d), new jz5.l("visibleHeight", java.lang.Float.valueOf(parseFloat * ((java.lang.Number) ((jz5.n) mMFTSImageRecognitionUI.f181634f).getValue()).intValue())))));
            circleToSearchClient2WebEvent.e();
            if (kotlin.jvm.internal.o.b(status, "STATE_DID_CHANGE_HEIGHT")) {
                dv4.n nVar2 = dv4.n.f244021i;
                if (nVar == nVar2) {
                    ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ui(mMFTSImageRecognitionUI.Y6(), mMFTSImageRecognitionUI.X6(), tg0.e1.f419067m, mMFTSImageRecognitionUI.a7());
                }
                android.view.View view = (android.view.View) ((jz5.n) mMFTSImageRecognitionUI.f181637i).getValue();
                int i18 = nVar == nVar2 ? 8 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/websearch/ui/MMFTSImageRecognitionUI$initSearchHalfScreen$statusListener$1", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/websearch/ui/MMFTSImageRecognitionUI$initSearchHalfScreen$statusListener$1", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}
