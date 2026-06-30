package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.smiley.c0 f193225a = new com.tencent.mm.smiley.c0();

    /* renamed from: b, reason: collision with root package name */
    public static kotlinx.coroutines.f2 f193226b;

    /* renamed from: c, reason: collision with root package name */
    public static kotlinx.coroutines.y0 f193227c;

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.sync.d f193228d;

    /* renamed from: e, reason: collision with root package name */
    public static ny4.e f193229e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.smiley.s f193230f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f193231g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f193232h;

    static {
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310568a);
        kotlinx.coroutines.z0.c(a17, null);
        f193227c = a17;
        f193228d = new kotlinx.coroutines.sync.k(true);
        f193230f = new com.tencent.mm.smiley.s(0L, 0L, 0, 0L, 0L, 0L, 0L, 127, null);
        f193232h = true;
    }

    public static final ny4.e a(com.tencent.mm.smiley.c0 c0Var) {
        c0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "createRecognizer");
        ny4.e eVar = new ny4.e();
        boolean e17 = eVar.e(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "init ocr result: " + e17);
        if (e17) {
            return eVar;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[Catch: all -> 0x00b7, TryCatch #1 {all -> 0x00b7, blocks: (B:11:0x0066, B:13:0x006d, B:16:0x0078, B:20:0x0111, B:21:0x0085, B:24:0x008f, B:27:0x00a3, B:29:0x00ac, B:33:0x00bd, B:37:0x00c5, B:38:0x00c8, B:40:0x00cf, B:41:0x00e8, B:47:0x0119, B:48:0x011c, B:51:0x011e, B:52:0x0121, B:55:0x0123, B:56:0x0126, B:15:0x0071, B:26:0x0099, B:23:0x0089), top: B:10:0x0066, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[Catch: all -> 0x00b7, TryCatch #1 {all -> 0x00b7, blocks: (B:11:0x0066, B:13:0x006d, B:16:0x0078, B:20:0x0111, B:21:0x0085, B:24:0x008f, B:27:0x00a3, B:29:0x00ac, B:33:0x00bd, B:37:0x00c5, B:38:0x00c8, B:40:0x00cf, B:41:0x00e8, B:47:0x0119, B:48:0x011c, B:51:0x011e, B:52:0x0121, B:55:0x0123, B:56:0x0126, B:15:0x0071, B:26:0x0099, B:23:0x0089), top: B:10:0x0066, inners: #0, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(com.tencent.mm.smiley.c0 r20, com.tencent.mm.storage.emotion.EmojiInfo r21) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.smiley.c0.b(com.tencent.mm.smiley.c0, com.tencent.mm.storage.emotion.EmojiInfo):boolean");
    }

    public final com.tencent.mm.smiley.t c(android.graphics.Bitmap bitmap) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int length = array.length / 4;
        int i17 = length * 3;
        byte[] bArr = new byte[i17];
        java.util.Iterator it = e06.p.m(0, length).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            int i18 = b17 * 3;
            int i19 = b17 * 4;
            bArr[i18] = array[i19];
            bArr[i18 + 1] = array[i19 + 1];
            bArr[i18 + 2] = array[i19 + 2];
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i17);
        allocateDirect.put(bArr);
        return new com.tencent.mm.smiley.t(allocateDirect, bitmap.getWidth(), bitmap.getHeight());
    }

    public final void d(boolean z17) {
        if (f193229e != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiOcrService", "already started!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "start: " + z17);
        com.tencent.mm.smiley.s sVar = f193230f;
        sVar.f193366e = 0L;
        sVar.f193367f = 0L;
        sVar.f193368g = 0L;
        sVar.f193362a = 0L;
        sVar.f193363b = 0L;
        sVar.f193364c = 0;
        sVar.f193365d = 0L;
        kotlinx.coroutines.f2 a17 = kotlinx.coroutines.w3.a(1, "emoji-ocr");
        kotlinx.coroutines.y0 a18 = kotlinx.coroutines.z0.a(a17);
        f193227c = a18;
        f193226b = a17;
        kotlinx.coroutines.l.d(a18, null, null, new com.tencent.mm.smiley.y(z17, null), 3, null);
    }

    public final void e(yz5.a onCompeted) {
        kotlin.jvm.internal.o.g(onCompeted, "onCompeted");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "stop: " + kotlinx.coroutines.z0.h(f193227c));
        f193232h = true;
        if (f193226b != null) {
            kotlinx.coroutines.l.d(f193227c, null, null, new com.tencent.mm.smiley.b0(onCompeted, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiOcrService", "the job has been already finished");
            onCompeted.invoke();
        }
    }
}
