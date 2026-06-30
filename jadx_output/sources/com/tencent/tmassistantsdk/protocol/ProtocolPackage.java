package com.tencent.tmassistantsdk.protocol;

/* loaded from: classes13.dex */
public class ProtocolPackage {
    static final java.lang.String CRYPT_KEY = "ji*9^&43U0X-~./(";
    static final byte FLAG_CRYPT = 2;
    static final byte FLAG_ZIP = 1;
    public static final java.lang.String ServerEncoding = "utf-8";
    private static final java.lang.String TAG = "ProtocolPackage";
    static final int ZIP_TRIGGER = 256;

    public static byte[] buildPostData(com.tencent.tmassistantsdk.protocol.jce.Request request) {
        if (request == null) {
            return null;
        }
        request.head.encryptWithPack = (byte) 0;
        byte[] bArr = request.body;
        if (bArr.length > 256) {
            request.body = com.tencent.tmassistantsdk.protocol.ZipUtils.zip(bArr);
            com.tencent.tmassistantsdk.protocol.jce.ReqHead reqHead = request.head;
            reqHead.encryptWithPack = (byte) (reqHead.encryptWithPack | 1);
        }
        request.body = encrypt(request.body, CRYPT_KEY.getBytes());
        com.tencent.tmassistantsdk.protocol.jce.ReqHead reqHead2 = request.head;
        reqHead2.encryptWithPack = (byte) (reqHead2.encryptWithPack | 2);
        return jceStructToUTF8Byte(request);
    }

    public static com.qq.taf.jce.JceStruct buildReportRequest(byte b17, java.util.List<byte[]> list, java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.tmassistantsdk.protocol.jce.ReportLogRequest reportLogRequest = new com.tencent.tmassistantsdk.protocol.jce.ReportLogRequest();
        reportLogRequest.logType = b17;
        reportLogRequest.logData = formatLogData(list);
        reportLogRequest.hostAppPackageName = str;
        reportLogRequest.hostAppVersion = i17;
        reportLogRequest.hostUserId = str2;
        return reportLogRequest;
    }

    public static com.tencent.tmassistantsdk.protocol.jce.Request buildRequest(com.qq.taf.jce.JceStruct jceStruct) {
        if (jceStruct == null) {
            return null;
        }
        com.tencent.tmassistantsdk.protocol.jce.Request request = new com.tencent.tmassistantsdk.protocol.jce.Request();
        request.head = getReqHead(jceStruct);
        request.body = jceStructToUTF8Byte(jceStruct);
        return request;
    }

