package gq1;

/* loaded from: classes13.dex */
public class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq1.o f274502d;

    public f(gq1.o oVar) {
        this.f274502d = oVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f274502d.f274525i.post(new gq1.e(this));
        return false;
    }
}
