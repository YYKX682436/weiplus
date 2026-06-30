package pd0;

/* loaded from: classes9.dex */
public class p1 extends com.tencent.mm.sdk.event.n {
    public p1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.ii iiVar;
        java.util.HashMap hashMap;
        java.lang.String str;
        com.tencent.mm.autogen.events.KindaNotifyEvent kindaNotifyEvent = (com.tencent.mm.autogen.events.KindaNotifyEvent) iEvent;
        if (kindaNotifyEvent == null || (iiVar = kindaNotifyEvent.f54459g) == null || (hashMap = iiVar.f6954a) == null || hashMap.get("url") == null || !(hashMap.get("url") instanceof java.lang.String) || (str = (java.lang.String) hashMap.get("url")) == null) {
            return false;
        }
        if (str.equalsIgnoreCase("floatPay") || str.equalsIgnoreCase("jointPay")) {
            ((ku5.t0) ku5.t0.f312615d).h(new od0.j(), "SIRWorker");
            return false;
        }
        boolean equalsIgnoreCase = str.equalsIgnoreCase("offline");
        w04.l lVar = w04.l.INSTANCE;
        if (equalsIgnoreCase) {
            lVar.Nc();
            return false;
        }
        if (str.equalsIgnoreCase("walletUseCase")) {
            return false;
        }
        if (str.equalsIgnoreCase("faceCheckFrontUseCase")) {
            lVar.Y3(540999729);
            return false;
        }
        if (str.equalsIgnoreCase("faceCheckResultUseCase")) {
            lVar.Y3(540999730);
            return false;
        }
        if (str.equalsIgnoreCase("liteAppRealNameUseCase")) {
            lVar.Y3(540999733);
            return false;
        }
        if (str.equalsIgnoreCase("addPayCard")) {
            lVar.Y3(540999735);
            return false;
        }
        if (str.equalsIgnoreCase("unbindBankCardUseCase")) {
            lVar.Y3(540999736);
            return false;
        }
        if (str.equalsIgnoreCase("changeRealnameUseCase")) {
            lVar.Y3(540999737);
            return false;
        }
        if (str.equalsIgnoreCase("nfcPayOpenUseCase")) {
            lVar.Y3(540999738);
            return false;
        }
        if (str.equalsIgnoreCase("modifyPwdUseCase")) {
            lVar.Y3(540999739);
            return false;
        }
        if (!str.equalsIgnoreCase("resetPwdUseCase")) {
            return false;
        }
        lVar.Y3(540999740);
        return false;
    }
}
