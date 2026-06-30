package t21;

/* loaded from: classes12.dex */
public class l3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.p3 f414832d;

    public l3(t21.p3 p3Var) {
        this.f414832d = p3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        t21.p3.b(this.f414832d);
        return false;
    }

    public java.lang.String toString() {
        return super.toString() + "|scenePusher";
    }
}
