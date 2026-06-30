package fi3;

/* loaded from: classes10.dex */
public class d extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fi3.e f262954a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fi3.e eVar, android.os.Looper looper) {
        super(looper);
        this.f262954a = eVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        fi3.l lVar;
        if (message.what == 1) {
            byte[] bArr = (byte[]) message.obj;
            boolean z17 = message.arg1 == 1;
            long j17 = message.arg2;
            fi3.e eVar = this.f262954a;
            if (eVar.f262956c != null) {
                if (eVar.f262973t == null) {
                    eVar.f262973t = eVar.f262955b.a();
                }
                eVar.getClass();
                android.graphics.Bitmap bitmap = eVar.f262977x;
                if (bitmap != null) {
                    if (eVar.f262978y == null) {
                        int i17 = eVar.f262964k;
                        if (i17 == 90 || i17 == 270) {
                            eVar.f262977x = com.tencent.mm.sdk.platformtools.x.w0(bitmap, 360 - i17);
                        } else if (i17 == 180) {
                            eVar.f262977x = com.tencent.mm.sdk.platformtools.x.w0(bitmap, 180.0f);
                        }
                        android.graphics.Bitmap bitmap2 = eVar.f262977x;
                        android.graphics.Point point = eVar.f262973t;
                        eVar.f262977x = android.graphics.Bitmap.createScaledBitmap(bitmap2, point.x, point.y, true);
                        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(eVar.f262977x.getRowBytes() * eVar.f262977x.getHeight());
                        allocateDirect.position(0);
                        eVar.f262977x.copyPixelsToBuffer(allocateDirect);
                        allocateDirect.position(0);
                        eVar.f262978y = new byte[allocateDirect.remaining()];
                        allocateDirect.get(eVar.f262978y);
                    }
                    byte[] bArr2 = eVar.f262978y;
                    android.graphics.Point point2 = eVar.f262973t;
                    com.tencent.mm.plugin.sight.base.SightVideoJNI.blendYuvFrame(bArr, bArr2, point2.x, point2.y);
                }
                fi3.l lVar2 = eVar.f262956c;
                android.graphics.Point point3 = eVar.f262973t;
                int i18 = point3.x;
                int i19 = point3.y;
                lVar2.getClass();
                if (z17 || bArr == null) {
                    lVar2.c(lVar2.f263043u, true, j17);
                } else {
                    int i27 = lVar2.f263026d;
                    int i28 = lVar2.f263025c;
                    boolean z18 = (i18 == i28 && i19 == i27) ? false : true;
                    if (lVar2.f263043u == null) {
                        lVar2.f263043u = new byte[((i28 * i27) * 3) >> 1];
                    }
                    if (lVar2.f263027e != 19 || z18) {
                        lVar = lVar2;
                        com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.yuv420pTo420XXAndScaleLock(bArr, 2, lVar2.f263043u, lVar2.f263044v, i18, i19, i18, i19, i28, i27);
                    } else {
                        java.lang.System.arraycopy(bArr, 0, lVar2.f263043u, 0, bArr.length);
                        lVar = lVar2;
                    }
                    lVar.f263029g++;
                    lVar.c(lVar.f263043u, false, j17);
                }
                ei3.x.f253187d.o(bArr);
            }
        }
    }
}
