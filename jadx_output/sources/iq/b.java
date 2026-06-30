package iq;

/* loaded from: classes10.dex */
public abstract class b {
    public static boolean A() {
        com.tencent.mm.autogen.events.TingChatRoomStateActionEvent tingChatRoomStateActionEvent = new com.tencent.mm.autogen.events.TingChatRoomStateActionEvent();
        tingChatRoomStateActionEvent.e();
        am.zy zyVar = tingChatRoomStateActionEvent.f54894g;
        boolean z17 = zyVar.f8615a && zyVar.f8616b;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkTingChatRoomStateExist isExist %b ", java.lang.Boolean.valueOf(z17));
        return z17;
    }

    public static boolean B(android.content.Context context, boolean z17) {
        boolean A = A();
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkTingChatRoomStateExist isExist %b ", java.lang.Boolean.valueOf(A));
        if (A && z17 && context != null) {
            db5.t7.makeText(context, com.tencent.mm.R.string.n68, 0).show();
        }
        return A;
    }

    public static boolean C(android.content.Context context) {
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        am.w00 w00Var = voipCheckIsDeviceUsingEvent.f54943g;
        if (!w00Var.f8247c) {
            if (m(context, true, null) || q(context, true) || B(context, true)) {
                return true;
            }
            s(context);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "isVoiceUsing");
        java.lang.String G = G(context, w00Var.f8245a);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = G;
        e4Var.c();
        return w00Var.f8247c;
    }

