package ox1;

/* loaded from: classes12.dex */
public class l implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f349607d;

    public l(ox1.s sVar) {
        this.f349607d = sVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        ox1.s sVar = this.f349607d;
        if (sVar.m() == 1 && sVar.o(2)) {
            sVar.p();
        }
        return true;
    }
}
