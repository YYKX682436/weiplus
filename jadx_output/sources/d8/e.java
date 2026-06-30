package d8;

/* loaded from: classes7.dex */
public class e implements e8.b {

    /* renamed from: a, reason: collision with root package name */
    public int f226897a = 2048;

    /* renamed from: b, reason: collision with root package name */
    public int f226898b = 2048;

    /* renamed from: c, reason: collision with root package name */
    public final d8.i f226899c;

    /* renamed from: d, reason: collision with root package name */
    public com.github.henryye.nativeiv.bitmap.BitmapType f226900d;

    /* renamed from: e, reason: collision with root package name */
    public e8.d f226901e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f226902f;

    public e() {
        d8.i iVar = new d8.i();
        this.f226899c = iVar;
        this.f226902f = false;
        ((java.util.HashMap) iVar.f226903a).put(com.github.henryye.nativeiv.bitmap.BitmapType.Native, new com.github.henryye.nativeiv.comm.a());
    }

    public d8.l a(d8.i iVar, e8.a aVar) {
        return new d8.l(iVar, aVar);
    }

    public void b(d8.l lVar, java.lang.String str, java.io.InputStream inputStream, com.github.henryye.nativeiv.ImageDecodeConfig imageDecodeConfig, f8.d dVar) {
        boolean z17;
        boolean z18;
        e8.c cVar;
        e8.c cVar2;
        long j17;
        com.github.henryye.nativeiv.bitmap.IBitmap b17;
        f8.c cVar3 = dVar.f260072a;
        e8.c cVar4 = e8.c.NATIVE_DECODE_ERROR;
        e8.c cVar5 = e8.c.OUT_OF_MEMORY;
        e8.c cVar6 = e8.c.IO_ERROR;
        e8.a aVar = lVar.f226909d;
        if (inputStream != null) {
            com.github.henryye.nativeiv.bitmap.BitmapType bitmapType = lVar.f226906a;
            d8.i iVar = lVar.f226910e;
            if (bitmapType != null) {
                int hashCode = lVar.hashCode();
                com.github.henryye.nativeiv.bitmap.BitmapType bitmapType2 = lVar.f226906a;
                java.util.Map map = (java.util.Map) iVar.f226904b.get(hashCode);
                if (map == null || map.get(bitmapType2) == null) {
                    java.util.HashMap hashMap = (java.util.HashMap) iVar.f226903a;
                    b17 = hashMap.get(bitmapType2) != null ? ((f8.b) hashMap.get(bitmapType2)).b() : null;
                } else {
                    b17 = ((f8.b) map.get(bitmapType2)).b();
                }
                lVar.f226907b = b17;
            } else {
                int hashCode2 = lVar.hashCode();
                android.graphics.Bitmap.Config config = imageDecodeConfig.mConfig;
                java.util.Map map2 = (java.util.Map) iVar.f226904b.get(hashCode2);
                com.github.henryye.nativeiv.bitmap.IBitmap a17 = map2 != null ? iVar.a(inputStream, config, cVar3, map2) : null;
                if (a17 == null) {
                    a17 = iVar.a(inputStream, config, cVar3, iVar.f226903a);
                }
                lVar.f226907b = a17;
            }
            try {
                lVar.f226907b.decodeInputStream(inputStream, imageDecodeConfig, cVar3);
                z18 = lVar.f226907b.provide() != null;
                z17 = false;
            } catch (java.io.IOException e17) {
                g8.g.c("Ni.BitmapWrapper", e17, "hy: decodeInputStream", new java.lang.Object[0]);
                lVar.f226908c.a(str, cVar6, aVar);
                lVar.f226907b.recycle();
                z18 = false;
                z17 = true;
            } catch (java.lang.OutOfMemoryError e18) {
                g8.g.c("Ni.BitmapWrapper", e18, "hy: decodeInputStream", new java.lang.Object[0]);
                lVar.f226908c.a(str, cVar5, aVar);
                lVar.f226907b.recycle();
                z18 = false;
                z17 = true;
            } catch (java.lang.Throwable th6) {
                g8.g.c("Ni.BitmapWrapper", th6, "hy: decode image exception", new java.lang.Object[0]);
                lVar.f226908c.a(str, cVar4, aVar);
                lVar.f226907b.recycle();
                z17 = false;
                z18 = false;
            }
            try {
                if (z17) {
                    inputStream.close();
                } else {
                    try {
                        cVar = cVar5;
                        cVar2 = cVar6;
                        j17 = inputStream.available();
                    } catch (java.io.IOException | java.lang.IllegalStateException e19) {
                        cVar = cVar5;
                        cVar2 = cVar6;
                        g8.g.c("Ni.BitmapWrapper", e19, "hy: get stream len failed!", new java.lang.Object[0]);
                        j17 = 0;
                    }
                    if (!z18 && lVar.f226907b.getType() == com.github.henryye.nativeiv.bitmap.BitmapType.Native) {
                        e8.c cVar7 = cVar;
                        g8.g.b("Ni.BitmapWrapper", "hy: decode switch to legacy mode!", new java.lang.Object[0]);
                        com.github.henryye.nativeiv.bitmap.IBitmap b18 = ((f8.b) ((java.util.HashMap) iVar.f226903a).get(com.github.henryye.nativeiv.bitmap.BitmapType.Legacy)).b();
                        lVar.f226907b = b18;
                        try {
                            b18.decodeInputStream(inputStream, imageDecodeConfig, cVar3);
                        } catch (java.io.IOException e27) {
                            g8.g.c("Ni.BitmapWrapper", e27, "hy: IOException when use legacy", new java.lang.Object[0]);
                            lVar.f226908c.a(str, cVar2, aVar);
                        } catch (java.lang.OutOfMemoryError e28) {
                            g8.g.c("Ni.BitmapWrapper", e28, "hy: decodeInputStream", new java.lang.Object[0]);
                            lVar.f226908c.a(str, cVar7, aVar);
                        } catch (java.lang.Throwable th7) {
                            g8.g.c("Ni.BitmapWrapper", th7, "hy: decode image exception", new java.lang.Object[0]);
                            lVar.f226908c.a(str, cVar4, aVar);
                        }
                    }
                    aVar.f249981a = j17;
                    aVar.f249982b = lVar.f226907b.getDecodeTime();
                    lVar.f226908c.a(str, e8.c.OK, aVar);
                    if (lVar.f226907b.getType() == com.github.henryye.nativeiv.bitmap.BitmapType.Legacy) {
                        lVar.f226908c.a(str, e8.c.LEGACY_MODE, aVar);
                    }
                    if (lVar.f226907b.provide() == null) {
                        lVar.f226907b.recycle();
                        lVar.f226907b = null;
                    }
                    inputStream.close();
                }
            } catch (java.io.IOException | java.lang.IllegalStateException unused) {
            }
        }
    }
}
