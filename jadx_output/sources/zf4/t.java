package zf4;

/* loaded from: classes13.dex */
public class t implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf4.w f472690d;

    public t(zf4.w wVar) {
        this.f472690d = wVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        zf4.q c17;
        zf4.w wVar = this.f472690d;
        java.lang.String str = wVar.f472698d;
        if (str != null && (c17 = zf4.r.c(str)) != null && c17.field_status == 1) {
            c17.field_status = 2;
            c17.U = 64;
            zf4.r.f(c17);
        }
        zf4.l.Ai().c();
        java.lang.String str2 = wVar.f472698d;
        return false;
    }
}
