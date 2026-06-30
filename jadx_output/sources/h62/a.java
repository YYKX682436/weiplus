package h62;

/* loaded from: classes.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279181d;

    public a(h62.d dVar, java.lang.String str) {
        this.f279181d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, this.f279181d, 1).show();
    }
}