    public static com.qq.taf.jce.JceStruct bytes2JceObj(byte[] bArr, java.lang.Class<? extends com.qq.taf.jce.JceStruct> cls) {
        if (bArr == null) {
            return null;
        }
        try {
            com.qq.taf.jce.JceInputStream jceInputStream = new com.qq.taf.jce.JceInputStream(bArr);
            jceInputStream.setServerEncoding(ServerEncoding);
            com.qq.taf.jce.JceStruct newInstance = cls.newInstance();
            newInstance.readFrom(jceInputStream);
            return newInstance;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private static com.qq.taf.jce.JceStruct createFromRequest(com.qq.taf.jce.JceStruct jceStruct) {
        if (jceStruct == null) {
            return null;
        }
        try {
            return (com.qq.taf.jce.JceStruct) java.lang.Class.forName(jceStruct.getClass().getName().substring(0, r6.length() - 7) + "Response").newInstance();
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

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) {
        return new com.tencent.tmassistantsdk.util.Cryptor().decrypt(bArr, bArr2);
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) {
        return new com.tencent.tmassistantsdk.util.Cryptor().encrypt(bArr, bArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] formatLogData(java.util.List<byte[]> r8) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "ProtocolPackage"
            r2 = 0
            r3 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
            r4.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
        L14:
            boolean r6 = r8.hasNext()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            if (r6 == 0) goto L28
            java.lang.Object r6 = r8.next()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            int r7 = r6.length     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            r5.writeInt(r7)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            r5.write(r6)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            goto L14
        L28:
            byte[] r8 = r4.toByteArray()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            r4.close()     // Catch: java.io.IOException -> L30
            goto L36
        L30:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r3, r0, r4)
        L36:
            r5.close()     // Catch: java.io.IOException -> L3a
            goto L40
        L3a:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r3, r0, r2)
        L40:
            return r8
        L41:
            r8 = move-exception
            goto L50
        L43:
            r8 = move-exception
            r5 = r3
        L45:
            r3 = r4
            goto L70
        L47:
            r8 = move-exception
            r5 = r3
            goto L50
        L4a:
            r8 = move-exception
            r5 = r3
            goto L70
        L4d:
            r8 = move-exception
            r4 = r3
            r5 = r4
        L50:
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6e
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r8, r0, r6)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L61
            r4.close()     // Catch: java.io.IOException -> L5b
            goto L61
        L5b:
            r8 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r8, r0, r4)
        L61:
            if (r5 == 0) goto L6d
            r5.close()     // Catch: java.io.IOException -> L67
            goto L6d
        L67:
            r8 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r8, r0, r2)
        L6d:
            return r3
        L6e:
            r8 = move-exception
            goto L45
        L70:
            if (r3 == 0) goto L7c
            r3.close()     // Catch: java.io.IOException -> L76
            goto L7c
        L76:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r3, r0, r4)
        L7c:
            if (r5 == 0) goto L88
            r5.close()     // Catch: java.io.IOException -> L82
            goto L88
        L82:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r3, r0, r2)
        L88:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmassistantsdk.protocol.ProtocolPackage.formatLogData(java.util.List):byte[]");
    }

    public static com.tencent.tmassistantsdk.protocol.jce.ReqHead getReqHead(com.qq.taf.jce.JceStruct jceStruct) {
        if (jceStruct == null) {
            return null;
        }
        com.tencent.tmassistantsdk.protocol.jce.ReqHead reqHead = new com.tencent.tmassistantsdk.protocol.jce.ReqHead();
        reqHead.requestId = com.tencent.tmassistantsdk.util.GlobalUtil.getMemUUID();
        reqHead.cmdId = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getJceCmdIdByClassName(jceStruct.getClass().getSimpleName().substring(0, r3.length() - 7));
        reqHead.qua = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().mQUA;
        reqHead.phoneGuid = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getPhoneGuid();
        reqHead.terminal = new com.tencent.tmassistantsdk.protocol.jce.Terminal();
        reqHead.assistantAPILevel = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getQQDownloaderAPILevel();
        reqHead.assistantVersionCode = com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().getQQDownloaderVersionCode();
        return reqHead;
    }

    public static byte[] jceStructToUTF8Byte(com.qq.taf.jce.JceStruct jceStruct) {
        if (jceStruct == null) {
            return null;
        }
        com.qq.taf.jce.JceOutputStream jceOutputStream = new com.qq.taf.jce.JceOutputStream();
        jceOutputStream.setServerEncoding(ServerEncoding);
        jceStruct.writeTo(jceOutputStream);
        return jceOutputStream.toByteArray();
    }

    public static com.tencent.tmassistantsdk.protocol.jce.Response unpackPackage(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            com.tencent.tmassistantsdk.protocol.jce.Response response = new com.tencent.tmassistantsdk.protocol.jce.Response();
            try {
                com.qq.taf.jce.JceInputStream jceInputStream = new com.qq.taf.jce.JceInputStream(bArr);
                jceInputStream.setServerEncoding(ServerEncoding);
                response.readFrom(jceInputStream);
                com.tencent.tmassistantsdk.protocol.jce.RspHead rspHead = response.head;
                if (rspHead.ret == 0) {
                    if ((rspHead.encryptWithPack & 2) == 2) {
                        response.body = decrypt(response.body, CRYPT_KEY.getBytes());
                    }
                    if ((response.head.encryptWithPack & 1) == 1) {
                        response.body = com.tencent.tmassistantsdk.protocol.ZipUtils.unzip(response.body);
                    }
                    com.tencent.tmassistantsdk.util.GlobalUtil.getInstance().setPhoneGuid(response.head.phoneGuid);
                }
                return response;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public static com.qq.taf.jce.JceStruct unpageageJceResponse(com.qq.taf.jce.JceStruct jceStruct, byte[] bArr) {
        com.qq.taf.jce.JceStruct createFromRequest;
        if (jceStruct != null && bArr != null && (createFromRequest = createFromRequest(jceStruct)) != null) {
            try {
                com.qq.taf.jce.JceInputStream jceInputStream = new com.qq.taf.jce.JceInputStream(bArr);
                jceInputStream.setServerEncoding(ServerEncoding);
                createFromRequest.readFrom(jceInputStream);
                return createFromRequest;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }
}
