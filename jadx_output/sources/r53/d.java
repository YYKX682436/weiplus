package r53;

/* loaded from: classes8.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f392647a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f392648b = false;

    /* renamed from: c, reason: collision with root package name */
    public final r53.c f392649c = new r53.c();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f392650d = new java.util.concurrent.ConcurrentHashMap();

    public d(r53.a aVar) {
    }

    public synchronized java.util.Map a() {
        b();
        return this.f392647a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public synchronized void b() {
        if (this.f392647a == null) {
            this.f392647a = new java.util.LinkedHashMap();
        }
        if (this.f392647a.size() <= 0) {
            java.lang.String str = "";
            java.io.InputStream inputStream = null;
            java.io.InputStream inputStream2 = null;
            try {
                try {
                    inputStream2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("game_region_data.txt");
                    byte[] bArr = new byte[inputStream2.available()];
                    inputStream2.read(bArr);
                    java.lang.String str2 = new java.lang.String(bArr);
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException e17) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.GameCacheUtil", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                    str = str2;
                } finally {
                }
            } catch (java.io.IOException e18) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.GameCacheUtil", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (java.io.IOException e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GameCacheUtil", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                    }
                }
            }
            java.lang.String[] split = str.trim().split("\n|\r\n|\r");
            inputStream = null;
            for (?? r37 = inputStream; r37 < split.length; r37++) {
                java.lang.String[] split2 = split[r37].trim().split("\\|");
                if (split2.length < 4) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameCacheUtil", "this GameRegion item has problem %s", split[r37]);
                } else {
                    com.tencent.mm.plugin.game.ui.p5 p5Var = new com.tencent.mm.plugin.game.ui.p5();
                    p5Var.f141712a = split2[0];
                    p5Var.f141713b = split2[1];
                    p5Var.f141714c = split2[2];
                    java.lang.String str3 = split2[3];
                    p5Var.f141715d = str3;
                    p5Var.f141716e = false;
                    p5Var.f141717f = false;
                    this.f392647a.put(str3, p5Var);
                }
            }
            com.tencent.mm.plugin.game.ui.p5 p5Var2 = (com.tencent.mm.plugin.game.ui.p5) this.f392647a.get(com.tencent.mm.plugin.game.model.f.b());
            if (p5Var2 != null) {
                java.lang.String b17 = com.tencent.mm.plugin.game.model.f.b();
                r53.d dVar = r53.b.f392640a;
                com.tencent.mm.plugin.game.ui.p5 p5Var3 = (com.tencent.mm.plugin.game.ui.p5) dVar.a().get(b17);
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                if (p5Var3 != null) {
                    stringBuffer.append(p5Var3.f141712a);
                    stringBuffer.append(com.tencent.mm.plugin.game.model.f.c("zh_CN"));
                }
                p5Var2.f141712a = stringBuffer.toString();
                com.tencent.mm.plugin.game.ui.p5 p5Var4 = (com.tencent.mm.plugin.game.ui.p5) dVar.a().get(com.tencent.mm.plugin.game.model.f.b());
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
                if (p5Var4 != null) {
                    stringBuffer2.append(p5Var4.f141713b);
                    stringBuffer2.append(com.tencent.mm.plugin.game.model.f.c("zh_TW"));
                }
                p5Var2.f141713b = stringBuffer2.toString();
                com.tencent.mm.plugin.game.ui.p5 p5Var5 = (com.tencent.mm.plugin.game.ui.p5) dVar.a().get(com.tencent.mm.plugin.game.model.f.b());
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
                if (p5Var5 != null) {
                    stringBuffer3.append(p5Var5.f141714c);
                    stringBuffer3.append(com.tencent.mm.plugin.game.model.f.c("en"));
                }
                p5Var2.f141714c = stringBuffer3.toString();
                p5Var2.f141717f = true;
            }
        }
    }
}
