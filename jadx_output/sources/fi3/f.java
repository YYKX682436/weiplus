package fi3;

/* loaded from: classes10.dex */
public class f implements fi3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fi3.g f262979a;

    public f(fi3.g gVar) {
        this.f262979a = gVar;
    }

    @Override // fi3.p
    public void a(byte[] bArr, boolean z17, long j17) {
        fi3.o oVar;
        fi3.n nVar;
        fi3.g gVar = this.f262979a;
        if (gVar.f263000v == null) {
            gVar.f263000v = gVar.f262980b.a();
        }
        gVar.getClass();
        android.graphics.Bitmap bitmap = gVar.f263002x;
        if (bitmap != null) {
            if (gVar.f263003y == null) {
                int i17 = gVar.f262989k;
                if (i17 == 90 || i17 == 270) {
                    gVar.f263002x = com.tencent.mm.sdk.platformtools.x.w0(bitmap, 360 - i17);
                } else if (i17 == 180) {
                    gVar.f263002x = com.tencent.mm.sdk.platformtools.x.w0(bitmap, 180.0f);
                }
                android.graphics.Bitmap bitmap2 = gVar.f263002x;
                android.graphics.Point point = gVar.f263000v;
                gVar.f263002x = android.graphics.Bitmap.createScaledBitmap(bitmap2, point.x, point.y, true);
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(gVar.f263002x.getRowBytes() * gVar.f263002x.getHeight());
                allocateDirect.position(0);
                gVar.f263002x.copyPixelsToBuffer(allocateDirect);
                allocateDirect.position(0);
                gVar.f263003y = new byte[allocateDirect.remaining()];
                allocateDirect.get(gVar.f263003y);
            }
            byte[] bArr2 = gVar.f263003y;
            android.graphics.Point point2 = gVar.f263000v;
            com.tencent.mm.plugin.sight.base.SightVideoJNI.blendYuvFrame(bArr, bArr2, point2.x, point2.y);
        }
        fi3.o oVar2 = gVar.f262981c;
        if (oVar2 != null) {
            android.graphics.Point point3 = gVar.f263000v;
            int i18 = point3.x;
            int i19 = point3.y;
            int e17 = gVar.f262980b.e();
            if (bArr != null) {
                com.tencent.mm.plugin.mmsight.segment.MP4MuxerJNI.writeYuvDataForSegmentLock(bArr, i18, i19, oVar2.f263052d, oVar2.f263053e, e17, oVar2.f263050b, oVar2.f263051c);
                oVar2.f263054f++;
            } else {
                oVar2.getClass();
            }
        }
        ei3.x.f253187d.o(bArr);
        if (!z17 || (oVar = gVar.f262981c) == null || (nVar = oVar.f263049a) == null) {
            return;
        }
        nVar.f263047g = true;
    }
}