    public static boolean D(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        am.w00 w00Var = voipCheckIsDeviceUsingEvent.f54943g;
        if (w00Var.f8247c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "isVoiceUsing");
            db5.e1.y(context, "", G(context, w00Var.f8245a), context.getString(com.tencent.mm.R.string.f490454vi), onClickListener);
            return w00Var.f8247c;
        }
        if (q(context, true) || B(context, true)) {
            return true;
        }
        s(context);
        return false;
    }

    public static boolean E() {
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        return voipCheckIsDeviceUsingEvent.f54943g.f8246b;
    }

    public static boolean F(android.content.Context context, boolean z17) {
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        am.w00 w00Var = voipCheckIsDeviceUsingEvent.f54943g;
        if (w00Var.f8247c && z17) {
            db5.t7.makeText(context, G(context, w00Var.f8245a), 0).show();
        }
        return w00Var.f8247c;
    }

    public static java.lang.String G(android.content.Context context, boolean z17) {
        return z17 ? context.getString(com.tencent.mm.R.string.aqd) : context.getString(com.tencent.mm.R.string.aqf);
    }

    public static boolean H() {
        com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent = new com.tencent.mm.autogen.events.MultiTalkActionEvent();
        multiTalkActionEvent.f54504g.f6259a = 1;
        multiTalkActionEvent.e();
        return multiTalkActionEvent.f54505h.f6359a;
    }

    public static boolean a() {
        com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent();
        appBrandVoipCheckIsDeviceUsingEvent.e();
        am.z zVar = appBrandVoipCheckIsDeviceUsingEvent.f53986g;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkAppBrandCameraUsing isVoiceUsing:%b, isCameraUsing:%b", java.lang.Boolean.valueOf(zVar.f8497b), java.lang.Boolean.valueOf(zVar.f8496a));
        if (zVar.f8496a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "app brand voip camera using");
        }
        return zVar.f8496a;
    }

    public static boolean b(android.content.Context context) {
        return c(context, true);
    }

    public static boolean c(android.content.Context context, boolean z17) {
        com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent();
        appBrandVoipCheckIsDeviceUsingEvent.e();
        am.z zVar = appBrandVoipCheckIsDeviceUsingEvent.f53986g;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkAppBrandCameraUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b", java.lang.Boolean.valueOf(zVar.f8497b), java.lang.Boolean.valueOf(zVar.f8496a));
        if (zVar.f8496a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "app brand voip camera using");
            if (z17) {
                dp.a.makeText(context, G(context, zVar.f8496a), 0).show();
            }
        }
        return zVar.f8496a;
    }

    public static boolean d() {
        com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent();
        appBrandVoipCheckIsDeviceUsingEvent.e();
        am.z zVar = appBrandVoipCheckIsDeviceUsingEvent.f53986g;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkAppBrandVoiceUsing isVoiceUsing:%b, isCameraUsing:%b", java.lang.Boolean.valueOf(zVar.f8497b), java.lang.Boolean.valueOf(zVar.f8496a));
        if (zVar.f8497b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "app brand voip voice using");
        }
        return zVar.f8497b;
    }

    public static boolean e(android.content.Context context) {
        com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent();
        appBrandVoipCheckIsDeviceUsingEvent.e();
        am.z zVar = appBrandVoipCheckIsDeviceUsingEvent.f53986g;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkAppBrandVoiceUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b", java.lang.Boolean.valueOf(zVar.f8497b), java.lang.Boolean.valueOf(zVar.f8496a));
        if (zVar.f8497b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "app brand voip voice using");
            db5.e1.y(context, "", G(context, zVar.f8496a), context.getString(com.tencent.mm.R.string.f490454vi), new iq.a());
        }
        return zVar.f8497b;
    }

    public static boolean f(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent();
        appBrandVoipCheckIsDeviceUsingEvent.e();
        am.z zVar = appBrandVoipCheckIsDeviceUsingEvent.f53986g;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkAppBrandVoiceUsingAndShowToast isVoiceUsing:%b, isCameraUsing:%b", java.lang.Boolean.valueOf(zVar.f8497b), java.lang.Boolean.valueOf(zVar.f8496a));
        if (zVar.f8497b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "app brand voip voice using");
            db5.e1.y(context, "", G(context, zVar.f8496a), context.getString(com.tencent.mm.R.string.f490454vi), onClickListener);
        }
        return zVar.f8497b;
    }

    public static boolean g(android.content.Context context) {
        return i(context, true, null);
    }

    public static boolean h(android.content.Context context, boolean z17, android.content.DialogInterface.OnClickListener onClickListener) {
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        am.w00 w00Var = voipCheckIsDeviceUsingEvent.f54943g;
        if (!w00Var.f8246b) {
            t(context, onClickListener);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "isCameraUsing");
        if (z17) {
            db5.e1.y(context, "", G(context, w00Var.f8245a), context.getString(com.tencent.mm.R.string.f490454vi), onClickListener);
        }
        return w00Var.f8246b;
    }

    public static boolean i(android.content.Context context, boolean z17, android.os.Bundle bundle) {
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        am.w00 w00Var = voipCheckIsDeviceUsingEvent.f54943g;
        if (w00Var.f8246b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "isCameraUsing");
            if (z17) {
                java.lang.String G = G(context, w00Var.f8245a);
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = G;
                e4Var.c();
            }
            return w00Var.f8246b;
        }
        if (m(context, z17, bundle)) {
            return true;
        }
        com.tencent.mm.autogen.events.LiveStateActionEvent liveStateActionEvent = new com.tencent.mm.autogen.events.LiveStateActionEvent();
        liveStateActionEvent.e();
        liveStateActionEvent.f54477g.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "isLiving %b isAnchor %b isAudioMicing %s isVideoMicing %s", bool, bool, bool, bool);
        return false;
    }

    public static int j() {
        if (E()) {
            return 1;
        }
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        if (voipCheckIsDeviceUsingEvent.f54943g.f8247c) {
            return 2;
        }
        if (x(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return 3;
        }
        return H() ? 4 : 0;
    }

    public static boolean k(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        com.tencent.mm.autogen.events.FaceFlashStateEvent faceFlashStateEvent = new com.tencent.mm.autogen.events.FaceFlashStateEvent();
        faceFlashStateEvent.e();
        am.p9 p9Var = faceFlashStateEvent.f54233g;
        if (!p9Var.f7610a) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "is Face page exist");
        db5.e1.y(context, "", context.getString(com.tencent.mm.R.string.f491167c72), context.getString(com.tencent.mm.R.string.f490454vi), onClickListener);
        return p9Var.f7610a;
    }

    public static boolean l(android.content.Context context, boolean z17) {
        com.tencent.mm.autogen.events.FinderLiveStateActionEvent finderLiveStateActionEvent = new com.tencent.mm.autogen.events.FinderLiveStateActionEvent();
        finderLiveStateActionEvent.e();
        am.ac acVar = finderLiveStateActionEvent.f54296g;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkFinderLive isLiving %b isAnchor %b", java.lang.Boolean.valueOf(acVar.f6146a), java.lang.Boolean.valueOf(acVar.f6147b));
        boolean z18 = acVar.f6146a || acVar.f6150e;
        if (z18 && z17) {
            db5.t7.makeText(context, acVar.f6147b ? context.getString(com.tencent.mm.R.string.e2g) : context.getString(com.tencent.mm.R.string.e2j), 0).show();
        }
        return z18;
    }

    public static boolean m(android.content.Context context, boolean z17, android.os.Bundle bundle) {
        com.tencent.mm.autogen.events.FinderLiveStateActionEvent finderLiveStateActionEvent = new com.tencent.mm.autogen.events.FinderLiveStateActionEvent();
        finderLiveStateActionEvent.e();
        am.ac acVar = finderLiveStateActionEvent.f54296g;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkFinderLive isLiving %b isAnchor %b", java.lang.Boolean.valueOf(acVar.f6146a), java.lang.Boolean.valueOf(acVar.f6147b));
        boolean z18 = acVar.f6146a && acVar.f6147b;
        boolean z19 = acVar.f6149d;
        boolean z27 = bundle != null ? bundle.getBoolean("CLICK_ENTER_SCAN", false) : false;
        boolean z28 = acVar.f6150e;
        boolean z29 = (z27 || z28) && !z19;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "isAnchorLinkMic %b isEnterScan %b isFloatModeBeforePost %b", java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27), java.lang.Boolean.valueOf(z28));
        boolean z37 = z18 && !z29;
        if (z37 && z17) {
            db5.t7.makeText(context, z19 ? context.getString(com.tencent.mm.R.string.e2h) : acVar.f6147b ? context.getString(com.tencent.mm.R.string.e2g) : context.getString(com.tencent.mm.R.string.e2j), 0).show();
        }
        return z37;
    }

    public static boolean n(android.content.Context context, boolean z17) {
        com.tencent.mm.autogen.events.FinderLiveStateActionEvent finderLiveStateActionEvent = new com.tencent.mm.autogen.events.FinderLiveStateActionEvent();
        finderLiveStateActionEvent.e();
        am.ac acVar = finderLiveStateActionEvent.f54296g;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkFinderLive isLiving %b isAnchor %b", java.lang.Boolean.valueOf(acVar.f6146a), java.lang.Boolean.valueOf(acVar.f6147b));
        boolean z18 = acVar.f6146a && !acVar.f6147b && acVar.f6148c;
        if (z18 && z17) {
            db5.t7.makeText(context, acVar.f6147b ? context.getString(com.tencent.mm.R.string.e2g) : context.getString(com.tencent.mm.R.string.e2j), 0).show();
        }
        return z18;
    }

    public static boolean o(android.content.Context context, boolean z17) {
        com.tencent.mm.autogen.events.FinderLiveStateActionEvent finderLiveStateActionEvent = new com.tencent.mm.autogen.events.FinderLiveStateActionEvent();
        finderLiveStateActionEvent.e();
        am.ac acVar = finderLiveStateActionEvent.f54296g;
        boolean z18 = acVar.f6149d;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkFinderLiveStateAsVisitorMicOrIntercom isLiving %b isAnchor %b isLinkMic %b", java.lang.Boolean.valueOf(acVar.f6146a), java.lang.Boolean.valueOf(acVar.f6147b), java.lang.Boolean.valueOf(z18));
        boolean z19 = acVar.f6146a && !acVar.f6147b && z18;
        if (z19 && z17) {
            db5.t7.makeText(context, z18 ? context.getString(com.tencent.mm.R.string.e2h) : context.getString(com.tencent.mm.R.string.e2j), 0).show();
        }
        return z19;
    }

    public static boolean p() {
        com.tencent.mm.autogen.events.FinderLiveStateActionEvent finderLiveStateActionEvent = new com.tencent.mm.autogen.events.FinderLiveStateActionEvent();
        finderLiveStateActionEvent.e();
        am.ac acVar = finderLiveStateActionEvent.f54296g;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkFinderLiveStatePlaying isLiving %b isAnchor %b", java.lang.Boolean.valueOf(acVar.f6146a), java.lang.Boolean.valueOf(acVar.f6147b));
        return acVar.f6146a && !acVar.f6147b;
    }

    public static boolean q(android.content.Context context, boolean z17) {
        com.tencent.mm.autogen.events.FinderVideoStateActionEvent finderVideoStateActionEvent = new com.tencent.mm.autogen.events.FinderVideoStateActionEvent();
        finderVideoStateActionEvent.e();
        am.rd rdVar = finderVideoStateActionEvent.f54338g;
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkFinderVideoState isExist %b ", java.lang.Boolean.valueOf(rdVar.f7807a));
        if (rdVar.f7807a && z17 && context != null) {
            db5.t7.makeText(context, com.tencent.mm.R.string.elf, 0).show();
        }
        return rdVar.f7807a;
    }

    public static boolean r() {
        com.tencent.mm.autogen.events.LiveStateActionEvent liveStateActionEvent = new com.tencent.mm.autogen.events.LiveStateActionEvent();
        liveStateActionEvent.e();
        am.aj ajVar = liveStateActionEvent.f54477g;
        ajVar.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ajVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "isLiving %b isAnchor %b", bool, bool);
        ajVar.getClass();
        return false;
    }

    public static boolean s(android.content.Context context) {
        t(context, null);
        return false;
    }

    public static boolean t(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        com.tencent.mm.autogen.events.LiveStateActionEvent liveStateActionEvent = new com.tencent.mm.autogen.events.LiveStateActionEvent();
        liveStateActionEvent.e();
        am.aj ajVar = liveStateActionEvent.f54477g;
        ajVar.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ajVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "isLiving %b isAnchor %b", bool, bool);
        ajVar.getClass();
        return false;
    }

    public static boolean u(android.content.Context context, boolean z17) {
        com.tencent.mm.autogen.events.LiveStateActionEvent liveStateActionEvent = new com.tencent.mm.autogen.events.LiveStateActionEvent();
        liveStateActionEvent.e();
        am.aj ajVar = liveStateActionEvent.f54477g;
        ajVar.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ajVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkFinderLiveStatePlaying isLiving %b isAnchor %b", bool, bool);
        ajVar.getClass();
        return false;
    }

    public static boolean v(android.content.Context context) {
        if (!H()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "isMultiTalking");
        java.lang.String string = context.getString(com.tencent.mm.R.string.aqf);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = string;
        e4Var.c();
        return true;
    }

    public static boolean w(android.content.Context context, android.content.DialogInterface.OnClickListener onClickListener) {
        if (!H()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "isMultiTalking");
        java.lang.String string = context.getString(com.tencent.mm.R.string.aqf);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = string;
        e4Var.c();
        return true;
    }

    public static boolean x(android.content.Context context) {
        com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent = new com.tencent.mm.autogen.events.MultiTalkActionEvent();
        multiTalkActionEvent.f54504g.f6259a = 2;
        multiTalkActionEvent.e();
        return multiTalkActionEvent.f54505h.f6359a;
    }

    public static boolean y() {
        boolean z17 = l(null, false) || q(null, false) || B(null, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.DeviceOccupy", "checkMutePlay=" + z17);
        return z17;
    }

    public static boolean z(android.content.Context context) {
        boolean Bi = com.tencent.mm.sdk.platformtools.l5.Bi();
        if (Bi) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = context.getString(com.tencent.mm.R.string.aqe);
            e4Var.c();
        }
        return Bi;
    }
}
