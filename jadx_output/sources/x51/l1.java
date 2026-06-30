package x51;

/* loaded from: classes11.dex */
public abstract class l1 {
    public static boolean a(int i17, byte[] bArr, int i18) {
        if (bArr == null || bArr.length < i18 + 4) {
            return false;
        }
        bArr[i18] = (byte) ((i17 >> 24) & 255);
        bArr[i18 + 1] = (byte) ((i17 >> 16) & 255);
        bArr[i18 + 2] = (byte) ((i17 >> 8) & 255);
        bArr[i18 + 3] = (byte) (i17 & 255);
        return true;
    }

    public static boolean b(byte[] bArr, java.lang.String str, java.lang.String str2, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StackReportUploader", "read file failed:%s", str);
            return false;
        }
        if (bArr.length > 128000) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StackReportUploader", "file :%s data len error:%d", str, java.lang.Integer.valueOf(bArr.length));
            return false;
        }
        int length = bArr.length;
        java.lang.String lowerCase = kk.k.g(java.lang.String.format("weixin#$()%d%d", java.lang.Integer.valueOf(o45.wf.f343029g), java.lang.Integer.valueOf(length)).getBytes()).toLowerCase();
        byte[] a17 = kk.y.a(bArr);
        if (com.tencent.mm.sdk.platformtools.t8.M0(a17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StackReportUploader", "zip data failed file:%s", str);
            return false;
        }
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        kk.d.b(pByteArray, a17, lowerCase.getBytes());
        byte[] bArr2 = pByteArray.value;
        if (com.tencent.mm.sdk.platformtools.t8.M0(bArr2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StackReportUploader", "encrypt data failed file:%s", str);
        }
        java.lang.String str3 = "https://" + com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0).getString("support.weixin.qq.com", "support.weixin.qq.com");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str3 + "/cgi-bin/mmsupport-bin/stackreport?version=");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(java.lang.Integer.toHexString(o45.wf.f343029g));
        stringBuffer.append(sb6.toString());
        stringBuffer.append("&devicetype=");
        stringBuffer.append(wo.q.f447780a);
        stringBuffer.append("&filelength=");
        stringBuffer.append(length);
        stringBuffer.append("&sum=");
        stringBuffer.append(lowerCase);
        stringBuffer.append("&reporttype=");
        stringBuffer.append(i17);
        stringBuffer.append("&reportvalue=");
        stringBuffer.append("" + java.lang.System.currentTimeMillis() + ".0.1");
        if (str2 != null && !str2.equals("")) {
            stringBuffer.append("&username=");
            stringBuffer.append(str2);
        }
        org.apache.http.impl.client.DefaultHttpClient defaultHttpClient = new org.apache.http.impl.client.DefaultHttpClient();
        org.apache.http.client.methods.HttpPost httpPost = new org.apache.http.client.methods.HttpPost(stringBuffer.toString());
        try {
            org.apache.http.entity.ByteArrayEntity byteArrayEntity = new org.apache.http.entity.ByteArrayEntity(bArr2);
            byteArrayEntity.setContentType("binary/octet-stream");
            httpPost.setEntity(byteArrayEntity);
            org.apache.http.HttpResponse execute = defaultHttpClient.execute(httpPost);
            if (execute == null || execute.getStatusLine() == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.StackReportUploader", "execute http failed resp null");
                return false;
            }
            if (execute.getStatusLine().getStatusCode() == 200) {
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.StackReportUploader", "error response code:%d ", java.lang.Integer.valueOf(execute.getStatusLine().getStatusCode()));
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StackReportUploader", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            e17.getMessage();
            return false;
        }
    }
}
