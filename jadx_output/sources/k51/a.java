package k51;

/* loaded from: classes12.dex */
public class a {
    public static int b(java.io.File file, java.io.File file2, java.io.File file3, java.io.File file4) {
        try {
            return new k51.a().a(file, file2, file3, file4);
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.i("HdiffApk-MMPatchMerge", "applyPatch, e = " + e17);
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.io.File r18, java.io.File r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k51.a.d(java.io.File, java.io.File, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0267 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0250 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k51.a.e(java.lang.String, java.lang.String, java.lang.String):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [h51.i] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void f(m51.e eVar, java.io.File file, java.io.File file2) {
        h51.i iVar;
        ?? r17 = 0;
        h51.i iVar2 = null;
        try {
            try {
                try {
                    iVar = new h51.i(file2, eVar.f323530c);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            } catch (java.lang.Exception e17) {
                e = e17;
            }
            try {
                new java.util.ArrayList();
                r17 = 32768;
                h51.c.a(eVar.f323528a, file, iVar, false, 32768);
                iVar.close();
            } catch (java.lang.Exception e18) {
                e = e18;
                iVar2 = iVar;
                com.tencent.stubs.logger.Log.i("HdiffApk-MMPatchMerge", "writeDeltaFriendlyOldFile, e = " + e);
                iVar2.close();
                r17 = iVar2;
            } catch (java.lang.Throwable th7) {
                th = th7;
                r17 = iVar;
                try {
                    r17.close();
                } catch (java.lang.Exception unused) {
                }
                throw th;
            }
        } catch (java.lang.Exception unused2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:123|(13:124|125|126|127|128|129|130|131|132|133|134|135|136)|(4:138|139|140|(20:142|143|144|145|146|147|148|(2:178|179)(2:153|154)|155|156|157|158|160|161|162|163|164|165|69|70))(1:187)|184|143|144|145|146|147|148|(2:150|151)|175|178|179|155|156|157|158|160|161|162|163|164|165|69|70) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:1|(2:2|3)|(7:5|6|7|8|9|10|(28:12|13|14|15|17|18|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|(3:275|276|(2:278|(2:280|(10:282|283|284|285|286|287|288|289|290|291))))|39|40|41))|(3:256|257|(5:259|260|261|262|(27:264|44|(1:46)(1:255)|47|48|(2:245|246)(1:50)|51|117|118|119|120|121|(12:210|211|212|213|214|215|216|217|218|219|220|221)(38:123|124|125|126|127|128|129|130|131|132|133|134|135|136|(4:138|139|140|(20:142|143|144|145|146|147|148|(2:178|179)(2:153|154)|155|156|157|158|160|161|162|163|164|165|69|70))(1:187)|184|143|144|145|146|147|148|(2:150|151)|175|178|179|155|156|157|158|160|161|162|163|164|165|69|70)|207|196|56|57|(1:59)|(1:61)|(1:63)|(2:82|83)|(2:77|78)|66|(2:72|73)|68|69|70)(26:265|(0)(0)|47|48|(0)(0)|51|117|118|119|120|121|(0)(0)|207|196|56|57|(0)|(0)|(0)|(0)|(0)|66|(0)|68|69|70)))|43|44|(0)(0)|47|48|(0)(0)|51|117|118|119|120|121|(0)(0)|207|196|56|57|(0)|(0)|(0)|(0)|(0)|66|(0)|68|69|70|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(39:1|2|3|5|6|7|8|9|10|(28:12|13|14|15|17|18|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|(3:275|276|(2:278|(2:280|(10:282|283|284|285|286|287|288|289|290|291))))|39|40|41)|(3:256|257|(5:259|260|261|262|(27:264|44|(1:46)(1:255)|47|48|(2:245|246)(1:50)|51|117|118|119|120|121|(12:210|211|212|213|214|215|216|217|218|219|220|221)(38:123|124|125|126|127|128|129|130|131|132|133|134|135|136|(4:138|139|140|(20:142|143|144|145|146|147|148|(2:178|179)(2:153|154)|155|156|157|158|160|161|162|163|164|165|69|70))(1:187)|184|143|144|145|146|147|148|(2:150|151)|175|178|179|155|156|157|158|160|161|162|163|164|165|69|70)|207|196|56|57|(1:59)|(1:61)|(1:63)|(2:82|83)|(2:77|78)|66|(2:72|73)|68|69|70)(26:265|(0)(0)|47|48|(0)(0)|51|117|118|119|120|121|(0)(0)|207|196|56|57|(0)|(0)|(0)|(0)|(0)|66|(0)|68|69|70)))|43|44|(0)(0)|47|48|(0)(0)|51|117|118|119|120|121|(0)(0)|207|196|56|57|(0)|(0)|(0)|(0)|(0)|66|(0)|68|69|70|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03cd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03ce, code lost:
    
        com.tencent.stubs.logger.Log.i("HdiffApk-MMPatchMerge", r36, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03bb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03bc, code lost:
    
        com.tencent.stubs.logger.Log.i("HdiffApk-MMPatchMerge", r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03ae, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03af, code lost:
    
        com.tencent.stubs.logger.Log.i("HdiffApk-MMPatchMerge", "patchIntputStream.close(), e = %s.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03db, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03dc, code lost:
    
        r2 = r37;
        r8 = 0;
        r7 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0414, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0415, code lost:
    
        r2 = r37;
        r20 = r7;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x040c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x040d, code lost:
    
        r2 = r37;
        r20 = r7;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x041b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x041c, code lost:
    
        r2 = r37;
        r20 = r7;
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0425, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0426, code lost:
    
        r2 = r37;
        r20 = r7;
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x053b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x056f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x055d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x054e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017b A[Catch: all -> 0x0183, Exception -> 0x042c, TRY_LEAVE, TryCatch #37 {Exception -> 0x042c, blocks: (B:262:0x0162, B:46:0x017b, B:48:0x018b, B:246:0x01a2, B:51:0x01eb, B:50:0x01d6), top: B:261:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d6 A[Catch: all -> 0x0425, Exception -> 0x042c, TRY_ENTER, TryCatch #1 {all -> 0x0425, blocks: (B:48:0x018b, B:51:0x01eb, B:118:0x01ed, B:50:0x01d6), top: B:47:0x018b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0525 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0513 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0504 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0549  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.io.File r38, java.io.File r39, java.io.File r40, java.io.File r41) {
        /*
            Method dump skipped, instructions count: 1412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k51.a.a(java.io.File, java.io.File, java.io.File, java.io.File):int");
    }

    public final void c(java.io.DataInputStream dataInputStream) {
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (java.lang.Exception e17) {
                com.tencent.stubs.logger.Log.i("HdiffApk-MMPatchMerge", "closeDataInputStream e = " + e17);
            }
        }
    }
}
