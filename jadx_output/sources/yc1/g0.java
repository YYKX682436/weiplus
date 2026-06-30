package yc1;

@j95.b
/* loaded from: classes7.dex */
public class g0 extends i95.w implements qe.g0 {
    public boolean wi() {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.i().getString("appbrandgame_open_nativelibuv", "");
        if (!((string == null || !string.equalsIgnoreCase("close")) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE).booleanValue()) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.NativeInstallHelperSwitchDelegateImpl", "use libuv Command close");
        return false;
    }
}
