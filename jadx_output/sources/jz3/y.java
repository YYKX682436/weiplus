package jz3;

/* loaded from: classes12.dex */
public class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        boolean z17;
        int i17;
        com.tencent.mm.autogen.events.ScanTranslationEvent scanTranslationEvent = (com.tencent.mm.autogen.events.ScanTranslationEvent) iEvent;
        java.util.HashMap hashMap = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).f159125o;
        java.util.HashMap hashMap2 = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).f159126p;
        java.util.HashMap hashMap3 = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).f159127q;
        am.bt btVar = scanTranslationEvent.f54738g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(btVar.f6284c)) {
            z17 = false;
        } else {
            try {
                com.tencent.mars.xlog.Log.i("ScanTranslationListener", "request to translate img %s, sessionId %d", btVar.f6284c, java.lang.Integer.valueOf(btVar.f6283b));
                dm.aa y07 = ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).cj().y0(com.tencent.mm.sdk.platformtools.w2.a(btVar.f6284c + com.tencent.mm.vfs.w6.l(btVar.f6284c)));
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
                if (y07 != null && android.text.TextUtils.equals(y07.field_toLang, c17)) {
                    com.tencent.mars.xlog.Log.i("ScanTranslationListener", "already has translation result, translateLanguageCode: " + c17);
                    java.lang.String str = y07.field_resultFile;
                    if (com.tencent.mm.vfs.w6.j(str)) {
                        com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent = new com.tencent.mm.autogen.events.ScanTranslationResultEvent();
                        am.ct ctVar = scanTranslationResultEvent.f54739g;
                        ctVar.f6400a = btVar.f6283b;
                        ctVar.f6402c = true;
                        ctVar.f6403d = str;
                        scanTranslationResultEvent.e();
                        hashMap.remove(java.lang.Integer.valueOf(btVar.f6283b));
                        return true;
                    }
                    com.tencent.mars.xlog.Log.w("ScanTranslationListener", "can not find old translation result!");
                }
                com.tencent.mars.xlog.Log.i("ScanTranslationListener", "request translation, languageCode: " + c17);
                com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct oCRTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.OCRTranslateReportStruct();
                switch (btVar.f6282a) {
                    case 1:
                        i17 = 4;
                        break;
                    case 2:
                        i17 = 5;
                        break;
                    case 3:
                        i17 = 6;
                        break;
                    case 4:
                        i17 = 7;
                        break;
                    case 5:
                        i17 = 8;
                        break;
                    case 6:
                        i17 = 9;
                        break;
                    case 7:
                        i17 = 10;
                        break;
                    default:
                        i17 = 0;
                        break;
                }
                oCRTranslateReportStruct.f59745d = i17;
                hashMap2.put(java.lang.Integer.valueOf(btVar.f6283b), oCRTranslateReportStruct);
                com.tencent.mm.plugin.scanner.model.p2 p2Var = new com.tencent.mm.plugin.scanner.model.p2();
                java.lang.String str2 = btVar.f6284c;
                p2Var.f158975a = str2;
                p2Var.f158976b = str2;
                int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(str2).getOrientationInDegree();
                com.tencent.mars.xlog.Log.i("ScanTranslationListener", "original img degree %s", java.lang.Integer.valueOf(orientationInDegree));
                java.lang.String str3 = btVar.f6284c;
                java.lang.String c18 = e04.t2.c(str3);
                p2Var.f158980f = c18;
                android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(btVar.f6284c, new android.graphics.BitmapFactory.Options());
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigC2CAlphaImageWhiteBgConfig()) == 1) {
                    J2 = com.tencent.mm.sdk.platformtools.x.d(J2, -1);
                    com.tencent.mars.xlog.Log.i("ScanTranslationListener", "addBackgroundColor to %s", J2);
                }
                if (J2 != null) {
                    if (orientationInDegree != 0) {
                        J2 = com.tencent.mm.sdk.platformtools.x.w0(J2, orientationInDegree);
                    }
                    str3 = ((com.tencent.mm.plugin.scanner.u0) ((com.tencent.mm.plugin.scanner.a0) i95.n0.c(com.tencent.mm.plugin.scanner.a0.class))).Ai("jpg");
                    com.tencent.mm.sdk.platformtools.x.D0(J2, 80, android.graphics.Bitmap.CompressFormat.JPEG, str3, false);
                    p2Var.f158976b = str3;
                }
                java.lang.String str4 = str3;
                hashMap.put(java.lang.Integer.valueOf(btVar.f6283b), p2Var);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                hashMap3.put(java.lang.Integer.valueOf(btVar.f6283b), java.lang.Long.valueOf(currentTimeMillis));
                e04.t2.a(c18, str4, 2, new jz3.x(this, c18, oCRTranslateReportStruct, currentTimeMillis, scanTranslationEvent, str4, hashMap2, hashMap3));
                return true;
            } catch (java.lang.Exception e17) {
                z17 = false;
                com.tencent.mars.xlog.Log.printErrStackTrace("ScanTranslationListener", e17, "", new java.lang.Object[0]);
                ((com.tencent.mm.plugin.scanner.q0) i95.n0.c(com.tencent.mm.plugin.scanner.q0.class)).fj(btVar.f6283b);
            }
        }
        return z17;
    }
}
