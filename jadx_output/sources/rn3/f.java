package rn3;

/* loaded from: classes8.dex */
public class f implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.newtips.NormalIconNewTipPreference f397950a;

    public f(com.tencent.mm.plugin.newtips.NormalIconNewTipPreference normalIconNewTipPreference) {
        this.f397950a = normalIconNewTipPreference;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mm.sdk.platformtools.u3.h(new rn3.e(this, str, (!this.f397950a.f152364h2 || bitmap == null || bitmap.isRecycled()) ? bitmap != null ? com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, bitmap.getWidth() * 0.1f) : null : com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, bitmap.getWidth() / 2), bitmap));
    }
}
