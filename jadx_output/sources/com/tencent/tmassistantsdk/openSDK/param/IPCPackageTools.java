package com.tencent.tmassistantsdk.openSDK.param;

/* loaded from: classes13.dex */
public class IPCPackageTools {
    protected static final java.lang.String CHILD_NAME = ".jce.";
    static final java.lang.String CRYPT_KEY = "ji*9^&43U0X-~./(";
    private static final java.lang.String TAG = "IPCPackageTools";
    protected static int mReqId;

    public static com.tencent.tmassistantsdk.openSDK.param.jce.IPCRequest buildIpcRequest(com.qq.taf.jce.JceStruct jceStruct) {
        if (jceStruct == null) {
            return null;
        }
        com.tencent.tmassistantsdk.openSDK.param.jce.IPCRequest iPCRequest = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCRequest();
        com.tencent.tmassistantsdk.openSDK.param.jce.IPCHead iPCHead = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCHead();
        int i17 = mReqId;
        mReqId = i17 + 1;
        iPCHead.requestId = i17;
        iPCHead.cmdId = getCmdId(jceStruct);
        iPCHead.hostPackageName = com.tencent.tmassistantsdk.util.GlobalUtil.getAppPackageName(com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext());
        iPCHead.hostVersionCode = java.lang.String.valueOf(com.tencent.tmassistantsdk.util.GlobalUtil.getAppVersionCode(com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getContext()));
        iPCRequest.head = iPCHead;
        iPCRequest.body = jceStruct2ByteArray(jceStruct);
        return iPCRequest;
    }

    public static byte[] buildPostData(com.tencent.tmassistantsdk.openSDK.param.jce.IPCRequest iPCRequest) {
        if (iPCRequest == null) {
            return null;
        }
        iPCRequest.body = com.tencent.tmassistantsdk.protocol.ProtocolPackage.encrypt(iPCRequest.body, CRYPT_KEY.getBytes());
        return jceStruct2ByteArray(iPCRequest);
    }

    private static com.qq.taf.jce.JceStruct createFromRequest(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (com.qq.taf.jce.JceStruct) java.lang.Class.forName((com.tencent.tmassistantsdk.openSDK.param.IPCPackageTools.class.getPackage().getName() + CHILD_NAME + str) + "Response").newInstance();
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            return null;
        } catch (java.lang.IllegalAccessException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e18, "", new java.lang.Object[0]);
            return null;
        } catch (java.lang.InstantiationException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e19, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static int getCmdId(com.qq.taf.jce.JceStruct jceStruct) {
        if (jceStruct == null) {
            return -1;
        }
        return com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd.convert(jceStruct.getClass().getSimpleName().substring(0, r2.length() - 7)).value();
    }

    public static byte[] jceStruct2ByteArray(com.qq.taf.jce.JceStruct jceStruct) {
        return com.tencent.tmassistantsdk.protocol.ProtocolPackage.jceStructToUTF8Byte(jceStruct);
    }

    public static com.qq.taf.jce.JceStruct unpackBodyStruct(com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse iPCResponse) {
        com.qq.taf.jce.JceStruct createFromRequest = createFromRequest(com.tencent.tmassistantsdk.openSDK.param.jce.IPCCmd.convert(iPCResponse.head.cmdId).toString());
        if (createFromRequest != null) {
            byte[] bArr = iPCResponse.body;
            if (bArr.length > 0) {
                try {
                    com.qq.taf.jce.JceInputStream jceInputStream = new com.qq.taf.jce.JceInputStream(bArr);
                    jceInputStream.setServerEncoding(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    createFromRequest.readFrom(jceInputStream);
                    return createFromRequest;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
                }
            }
        }
        return null;
    }

    public static com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse unpackPackage(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse iPCResponse = new com.tencent.tmassistantsdk.openSDK.param.jce.IPCResponse();
            try {
                com.qq.taf.jce.JceInputStream jceInputStream = new com.qq.taf.jce.JceInputStream(bArr);
                jceInputStream.setServerEncoding(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                iPCResponse.readFrom(jceInputStream);
                if (!android.text.TextUtils.isEmpty(iPCResponse.head.hostPackageName)) {
                    iPCResponse.body = com.tencent.tmassistantsdk.protocol.ProtocolPackage.decrypt(iPCResponse.body, CRYPT_KEY.getBytes());
                }
                return iPCResponse;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }
}
