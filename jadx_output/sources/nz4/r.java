package nz4;

/* loaded from: classes12.dex */
public class r implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f341635d;

    public r(nz4.y yVar) {
        this.f341635d = yVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        nz4.y yVar = this.f341635d;
        if (yVar.m() == 1 && yVar.o(2)) {
            yVar.p();
        }
        return true;
    }
}
