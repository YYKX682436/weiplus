package n84;

/* loaded from: classes7.dex */
public abstract class y {
    public static java.lang.String a(android.content.Context context, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readRawTextFile", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(context.getResources().openRawResource(i17)));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (true) {
            try {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb6.append(readLine);
                    sb6.append("\n");
                }
            } catch (java.lang.Exception unused) {
            }
            try {
                break;
            } catch (java.io.IOException unused2) {
            }
        }
        bufferedReader.close();
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readRawTextFile", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
        return sb7;
    }

    public static java.lang.String b(com.tencent.mm.vfs.r6 r6Var) {
        java.io.InputStream inputStream;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readRawTextFile", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
        try {
            inputStream = com.tencent.mm.vfs.w6.C(r6Var);
        } catch (java.io.FileNotFoundException unused) {
            inputStream = null;
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (true) {
            try {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb6.append(readLine);
                    sb6.append("\n");
                }
            } catch (java.lang.Exception unused2) {
            }
            try {
                break;
            } catch (java.io.IOException unused3) {
            }
        }
        bufferedReader.close();
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readRawTextFile", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.OpenGLUtils");
        return sb7;
    }
}
