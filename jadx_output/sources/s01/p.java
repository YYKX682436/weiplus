package s01;

/* loaded from: classes11.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401916f;

    public p(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f401914d = str;
        this.f401915e = str2;
        this.f401916f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        s01.h D0 = r01.q3.Ui().D0(this.f401914d);
        if (D0 == null) {
            return;
        }
        if (D0.field_chatVersion < com.tencent.mm.sdk.platformtools.t8.P(this.f401915e, Integer.MAX_VALUE)) {
            D0.field_needToUpdate = true;
            r01.q3.Ui().P0(D0);
        }
        boolean y07 = D0.y0();
        java.lang.String str = this.f401916f;
        if (y07) {
            r01.q3.Ni().f(D0.field_bizChatServId, str, 5000);
        } else {
            r01.q3.Ni().g(D0.field_bizChatServId, str, 5000);
        }
    }
}
