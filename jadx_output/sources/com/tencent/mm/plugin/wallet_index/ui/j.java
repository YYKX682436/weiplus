package com.tencent.mm.plugin.wallet_index.ui;

/* loaded from: classes8.dex */
public abstract class j {
    public static boolean a(android.content.Context context, java.lang.String str, com.tencent.mm.opensdk.modelpay.PayResp payResp, com.tencent.mm.opensdk.modelpay.PayReq.Options options) {
        java.lang.String str2;
        int i17;
        if (options == null || com.tencent.mm.sdk.platformtools.t8.K0(options.callbackClassName)) {
            str2 = str + ".wxapi.WXPayEntryActivity";
        } else {
            str2 = options.callbackClassName;
        }
        if (options == null || (i17 = options.callbackFlags) == -1) {
            i17 = 268435456;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PayCallbackHelper", "callback, cbPkg = " + str + ", cbCls = " + str2 + ", cbFlags(hex) = " + java.lang.Integer.toHexString(i17) + ", errCode = " + payResp.errCode);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.Token.WX_TOKEN_KEY, com.tencent.mm.opensdk.constants.ConstantsAPI.Token.WX_TOKEN_VALUE_MSG);
        payResp.toBundle(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = str;
        args.targetClassName = str2;
        args.bundle = bundle;
        args.flags = i17;
        return com.tencent.mm.opensdk.channel.MMessageActV2.send(context, args);
    }
}
