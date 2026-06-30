package lp;

/* loaded from: classes11.dex */
public class q implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f320239a = 0;

    static {
        q25.b.b(new lp.q(), "//assert", "//netassert", "//jniassert", "//jnipushassert", "//pushassert", "//anrassert", "//stackoverflowassert", "//multicauseassert");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        char c17;
        java.lang.String str2 = strArr[0];
        str2.getClass();
        int i17 = 1;
        switch (str2.hashCode()) {
            case -2061874877:
                if (str2.equals("//netassert")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case -1869906331:
                if (str2.equals("//jnipushassert")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case -1794206389:
                if (str2.equals("//jniassert")) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case -1547642890:
                if (str2.equals("//multicauseassert")) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 222478448:
                if (str2.equals("//stackoverflowassert")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case 918688960:
                if (str2.equals("//pushassert")) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            case 985580427:
                if (str2.equals("//anrassert")) {
                    c17 = 6;
                    break;
                }
                c17 = 65535;
                break;
            case 1957466406:
                if (str2.equals("//assert")) {
                    c17 = 7;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
                iz5.a.g("NetsceneQueue forbid in ", false);
                return true;
            case 1:
                com.tencent.mm.modelstat.WatchDogPushReceiver.c(2);
                return true;
            case 2:
                com.tencent.mm.protocal.MMProtocalJni.setClientPackVersion(-1);
                return true;
            case 3:
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("cause: 0");
                while (i17 < 50) {
                    i17++;
                    runtimeException = new java.lang.RuntimeException("cause: " + i17, runtimeException);
                }
                throw runtimeException;
            case 4:
                new lp.p(this, 256).run();
                return true;
            case 5:
                com.tencent.mm.modelstat.WatchDogPushReceiver.c(1);
                return true;
            case 6:
                try {
                    java.lang.Thread.sleep(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                } catch (java.lang.InterruptedException unused) {
                }
                return true;
            case 7:
                iz5.a.g("test errlog " + new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new java.util.Date()), false);
                return true;
            default:
                return false;
        }
    }
}
