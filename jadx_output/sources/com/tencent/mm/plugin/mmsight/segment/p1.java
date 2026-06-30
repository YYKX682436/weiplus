package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.VideoCompressUI f149072d;

    public p1(com.tencent.mm.plugin.mmsight.segment.VideoCompressUI videoCompressUI) {
        this.f149072d = videoCompressUI;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:1|2|3|4|5|(2:7|(9:13|14|15|16|(19:(1:28)|30|(3:32|(1:34)|35)(1:70)|36|(2:38|(1:40)(14:68|42|(10:47|48|(1:50)(1:66)|51|(1:65)(1:54)|55|(1:57)|58|(1:60)(2:62|(1:64))|61)|67|48|(0)(0)|51|(0)|65|55|(0)|58|(0)(0)|61))(1:69)|41|42|(12:44|47|48|(0)(0)|51|(0)|65|55|(0)|58|(0)(0)|61)|67|48|(0)(0)|51|(0)|65|55|(0)|58|(0)(0)|61)(1:19)|20|21|22|23))|80|14|15|16|(0)|(0)|30|(0)(0)|36|(0)(0)|41|42|(0)|67|48|(0)(0)|51|(0)|65|55|(0)|58|(0)(0)|61|20|21|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x028f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0290, code lost:
    
        r1 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0292, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoCompressUI", r0, "video compress failed e [%s]", r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x02a2, code lost:
    
        r3.finish();
        r0 = new com.tencent.mm.plugin.mmsight.segment.o1(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x028b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x028c, code lost:
    
        r1 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02ae, code lost:
    
        r3.finish();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.segment.o1(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02b9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[Catch: all -> 0x004c, Exception -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x004f, blocks: (B:3:0x0007, B:5:0x000b, B:7:0x0029, B:9:0x003a, B:11:0x0046, B:14:0x0053, B:28:0x0065), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[Catch: all -> 0x028b, Exception -> 0x028f, TryCatch #4 {Exception -> 0x028f, all -> 0x028b, blocks: (B:19:0x0265, B:20:0x027c, B:30:0x006e, B:32:0x007b, B:34:0x00c4, B:35:0x00d4, B:36:0x0100, B:41:0x0113, B:42:0x0138, B:44:0x013e, B:48:0x0146, B:50:0x01a7, B:51:0x01ae, B:54:0x01d7, B:55:0x0214, B:57:0x0218, B:58:0x023c, B:60:0x0242, B:61:0x0253, B:62:0x0249, B:64:0x024d, B:65:0x01ff), top: B:16:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013e A[Catch: all -> 0x028b, Exception -> 0x028f, TryCatch #4 {Exception -> 0x028f, all -> 0x028b, blocks: (B:19:0x0265, B:20:0x027c, B:30:0x006e, B:32:0x007b, B:34:0x00c4, B:35:0x00d4, B:36:0x0100, B:41:0x0113, B:42:0x0138, B:44:0x013e, B:48:0x0146, B:50:0x01a7, B:51:0x01ae, B:54:0x01d7, B:55:0x0214, B:57:0x0218, B:58:0x023c, B:60:0x0242, B:61:0x0253, B:62:0x0249, B:64:0x024d, B:65:0x01ff), top: B:16:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a7 A[Catch: all -> 0x028b, Exception -> 0x028f, TryCatch #4 {Exception -> 0x028f, all -> 0x028b, blocks: (B:19:0x0265, B:20:0x027c, B:30:0x006e, B:32:0x007b, B:34:0x00c4, B:35:0x00d4, B:36:0x0100, B:41:0x0113, B:42:0x0138, B:44:0x013e, B:48:0x0146, B:50:0x01a7, B:51:0x01ae, B:54:0x01d7, B:55:0x0214, B:57:0x0218, B:58:0x023c, B:60:0x0242, B:61:0x0253, B:62:0x0249, B:64:0x024d, B:65:0x01ff), top: B:16:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0218 A[Catch: all -> 0x028b, Exception -> 0x028f, TryCatch #4 {Exception -> 0x028f, all -> 0x028b, blocks: (B:19:0x0265, B:20:0x027c, B:30:0x006e, B:32:0x007b, B:34:0x00c4, B:35:0x00d4, B:36:0x0100, B:41:0x0113, B:42:0x0138, B:44:0x013e, B:48:0x0146, B:50:0x01a7, B:51:0x01ae, B:54:0x01d7, B:55:0x0214, B:57:0x0218, B:58:0x023c, B:60:0x0242, B:61:0x0253, B:62:0x0249, B:64:0x024d, B:65:0x01ff), top: B:16:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0242 A[Catch: all -> 0x028b, Exception -> 0x028f, TryCatch #4 {Exception -> 0x028f, all -> 0x028b, blocks: (B:19:0x0265, B:20:0x027c, B:30:0x006e, B:32:0x007b, B:34:0x00c4, B:35:0x00d4, B:36:0x0100, B:41:0x0113, B:42:0x0138, B:44:0x013e, B:48:0x0146, B:50:0x01a7, B:51:0x01ae, B:54:0x01d7, B:55:0x0214, B:57:0x0218, B:58:0x023c, B:60:0x0242, B:61:0x0253, B:62:0x0249, B:64:0x024d, B:65:0x01ff), top: B:16:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0249 A[Catch: all -> 0x028b, Exception -> 0x028f, TryCatch #4 {Exception -> 0x028f, all -> 0x028b, blocks: (B:19:0x0265, B:20:0x027c, B:30:0x006e, B:32:0x007b, B:34:0x00c4, B:35:0x00d4, B:36:0x0100, B:41:0x0113, B:42:0x0138, B:44:0x013e, B:48:0x0146, B:50:0x01a7, B:51:0x01ae, B:54:0x01d7, B:55:0x0214, B:57:0x0218, B:58:0x023c, B:60:0x0242, B:61:0x0253, B:62:0x0249, B:64:0x024d, B:65:0x01ff), top: B:16:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fa  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mmsight.segment.p1.run():void");
    }
}
