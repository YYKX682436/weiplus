package com.tencent.paymars.stn;

/* loaded from: classes12.dex */
public class StnManagerCallback implements com.tencent.paymars.stn.StnManager.CallBack {
    private static int NEWSYNCCHECK_CMDID_REQ = 205;
    private static int NEWSYNCCHECK_CMDID_RESP = 1000000205;
    private static final java.lang.String TAG = "StnManagerCallback";
    private static com.tencent.mars.comm.MMWakerLock wLock;
    private byte[] cacheKeyBuf;
    private byte[] cacheMd5Buf;
    private final long mWakelockTimeMs = com.tencent.mm.network.g1.M();

    private java.lang.String exception2String(java.lang.Exception exc) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        exc.printStackTrace(new java.io.PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public int buf2Resp(int i17, java.lang.Object obj, java.lang.String str, byte[] bArr, int[] iArr, int[] iArr2, int i18, int[] iArr3) {
        if (com.tencent.mm.network.x2.h() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "mars2 buf2Resp NetTaskAdapter is empty.");
            return -1;
        }
        int i19 = iArr[0];
        int i27 = iArr3[0];
        try {
            return com.tencent.mm.network.x2.h().a(i17, obj, bArr, iArr, iArr2, i18, iArr3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            return -1;
        }
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public int getLongLinkIdentifyCheckBuffer(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2, int[] iArr) {
        iArr[0] = NEWSYNCCHECK_CMDID_REQ;
        iArr[1] = NEWSYNCCHECK_CMDID_RESP;
        return (getSyncCheckInfo(byteArrayOutputStream, byteArrayOutputStream2) == 0 || byteArrayOutputStream.size() == 0 || byteArrayOutputStream2.size() == 0) ? com.tencent.paymars.stn.StnManager.ECHECK_NEXT : com.tencent.paymars.stn.StnManager.ECHECK_NOW;
    }

    public int getSyncCheckInfo(java.io.ByteArrayOutputStream byteArrayOutputStream, java.io.ByteArrayOutputStream byteArrayOutputStream2) {
        if (com.tencent.mm.network.x2.c() == null) {
            return 0;
        }
        try {
            byte[] S = com.tencent.mm.network.x2.c().S();
            if (S != null) {
                byteArrayOutputStream.write(S);
                this.cacheKeyBuf = S;
            }
            byte[] bArr = com.tencent.mm.network.x2.c().f72003x;
            if (bArr != null) {
                byteArrayOutputStream2.write(bArr);
                this.cacheMd5Buf = bArr;
            }
            return com.tencent.mm.network.x2.c().f71993n.f71902o;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            byte[] bArr2 = this.cacheKeyBuf;
            if (bArr2 != null && this.cacheMd5Buf != null) {
                try {
                    byteArrayOutputStream.write(bArr2);
                    byteArrayOutputStream2.write(this.cacheMd5Buf);
                } catch (java.io.IOException unused) {
                }
            }
            return 0;
        }
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public boolean makesureAuthed(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.network.x2.c() == null) {
            return false;
        }
        try {
            return com.tencent.mm.network.x2.c().V(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            return false;
        }
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public void networkAnalysisCallBack(int i17, int i18, boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "networkAnalysisCallBack: status:%d, stage:%d, isDetectEnd:%b, kvInfo:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), str);
        try {
            com.tencent.mm.network.x2.c().f72004y.networkAnalysisCallBack(i17, i18, z17, str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public boolean onLongLinkIdentifyResponse(java.lang.String str, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return true;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(bArr);
            byteArrayOutputStream.write(bArr2);
        } catch (java.io.IOException unused) {
        }
        onPush(str, NEWSYNCCHECK_CMDID_RESP, 0, byteArrayOutputStream.toByteArray(), new byte[0]);
        saveSyncCheckInfo(byteArrayOutputStream.toByteArray());
        return true;
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public void onLongLinkNetworkError(com.tencent.paymars.stn.ErrCmdType errCmdType, int i17, java.lang.String str, int i18) {
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public void onLongLinkStatusChange(int i17) {
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public java.lang.String[] onNewDns(java.lang.String str, boolean z17) {
        return new java.lang.String[0];
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public void onPush(java.lang.String str, final int i17, int i18, final byte[] bArr, byte[] bArr2) {
        if (com.tencent.mm.network.x2.f() == null) {
            return;
        }
        try {
            if (wLock == null) {
                wLock = new com.tencent.mars.comm.MMWakerLock(com.tencent.mm.network.x2.d(), TAG);
            }
            wLock.lock(this.mWakelockTimeMs, "StnLogic.onNotify");
            com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.stn.StnManagerCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.network.x2.f().a(i17, bArr);
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
        }
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public void onShortLinkNetworkError(com.tencent.paymars.stn.ErrCmdType errCmdType, int i17, java.lang.String str, java.lang.String str2, int i18) {
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public int onTaskEnd(final int i17, final java.lang.Object obj, final int i18, final int i19, final com.tencent.paymars.stn.StnManager.CgiProfile cgiProfile) {
        int i27 = 0;
        if (com.tencent.mm.network.x2.h() == null) {
            return 0;
        }
        long j17 = cgiProfile.startConnectTime;
        try {
            i27 = com.tencent.mm.network.x2.h().g(i17);
            com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.stn.StnManagerCallback.2
                /* JADX WARN: Can't wrap try/catch for region: R(27:11|(1:13)|(1:15)|16|(1:116)(1:19)|20|21|22|23|25|26|(8:28|29|30|31|32|33|34|35)|(3:80|81|(14:84|38|39|40|41|42|(1:52)|53|54|55|(2:57|(4:59|60|61|62))|65|61|62))|37|38|39|40|41|42|(2:44|52)|53|54|55|(0)|65|61|62) */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x00d6, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:76:0x00da, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Removed duplicated region for block: B:44:0x01ad  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x01db A[Catch: Exception -> 0x0201, TRY_LEAVE, TryCatch #13 {Exception -> 0x0201, blocks: (B:54:0x01c7, B:57:0x01db), top: B:53:0x01c7 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 556
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.paymars.stn.StnManagerCallback.AnonymousClass2.run():void");
                }
            });
            return i27;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            return i27;
        }
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public void reportConnectStatus(int i17, int i18) {
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public void reportTaskProfile(java.lang.String str) {
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public boolean req2Buf(int i17, java.lang.Object obj, java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream, int[] iArr, int i18, java.lang.String str2, int i19) {
        if (com.tencent.mm.network.x2.h() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "mars2 req2Buf NetTaskAdapter is empty.");
            return false;
        }
        int i27 = iArr[0];
        int i28 = iArr[1];
        try {
            return com.tencent.mm.network.x2.h().n(i17, obj, byteArrayOutputStream, iArr, i18, str2, i19);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
            return false;
        }
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public java.lang.String[] requestNetCheckShortLinkHosts() {
        return new java.lang.String[0];
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public void requestSync() {
        if (com.tencent.mm.network.x2.f() == null) {
            return;
        }
        try {
            com.tencent.mm.network.x2.e().post(new java.lang.Runnable() { // from class: com.tencent.paymars.stn.StnManagerCallback.3
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.network.x2.f().a(24, kk.u.d(7));
                }
            });
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, exception2String(e17));
        }
    }

    public void saveSyncCheckInfo(byte[] bArr) {
        com.tencent.mm.network.x2.c().w0(bArr);
    }

    @Override // com.tencent.paymars.stn.StnManager.CallBack
    public void trafficData(int i17, int i18) {
    }
}
