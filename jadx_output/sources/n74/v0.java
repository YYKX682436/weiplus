package n74;

/* loaded from: classes4.dex */
public class v0 implements java.lang.Runnable {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r8.moveToFirst() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        r10 = new com.tencent.mm.plugin.sns.storage.AdSnsInfo();
        r10.convertFrom(r8);
        r11 = r10.getAdInfo();
        r10 = ca4.z0.t0(r10.field_snsId);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r11 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (android.text.TextUtils.isEmpty(r11.uxInfo) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        r11 = n74.w0.e(r11.uxInfo);
        com.tencent.mars.xlog.Log.i("AdWuidHelper", "wuid=" + r11 + ", snsId=" + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
    
        if (android.text.TextUtils.isEmpty(r11) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        com.tencent.mars.xlog.Log.w("AdWuidHelper", "updateWuidFromHistoryAd, empty uxinfo, snsId=" + r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        com.tencent.mars.xlog.Log.e("AdWuidHelper", "updateWuidFromHistoryAd loop exp=" + r10.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        if (r8 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
    
        if (r8 == null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0146  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n74.v0.run():void");
    }
}
