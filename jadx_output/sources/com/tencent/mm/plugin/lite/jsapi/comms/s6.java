package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes5.dex */
public class s6 implements zo0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.w6 f143773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.q6 f143774c;

    public s6(com.tencent.mm.plugin.lite.jsapi.comms.q6 q6Var, java.lang.String str, com.tencent.mm.plugin.lite.jsapi.comms.w6 w6Var) {
        this.f143774c = q6Var;
        this.f143772a = str;
        this.f143773b = w6Var;
    }

    @Override // zo0.c
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[loadImageFromUrl] failed to load image from url:");
        java.lang.String str = this.f143772a;
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", sb6.toString());
        ((com.tencent.mm.plugin.lite.jsapi.comms.q6$$d) this.f143773b).a(str, null, "");
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0098: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:46:0x0098 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ba -> B:15:0x00c1). Please report as a decompilation issue!!! */
    @Override // zo0.c
    public void b(hp0.i iVar) {
        java.io.OutputStream outputStream;
        java.io.OutputStream outputStream2;
        com.tencent.mm.plugin.lite.jsapi.comms.w6 w6Var = this.f143773b;
        jp0.f a17 = iVar.a();
        this.f143774c.getClass();
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("LiteAppImg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(h07.o());
        sb6.append("/");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String str = this.f143772a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        sb6.append(str.hashCode());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = sb7 + ".tmp";
        java.io.OutputStream outputStream3 = null;
        try {
        } catch (java.lang.Throwable th6) {
            th = th6;
            outputStream3 = outputStream;
        }
        try {
            try {
                outputStream2 = com.tencent.mm.vfs.w6.K(str2, false);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", e17.getMessage());
            }
            try {
                outputStream2.write(a17.a());
                outputStream2.flush();
                android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(str2, 480, 480, false);
                if (T == null || T.isRecycled()) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", "[loadImageFromUrl] bitmap is null or recycled");
                    ((com.tencent.mm.plugin.lite.jsapi.comms.q6$$d) w6Var).a(str, null, "");
                } else {
                    com.tencent.mm.sdk.platformtools.x.D0(T, 100, android.graphics.Bitmap.CompressFormat.PNG, sb7, false);
                    ((com.tencent.mm.plugin.lite.jsapi.comms.q6$$d) w6Var).a(str, T, sb7);
                }
                if (com.tencent.mm.vfs.w6.j(str2)) {
                    com.tencent.mm.vfs.w6.h(str2);
                }
                outputStream2.close();
            } catch (java.io.IOException e18) {
                e = e18;
                com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", e.getMessage());
                ((com.tencent.mm.plugin.lite.jsapi.comms.q6$$d) w6Var).a(str, null, "");
                if (com.tencent.mm.vfs.w6.j(str2)) {
                    com.tencent.mm.vfs.w6.h(str2);
                }
                if (outputStream2 != null) {
                    outputStream2.close();
                }
            }
        } catch (java.io.IOException e19) {
            e = e19;
            outputStream2 = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (com.tencent.mm.vfs.w6.j(str2)) {
                com.tencent.mm.vfs.w6.h(str2);
            }
            if (outputStream3 != null) {
                try {
                    outputStream3.close();
                } catch (java.lang.Exception e27) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApiSendAppMessage", e27.getMessage());
                }
            }
            throw th;
        }
    }
}
